package com.techelevator;

public class SavingsAccount extends BankAccount {

    private static final int MIN_BALANCE_FOR_WITHDRAWAL = 150;
    private static final int SERVICE_CHARGE = 2;

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw) {


        if (getBalance() < amountToWithdraw + 2 || amountToWithdraw < 0) {
            return getBalance();
        }

        super.withdraw(amountToWithdraw);
        if ((getBalance()) < MIN_BALANCE_FOR_WITHDRAWAL) {
            super.withdraw(SERVICE_CHARGE);
        }

        return getBalance();
        }

    }


