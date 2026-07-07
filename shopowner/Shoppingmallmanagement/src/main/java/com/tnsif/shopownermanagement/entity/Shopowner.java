package com.tnsif.shopownermanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name="shop")

public class Shopowner {
	
	@Id //Primary key
	@GeneratedValue //auto generated PK
	private Long id;
	private String name;
	private String address;
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
