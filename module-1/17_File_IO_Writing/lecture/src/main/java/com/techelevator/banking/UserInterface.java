package com.techelevator.banking;

import java.util.Scanner;

public class UserInterface {

    private Scanner userInput = new Scanner(System.in);

    private BankAccountData data = new BankAccountData();

    public void run () {

        while (true) {

        System.out.println("Please choose an option");
        System.out.println("[1] Deposit");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Exit");

        String menuChoice = userInput.nextLine();

        // switch is to compare things

        switch (menuChoice) {
            case "1":
                doDeposit(); // we moved the code down at the bottom to
                break; // we have to break after we finish the work in switch method

            case "2":
                doWithdraw();
                break;
            case "3":
                System.out.println("Thanks for stopping by!");
                return;
            default:
                System.out.println("Incorrect input, please");
                break;
        }
        }
    }

    private void doDeposit() {
        System.out.println("How much would like you to deposit?");
        int howMuch = Integer.parseInt(userInput.nextLine());     // deposit has to be integer
        System.out.println("Which account number would you like to deposit into?");

        String accountNumber = userInput.nextLine();
        data.deposit(accountNumber, howMuch);
    }

    private void doWithdraw () {

        System.out.println("How much would like you to withdraw?");
        int howMuch = Integer.parseInt(userInput.nextLine());     // deposit has to be integer
        System.out.println("Which account number would you like to withdraw from?");

        String accountNumber = userInput.nextLine();
        data.withdraw(accountNumber, howMuch);
    }
    }
