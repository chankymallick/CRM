package com.crmapp.repositoriesimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.crmapp.models.Deal;
import com.crmapp.repositories.DealRepository;

public class DealRepoImpl {
	@Autowired
	DealRepository dealRepository;
	
	public List<Deal> getAllDeals(){		
		List<Deal> deals = new ArrayList<>();
		dealRepository.findAll().forEach(deals::add);
		return deals;	
	}
	
	public Deal addDeal(Deal deal){
	 return	dealRepository.save(deal);		
	}
	
}
