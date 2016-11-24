package com.testbank.repository;

import com.testbank.model.Employee;

public interface EmployeeRepository {

	String authenticate(String username, String password);
	long createEmployee(Employee emp);
	long usernameToId();

}
