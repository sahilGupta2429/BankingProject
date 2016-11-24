package com.testbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testbank.model.Employee;
import com.testbank.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public String authenticate(String username, String password) {
		return employeeRepository.authenticate(username, password);
	}

	@Transactional
	public long createEmployee(Employee emp) {
		return employeeRepository.createEmployee(emp);
	}

	public long usernameToId() {
		return employeeRepository.usernameToId();
	}

}