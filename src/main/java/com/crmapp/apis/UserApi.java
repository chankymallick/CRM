package com.crmapp.apis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crmapp.models.User;
import com.crmapp.repositories.UserRepository;
import com.crmapp.repositoriesimpl.UserRepoImpl;


@CrossOrigin
@RestController
public class UserApi {
	
	@Autowired
	UserRepoImpl userRepoimpl;
	
	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public List<User> authenticateUser() {
		
	return userRepoimpl.getAllUser();		
				
	}


}