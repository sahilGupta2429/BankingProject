package com.testbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testbank.model.Transaction;
import com.testbank.repository.TransactionRepository;

@Service("transactionService")
public class TransactionServiceImpl implements TransactionService {


	@Autowired
	private TransactionRepository transactionRepository;
	
	@Transactional
	public long balanceEnquiry(long accountId) {
		if(transactionRepository.validation(accountId))
			return transactionRepository.balanceEnquiry(accountId);
		return -1;
	}

	@Transactional
	public long deposit(long accountId, long amount) {
		if(transactionRepository.validation(accountId))
			return transactionRepository.deposit(accountId, amount);
		return -1;
	}

	@Transactional
	public long withdraw(long accountId, long amount) {
		if(transactionRepository.validation(accountId))
		{
			if(transactionRepository.balanceEnquiry(accountId) >= amount)
				return transactionRepository.withdraw(accountId, amount);
			else
				return -10;
		}
		return -1;
	}

	@Transactional
	public List<Transaction> generateStatement(long accountId) {
		if(transactionRepository.validation(accountId))
			return transactionRepository.generateStatement(accountId);
		return null;
	}

}
