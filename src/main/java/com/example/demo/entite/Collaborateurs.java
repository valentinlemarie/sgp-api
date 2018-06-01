package com.example.demo.entite;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Collaborateurs {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id ;
	
	String matricule;
	String nom;
	String prenom;
	
	@ManyToOne
	Banque banque;
	@ManyToOne
	Departement departement;
	
	public Collaborateurs() {
		// TODO Auto-generated constructor stub
	}
	
	public Collaborateurs(String matricule, String nom, String prenom, Banque banque) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.banque = banque;
	}
	public Banque getBanque() {
		return banque;
	}
	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
