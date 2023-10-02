package com.techelevator.bank;

import java.util.Map;

public class MapExercises {

    /*
    if peter has at least $50, transfer half of peter's money to paul
    balances are represented as pennies i.e. $50 is 5,000 pennies
    */

    public Map<String, Integer> robertToPayPull (Map<String, Integer> startingBalance) {

        if (startingBalance.get("Peter") < 5_000) {
            return startingBalance;
        }

        int halfOfPetersMoney = startingBalance.get("Peter") / 2;

        startingBalance.put("Pall", startingBalance.get("Paul") + halfOfPetersMoney);
        startingBalance.put("Peter", startingBalance.get("Peter") - halfOfPetersMoney);

        return startingBalance;

    }
}
