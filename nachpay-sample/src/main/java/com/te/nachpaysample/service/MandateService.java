package com.te.nachpaysample.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.nachpaysample.pojo.Np_Mandate;
import com.te.nachpaysample.repo.NpMandateRepo;

@Service
public class MandateService {

	@Autowired
	private NpMandateRepo mandateRepo;
	
	public List<Np_Mandate> addMandate(List<Np_Mandate> mandates){
		return mandateRepo.saveAll(mandates);
	}
}
