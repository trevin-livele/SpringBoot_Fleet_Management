package com.trevin.FleetMangmt.controllers;

import java.util.Optional;

import com.trevin.FleetMangmt.models.Country;
import com.trevin.FleetMangmt.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountryController {
	
	//Get All Countrys
	@GetMapping("/countries")
	public String getCountries(){

		return "country";
	}

}
