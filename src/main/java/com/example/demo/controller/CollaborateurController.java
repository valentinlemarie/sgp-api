package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entite.Banque;
import com.example.demo.entite.Collaborateurs;
import com.example.demo.entite.Departement;
import com.example.demo.repository.CollaborateursRepository;
import com.example.demo.repository.DepartementRepository;

@RestController
@RequestMapping("/api")
public class CollaborateurController {
		@Autowired CollaborateursRepository collaborateursRepository ;

		@RequestMapping(method = RequestMethod.GET, path = "/collaborateurs")
		public List<Collaborateurs> listeDesCollaboratueursAuFormatJSON() {
			return collaborateursRepository.findAll();	 
		}

		@RequestMapping(method = RequestMethod.GET, path = "/collaborateurs", params="id")
		public Collaborateurs collaboratueursAuFormatJSON(@RequestParam("id") int id) {
			return collaborateursRepository.findById(id) ;
		}
		
		@RequestMapping(method = RequestMethod.GET, path = "/collaborateurs/{matricule}")
		public Collaborateurs collaboratueursAuFormatJSONByMatricule(@PathVariable String matricule) {
			return collaborateursRepository.findByMatricule(matricule) ;
		}
		
		@RequestMapping(method = RequestMethod.PUT, path = "/collaborateurs/{matricule}")
		public void modifCollaboratueursAuFormatJSONByMatricule(@PathVariable String matricule , @RequestBody Collaborateurs collaborateur) {
			Collaborateurs collaborateurAchanger = collaborateur;
			collaborateurAchanger.setMatricule(matricule);
			collaborateursRepository.save(collaborateurAchanger);
		}

		@RequestMapping(method=RequestMethod.GET, path="/collaborateurs/{matricule}/banque" )
		public Banque getBanqueCollaborateurbyMatricule(@PathVariable String matricule){
			return collaborateursRepository.findByMatricule(matricule).getBanque();
		}
		
		@RequestMapping(method=RequestMethod.PUT, path="/collaborateurs/{matricule}/banque" )
		public void modifieBanqueCollaborateurbyMatricule(@PathVariable String matricule, @RequestBody Banque banque){
			Collaborateurs collaborateur = collaborateursRepository.findByMatricule(matricule);
			collaborateur.setBanque(banque);
			collaborateursRepository.save(collaborateur);
		}
}
