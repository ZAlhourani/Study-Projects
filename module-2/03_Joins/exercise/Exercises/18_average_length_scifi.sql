-- 18. The average length of movies in the "Science Fiction" genre. Name the column 'average_length'.
-- (1 row, expected result between 110-120)
select avg(length_minutes) as average_length
from movie
join movie_genre using (movie_id)
join genre using (genre_id)
where genre_name = 'Science Fiction';
