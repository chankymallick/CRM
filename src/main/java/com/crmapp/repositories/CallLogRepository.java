package com.crmapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.crmapp.models.CallLog;

public interface CallLogRepository extends CrudRepository<CallLog, Integer> {

}
