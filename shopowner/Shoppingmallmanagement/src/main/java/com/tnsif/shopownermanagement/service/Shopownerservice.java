package com.tnsif.shopownermanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.shopownermanagement.entity.Shopowner;
import com.tnsif.shopownermanagement.repository.Shopownerrepo;

@Service     // Business Logic layer
public class Shopownerservice {
	
	@Autowired     // Automatically injects shopownerrepo
	private Shopownerrepo sr;
	
	//create
	public Shopowner registershopowner(Shopowner s) {
		return sr.save(s);
	}
	
	//read
	public List<Shopowner>getshopowners() {
		return (List<Shopowner>)sr.findAll();	
	}
	
	//update
	public Shopowner updateshopowner(Long id, Shopowner s) {
		Shopowner so = sr.findById(id).orElse(null);
		
		if(so != null) {
			so.setName(s.getName());
			so.setAddress(s.getAddress());
			return sr.save(so);
		}
		return null;
	}
	
	//delete
	public void deleteshopowner(Long id) {
		sr.deleteById(id);
	}
}
