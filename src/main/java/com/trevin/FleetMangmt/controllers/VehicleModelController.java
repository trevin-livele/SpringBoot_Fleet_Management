package com.trevin.FleetMangmt.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class VehicleModelController {

	@GetMapping("/vehiclemodels")
	public String getVehicleModels(){

		return "vehicleModel";
	}
}
