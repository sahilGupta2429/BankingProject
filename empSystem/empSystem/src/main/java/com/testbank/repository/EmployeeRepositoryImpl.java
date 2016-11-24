package com.testbank.repository;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.testbank.model.Employee;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@PersistenceContext
	private EntityManager em;
	
	static private long empId;

	public String authenticate(String username, String password) {
		
		String s= password;
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        m.update(s.getBytes(),0,s.length());
        password = new BigInteger(1,m.digest()).toString(16);
        
		System.out.println("Select e from Employee e where e.username = '" + username + "' AND e.password = '" + password + "'");
		Query query = em.createQuery("Select e from Employee e where e.username = '" + username + "' AND e.password = '" + password + "'");
		@SuppressWarnings("unchecked")
		List<Employee> e = query.getResultList();
		if(e.isEmpty())
			return null;
		else {
			empId = e.get(0).getEmployeeId();
			return e.get(0).getName();
		}
	}
	
	public long createEmployee(Employee emp) {
		String s=emp.getPassword();
		MessageDigest m = null;
		try {
			m = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        m.update(s.getBytes(),0,s.length());
        emp.setPassword(new BigInteger(1,m.digest()).toString(16));
		em.persist(emp);
		em.flush();
		return emp.getEmployeeId();
	}

	public long usernameToId() {
		return empId;
	}
}
