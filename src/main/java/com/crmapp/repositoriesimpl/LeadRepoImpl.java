package com.crmapp.repositoriesimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.crmapp.models.Lead;
import com.crmapp.repositories.LeadRepository;

public class LeadRepoImpl {
	
	@Autowired
	LeadRepository leadRepository;
	
	public List<Lead> getAllLead(){		
		List<Lead> lead = new ArrayList<>();
		leadRepository.findAll().forEach(lead::add);
		return lead;	
	}
	
	public Lead addLead(Lead lead){
	 return	leadRepository.save(lead);		
	}
	
	

}
