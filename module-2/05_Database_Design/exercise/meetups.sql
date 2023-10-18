

drop table if exists member, group_table, event, group_member, event_member;

create table member (
	
	member_number serial,
	last_name varchar not null,
	first_name varchar not null, 
	email varchar not null,
	phone_number varchar,
	date_of_birth date not null,
	email_reminder boolean not null,
	
	constraint pk_member primary key (member_number)
);

create table group_table (
	
	group_number serial,
	name varchar not null,
	
	constraint pk_group primary key (group_number),
	constraint no_duplicate_name unique (name)
);

create table event (

	event_number serial,
	name varchar not null,
	description varchar not null,
	event_date_time timestamp not null,
	duration integer not null,
	running_gruop varchar,
	
	constraint pk_event primary key (event_number),
	constraint not_more_30_min check (duration >= 30)
);

create table group_member (
	
	group_number integer not null,
	member_number integer not null,
	
	constraint pk_group_member primary key (group_number, member_number),
	constraint fk_group foreign key (group_number) references group_table(group_number),
	constraint fk_member foreign key (member_number) references member(member_number)	
);

create table event_member (
	
	event_number integer not null,
	member_number integer not null,
	
	constraint pk_event_member primary key (event_number, member_number),
	constraint fk_event foreign key (event_number) references event(event_number),
	constraint fk_member foreign key (member_number) references member(member_number)	
);

insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Alhourani', 'Zee', 'zee@gmail.com', '412-669-0708', '1989-05-25', True);
insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Smith', 'Adam', 'adam@gmail.com', '412-666-7777', '1995-01-12', false);
insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Salah', 'Rami', 'rami@yahoo.com', '412-546-8975', '1980-07-24', true);
insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Williams', 'Ashley', 'ashley@gmail.com', '412-632-9147', '1999-03-16', false);
insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Jones', 'Joyce', 'joyce@yahoo.com', '412-669-8757', '1975-05-08', true);
insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Murray', 'Andy', 'andy@gmail.com', '', '1988-09-15',true);
insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Ronaldo', 'Chris', 'chris@outlook.com', '724-557-9432', '1982-11-23', true);
insert into member (last_name, first_name, email, phone_number, date_of_birth, email_reminder)
values ('Statham', 'Christina', 'christina@gmail.com', '', '1997-08-13', false);

insert into group_table (name) values ('American Group');
insert into group_table (name) values ('Spanish Group');
insert into group_table (name) values ('Italian Group');

insert into event (name, description, event_date_time, duration, running_gruop)
values ('Olympic Games', 'Discussing where is the next Olympic games will be', '2023-11-01 12:00:00', 90, 'International Olympic Committee');
insert into event (name, description, event_date_time, duration, running_gruop)
values ('World Cup', 'Discussing where is the next World Cup will be', '2023-12-20 09:30:00', 60, 'FIFA');
insert into event (name, description, event_date_time, duration, running_gruop)
values ('NFL Final Game', 'Discussing where is the 2024 NFL final game will be', '2024-01-30 10:00:00', 75, 'NFL');
insert into event (name, description, event_date_time, duration, running_gruop)
values ('Davis Cup', 'Discussing where is the 2024 Davis Cup will be', '2024-02-15 11:00:00', 120, 'International Tennis Federation');

insert into event_member (event_number, member_number)
values ((select event_number from event where name = 'Olympic Games'), (select member_number from member where last_name = 'Smith'));

insert into event_member (event_number, member_number)
values ((select event_number from event where name = 'World Cup'), (select member_number from member where last_name = 'Alhourani'));

insert into event_member (event_number, member_number)
values ((select event_number from event where name = 'NFL Final Game'), (select member_number from member where last_name = 'Williams'));

insert into event_member (event_number, member_number)
values ((select event_number from event where name = 'Davis Cup'), (select member_number from member where last_name = 'Statham'));

insert into group_member (group_number, member_number)
values ((select group_number from group_table where name = 'American Group'), (select member_number from member where last_name = 'Salah'));

insert into group_member (group_number, member_number)
values ((select group_number from group_table where name = 'American Group'), (select member_number from member where last_name = 'Murray'));

insert into group_member (group_number, member_number)
values ((select group_number from group_table where name = 'Spanish Group'), (select member_number from member where last_name = 'Jones'));

insert into group_member (group_number, member_number)
values ((select group_number from group_table where name = 'Spanish Group'), (select member_number from member where last_name = 'Ronaldo'));

insert into group_member (group_number, member_number)
values ((select group_number from group_table where name = 'Italian Group'), (select member_number from member where last_name = 'Williams'));

insert into group_member (group_number, member_number)
values ((select group_number from group_table where name = 'Italian Group'), (select member_number from member where last_name = 'Statham'));



