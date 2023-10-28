BEGIN TRANSACTION;

-- TODO: create tables for storing games, and guesses made for a game

-- For games, we will need to know the player's name, 
-- the lower and upper bounds of possible numbers, 
-- as well as the actual number the player should be attempting to guess.

-- For guesses, we will need to know which game the guess was for
-- and when the guess was made so that we can order guesses chronologically

drop table if exists member, games, guesses;

create table games (
game_id serial,
player_name varchar(100) not null,
lower_bound integer,
upper_bound integer,
actual_number integer,

constraint game_id primary key (game_id)
);


create table guesses (
guess_id serial not null,
game_id integer,
guess_amount integer not null,
guess_order timestamp,

constraint guess_id primary key (guess_id),
constraint fk_game_id foreign key (game_id) references games(game_id)
);



COMMIT;
