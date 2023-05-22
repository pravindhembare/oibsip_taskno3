package com.oasisinfobyte.atm_interface.main;

import java.util.Scanner;

public class ShowMenu {
	static void showMenu() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + ATM_Interface.bankAccount.customerid);
        System.out.println("Your ID is  " + ATM_Interface.bankAccount.customerpin);
        do {
            System.out.println("\n");
            System.out.println("\n");
            System.out.println("1. Check Balance");
            System.out.println("2. Transaction History");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Quit");

            System.out.println("=================================");
            System.out.println("Enter the option");
            System.out.println("=================================");
            option = sc.nextInt();          
            System.out.println("\n");

            switch (option) {
                case 1:
                	Operations.clrscr();
                    System.out.println("================");
                    System.out.println("Balance " + ATM_Interface.bankAccount.balance);
                    System.out.println("================");
                    System.out.println("\n");
                    break;
                    
                case 2:
                	Operations.clrscr();
                    System.out.println("================");
                    Operations.getPrevTransaction();
                    System.out.println("================");
                    System.out.println("\n");
                    break;
                    
                case 3:
                	Operations.clrscr();
                    System.out.println("================");
                    System.out.println("Enter the amount to deposit");
                    System.out.println("================");
                    int amount = sc.nextInt();
                    Operations.deposit(amount);
                    System.out.println("\n");
                    break;
                
                case 4:
                	Operations.clrscr();
                    System.out.println("================");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("================");
                    int amount2 = sc.nextInt();
                    Operations.withdraw(amount2);
                    System.out.println("\n");
                    break;

                

                case 5:
                	Operations.clrscr();
                    System.out.println("***************");
                    System.out.println("To whom");
                    BankAccount bb = new BankAccount("Ganesh", "2002");
                    System.out.println(bb.customerid);
                    System.out.println("***************");
                    System.out.println("Amount to Transfer");
                    double am = sc.nextDouble();
                    System.out.println("***************");
                    Operations.transfer(am, bb);
                    break;

                case 6:
                	Operations.clrscr();
                    System.out.println("***************");
                    break;
                
                default:
                	Operations.clrscr();
                    System.out.println("Invalid Option!!! Please Enter Again");
            }

        } while (option != 'F');
        System.out.println("ThankYou For using our services");
        sc.close();
    }
}
