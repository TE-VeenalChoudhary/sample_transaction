package com.te.nachpaysample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.nachpaysample.pojo.Company;
import com.te.nachpaysample.repo.CompanyRepo;


@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepo repo;
	
	public List<Company> addCompany(List<Company> company) {
		return repo.saveAll(company);
	}

	public List<Company> getAll() {
		
		return repo.findAll();
	}

}
