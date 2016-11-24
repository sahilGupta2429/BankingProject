package com.testbank.repository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.testbank.model.Customer;
import com.testbank.model.Transaction;

@Repository("transactionRepository")
public class TransactionRepositoryImpl implements TransactionRepository {


	@PersistenceContext
	private EntityManager em;
	
	public long balanceEnquiry(long accountId) {
		Query query = em.createQuery("Select c from Customer c where c.accountId = '" + accountId + "'");
		@SuppressWarnings("unchecked")
		List<Customer> c = query.getResultList();
		return c.get(0).getBalance();
	}

	public long deposit(long accountId, long amount) {
		
		Transaction t = new Transaction();
		t.setAccountId(accountId);
		t.setAmount(amount);
		t.setBalance((balanceEnquiry(accountId))+amount);
		t.setOperation("Deposit");
		Timestamp ts = new Timestamp((new Date().getTime()));
		t.setTimestp(ts.toString());
		em.persist(t);
		em.flush();
		
		Query query = em.createQuery("update Customer c set balance="+ t.getBalance() + " where c.accountId = '" + accountId + "'");
		query.executeUpdate();
		
		return t.getBalance();

	}

	public long withdraw(long accountId, long amount) {
		Transaction t = new Transaction();
		t.setAccountId(accountId);
		t.setAmount(amount);
		t.setBalance((balanceEnquiry(accountId))-amount);
		t.setOperation("Withdraw");
		Timestamp ts = new Timestamp((new Date().getTime()));
		t.setTimestp(ts.toString());
		em.persist(t);
		em.flush();
		
		Query query = em.createQuery("update Customer c set balance="+ t.getBalance() + " where c.accountId = '" + accountId + "'");
		query.executeUpdate();
		
		return t.getBalance();
	}

	public boolean validation(long accountId) {
		Query query = em.createQuery("Select c from Customer c where c.accountId = '" + accountId + "'");
		@SuppressWarnings("unchecked")
		List<Customer> c = query.getResultList();
		if(c.isEmpty())
			return false;
		else
			return true;
	}

	public List<Transaction> generateStatement(long accountId) {
		Query query = em.createQuery("Select t from Transaction t where t.accountId = '" + accountId + "'");
		@SuppressWarnings("unchecked")
		List<Transaction> t = query.getResultList();
		return t;
	}

}
