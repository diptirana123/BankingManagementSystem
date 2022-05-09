package com.BankingApplication;

public class InSufficientBalanceException extends Exception {
	
	public String toString(){
		return "Balance not Sufficient";
		
	}

}
