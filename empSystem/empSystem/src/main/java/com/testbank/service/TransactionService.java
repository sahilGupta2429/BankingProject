package com.testbank.service;

import java.util.List;

import com.testbank.model.Transaction;

public interface TransactionService {

	long balanceEnquiry(long accountId);
	long deposit(long accountId, long amount);
	long withdraw(long accountId, long amount);
	List<Transaction> generateStatement(long accountId);
	
}
