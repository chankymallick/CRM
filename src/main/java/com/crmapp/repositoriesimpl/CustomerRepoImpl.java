package com.crmapp.repositoriesimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.crmapp.models.Customer;
import com.crmapp.repositories.CustomerRepository;


public class CustomerRepoImpl {
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){		
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;	
	}
	
	public Customer addCustomer(Customer customer){
	 return	customerRepository.save(customer);		
	}
}
