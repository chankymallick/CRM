package com.crmapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crmapp.models.Deal;

public interface DealRepository extends CrudRepository<Deal, Integer> {

}
