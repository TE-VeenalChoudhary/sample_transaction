package com.te.nachpaysample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.nachpaysample.pojo.Relationship;
import com.te.nachpaysample.repo.RelationshipRepo;

@Service
public class RelationshipService {

	@Autowired
	private RelationshipRepo relationship;
	
	public Relationship saveRelation(Relationship relationship) {
		
	return	this.relationship.save(relationship);
	}
}
