package com.te.nachpaysample.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.nachpaysample.pojo.Invoice;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Long> {

	List<Invoice> findBycompanyName(String string);

}
