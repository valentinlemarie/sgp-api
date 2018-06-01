package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.Banque;

public interface BanqueRepository  extends JpaRepository<Banque, Integer>{

}
