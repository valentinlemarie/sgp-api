
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.Collaborateurs;

public interface CollaborateursRepository extends JpaRepository<Collaborateurs	, Integer> {
	Collaborateurs findByMatricule(String matricule) ;
}
