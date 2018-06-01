package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entite.Departement;
import com.example.demo.repository.DepartementRepository;


@Controller
@RequestMapping("/api")
public class DepartementControler {

	@Autowired DepartementRepository departements ;

	@RequestMapping(method = RequestMethod.GET, path = "/departements ")
	@ResponseBody
	public List<Departement> listeDesDepartementsAuFormatJSON() {
		return departements.findAll();	 
	}

	
}
