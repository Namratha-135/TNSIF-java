package com.tnsif.shopownermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.tnsif.shopownermanagement.entity.Shopowner;

// sql queries
// data base 

public interface Shopownerrepo extends CrudRepository<Shopowner, Long>{
	

}
