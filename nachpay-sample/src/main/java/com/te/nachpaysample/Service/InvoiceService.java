package com.te.nachpaysample.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.nachpaysample.pojo.Invoice;
import com.te.nachpaysample.pojo.StatusDTO;
import com.te.nachpaysample.repo.InvoiceRepo;
import com.te.nachpaysample.repo.NpMandateRepo;

@Service
public class InvoiceService {

	@Autowired
	private NpMandateRepo repo;
	
	@Autowired
	private InvoiceRepo invoice;
	
	public Invoice saveInvoice(Invoice invoice) {
		return this.invoice.save(invoice);
	}
	
	public List<Invoice> getAll() {
		return invoice.findAll();
	}
	
	public StatusDTO status() {
		Long amount=0l;
		Long dueamount=0l;
		
		List<Invoice> list = invoice.findBycompanyName("wipro");
		StatusDTO statusDTO = new StatusDTO();
		for (Invoice invoice : list) {
			
			if(invoice.getStatus().equals("paid")) {
				amount+=invoice.getAmount();
			}
			else {
				dueamount+=invoice.getAmount();
			}
		}
		statusDTO.setAmtPaid(amount);
		statusDTO.setAmtUnpaid(dueamount);
		statusDTO.setNoOfInvoices(list.size());
		statusDTO.setNoOfMandateCreated(repo.countBybuyerComanyName("wipro"));
		return statusDTO;
	}
	
	
	public Map<String, Long> amountGenerated() {
		int	month=0;
		Map<String, Long> amtMap=new HashMap<>();
		amtMap.put("January", 0l);
		amtMap.put("February", 0l);
		amtMap.put("April", 0l);
		
		List<Invoice> list= invoice.findBycompanyName("wipro");
		for (Invoice invoice : list) {
			Date createdDate = invoice.getInvoiceDate();
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(createdDate);
			month=calendar.get(Calendar.MONTH);
			System.out.println(month);
			switch (month) {
			case 0:{
				long amo;
				Long amount = invoice.getAmount();
				amo=amtMap.get("January");
				amtMap.put("January", amo+amount);
				
				
				break;
			}
			case 1:{
				long amo;
				Long amount = invoice.getAmount();
				amo=amtMap.get("February");
				amtMap.put("February",amo+amount);
				
				break;
			}
			case 3:{
				long amo;
				Long amount = invoice.getAmount();
				amo=amtMap.get("April");
				amtMap.put("April",amo+amount);
				break;
			}
			default:
				break;
			}
		}
		
		return amtMap;
	}
	
	
	
	public Map<String, Long> doughnutChart() {
		int month;
		Map<String, Long> amtMap=new HashMap<>();
		amtMap.put("January", 0l);
		amtMap.put("February", 0l);
		amtMap.put("March", 0l);
		amtMap.put("April", 0l);
		amtMap.put("May", 0l);
		amtMap.put("June", 0l);
		amtMap.put("July", 0l);
		amtMap.put("August", 0l);
		amtMap.put("September", 0l);
		amtMap.put("October", 0l);
		amtMap.put("November", 0l);
		amtMap.put("December", 0l);
		
		List<Invoice> list= invoice.findBycompanyName("wipro");
		for (Invoice invoice : list) {
			Date createdDate = invoice.getInvoiceDate();
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(createdDate);
			month=calendar.get(Calendar.MONTH);
			System.out.println(month);
		switch (month) {
		case 0:{
			Long count=amtMap.get("January");
			amtMap.put("January", ++count);
			break;
		}
		case 3:{
			Long count=amtMap.get("April");
			amtMap.put("April", ++count);
			break;
		}

		default:
			break;
		}
		
		
	}
	
	
	
	
	return amtMap;
}
	}
