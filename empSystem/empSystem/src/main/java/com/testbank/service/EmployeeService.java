package com.testbank.service;

import com.testbank.model.Employee;

public interface EmployeeService {

	
	String authenticate(String username, String password);
	long createEmployee(Employee emp);
	long usernameToId();
	
}
