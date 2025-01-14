package com.techelevator.guessnumber.controller;

import com.techelevator.guessnumber.RandomGenerator;
import com.techelevator.guessnumber.dao.GuessNumberDao;
import com.techelevator.guessnumber.model.Game;
import com.techelevator.guessnumber.security.dao.UserDao;
import com.techelevator.guessnumber.security.model.User;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@PreAuthorize("isAuthenticated()")
public class GuessNumberController {

    private final GuessNumberDao guessNumberDao;
    private final UserDao userDao;
    public GuessNumberController(GuessNumberDao guessNumberDao, UserDao userDao) {
        this.guessNumberDao = guessNumberDao;
        this.userDao= userDao;
    }

    @PreAuthorize("permitAll")
    @GetMapping("/games")
    public List<Game> getAllGames() {
        return guessNumberDao.getAllGames();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/games")

    public Game startNewGame(Principal principal) {

        String username = principal.getName();
        User loggedInUser = userDao.getUserByUsername(username);

        int random = RandomGenerator.getRandom(Game.DEFAULT_LOWER_BOUND, Game.DEFAULT_UPPER_BOUND);

        Game gameToCreate = new Game();

        gameToCreate.setUserId(loggedInUser.getId());
        gameToCreate.setLowerBound(Game.DEFAULT_LOWER_BOUND);
        gameToCreate.setUpperBound(Game.DEFAULT_UPPER_BOUND);
        gameToCreate.setNumberToGuess(random);

        return guessNumberDao.startNewGame(gameToCreate);
    }
}
