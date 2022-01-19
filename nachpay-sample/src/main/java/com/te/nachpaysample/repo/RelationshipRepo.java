package com.te.nachpaysample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.nachpaysample.pojo.Relationship;

@Repository
public interface RelationshipRepo extends JpaRepository<Relationship, Long>{

}
