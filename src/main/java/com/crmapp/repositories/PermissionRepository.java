package com.crmapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crmapp.models.Permission;

public interface PermissionRepository extends CrudRepository<Permission,Integer> {

}
