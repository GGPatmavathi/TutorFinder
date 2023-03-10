package com.optfs.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.optfs.entities.DemoRequests;
import com.optfs.exceptions.NullValuesFoundException;

@Service
public interface DemoRequestService {
	
	public DemoRequests addDemoRequests(DemoRequests d) throws NullValuesFoundException;
	
	public List<DemoRequests> getDemoRequestsByTutorId(Integer tId) throws NullValuesFoundException;
	
	public List<DemoRequests> getDemoRequestsByParentId(Integer pId)throws NullValuesFoundException;

	public DemoRequests updateDemoRequest(Integer d) throws NullValuesFoundException; 
	
	public void deleteDemoRequest(DemoRequests d) throws NullValuesFoundException; 
	
	

}
