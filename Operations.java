package com.oasisinfobyte.atm_interface.main;

public class Operations {

	public static final void clrscr() {
        try {
            try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
    } catch (final Exception es) {
        // System.out.println("nothing here!");
    }

    }

    
	static void deposit(int amount) {
        if (amount != 0) {
        	ATM_Interface.bankAccount.balance = ATM_Interface.bankAccount.balance + amount;
        	ATM_Interface.bankAccount.prevTransaction = amount;
        }
    }

   static void withdraw(int amount) {
        if (ATM_Interface.bankAccount.balance > amount) {
        	ATM_Interface.bankAccount.balance = ATM_Interface.bankAccount.balance - amount;
        	ATM_Interface.bankAccount.prevTransaction = -amount;
        } else {
            clrscr();
            System.out.println("=================================");
            System.out.println("Sufficient Balance not available for the withdrawl!");
            System.out.println("=================================");
        }
    }

    static void getPrevTransaction() {
        if (ATM_Interface.bankAccount.prevTransaction > 0) {
            System.out.println("Deposited: " + ATM_Interface.bankAccount.prevTransaction);
        } else if (ATM_Interface.bankAccount.prevTransaction < 0) {
            System.out.println("Withdraw: " + Math.abs(ATM_Interface.bankAccount.prevTransaction));
        } else {
            System.out.println("No Transaction Occured ");
        }
    }

   static public void transfer(double amount, BankAccount bankAccount2) {
        if (ATM_Interface.bankAccount.balance < amount) {
            clrscr();
            System.out.println("=================================");
            System.out.println("Transfer Fails due to insufficient balance!");
            System.out.println("=================================");
        } else {
        	ATM_Interface.bankAccount.balance -= amount;
        	bankAccount2.balance += amount;
            System.out.println("Account of " + ATM_Interface.bankAccount.customerid + " becomes $" + ATM_Interface.bankAccount.balance);
            System.out.println("Account of " + bankAccount2.customerid + " becomes $" + bankAccount2.balance);
            System.out.println("\n");
        }
    }
}
