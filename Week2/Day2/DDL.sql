--DDL : Data Definition Language
-- DDL has commands that will affect the structure of a table!

--CREATE : create a table
--ALTER : modifiy/alter the strcutre of the table
--DROP : remove the table structure all together, including the data
--TRUNCATE : remove all the data, while keeping the table structure!


create table basic_table( --typing convention is different in sql 

	--In Java "basicTable", in sql, we don't use case so we use underscore
	--in SQL "basic_table"

	--This table has no columns, so we can't actually store any information there!
)

drop table basic_table; --removes the table structure AND it removes all teh data 


create table if not exists upgraded_table(
		user_id int, --we only have to define column name and datatype
		user_name varchar(30)
);

drop table upgraded_table;

insert into upgraded_table values(null,null); --without any constraints, we can put whatever we want as long as it's a valid datatype



--Fully fleshed out example of a table!
create table if not exists planets( --We've create a table, planets, with a single column, planet_id
--  <column name>  <data-type> <constraint1> <constraint2> ... ,
	planet_id serial primary key, --primary key column are used to select a particular record 
	planet_name varchar(30) not null,
	planet_description varchar(60) not null unique,
	has_rings boolean,
	number_of_moons smallint check(number_of_moons > -1)
);

-- NOT DDL COMMANDS BELOW-------------------------------------------------------
select * from planets where planet_id = 1;

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
	values ('Mars','Very red', null,2);

insert into planets (planet_name, planet_description, has_rings, number_of_moons)
	values('Earth','Green and Blue',null,1);
-- NOT DDEL COMMANDS ABOVE ^^----------------------------------------------------

truncate table planets; --removes all the data, but not the table structure!

drop table planets; --remove data and the table structure!

--Alter can change the table structure; below we change the name of column
-- "has_rings" to "rings" and then remove that column!
alter table if exists planets rename has_rings to rings; --modifiying the table structure

alter table if exists planets drop if exists columns rings;
--ALTER TABLE [only] name
-- anything inside square brackets is optional
-- anthing in bold, is well specific to you, but necessary
--Challenge: add rings back to the table!


