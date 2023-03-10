package com.optfs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.optfs.entities.Admin;
import com.optfs.exceptions.NullEmailFoundException;
import com.optfs.exceptions.NullUserFound;

@Service
public interface AdminService {
	
	//public Admin registerAdmin(Admin admin) throws NullUserFound, NullEmailFoundException;
	
	public List<Admin> getAllAdmins();
	
	public Admin getAdminById(Integer pid) throws NullUserFound;
	
	public Admin updateAdmin(Admin admin) throws NullUserFound;
	
	public String deleteAdmin(Admin admin) throws NullUserFound;
	
	//public Admin loginAdmin(String email, String password) throws NullUserFound;
}
