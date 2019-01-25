package com.crmapp.repositoriesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.crmapp.models.CallLog;
import com.crmapp.repositories.CallLogRepository;


public class CallLogRepoImpl {
	
	@Autowired
	CallLogRepository callLogRepository;
	
	public List<CallLog> getAllCallLogs(){		
		List<CallLog> callLogs = new ArrayList<>();
		callLogRepository.findAll().forEach(callLogs::add);
		return callLogs;	
	}
	
	public CallLog addCallLog(CallLog callLog){
	 return	callLogRepository.save(callLog);		
	}

}
