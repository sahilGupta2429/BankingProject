package com.testbank.repository;

import com.testbank.model.Customer;

public interface CustomerRepository {

	long createCustomer(Customer cus);
	boolean validateAccount(long accountId);
}
