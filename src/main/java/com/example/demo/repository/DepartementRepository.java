package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
