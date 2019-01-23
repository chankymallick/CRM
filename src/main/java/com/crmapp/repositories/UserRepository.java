package com.crmapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crmapp.models.User;


public interface UserRepository extends CrudRepository<User,Integer>  {
	
	

}
