package com.BankingApplication;

import java.util.LinkedList;
import java.util.List;

public class TransactionDetails {
	
	public static List<Transaction> transactionList = new LinkedList<>();
	// we will store object t of transaction inside transactionlist
	public static void addTransaction(Transaction t) {
		transactionList.add(t);
	}
	public static void showMiniStatement(int actNumber) {
		System.out.println("Mini statement for account number:" + actNumber);
		System.out.println();
		for(Transaction t : transactionList) {
			if(t.getActNumber()==actNumber) {
				System.out.println(t.getTranNumber()+"-"+t.getTranType()+"-"+t.getTranAmount()+"-"+t.getBalanceAfterThisTransaction());
			}
		}
	}

}
