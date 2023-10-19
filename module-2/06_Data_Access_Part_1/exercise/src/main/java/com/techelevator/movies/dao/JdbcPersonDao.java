package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Genre;
import com.techelevator.movies.model.Movie;
import com.techelevator.movies.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcPersonDao implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcPersonDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Person> getPersons() {

        List<Person> personName = new ArrayList<>();
        String sql = "select * from person";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {

           Person person = mapRowToPerson(results);

            personName.add(person);
        }
        return personName;

    }

    @Override
    public Person getPersonById(int id) {

        Person person = null;
        String sql = "select * from person where person_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            person = mapRowToPerson(results);
        }
        return person;

    }

    @Override
    public List<Person> getPersonsByName(String name, boolean useWildCard) {

        Person person;

        List<Person> personName = new ArrayList<>();

        String sql = "select * from person where person_name ilike ?;";

        if (useWildCard) {
            name = "%" + name + "%" ;
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);
        while (results.next()) {

           person = mapRowToPerson(results);
            personName.add(person);

        }
        return personName;
    }

    @Override
    public List<Person> getPersonsByCollectionName(String collectionName, boolean useWildCard) {

        Person person;

        List<Person> personCollection = new ArrayList<>();

        String sql = "select distinct person.* from person " +
                "join movie_actor on actor_id = person_id " +
                "join movie using (movie_id) " +
                "join collection using (collection_id)" +
                "where collection_name ilike ? " +
                "order by person_name asc;";

        if (useWildCard) {
            collectionName = "%" + collectionName + "%";
        }

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, collectionName);
        while (results.next()) {

            person = mapRowToPerson(results);

            personCollection.add(person);
        }
        return personCollection;
    }

    private Person mapRowToPerson(SqlRowSet rowSet) {
        Person person = new Person();

        int personId = rowSet.getInt("person_id");

        person.setId(personId);

        person.setName(rowSet.getString("person_name"));
        person.setBiography(rowSet.getString("biography"));
        if (rowSet.getDate("birthday") != null) {
            person.setBirthday(rowSet.getDate("birthday").toLocalDate());
        }
        if (rowSet.getDate("deathday") != null){
            person.setDeathDay(rowSet.getDate("deathday").toLocalDate());
        }
        person.setProfilePath(rowSet.getString("profile_path"));
        person.setHomePage(rowSet.getString("home_page"));

        return person;
    }
}
