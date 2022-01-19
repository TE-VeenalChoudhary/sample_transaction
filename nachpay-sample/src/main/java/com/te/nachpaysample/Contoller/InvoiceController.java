package com.te.nachpaysample.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.nachpaysample.Service.InvoiceService;
import com.te.nachpaysample.pojo.Invoice;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

	
	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@PostMapping("/saveinvoice")
	public Invoice saveInvoice(@RequestBody Invoice invoice) {

		return invoiceService.saveInvoice(invoice); 
	}
}
