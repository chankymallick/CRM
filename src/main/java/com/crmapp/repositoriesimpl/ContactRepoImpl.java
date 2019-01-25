package com.crmapp.repositoriesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crmapp.models.Contact;
import com.crmapp.models.Customer;
import com.crmapp.repositories.ContactRepository;
import com.crmapp.repositories.CustomerRepository;

public class ContactRepoImpl {

	@Autowired
	ContactRepository contactRepository;
	
	public List<Contact> getAllContacts(){		
		List<Contact> contacts = new ArrayList<>();
		contactRepository.findAll().forEach(contacts::add);
		return contacts;	
	}
	
	public Contact addContact(Contact contact){
	 return	contactRepository.save(contact);		
	}
}
