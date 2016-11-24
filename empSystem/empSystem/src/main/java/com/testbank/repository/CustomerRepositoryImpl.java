package com.testbank.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.testbank.model.Customer;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

	@PersistenceContext
	private EntityManager em;
	
	public long createCustomer(Customer cus) {
		em.persist(cus);
		em.flush();
		return cus.getAccountId();
	
	}

	public boolean validateAccount(long accountId) {
		Query query = em.createQuery("Select c from Customer c where c.accountId = '" + accountId + "'");
		@SuppressWarnings("unchecked")
		List<Customer> c = query.getResultList();
		if(c.isEmpty())
			return false;
		else
			return true;
	}
}
