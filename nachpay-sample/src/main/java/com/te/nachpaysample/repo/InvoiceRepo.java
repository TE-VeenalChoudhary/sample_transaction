package com.te.nachpaysample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.nachpaysample.pojo.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice, Long> {

}
