package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Genre;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcGenreDao implements GenreDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcGenreDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Genre> getGenres() {

        List<Genre> genreName = new ArrayList<>();
        String sql = "select * from genre;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {

            Genre genre = mapRowToGenre(results);

            genreName.add(genre);
        }
        return genreName;

    }

    @Override
    public Genre getGenreById(int id) {
        Genre genre = null;
        String sql = "select genre_id, genre_name from genre where genre_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            genre = mapRowToGenre(results);

        }
        return genre;
    }


    @Override
    public List<Genre> getGenresByName(String name, boolean useWildCard) {

        Genre genre;

        List<Genre> genreList = new ArrayList<>();

        String sql = "select genre_id, genre_name from genre where genre_name ilike ?;";

        if (useWildCard) {
            name = "%" + name + "%" ;
        }

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);
        while (results.next()) {
            genre = mapRowToGenre(results);

            genreList.add(genre);
        }
        return genreList;


    }



    private Genre mapRowToGenre(SqlRowSet rowSet) {
        Genre genre = new Genre();

        int genreId = rowSet.getInt("genre_id");

        genre.setId(genreId);

        genre.setName(rowSet.getString("genre_name"));

        return genre;
    }
}
