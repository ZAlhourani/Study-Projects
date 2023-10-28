package com.techelevator.guessnumber.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

// TODO: fill in this class with fields matching your database
// as well as a few derived properties.
//
// We need the player name, 
// the guesses (in chronological order), 
// the number to guess, 
// the upper and lower bounds, 
// whether the game is over
// and a hint for the user's next guess e.g. "higher", "lower", "the same", or "don't know until your first guess is made"
public class Game {

    int gameId;
    String playerName;
    int lowerBound;
    int upperBound;
    @JsonIgnore
    int actualNumber;
    int guessAmount;


    public Game(int gameId, String playerName, int lower_bound, int upper_bound, int actual_number, int guessAmount) {
        this.gameId = gameId;
        this.playerName = playerName;
        this.lowerBound = lower_bound;
        this.upperBound = upper_bound;
        this.actualNumber = actual_number;
        this.guessAmount = guessAmount;

    }

    public Game() {
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public int getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(int actualNumber) {
        this.actualNumber = actualNumber;
    }

    public int getGuessAmount() {
        return guessAmount;
    }

    public void setGuessAmount(int guessAmount) {
        this.guessAmount = guessAmount;
    }

    public boolean isGameOver() {
        if (guessAmount == actualNumber) {
            return true;
        }
        return false;
    }

        public String getHint() {
            String hint = "";
            if (guessAmount > actualNumber) {
                hint = "Lower";
                System.out.println(hint);
            }
            if (guessAmount < actualNumber) {
            hint = "Higher";
                System.out.println("Higher");
            }
            if (guessAmount == actualNumber) {
                hint = "The Same";
                System.out.println("The Same");
            }
            return hint;
        }
    }




