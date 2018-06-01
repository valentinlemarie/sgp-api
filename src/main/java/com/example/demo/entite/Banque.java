package com.example.demo.entite;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id ;
	
	String nom;
	String iban;
	String ibic;
	
	
	public Banque() {
		// TODO Auto-generated constructor stub
	}
	
	public Banque(String nom, String iban, String ibic) {
		super();
		this.nom = nom;
		this.iban = iban;
		this.ibic = ibic;
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
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getIbic() {
		return ibic;
	}
	public void setIbic(String ibic) {
		this.ibic = ibic;
	}
	
	
}
