-- 17. The titles and taglines of movies that are in the "Family" genre that Samuel L. Jackson has acted in.
-- Order the results alphabetically by movie title.
-- (4 rows)
select title, tagline
from movie
join movie_actor using (movie_id)
join movie_genre using (movie_id)
join genre using (genre_id)
join person on person_id = movie_actor.actor_id
where genre_name = 'Family' and person_name = 'Samuel L. Jackson'
order by title asc;


