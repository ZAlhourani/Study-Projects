/*
customer
artist
painting 
purchase

artist_painting ??
artist_painting

*/

drop table if exists customer, artist, painting, purchase;

create table customer (
	customer_id serial primary key,
	name varchar(100) not null,
	phone_number varchar(15) null,
	address varchar(100) null
);

create table artist (
	artist_id serial,
	name varchar(100) not null,
	
	constraint pk_artist primary key (artist_id)
);

create table painting (
	painting_id serial,
	artist_id integer references artist(artist_id) not null, 
	title varchar(500) not null,
	
	constraint pk_painting primary key (painting_id)
);

create table purchase (
	purchase_id serial,
	customer_id integer not null,
	painting_id integer not null,
	purchase_date date not null default(current_date),
	sales_price numeric (15, 2) not null,
	
	constraint pk_purchase primary key (purchase_id),
	constraint fk_customer foreign key (customer_id) references customer(customer_id),
	constraint fk_painting foreign key (painting_id) references painting(painting_id),
	constraint chk_sales_price_is_positive check (sales_price >= 0)
);

create table artist_painting (
	artist_id integer not null,
	painting_id integer not null,
	
	constraint pk_artist_painting primary key (artist_id, painting_id),
	constraint fk_artist foreign key (artist_id) references artist(artist_id),
	constraint fk_painting foreign key (painting_id) references painting(painting_id)

	
);