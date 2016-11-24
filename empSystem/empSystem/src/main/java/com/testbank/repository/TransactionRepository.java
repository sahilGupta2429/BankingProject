package com.testbank.repository;

import java.util.List;

import com.testbank.model.Transaction;


public interface TransactionRepository {

	long balanceEnquiry(long accountId);
	long deposit(long accountId, long amount);
	long withdraw(long accountId, long amount);
	boolean validation(long accountId);
	List<Transaction> generateStatement(long accountId);

}
