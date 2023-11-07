package com.techelevator.guessnumber.dao;

import com.techelevator.guessnumber.model.Game;

import java.util.List;

public interface GuessNumberDao {

    List<Game> getAllGames();

    Game startNewGame(Game gameToCreate);
}
