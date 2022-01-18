package com.te.nachpaysample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.nachpaysample.pojo.Relationship;

public interface RelationshipRepo extends JpaRepository<Relationship, Long>{

}
