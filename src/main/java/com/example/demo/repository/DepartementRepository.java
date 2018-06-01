package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.Collaborateurs;
import com.example.demo.entite.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
	
}
