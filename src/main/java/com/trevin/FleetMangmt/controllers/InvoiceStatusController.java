package com.trevin.FleetMangmt.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class InvoiceStatusController {
	@GetMapping("/invoicestatuses")
	public String getInvoiceStatuses(){

		return "invoiceStatus";
	}
}
