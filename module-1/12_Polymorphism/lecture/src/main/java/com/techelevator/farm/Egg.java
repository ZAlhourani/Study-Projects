package com.techelevator.farm;

public class Egg implements Sellable {

    @Override
    public String getName() {
        return "EGG";
    }
    @Override
    public int getPrice() {
        return 1;
    }

}
