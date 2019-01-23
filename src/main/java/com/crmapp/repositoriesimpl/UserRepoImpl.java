package com.crmapp.repositoriesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crmapp.models.User;
import com.crmapp.repositories.UserRepository;


public class UserRepoImpl {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUser(){		
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;	
	}


}
