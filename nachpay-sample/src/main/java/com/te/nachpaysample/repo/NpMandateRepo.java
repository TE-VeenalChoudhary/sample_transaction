package com.te.nachpaysample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.nachpaysample.pojo.Np_Mandate;

public interface NpMandateRepo  extends JpaRepository<Np_Mandate, Long>{

}
