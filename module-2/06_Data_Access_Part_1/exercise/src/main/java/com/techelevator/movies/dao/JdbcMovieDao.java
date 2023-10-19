package com.techelevator.movies.dao;

import com.techelevator.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JdbcMovieDao implements MovieDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcMovieDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Movie> getMovies() {

        List<Movie> movieName = new ArrayList<>();
        String sql = "select * from movie";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {

            Movie movie = mapRowToMovie(results);

            movieName.add(movie);
        }
        return movieName;

    }

    @Override
    public Movie getMovieById(int id) {

        Movie movie = null;
        String sql = "select * from movie where movie_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
         if (results.next()) {
             movie = mapRowToMovie(results);

         }
         return movie;

    }

    @Override
    public List<Movie> getMoviesByTitle(String title, boolean useWildCard) {

        Movie movie;

        List<Movie> movieTitle = new ArrayList<>();

        String sql = "select * from movie where title ilike ?;";

        if (useWildCard) {
            title = "%" + title + "%";
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, title);

        while (results.next()) {
            movie = mapRowToMovie(results);

            movieTitle.add(movie);

        }
        return movieTitle;
    }

    @Override
    public List<Movie> getMoviesByDirectorNameAndBetweenYears(String directorName, int startYear,
                                                              int endYear, boolean useWildCard) {
        Movie movie;

        List<Movie> directorMovie = new ArrayList<>();


        String sql = "select * from movie " +
                "join person on person_id = director_id " +
                "where person_name ilike ? and date_part('year', release_date) between ? and ? " +
                "order by release_date asc;";

        if (useWildCard) {
            directorName = "%" + directorName + "%";
        }

        // or we can do the date like this
        //        LocalDate startDate = LocalDate.of(startYear, 1,1);
        //        LocalDate endDate = LocalDate.of(endYear, 12, 31);
        //        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, directorName, startDate, endDate);



        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, directorName, startYear, endYear);

        while (results.next()) {

            movie = mapRowToMovie(results);

            directorMovie.add(movie);
        }

        return directorMovie;
    }







    private Movie mapRowToMovie(SqlRowSet rowSet) {
        Movie movie = new Movie();

        int movieId = rowSet.getInt("movie_id");

        movie.setId(movieId);

        movie.setTitle(rowSet.getString("title"));
        movie.setOverview(rowSet.getString("overview"));
        movie.setTagline(rowSet.getString("tagline"));
        movie.setPosterPath(rowSet.getString("poster_path"));
        movie.setHomePage(rowSet.getString("home_page"));
        movie.setReleaseDate(rowSet.getDate("release_date").toLocalDate());
        movie.setLengthMinutes(rowSet.getInt("length_minutes"));
        movie.setDirectorId(rowSet.getInt("director_id"));
        movie.setCollectionId(rowSet.getInt("collection_id"));
        return movie;
    }
}
