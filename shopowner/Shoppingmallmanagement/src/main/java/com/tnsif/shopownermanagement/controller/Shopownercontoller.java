package com.tnsif.shopownermanagement.controller;

import java.util.List;
//connect postman

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.shopownermanagement.entity.Shopowner;
import com.tnsif.shopownermanagement.service.Shopownerservice;

@RestController
public class Shopownercontoller {
	
	@Autowired
	private Shopownerservice ss;
	
	// create
	@PostMapping("/saveshopowner")
	public Shopowner registershopowner(@RequestBody Shopowner s) {
		return ss.registershopowner(s);
	}
	
	// read
	@GetMapping("/getshopowner")
	public List<Shopowner> getshopowners(){
		return ss.getshopowners();		
	}
	
	//update
	@PutMapping("/updateshopowner/{id}")
	public Shopowner updateshopowner(@PathVariable Long id, @RequestBody Shopowner s) {
		return ss.updateshopowner(id, s);
	}
	
	//delete
	@DeleteMapping("/deleteshopowner/{id}")
	public void deleteshopowner(@PathVariable("Id")Long id) {
		ss.deleteshopowner(id);
	}
	
	    

}
