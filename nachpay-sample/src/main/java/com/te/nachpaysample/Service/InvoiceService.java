package com.te.nachpaysample.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.nachpaysample.pojo.Company;
import com.te.nachpaysample.pojo.Invoice;
import com.te.nachpaysample.pojo.InvoiceDTO;
import com.te.nachpaysample.pojo.MandateDTO;
import com.te.nachpaysample.pojo.StatusDTO;
import com.te.nachpaysample.repo.CompanyRepo;
import com.te.nachpaysample.repo.InvoiceRepo;
import com.te.nachpaysample.repo.NpMandateRepo;
import com.te.nachpaysample.repo.RelationshipRepo;

@Service
public class InvoiceService {

	@Autowired
	private NpMandateRepo repo;

	@Autowired
	private InvoiceRepo invoice;

	@Autowired
	private RelationshipRepo relationshipRepo;

	@Autowired
	private CompanyRepo companyRepo;

	public Invoice saveInvoice(Invoice invoice) {
		return this.invoice.save(invoice);
	}

	public List<Invoice> getAll() {
		return invoice.findAll();
	}

	public StatusDTO status() {
		Long amount = 0l;
		Long dueamount = 0l;

		List<Invoice> list = invoice.findBycompanyName("wipro");
		StatusDTO statusDTO = new StatusDTO();
		for (Invoice invoice : list) {

			if (invoice.getStatus().equals("paid")) {
				amount += invoice.getAmount();
			} else {
				dueamount += invoice.getAmount();
			}
		}
		statusDTO.setAmtPaid(amount);
		statusDTO.setAmtUnpaid(dueamount);
		statusDTO.setNoOfInvoices(list.size());
		statusDTO.setNoOfMandateCreated(repo.countBybuyerComanyName("wipro"));
		return statusDTO;
	}

	public Map<String, Long> amountGenerated() {
		int month = 0;
		Map<String, Long> amtMap = new HashMap<>();
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

		List<Invoice> list = invoice.findBycompanyName("wipro");
		for (Invoice invoice : list) {
			Date createdDate = invoice.getInvoiceDate();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(createdDate);
			month = calendar.get(Calendar.MONTH);
			System.out.println(month);
			switch (month) {
			case 0: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("January");
				amtMap.put("January", amo + amount);

				break;
			}
			case 1: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("February");
				amtMap.put("February", amo + amount);
				break;
			}
			case 2: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("March");
				amtMap.put("March", amo + amount);
				break;
			}
			
			case 3: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("April");
				amtMap.put("April", amo + amount);
				break;
			}
			case 4: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("May");
				amtMap.put("May", amo + amount);
				break;
			}
			case 5: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("June");
				amtMap.put("June", amo + amount);
				break;
			}
			case 6: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("July");
				amtMap.put("July", amo + amount);
				break;
			}
			case 7: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("August");
				amtMap.put("August", amo + amount);
				break;
			}
			case 8: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("September");
				amtMap.put("September", amo + amount);
				break;
			}
			case 9: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("October");
				amtMap.put("October", amo + amount);
				break;
			}
			case 10: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("November");
				amtMap.put("November", amo + amount);
				break;
			}
			case 11: {
				long amo;
				Long amount = invoice.getAmount();
				amo = amtMap.get("December");
				amtMap.put("December", amo + amount);
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
		Map<String, Long> amtMap = new HashMap<>();
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

		List<Invoice> list = invoice.findBycompanyName("wipro");
		for (Invoice invoice : list) {
			Date createdDate = invoice.getInvoiceDate();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(createdDate);
			month = calendar.get(Calendar.MONTH);
			System.out.println(month);
			switch (month) {
			case 0: {
				Long count = amtMap.get("January");
				amtMap.put("January", ++count);
				break;
			}
			case 1: {
				Long count = amtMap.get("February");
				amtMap.put("February", ++count);
				break;
			}
			case 2: {
				Long count = amtMap.get("March");
				amtMap.put("March", ++count);
				break;
			}
			case 3: {
				Long count = amtMap.get("April");
				amtMap.put("April", ++count);
				break;
			}
			case 4: {
				Long count = amtMap.get("May");
				amtMap.put("May", ++count);
				break;
			}
			case 5: {
				Long count = amtMap.get("June");
				amtMap.put("June", ++count);
				break;
			}
			case 6: {
				Long count = amtMap.get("July");
				amtMap.put("July", ++count);
				break;
			}
			case 7: {
				Long count = amtMap.get("August");
				amtMap.put("August", ++count);
				break;
			}
			case 8: {
				Long count = amtMap.get("September");
				amtMap.put("September", ++count);
				break;
			}
			case 9: {
				Long count = amtMap.get("October");
				amtMap.put("October", ++count);
				break;
			}
			case 10: {
				Long count = amtMap.get("November");
				amtMap.put("November", ++count);
				break;
			}
			case 11: {
				Long count = amtMap.get("December");
				amtMap.put("December", ++count);
				break;
			}

			default:
				break;
			}

		}

		return amtMap;
	}

	public List<StatusDTO> getAmountTable() {
		Long amount = 0l;
		Map<String, Long> map = new HashMap<>();
		List<StatusDTO> dtos = new ArrayList<>();
		List<Invoice> list = invoice.findBycompanyName("wipro");
		for (Invoice invoice : list) {

			String name = companyRepo
					.findById(relationshipRepo.findById(invoice.getRelationshipId()).get().getSellerId()).get()
					.getCompanyName();
			map.put(name, amount);

		}
		map.keySet().forEach(key -> {
			
			List<Invoice> list1 = invoice.findByRelationshipId(
					relationshipRepo.findBySellerIdAndBuyerId(companyRepo.findByCompanyName(key).getCompanyId(),
							companyRepo.findByCompanyName("wipro").getCompanyId()).getRelationshipId());
			long amt = 0l;
			for (Invoice i : list1) {
				amt += i.getAmount();
			}
			map.put(key, amt);

		});

		for (String s : map.keySet()) {
			Long uniqueKey=0l;
			StatusDTO statusDTO = new StatusDTO();
			statusDTO.setUniqueKey(++uniqueKey);
			statusDTO.setCompanyName(s);
			statusDTO.setAmtPaid(map.get(s));
			statusDTO.setNoOfMandateCreated(repo.countBybuyerComanyName("wipro"));
			dtos.add(statusDTO);
		}

		return dtos;
	}
	
	public List<InvoiceDTO> getAllInvoices() {
		List<InvoiceDTO> list=new ArrayList<>();
		invoice.findAll().forEach(i->{
			InvoiceDTO invoiceDTO=new InvoiceDTO();
			invoiceDTO.setInvoiceId(i.getInvoiceId());
			invoiceDTO.setGeneratedFor(i.getCompanyName());
			invoiceDTO.setCost(i.getAmount());
			Date date=i.getInvoiceDate();
			SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");  
			invoiceDTO.setDate(formatter.format(date));
			list.add(invoiceDTO);
		});
		return list;
	}
	

}
