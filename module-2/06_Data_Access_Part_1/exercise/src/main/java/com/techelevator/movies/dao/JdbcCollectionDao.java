package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcCollectionDao implements CollectionDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcCollectionDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Collection> getCollections() {

        List<Collection> collectionName = new ArrayList<>();
        String sql = "select * from collection;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {

            Collection collection = mapRowToCollection(results);

            collectionName.add(collection);
        }
        return collectionName;

    }

    @Override
    public Collection getCollectionById(int id) {

        Collection collection = null;
        String sql = "select collection_id, collection_name from collection where collection_id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            collection = mapRowToCollection(results);

        }
        return collection;
    }

    @Override
    public List<Collection> getCollectionsByName(String name, boolean useWildCard) {

        Collection collection;

        List<Collection> collectionList = new ArrayList<>();
        String sql = "select collection_id, collection_name from collection where collection_name ilike ?;";

        if (useWildCard) {
            name = "%" + name + "%" ;
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, name);
        while (results.next()) {
            collection = mapRowToCollection(results);
           collectionList.add(collection);
        }
        return collectionList;

    }


    private Collection mapRowToCollection(SqlRowSet rowSet) {
        Collection collection = new Collection();

        int collectionId = rowSet.getInt("collection_id");

        collection.setId(collectionId);

        collection.setName(rowSet.getString("collection_name"));

        return collection;
    }
}
