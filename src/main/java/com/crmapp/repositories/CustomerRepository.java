package com.crmapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crmapp.models.Customer;

public interface CustomerRepository  extends CrudRepository<Customer,Integer>{

}
