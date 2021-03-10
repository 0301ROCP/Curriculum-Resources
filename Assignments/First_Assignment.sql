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
	
-- 1 select all planets
select * from planets;
--2 select jupiter by name
select planet_name from planets where planet_name = 'Jupiter';
--3 select planets with rings
select * from planets where has_rings;
--4 select planets with moons descending
select * from planets order by number_of_moons desc;
--5 select all planets ascending by name
select * from planets order by planet_name;
--6 insert another planet without description
insert into planets(planet_name, planet_description, has_rings, number_of_moons) values
	('anotherPlanet', '', true, 1);
--7Update Mercury, it shouldnt have rings
update planets set has_rings = false where planet_name = 'Mercury';
select * from planets where planet_name = 'Mercury';
--8 select all the planets that have the letter 'a' in their name
select * from planets where planet_name like '%a%';
--9 Select all the planets that start with the letter 'm'
select * from planets where planet_name like 'M%';
--10 select all the planets with their third character being 'r'
select * from planets where planet_name like '__r%';
--11 delete pluto from the planet list
delete from planets where planet_name = 'Pluto';