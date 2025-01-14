package com.techelevator.banking;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountData {
    private Map<String, BankAccount> mapOfAccounts = new HashMap<>();
    private File accountsFile =new File("bankaccounts.txt");

    public BankAccountData() {



        try (Scanner fileReader = new Scanner(accountsFile)) {

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                // split the line to 3 parts
                String[] lineParts = line.split(",");

                String accountNumber = lineParts[0];
                String accountHolder = lineParts[1];
                int balance = Integer.parseInt(lineParts[2]);

                BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);

                mapOfAccounts.put(accountNumber, bankAccount);

            }

        } catch (FileNotFoundException e) {

        }
    }

    public void deposit(String accountNumber, int howMuch) {

        BankAccount account = findBankAccountByAccountNumber(accountNumber);
        if (account != null) {
            account.deposit(howMuch);
            saveAccounts();
        }
    }
    public void withdraw (String accountNumber, int howMuch) {

        BankAccount account = findBankAccountByAccountNumber(accountNumber);
        if (account != null) {
            account.withdraw(howMuch);
            saveAccounts();
        }

    }
    private BankAccount findBankAccountByAccountNumber(String accountNumber) {

        return mapOfAccounts.get(accountNumber);


    }

    // updating the file

    public void saveAccounts() {
        try (PrintWriter printWriter = new PrintWriter(accountsFile)) {

            for (String key : mapOfAccounts.keySet()) {
                BankAccount account = mapOfAccounts.get(key);

                String accountNumber = account.getAccountNumber();
                String accountHolder = account.getAccountHolderName();
                int balance = account.getBalance();

                String lineToWrite = accountNumber + "," + accountHolder + "," + balance;

                printWriter.println(lineToWrite);
            }
        } catch (FileNotFoundException e) {

        }
    }
}