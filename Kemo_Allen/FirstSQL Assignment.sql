create table planets(
--int, varchar, nvarchar, decimal, boolean, https://www.postgresql.org/docs/9.5/datatype.html
-- column name, column type, constraints 
	planet_id serial primary key,
	planet_name varchar(30) not null,
	planet_description VARCHAR(60) not null unique,
	has_rings boolean not null,
	number_of_moons smallint check(number_of_moons > -1));

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
	

--1 Select all planets
select * from planets;

--2 Select 'Jupiter'
select * from planets where planet_name = 'Jupiter';

--3 Select planets with rings
select * from planets where has_rings;

--4 select planets with moons descending
select * from planets order by number_of_moons desc;

--5 select planets by name acsending
select * from planets order by planet_name;

--6 insert new planet without description *Come back*
insert into planets(planet_name, planet_description, has_rings, number_of_moons) values
	('Pluto2', '', true, 1);

--7 update mercury to not have rings
update planets set has_rings = false where planet_name = 'Mercury';
select * from planets where planet_name = 'Mercury';

--8  select planets with the letter 'a' in them
select * from planets where planet_name like '%a%';

--9 select planets that start with 'M'
select * from planets where planet_name like 'M%';

--10 select planets with their 3rd letter being 'r'
select * from planets where planet_name like '__r%';

--11 Delete Pluto
delete from planets where planet_name = 'Pluto';

