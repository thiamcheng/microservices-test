package com.ibm.tc.homework.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Customers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String customerId; 
	
	@NotNull
	@Size(min=5, max=30)
	private String accountName;
	private String accountType;
	private String balance;
	private String currency;
	
	public Customers() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Customers(String customerId, String accountName, String accountType, String balance, String currency) {
		// super();
		this.customerId = customerId;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balance = balance;
		this.currency = currency;
	}

	public Long getId() {
		    return id;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
}
