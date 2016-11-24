package com.testbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testbank.model.Customer;
import com.testbank.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional
	public long createCustomer(Customer cus) {
		return customerRepository.createCustomer(cus);
	}

	public boolean validateAccount(long accountId) {
		return customerRepository.validateAccount(accountId);
	}
	
	
}
