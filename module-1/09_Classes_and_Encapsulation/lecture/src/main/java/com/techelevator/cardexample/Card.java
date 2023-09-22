package com.techelevator.cardexample;

public class Card {
    // Constants

    public static final char SPADES_SYMBOL = '\u2660';
    public static final char DIAMONDS_SYMBOL = '\u2666';
    public static final char HEARTS_SYMBOL = '\u2665';
    public static final char CLUBS_SYMBOL = '\u2663';
    // data:
    // rank - String
    // suit - String
    // color -String
    // faceUp - boolean

    private final String rank;

    private String suit;


    private boolean faceUp = true;


    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(String rank, String suit, boolean faceUp) {
        this(rank, suit);    // refers to the constructor above instead of write it again
        this.faceUp = faceUp;
    }

    // behaviors:

    // getters
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    // setters
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // here we can derive the color instead of put it as a field
    public String getColor() {
        if (suit.equalsIgnoreCase("Clubs") || suit.equalsIgnoreCase("Spades")) {
            return "Black";
        }
        return "Red";
    }

    public char getSymbol() {
        if (suit.equalsIgnoreCase("Spades")) {
            return SPADES_SYMBOL;
        }
        if (suit.equalsIgnoreCase("Clubs")) {
            return CLUBS_SYMBOL;
        }
        if (suit.equalsIgnoreCase("Hearts")) {
            return HEARTS_SYMBOL;
        } else
            return DIAMONDS_SYMBOL;
    }


        // getters a boolean
        public boolean isFaceUp () {
            return faceUp;
        }

        // flip()

        public void flip () {
            faceUp = !faceUp;
        }


        public String cardString () {
            if (!faceUp) {
                return "##";
            }

            // Ace of Spades (Black)
            return rank + " of " + getSymbol() + " "+ suit + "(" + getColor() + ")";
        }

    }



