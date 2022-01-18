package com.te.nachpaysample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.nachpaysample.pojo.Company;

public interface CompanyRepo extends JpaRepository<Company, Long> {

}
