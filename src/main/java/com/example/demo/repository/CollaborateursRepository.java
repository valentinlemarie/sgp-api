
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.Collaborateurs;

public interface CollaborateursRepository extends JpaRepository<Collaborateurs	, Integer> {
	Collaborateurs findByMatricule(String matricule) ;
	List<Collaborateurs> findByDepartementId(int id);
}
