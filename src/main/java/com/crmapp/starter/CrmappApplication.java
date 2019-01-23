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
import com.crmapp.apis.UserApi;
import com.crmapp.repositoriesimpl.UserRepoImpl;


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

}

