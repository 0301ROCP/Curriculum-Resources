
create table planets(
--int, varchar, nvarchar, decimal, boolean, https://www.postgresql.org/docs/9.5/datatype.html
-- column name, column type, constraints 
	planet_id serial primary key,
	planet_name varchar(30) not null,
	planet_description VARCHAR(60) not null unique,
	has_rings boolean not null,
	number_of_moons smallint check(number_of_moons > -1)
);

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
	
select * from planets;


--1)Select all the planets from the planets table 
select * from planets;

--2) Select 'Jupiter by its name
select * from planets where planet_name = 'Jupiter';

--3)Select all the planets with rings;
select * from planets where has_rings = true;

--4)Select all the planets, descending by the number of moons
select * from planets order by number_of_moons desc; 

--5)Select all the planets ascending by their names 
select * from planets order by planet_name; 

--6)Insert another planet into the table, without a description. What do you need to ALTER to allow you to do that?
alter table if exists planets drop  if exists planet_description;
insert 
    into
    planets(planet_name, has_rings, number_of_moons)
    values ('AnotherPlanet',false, 1);

--7)Update Mercury, it shouldn't have rings 
update planets set has_rings = false where planet_name = 'Mercury';

--8)Select all the planets that have the letter 'a' in their name 
select * from planets where planet_name like '%a%';

--9)Select all the planets that start with the letter 'M'
select * from planets where planet_name like 'M%'; 

--10)Select all the planets with their third character being 'r'
select * from planets where planet_name like '__r%'; 

--11)Delete Pluto from the planet list 
delete from planets where planet_name = 'Pluto';



