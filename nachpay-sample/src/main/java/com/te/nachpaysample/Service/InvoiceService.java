package com.te.nachpaysample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.nachpaysample.pojo.Invoice;
import com.te.nachpaysample.repo.InvoiceRepo;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepo invoice;
	
	public Invoice saveInvoice(Invoice invoice) {
		return this.invoice.save(invoice);
	}
	
} 