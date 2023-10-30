package com.techelevator.guessnumber.dao;

import com.techelevator.guessnumber.model.Game;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcGuessNumberDao implements GuessNumberDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcGuessNumberDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Game startNewGame(String playerName) {
        Game newGame;
        String sql = "insert into games (player_name, lower_bound, upper_bound, actual_number" +
                "values (?,1,100,55) returning game_id";

            int gameId = jdbcTemplate.queryForObject(sql, int.class, playerName);
            newGame = getGameById(gameId);

            return newGame;
    }

    @Override
    public List<Game> getAll() {

        List<Game> gameList = new ArrayList<>();

        String sql = "select * from games";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {
//            Game newCity = mapRow(results);
//            gameList.add(newCity);
        }
        return gameList;


    }

    @Override
    public Game getGameById(int gameId) {
       return null;
    }

    @Override
    public Game makeGuess(int gameId, int guess) {
        return null;
    }
}
