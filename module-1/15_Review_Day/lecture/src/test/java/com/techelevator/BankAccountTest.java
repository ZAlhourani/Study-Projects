package com.techelevator;

import com.techelevator.bank.BankAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    private BankAccount sut;
    @Before
    private void setSut() {
        sut = new BankAccount("", "", 100);
    }

    @Test

    public void deposit_is_not_accepted_given_negative() {

        // arrange

        BankAccount sut = new BankAccount("", "");

        // act
        int resultingBalance = sut.deposit((-10));

        // assert
        Assert.assertEquals("The balance returned by the deposit method should be 0", 0, resultingBalance);
        Assert.assertEquals("The balance returned by the deposit method should match getBalance", 0, sut.getBalance());
    }

    @Test

    public void deposit_is_not_accepted_given_positive() {

        // arrange

        BankAccount sut = new BankAccount("", "", 100);

        // act
        int resultingBalance = sut.deposit(10);

        // assert
        Assert.assertEquals("The balance returned by the deposit method should be 110", 110, resultingBalance);
        Assert.assertEquals("The balance returned by the deposit method should match getBalance", 110, sut.getBalance());
    }

    @Test

    public void deposit_is_not_accepted_given_null_destination() {

        // arrange

        BankAccount destination = null;

        // act
        int myResultingBalance = sut.transferFunds(destination, 10);

        // assert
        Assert.assertEquals(100, myResultingBalance);
        Assert.assertEquals(100, sut.getBalance());
    }
}



