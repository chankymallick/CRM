package com.crmapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crmapp.models.Lead;

public interface LeadRepository extends CrudRepository<Lead, Integer> {

}
