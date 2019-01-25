package com.crmapp.apis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crmapp.models.Customer;
import com.crmapp.models.Lead;
import com.crmapp.models.Permission;
import com.crmapp.models.User;
import com.crmapp.repositoriesimpl.CustomerRepoImpl;
import com.crmapp.repositoriesimpl.LeadRepoImpl;
import com.crmapp.repositoriesimpl.PermissionRepoImpl;
import com.crmapp.repositoriesimpl.UserRepoImpl;

@CrossOrigin
@RestController
public class ApiVersionOne {

	@Autowired
	UserRepoImpl userRepoimpl;
	@Autowired
	PermissionRepoImpl permissionRepoImpl;
	@Autowired
	CustomerRepoImpl customerRepoImpl;
	@Autowired
	LeadRepoImpl leadRepoImpl;

	@RequestMapping(method = RequestMethod.GET, value = "api/v1/user/getalluser")
	public List<User> getAllUser() {
		return userRepoimpl.getAllUser();
	}

	@RequestMapping(method = RequestMethod.POST, value = "api/v1/user/adduser")
	public User addUser(@RequestBody User user) {
		return userRepoimpl.addUser(user);
	}

	@RequestMapping(method = RequestMethod.GET, value = "api/v1/permission/getallpermission")
	public List<Permission> getAllPermission() {
		return permissionRepoImpl.getAllPermission();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "api/v1/customer/getallcustomer")
	public List<Customer> getAllCustomer() {
		return customerRepoImpl.getAllCustomers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "api/v1/customer/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerRepoImpl.addCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "api/v1/lead/getalllead")
	public List<Lead> getAllLead() {
		return leadRepoImpl.getAllLead();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "api/v1/lead/addlead")
	public Lead addLead(@RequestBody Lead lead) {
		return leadRepoImpl.addLead(lead);
	}


}
