-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)
select title
from movie
join person on person_id = movie.director_id
join collection on collection.collection_id = movie.collection_id
where collection_name = 'Star Wars Collection' and person_name != 'George Lucas'
order by title asc;
