--Table Relatonships (Multiplicity)

-- one to many
-- many to one 
-- one to one 
-- many to many

drop table if exists planets cascade;
drop table if exists moons cascade;


create table planets( 
	planet_id serial primary key,
	planet_name varchar(30)
);

create table moons(  
	moon_id serial primary key, 
	moon_name varchar(30),
	my_planet int references planets(planet_id) --every value in moon, under my_planet column has to exist in planets table
	-- the my_planet columns is a foreign key 
	--foreign key, is a primary key but in another table! 
);
-- Our moon table has a reference to our planet tables
--My moon, "The Moon" know that i's associated with Earth 

insert into planets(planet_name) values('Mercury');
insert into planets(planet_name) values('Earth');
insert into planets(planet_name) values('Mars');
insert into planets(planet_id, planet_name) values(200,'Mars');


insert into moons(moon_name,my_planet) values('The Moon', 1);

--insert into moons(moon_name,my_planet) values('The Fake Moon', 20);

insert into moons(moon_name,my_planet) values('The Fake Moon', 
	(select planet_id from planets where planet_name = 'Earth') );
-- be careful, when not using primary key column, if there are duplicates, then an error will be thrown 

insert into moons(moon_name, my_planet) values('Pheobus',
	(select planet_id from planets where planet_name = 'Mars'));

insert into moons(moon_name, my_planet) values('Deimos',
	(select planet_id from planets where planet_name = 'Mars'));

select * from moons;

select * from planets;

delete from planets where planet_id = 3; --I can delete Mercury, because there are no moons associated with it!

delete from planets where planet_id = 200; -- Cannot because, a moon is associated with it!


truncate planets cascade; --cascade will cause the associated records to be updated!, in this case removed!
-- cascade will propagate the changes! So we don't end up with orphan records!

--due to oprhan records!
-- when a table is pointing to another table, we've got to keep referntial integrity!
-- a record cannot point to another record, that doesn't exist!

--To avoid orphan records, we have to update/destroy all the records associated with it!

delete from moons where my_planet = (select planet_id from planets where planet_id = 200);



------------------------------------------------------------------------------------------------

create table human( 
	human_id serial primary key,
	human_name varchar(30)
);

create table pets( 
	pet_id serial primary key,
	pet_name varchar(30),
	my_human int references human(human_id) unique-- there is no column constraint, so pets can point to the same human
);

create table human_pets(
	human_id serial primary key, 
	human_name varchar(30),
	pet_name varchar(30)
)

drop table pets;

-----------------------------------------------------------------------------------------------------------

--many to many relationship
--As the name suggests, maps entiteis to multiple other entities
--professor has many students, students have many professors
--When we submit a query, we don't know wah't we're going to get!

drop table planets cascade;
drop table geological_features cascade;
drop table planet_features cascade;

create table planets(
	planet_id serial primary key,
	number_of_moons int,
	planet_name varchar(30)
	);

create table geological_features (
	feature_id serial primary key,
	feature_description varchar(60),
	feature_name varchar(30)
);

--Create a third table
--mulitplicity table/junction table
-- at minimum this is what we need: 

create table planet_features(
	 p_id int references planets(planet_id),
	 f_id int references geological_features(feature_id)
);

insert into planets(planet_name,number_of_moons) values ('Earth',1),('Mars',2),('Mercury',0), ('Jupiter',82);

insert into geological_features(feature_name, feature_description) values
	('Mountains','pointy stuff'),
	('Planet scale storms', 'windy'),
	('Desert', 'dry');

insert into planet_features(p_id,f_id) values
	(( select planet_id from planets where planet_name = 'Earth'), 
		(select feature_id from geological_features where feature_name = 'Mountains'));
	
	insert into planet_features(p_id,f_id) values
	(( select planet_id from planets where planet_name = 'Earth'), 
		(select feature_id from geological_features where feature_name = 'Desert'));
	

insert into planet_features(p_id,f_id) values
	(( select planet_id from planets where planet_name = 'Jupiter'), 
		(select feature_id from geological_features where feature_name = 'Planet scale storms'));
	
	select * from planets;
	select * from planet_features;
	select * from geological_features gf ;

	select f_id from planet_features pf where pf.p_id = 
		(select planet_id from planets where planets.planet_name = 'Earth')

	truncate planet_features ;
	truncate planets cascade;

--

select * from geological_features gf 
	where feature_id in --Have to use "in" because we get multiple records from the nested query 
	(select f_id from planet_features pf where pf.p_id = 
		(select planet_id from planets where planets.planet_name = 'Earth') );
	
	
	select * from geological_features gf 
	where feature_id in --Have to use "in" because we get multiple records from the nested query 
	(select f_id from planet_features pf where pf.p_id = 
		(select planet_id from planets where planets.planet_name = 'Jupiter') );

select * from planets where planets.planet_name = 'Jupiter'

