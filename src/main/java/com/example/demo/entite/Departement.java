package com.example.demo.entite;

import java.util.TimeZone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id ;
	
	String nom ;

	
	public Departement() {
		// TODO Auto-generated constructor stub
	}
	
	public Departement(String nom) {
		super();
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
