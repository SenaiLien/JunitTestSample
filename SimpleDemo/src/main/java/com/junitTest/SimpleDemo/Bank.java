package com.junitTest.SimpleDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {
	
	String bankName = "Central Bank";
	int account = 0;
	private Map<String, Account> allAccount = new HashMap<>();
	
	public void addAccount(Account customer) {
		allAccount.put(customer.getOwner(), customer);
	}
	
	
	private void createAccount(String Name,int Money) {
		Account customer = new Account();
		customer.setOwner(Name);
		customer.setMoney(Money);
		account = account +1;
		
	}
	
	public void storeMoney(String Name,int Money) {
		//get Account information
		Account customer = allAccount.get(Name);
		int currentMoney = customer.getMoney();
		//get current Money and store money
		currentMoney = currentMoney+Money;
		//set the money
		customer.setMoney(currentMoney);
		//record to Account
		allAccount.put(Name, customer);
	}
	
	public Account getAccount(String Name) {
		Account customer = allAccount.get(Name);
		return customer;
	}
	
	public String getBankName() {
		return bankName;
	}

	
	

}
