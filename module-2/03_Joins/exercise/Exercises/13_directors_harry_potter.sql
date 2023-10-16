-- 13. The directors of the movies in the "Harry Potter Collection", sorted alphabetically.
-- (4 rows)
select person_name
from person
join movie on movie.director_id = person_id
join collection on collection.collection_id = movie.collection_id
where collection_name = 'Harry Potter Collection'
group by person_name
order by person_name asc;
