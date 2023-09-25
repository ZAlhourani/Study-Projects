package com.techelevator.cardexample;

import jdk.jshell.Snippet;

public class MainProgram {

	public static void main(String[] args) {

		Card aceOfSpades = new Card("Ace", "Spades");

		Card twoOfDiamonds = new Card("Two", "Diamonds");

		Card threeOfClubs = new Card("Three", "Clubs");

		Card fourOfHearts = new Card ("Four", "Hearts");

		aceOfSpades.flip();

		System.out.println(aceOfSpades.cardString());

		System.out.println(twoOfDiamonds.cardString());

		Deck pockerDeck = new Deck("Red");

		pockerDeck.addCard(aceOfSpades);
		pockerDeck.addCard(twoOfDiamonds);
		pockerDeck.addCard(threeOfClubs);
		pockerDeck.addCard(fourOfHearts);

		System.out.println(pockerDeck.showDeck());

		pockerDeck.shuffle();

		System.out.println(pockerDeck.showDeck());

		Card topCard = pockerDeck.drawTop();

		System.out.println(topCard.cardString());

		String[] allSuits = {"Spades", "Clubs", "Diamonds", "Hearts"};
		String[] allRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

		Deck myNewDeck = new Deck("Blue");

		for (String suit : allSuits){
			for (String rank : allRanks){
				Card currCard = new Card(rank, suit);
				myNewDeck.addCard(currCard);
			}
		}
		myNewDeck.shuffle();

		System.out.println(myNewDeck.showDeck());


	}

}
