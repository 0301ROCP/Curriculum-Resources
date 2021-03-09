--DQL 
--Data Query Language
-- Has only a single statement, the SELECT statement

-- 2 thoughnts:
-- DML, means manipulating the table/database 
-- UPDATE, INSERT and DELETE - change the state of the table, select does not change the state. 
-- SELECT should be inside it's own sublangage. 

-- 2nd line of thought: 
-- SELECT also manipulates the database, so should be under DML. 

-- DQL CLauses: 
-- WHERE
select * from planets where has_rings = true;
select * from planets where has_rings = false;
-- (ORDER BY)
-- HAVING 


-- GROUP BY 
-- combine all rows by a column specified in a query! 
select has_rings as rings, AVG(number_of_moons) as average_number_of_moons
	from planets group by has_rings ;
-- GROUP BY to segregate the records into rings and no rings
-- We use the COUNT function to check how many planets are in each category
-- WE use the AVG function to check the average number of moons that each planet has. 

--I want to remove the planets that don't have a moon
select has_rings as rings, AVG(number_of_moons) as average_number_of_moons
	from planets group by has_rings having has_rings = true;

select * from planets;

select number_of_moons, count(*) as number_of_planets 
		from planets group by number_of_moons;

select planet_name, MIN(number_of_moons ) from 
	planets group by planet_name having MAX(number_of_moons)  > 0;

-- WHERE vs HAVING
-- WHERE is uesed as a filter condition, and so is HAVING
-- but HAVING is used after a 'GROUP BY' statement, and applied on agregate/group condition
-- but WHERE is applied on individual records!

-- Scalar functions
-- An operation that acts on each row individually, we get one input and one ouput each time
select UPPER(planet_name) from planets;
select LOWER(planet_name) from planets;
select UPPER(planet_name) as upper_case, LOWER(planet_name) as lower_case from planets;

-- TO_CHAR(DATE, 'DATE_FORMAT') change a date into character value 

-- Agregate Function
-- An operation that act on multiple values and returns a single result 
--checking what is the planet with the maxiumum number of moons!
select MAX(number_of_moons) from planets; -- it operates on the entire table, and returns a single value
select MIN(number_of_moons) from planets; -- returns planets without moons
select SUM(number_of_moons) from planets; -- reutrns all the values from the moons
select AVG(number_of_moons) from planets; -- returns the average number of moons!

select AVG(number_of_moons) from planets where has_rings = true; --average number of mooons for planets with rings 