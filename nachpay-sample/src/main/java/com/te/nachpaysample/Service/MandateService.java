package com.te.nachpaysample.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.nachpaysample.pojo.MandateDTO;
import com.te.nachpaysample.pojo.Np_Mandate;
import com.te.nachpaysample.repo.NpMandateRepo;

@Service
public class MandateService {

	@Autowired
	private NpMandateRepo mandateRepo;
	
	public List<Np_Mandate> addMandate(List<Np_Mandate> mandates){
		return mandateRepo.saveAll(mandates);
	}

	public List<Np_Mandate> getAll() {
		return mandateRepo.findAll();
	}
	
	
	
	
	public List<MandateDTO> getAllMandate() {
		List<MandateDTO> list=new ArrayList<>();
		mandateRepo.findAll().forEach(mandate->{
			MandateDTO mandateDTO=new MandateDTO();
			mandateDTO.setMandateId(mandate.getMandateId());
			mandateDTO.setGeneratedFor(mandate.getSellerCompanyName());
			mandateDTO.setStatus(mandate.getStatus());
			Date date=mandate.getCreatedDate();
			SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");  
			mandateDTO.setDate(formatter.format(date));
			list.add(mandateDTO);
		});
		return list;
	}
}
