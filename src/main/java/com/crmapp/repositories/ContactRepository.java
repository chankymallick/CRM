package com.crmapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crmapp.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
