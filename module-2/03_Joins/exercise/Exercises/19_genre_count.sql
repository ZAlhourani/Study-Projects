-- 19. The genre name and the number of movies in each genre. Name the count column 'num_of_movies'.
-- Order the results from the highest movie count to the lowest.
-- (19 rows, the highest expected count is around 400).
select genre_name, count(movie_id) as num_of_movies
from genre
join movie_genre using (genre_id)
join movie using (movie_id)
group by genre_name
order by num_of_movies desc;

