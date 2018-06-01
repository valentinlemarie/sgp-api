package com.example.demo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.entite.Banque;
import com.example.demo.entite.Collaborateurs;
import com.example.demo.entite.Departement;
import com.example.demo.repository.BanqueRepository;
import com.example.demo.repository.CollaborateursRepository;
import com.example.demo.repository.DepartementRepository;

@Component
public class StartUpAppListener {

	@Autowired
	CollaborateursRepository collaborateurs;
	@Autowired
	DepartementRepository departements;
	@Autowired
	BanqueRepository banques;

	@EventListener(ContextRefreshedEvent.class)
	public void contextRefreshedEvent() {
		// capture du démarrage de l'application
		// à un moment où le contexte Spring est complètement créé
		if (collaborateurs.count() + departements.count() + banques.count() == 0) {
			banques.save(new Banque("LaPoste", "123", "1234"));

			banques.save(new Banque("CreditLoyonais", "456", "4567"));
			banques.save(new Banque("SocieteGenerale", "789", "7890"));

			departements.save(new Departement("informatique"));
			departements.save(new Departement("commercial"));
			departements.save(new Departement("RessourceHuumaine"));

			collaborateurs
					.save(new Collaborateurs("LMV", "LEMARIE", "Valentin", banques.getOne(1), departements.getOne(1)));
			collaborateurs
					.save(new Collaborateurs("TG", "TOURRILHES", "Géraud", banques.getOne(2), departements.getOne(2)));
			collaborateurs
					.save(new Collaborateurs("LMB", "LEMARIE", "Benjamin", banques.getOne(3), departements.getOne(3)));
		}
	}
}