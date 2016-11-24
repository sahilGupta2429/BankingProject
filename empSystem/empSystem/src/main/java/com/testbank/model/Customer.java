package com.testbank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountId;
	
	//@NotNull(message="name cannot be left blank")
	//@Pattern(regexp="[^0-9]*")
	private String name;
	
	//@NotNull(message="email cannot be left blank")
	//@Pattern(regexp="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")
	private String email;
	
	//@NotNull(message="account type cannot be left blank")
	private String accountType;
	
	//@NotNull(message="Date of Birth cannot be left blank")
	private String dob;
	
	//@Pattern(regexp="[A-Za-z]{5}\\d{4}[A-Za-z]{1}")
	private String panNo;
	
	//@NotNull(message="Address cant be left blank")
	private String address;
	
	//@NotNull(message="mobile cant be left blank")
	private long mobile;
	
	private long generatorId;
	
	//@NotNull(message="introducer id cant be left blank")
	private long introducerId;
	
	@NotNull(message="balance cant be left blank")
	private long balance;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public long getGeneratorId() {
		return generatorId;
	}
	public void setGeneratorId(long generatorId) {
		this.generatorId = generatorId;
	}
	public long getIntroducerId() {
		return introducerId;
	}
	public void setIntroducerId(long introducerId) {
		this.introducerId = introducerId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
