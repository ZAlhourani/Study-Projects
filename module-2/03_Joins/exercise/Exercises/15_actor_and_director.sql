-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie.
-- Order the results by movie title (A-Z)
-- (73 rows)
select title, person_name
from movie
join movie_actor on movie_actor.movie_id = movie.movie_id
join person on person_id = director_id and person_id = actor_id
where person_name = person_name
order by title asc;
