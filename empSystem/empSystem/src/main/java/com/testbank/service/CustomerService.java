package com.testbank.service;

import com.testbank.model.Customer;


public interface CustomerService {
	long createCustomer(Customer cus);
	boolean validateAccount(long accountId);
}
