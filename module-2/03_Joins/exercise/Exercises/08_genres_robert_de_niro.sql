-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)

-- first solution :

--select genre_name
--from person
--join movie_actor on movie_actor.actor_id = person_id
--join movie on movie.movie_id = movie_actor.movie_id
--join movie_genre on movie.movie_id = movie_genre.movie_id
--join genre on movie_genre.genre_id = genre.genre_id
--where person_name = 'Robert De Niro' and release_date >= '2010-01-01'
--group by genre_name
--order by genre_name asc;

-- walt solution :

select distinct genre_name
from genre
join movie_genre using (genre_id)
join movie using (movie_id)
join movie_actor using(movie_id)
join person on person_id = actor_id
where person_name = 'Robert De Niro' and release_date >= '2010-01-01'
order by genre_name;
