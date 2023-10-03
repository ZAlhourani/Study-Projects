package com.techelevator;

public class Review {

    public boolean placeBid(int bidAmount) {

        if (bidAmount < 0) {
            throw new IllegalArgumentException("Bid amount must ba a positive integer");

        }
        return true;
    }

}
