-- 2. The names and birthdays of actors in "The Fifth Element"
-- Order the results alphabetically (A-Z) by name.
-- (15 rows)
select person_name, birthday
from person
join movie_actor on actor_id = person.person_id
join movie using (movie_id)
where title = 'The Fifth Element'
order by person_name asc;
