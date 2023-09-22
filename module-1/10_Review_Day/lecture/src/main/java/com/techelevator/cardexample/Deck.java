package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {

    }
    public Deck(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    public void shuffle() {
        Random r = new Random();

        for (int i = 0; i < cards.size(); i++) {
            int random = r.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(random));
            cards.set(random, temp);
        }
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }

        return cards.remove(cards.size()-1);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public String deckString() {
        StringBuilder builder = new StringBuilder();

        for (Card card : cards) {
            builder.append(card.cardString()).append(",");
        }

        return builder.toString();
    }
}
