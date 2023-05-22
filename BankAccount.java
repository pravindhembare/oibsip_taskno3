package com.oasisinfobyte.atm_interface.main;

public class BankAccount {
	int balance;
    int prevTransaction;
    String customerid;
    String customerpin;
    int flag = 0;

    BankAccount(String cid, String cpin) {
        customerid = cid;
        customerpin = cpin;
    }
	
     
}
