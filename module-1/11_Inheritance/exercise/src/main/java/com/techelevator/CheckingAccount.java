package com.techelevator;

public class CheckingAccount extends BankAccount {

    private static final int OVERDRAFT_FEE = 10;
    private static final int MAX_OVERDRAW = -100;


    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }


    @Override
    public int withdraw(int amountToWithdraw) {
        if ((getBalance() - amountToWithdraw) <= MAX_OVERDRAW){
            return getBalance();
        }
        super.withdraw(amountToWithdraw);

        if (getBalance() < 0 && getBalance() >= MAX_OVERDRAW) {
                super.withdraw(OVERDRAFT_FEE);
            }
        return getBalance();
    }
}








