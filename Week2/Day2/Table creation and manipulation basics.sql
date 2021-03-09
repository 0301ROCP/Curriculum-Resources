--Creating a basic table

create table planets( --We've create a table, planets, with a single column, planet_id
	planet_id
);


create table planets( --Created a table with basic datatypes 
-- No constraints have been added, so each of these 
	planet_id ,
	planet_name varchar(30),
	planet_description varchar(60),
	has_rings boolean,
	number_of_moons int
);

create table planets( --We've create a table, planets, with a single column, planet_id
--  <column name>  <data-type> <constraint1> <constraint2> ... ,
	planet_id int primary key, --primary key column are used to select a particular record 
	planet_name varchar(30) not null,
	planet_description varchar(60) not null unique,
	has_rings boolean not null,
	number_of_moons smallint check(number_of_moons > -1)
);

create table planets( --We've create a table, planets, with a single column, planet_id
--  <column name>  <data-type> <constraint1> <constraint2> ... ,
	planet_id serial primary key, --primary key column are used to select a particular record 
	planet_name varchar(30) not null,
	planet_description varchar(60) not null unique,
	has_rings boolean not null,
	number_of_moons smallint check(number_of_moons > -1)
);

select * from planets; --get method

insert into planets values(2);
insert into planets values(3, 'Earth','Green and Blue',false,1);
insert into planets values(2, 'Venus','Very hot',false,1);
insert into planets values(3,'Mercury','Very small',false,1);

insert into planets (planet_name, planet_description, has_rings, number_of_moons)
	values ('Mars','Very red', false,2);

insert into planets (planet_name, planet_description, has_rings, number_of_moons)
	values('Earth','Green and Blue',false,1);
--let serial work from the get go, it starts at 1 by default!

insert into planets values(0, 'Earth','Green and Blue',false,1); --Why can't I insert this?
insert into planets values(3, 'Earth','Very hot',false,1); --Why can't I insert this?
insert into planets values(4, 'Earth','Very hot',false,1); --Why can't I insert this?

