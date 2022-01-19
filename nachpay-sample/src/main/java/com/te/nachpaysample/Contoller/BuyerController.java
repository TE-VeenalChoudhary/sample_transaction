package com.te.nachpaysample.Contoller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.nachpaysample.Service.InvoiceService;
import com.te.nachpaysample.pojo.StatusDTO;

@RestController
public class BuyerController {

	@Autowired
	private InvoiceService invoiceService;

	@GetMapping("/getstatus")
	public StatusDTO getStatus() {
		return invoiceService.status();
	}

	@GetMapping("/barchart")
	public Map<String, Long> barChart() {
		return invoiceService.amountGenerated();
	}
	
	
	@GetMapping("/donoughtChart")
	public Map<String, Long> donoughtChart() {
	return	invoiceService.doughnutChart();
	}
}
