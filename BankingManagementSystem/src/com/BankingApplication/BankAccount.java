package com.BankingApplication;

import java.util.Random;

public class BankAccount {
     private int actNumber;
     private String customerName;
     private int actBalance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int actNumber, String customerName, int actBalance) {
		super();
		this.actNumber = actNumber;
		this.customerName = customerName;
		this.actBalance = actBalance;
	}
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getActBalance() {
		return actBalance;
	}
	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}
     
     //Apart from above all we will add some methods 
	
	public void deposit(int depositAmount) {
		actBalance += depositAmount;
		Random r = new Random();
		
		//after performing the deposit we need to store the deposit details
		//in an object of a Transaction class 
		//and them store that object in some collection such as LinkedList
		//for future reference
		Transaction t = new Transaction(r.nextInt(), actNumber, depositAmount, "deposit", actBalance);
		//r.nextInt() == randomly generated no  tht is transaction no.
		TransactionDetails.addTransaction(t);
		System.out.println("deposit completed and transaction stored...");
     } 
	public void withdraw(int  withdrawAmount) {
		Random r = new Random();
		if(withdrawAmount > actBalance) {
			try {
			throw new InSufficientBalanceException();
		} catch (InSufficientBalanceException e) {
			e.printStackTrace();
		}
			
		}
		
		actBalance -= withdrawAmount;
		//after performing the withdraw we need to store the deposit details
	    //in an object of a Transaction class 
		//and them store that object in some collection such as LinkedList
		//for future reference
		Transaction t = new Transaction(r.nextInt(), actNumber, withdrawAmount, "withdraw", actBalance);
		TransactionDetails.addTransaction(t);
		System.out.println("withdraw completed and transaction stored...");
	}
		
}
