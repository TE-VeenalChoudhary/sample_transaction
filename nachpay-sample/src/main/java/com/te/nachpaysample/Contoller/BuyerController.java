package com.te.nachpaysample.Contoller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.nachpaysample.Service.InvoiceService;
import com.te.nachpaysample.Service.MandateService;
import com.te.nachpaysample.pojo.InvoiceDTO;
import com.te.nachpaysample.pojo.MandateDTO;
import com.te.nachpaysample.pojo.StatusDTO;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

	@Autowired
	private InvoiceService invoiceService;
	
	@Autowired
	private MandateService mandateService;

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
	
	@GetMapping("/table")
	public List<StatusDTO> getAmountTable() {
	return	invoiceService.getAmountTable();
	}
	
	
	@GetMapping("/getallmandate")
	public List<MandateDTO> getAllMandate(){
		
		return mandateService.getAllMandate();
	}
	
	@GetMapping("/getallinvoices")
	public List<InvoiceDTO> getAllInvoices(){
		
		return invoiceService.getAllInvoices();
	}
}
