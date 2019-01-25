package com.crmapp.repositoriesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crmapp.models.Permission;
import com.crmapp.models.User;
import com.crmapp.repositories.PermissionRepository;



public class PermissionRepoImpl {
	
	
	@Autowired
	PermissionRepository permissionRepository;
	
	public List<Permission> getAllPermission(){		
		List<Permission> permissions = new ArrayList<>();
		permissionRepository.findAll().forEach(permissions::add);
		return permissions;				
	} 
	
	

}
