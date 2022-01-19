package com.te.nachpaysample.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.nachpaysample.Service.MandateService;
import com.te.nachpaysample.pojo.Np_Mandate;

@RestController
@RequestMapping("/mandate")
public class MandateController {

	@Autowired
	private MandateService service;
	
	@PostMapping("/add")
	public List<Np_Mandate> addMandate(@RequestBody List<Np_Mandate> mandates){
		return service.addMandate(mandates);
	}
}
