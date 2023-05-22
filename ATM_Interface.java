package com.oasisinfobyte.atm_interface.main;

public class ATM_Interface {
	public static BankAccount bankAccount; 
	 public static void main(String[] args) {
		 bankAccount = new BankAccount("Pravin", "2001");
		 CheckLogin.checkId();
	    }



}
