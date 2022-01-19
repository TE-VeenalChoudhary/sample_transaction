package com.te.nachpaysample.Contoller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.nachpaysample.Service.RelationshipService;
import com.te.nachpaysample.pojo.Relationship;

@RestController
@RequestMapping("/relationship")
public class RelationshipController {

	@Autowired
	private RelationshipService relationService;

	@PostMapping("saverelation")
	public Relationship saveRelation(@RequestBody Relationship relationship) {
		return relationService.saveRelation(relationship);
	}
}
