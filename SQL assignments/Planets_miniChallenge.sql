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

select * from planets; --number 1 is done

select planet_name from planets where planet_name = 'Jupiter';
select * from planets where planet_name = 'Jupiter';-- number 2 is done

select * from planets where has_rings = true; -- number 3 is done

select * from planets order by number_of_moons desc; -- number 4 is done

select * from planets order by planet_name asc; --number 5 is done

insert 
	into 
		planets (planet_name, planet_description, has_rings, number_of_moons)
		values ('KOI','',false, 3); --number 6 is done, you need single quotes to pass an empty description
		
update planets set has_rings = false where planet_name = 'Mercury';	--number 7 is done

select * from planets where planet_name like '%a%'; --number 8 is done

select * from planets where planet_name like 'M%'; --number 9 is done

select * from planets where planet_name like '__r%'; --number 10 is done
select * from planets where substring(planet_name,3,1)='r' ; --number 10 is done

delete from planets where planet_name = 'Pluto'; --number 11 is done

