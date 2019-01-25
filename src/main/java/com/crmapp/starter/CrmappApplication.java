package com.crmapp.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.crmapp.apis.ApiVersionOne;
import com.crmapp.repositories.LeadRepository;
import com.crmapp.repositoriesimpl.CallLogRepoImpl;
import com.crmapp.repositoriesimpl.ContactRepoImpl;
import com.crmapp.repositoriesimpl.CustomerRepoImpl;
import com.crmapp.repositoriesimpl.DealRepoImpl;
import com.crmapp.repositoriesimpl.LeadRepoImpl;
import com.crmapp.repositoriesimpl.PermissionRepoImpl;
import com.crmapp.repositoriesimpl.UserRepoImpl;

@EnableTransactionManagement
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.crmapp.repositories")
@Configuration
@EnableScheduling
@EntityScan("com.crmapp.*")  
@ComponentScan(basePackages  = {"com.crmapp.*"})


public class CrmappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmappApplication.class, args);
	}	
	@Bean
	public UserRepoImpl userRepoImplementation(){
		return new UserRepoImpl();
	}	
	@Bean
	public PermissionRepoImpl permissionRepoImplementation(){
		return new PermissionRepoImpl();
	}
	@Bean
	public CustomerRepoImpl customerRepoImplementation(){
		return new CustomerRepoImpl();
	}
	
	@Bean
	public LeadRepoImpl leadRepoImplementation(){
		return new LeadRepoImpl();
	}
	
	@Bean
	public ContactRepoImpl contactRepoImplementation(){
		return new ContactRepoImpl();
	}
	
	
	@Bean
	public CallLogRepoImpl callLogRepoImplementation(){
		return new CallLogRepoImpl();
	}	
	
	@Bean
	public DealRepoImpl dealLogRepoImplementation(){
		return new DealRepoImpl();
	}
	


}

