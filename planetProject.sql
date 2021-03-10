create table planets(
--int, varchar, nvarchar, decimal, boolean, https://www.postgresql.org/docs/9.5/datatype.html
-- column name, column type, constraints 
	planet_id serial primary key,
	planet_name varchar(30) not null,
	planet_description VARCHAR(60) unique,
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
	

--1
select * planets;
--2
select * from planets where planet_name = 'Jupiter';
--3
select * from planets where has_rings = true;
--4
select planet_name, number_of_moons
from planets
order by number_of_moons desc;
--5
select planet_name 
from planets 
order by planet_name;
--6
-- delete "not null"
insert into planets (planet_name, has_rings, number_of_moons)
values ('Roger', true, 8);
--7
update planets set has_rings = false where planet_name = 'Murcury';

--8
select planet_name from planets where planet_name like '%a%';
--9
select planet_name from planets where planet_name like 'M%';
--10
select planet_name from planets where planet_name like '__r%';
--11
delete from planets where planet_name = 'Pluto';

--current time

SELECT NOW();










