package com.BankingApplication;

public class BankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount(101, "Dipti", 10000);
		
		BankAccount b2 = new BankAccount(102, "Surbhi", 15000);
		
		BankAccount b3 = new BankAccount(103, "Pavni", 20000);
		
		b1.deposit(1000);
		b1.deposit(500);
		b1.deposit(700);
		b1.withdraw(3500);
		b1.withdraw(300);
		b1.deposit(500);
		
		System.out.println("----------------");
		//print mini statement for that we have to pass account no
		TransactionDetails.showMiniStatement(101);
		
		b2.deposit(1000);
		b2.deposit(500);
		b2.deposit(700);
		b2.withdraw(3500);
		b2.withdraw(300);
		b2.deposit(500);
		
		System.out.println("----------------");
		//print mini statement for that we have to pass account no
		TransactionDetails.showMiniStatement(102);
		
		b3.deposit(1000);
		b3.deposit(500);
		b3.deposit(700);
		b3.withdraw(3500);
		b3.withdraw(300);
		b3.deposit(500);
		
		System.out.println("----------------");
		//print mini statement for that we have to pass account no
		TransactionDetails.showMiniStatement(103);


		

	}

}
