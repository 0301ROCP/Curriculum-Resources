1) select * from planets;

2) select * from planets where planet_name = 'Jupiter';

3) select * from planets where has_rings = true;

4) select * from planets order by number_of_moons desc;

5) select * from planets order by planet_name;

6) alter table planets alter column planet_description drop not null;
		insert into planets (planet_name,planet_description , has_rings, number_of_moons) values 
			('Ben', null, true, 1);

7) update planets set has_rings = false where planet_name = 'Mercury';

8) select * from planets where planet_name like '%a%';

9) select * from planets where planet_name like 'M%';

10) select * from planets where planet_name like '__r%';

11) delete from planets where planet_name = 'Pluto';