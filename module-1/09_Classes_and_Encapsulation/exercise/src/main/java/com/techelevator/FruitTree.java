package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;

    private int startingPiecesOfFruit;

    public FruitTree (String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.startingPiecesOfFruit = startingPiecesOfFruit;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }
    public int getStartingPiecesOfFruit() {
        return startingPiecesOfFruit;
    }

    public String pickFruit (int numberOfPiecesToRemove) {
        if (piecesOfFruitLeft > startingPiecesOfFruit) {
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
        }else if (piecesOfFruitLeft < numberOfPiecesToRemove);
        return "false";
    }




}
