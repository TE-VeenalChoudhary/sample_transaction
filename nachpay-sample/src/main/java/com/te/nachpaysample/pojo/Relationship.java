package com.te.nachpaysample.pojo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="np_relationship")
public class Relationship implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="relationship_id")
	private Long relationshipId;
	
	@Column(name="seller_id")
	private Long sellerId;
	
	@Column(name="buyer_id")
	private Long buyerId;
	
	@JsonIgnore
	@ManyToMany
	@JoinColumn(name="seller_id",referencedColumnName = "company_id" ,insertable=false ,updatable=false)
	@JoinColumn(name="buyer_id",referencedColumnName = "company_id" ,insertable=false ,updatable=false)
	private List<Company> company;

	public Long getRelationshipId() {
		return relationshipId;
	}

	public void setRelationshipId(Long relationshipId) {
		this.relationshipId = relationshipId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}
	
	

}
