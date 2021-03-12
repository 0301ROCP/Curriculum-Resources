--DDL: Data Definition Language
-- DDL has commands that will affect the structure of a table!

--CREATE: create a table 
--ALTER: modify/alter the structure of the table
--DROP: remove the table structure all together, including the data
--TRUNCATE: remove all the data, while keeping the table structure!

create table basic_table( --typing convention is different in sql
	
	--In Java "basicTable", in sql, we don't use case so we use underscore
	--in SQL "basic_table"
	--This table has no columns, so we can't actually store any information there!
)

drop table basic_table; --removes the table structure and it removes all the data

create table if not exists upgraded_table(
		user_id int, --we only have to define column name and datatype
		user_name varchar(30)
);

drop table upgraded_table;

insert into upgraded_table values(null, null);


--Fully fleshed out example of a table!
create table if not exists planets( --Created a table, planets, with a single column, planet_id
-- <column name> <data-type> <constraint1> <constraint2>... ,
	planet_id serial primary key, --primary key column are used to select a particular record
	planet_name varchar(30) not null,
	planet_description varchar(60) not null unique,
	has_rings boolean not null,
	number_of_moons smallint check(number_of_moons > -1)
);

--Creating a basic table

create table planets( --We've created a table, planets, with a single column, planet_id
	planet_id int
);

create table if not exists planets( --Created a table with basic datatypes
-- No constraints have been added, so each of these
	planet_id int
	planet_name varchar(30),
	planet_description varchar(60),
	has_rings boolean,
	number_of_moons int
);

create table if not exists planets( --Created a table, planets, with a single column, planet_id
-- <column name> <data-type> <constraint1> <constraint2>... ,
	planet_id int primary key, --primary key column are used to select a particular record
	planet_name varchar(30) not null,
	planet_description varchar(60) not null unique,
	has_rings boolean not null,
	number_of_moons int check(number_of_moons > -1)
);

create table planets( --Created a table, planets, with a single column, planet_id
-- <column name> <data-type> <constraint1> <constraint2>... ,
	planet_id serial primary key, --primary key column are used to select a particular record
	planet_name varchar(30) not null,
	planet_description varchar(60) not null unique,
	has_rings boolean,
	number_of_moons smallint check(number_of_moons > -1)
);

select * from planets; --get method

truncate table planets; --removes all the data, but not the table structure!

drop table planets;	--remove data and the table structure!

alter table if exists planets rename has_rings to rings; --modifying the table structure

alter table if exists planets drop if exists rings 
--ALTER TABLE [only] name
-- anything inside square brackets is optional
-- anything in bold, is well specific to you, but necessary
--Challenge: add rings back to the table!

alter table if exists planets add column rings boolean;

insert into planets values(2);
insert into planets values(3, 'Earth', 'Green and Blue', false, 1);
insert into planets values(2, 'Venus', 'Very hot', false, 1);
insert into planets values(1, 'Mercury', 'Very small', false, 1);


-- NOT DDL COMMANDS BELOW
select * from planets; --get method

insert into planets (planet_name, planet_description, has_rings, number_of_moons) values
	('Mercury', 'Never too close', true, 0),
	('Venus', 'Getting a tad warm', false, 0),
	('Earth', 'cradle of civilization', false, 1),
	('Mars', 'Earth 2.0', false, 2),
	('Jupiter', 'Big', true, 67),
	('Saturn', 'very ringy', true, 82),
	('Uranus', 'blue', true, 27),
	('Neptune', 'getting nippy', true, 14),
	('Pluto', 'you cannot get rid of me', false, 2);
	

insert into planets (planet_name, planet_description, has_rings, number_of_moons)
	values('Mars', 'Very red', null, 2);

insert into planets (planet_name, planet_description, has_rings, number_of_moons)
	values('Earth', 'Green and Blue', false, 1);
-- NOT DDL COMMANDS ABOVE


--let serial work from the get go, it starts at 1 by default!


insert into planets values(0, 'Earth','Green and Blue', false, 1);  --Why can't I insert this?
insert into planets values(3, 'Earth', 'Very hot', false, 1); --Why can't I insert this?
insert into planets values(4, 'Earth', 'Very hot', false, 1); --Why can't I insert this?


--DML
--DML is regarding how we manipulate the DATA in a table, not the table itself.
--DML is used to perform CRUD operations
-- CREATE, READ, UPDATE and DELETE



--READ
select * from planets; --returns all the records (with all the columns) from table, planets

--We can use a where clause to narrow down our query!
select * from planets where planet_name = 'Mars';
select * from planets where number_of_moons > 1;

--With the primary key, we can guarantee a unique result
select * from planets where number_of_moons > 0;
select * from planets where planet_name = 'Earth';

--With primary key
select * from planets where planet_id = 1;


--INSERT
insert into planets (planet_name, planet_description, rings, number_of_moons)
	values('Earth', 'Green and Blue and Purple', false, 4);