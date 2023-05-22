package com.oasisinfobyte.atm_interface.main;

import java.util.Scanner;

public class CheckLogin {
	static int flag = 0;
	static void checkId() {
		Operations.clrscr();
        System.out.println("Welcome " + ATM_Interface.bankAccount.customerid);
        System.out.println();
        System.out.print("Please enter the User ID: ");
        Scanner id = new Scanner(System.in);
        String uid = id.nextLine();
        System.out.print("Please enter the PIN: ");        
        String upin = id.nextLine();
        if (uid.equals(ATM_Interface.bankAccount.customerid) && upin.equals(ATM_Interface.bankAccount.customerpin)) {
        	Operations.clrscr();
        	ShowMenu.showMenu();
        } else {
            System.out.println("=================================");
            System.out.println("Wrong Login!!");
            System.out.println("=================================");

            if (flag < 3) {
                flag++;
                checkId();
            }
        }
        id.close();
    }
}
