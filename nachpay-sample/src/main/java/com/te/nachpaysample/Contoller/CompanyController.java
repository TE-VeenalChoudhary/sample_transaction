package com.te.nachpaysample.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.nachpaysample.Service.CompanyService;
import com.te.nachpaysample.pojo.Company;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService service;
	
	@PostMapping("/addCompany")
	public List<Company> addDept(@RequestBody List<Company> company){
		return service.addCompany(company);
	}

	@GetMapping("/getCompnay")
	public List<Company> getCompanies(){
		return service.getAll();
	}
}
