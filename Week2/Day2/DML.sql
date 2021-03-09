--DML
--DML is regarding how we manipulate the DATA in a table, not the table itself. 
--DML is used to perfrom CRUD operations
-- CREATE , READ , UPDATE and DELETE
-- INSERT, SELECT, UPDATE and DELETE (corresponding SQL commands)


--READ
-- selecting all the values and columns 
select * from planets; --returns all the records (with all the columns) from table, planets

-- selecting a specific column
select planet_name from planets; --all the rows/records, but just the planet_name column

--We can use a where clause to narrow down our query!
--adding a "WHERE" clause, helps us to narrow down our search, it acts a sa filter
select * from planets where planet_name = 'Mars';
select * from planets where number_of_moons > 1;

-- select [columns... ] from table_name where column = "column value"
select planet_id, planet_description from planets where planet_name = 'Mars';
select planet_id, planet_description from planets where number_of_moons > 2;

-- WHERE clause also support 'OR' and 'AND' keywords
select planet_name from planets where number_of_moons > 2 and has_rings = true;
select planet_name, planet_id from planets where number_of_moons > 2 or has_rings = false;

--With the primary key, we can gurantee a unique result 
select * from planets where number_of_moons > 0;
select * from planets where planet_name = 'Earth';

--With primary key
select * from planets where planet_id = 1;

-- Aliases, temporary name, that is only present with the returned result

--select with an alias, changes how we refere to the table name
select planet_name from planets as p where p.planet_id = 8; --with alias
select planet_name from planets where planet_id = 8; --without alias

--Applicable to coumn names
select planet_name as name from planets;  --with alias
select planet_name from planets; --without alias

--Aliases with a WHERE clause
select planet_name as name, planet_id as id from planets where planet_id > 1;

--ORDER BY allows us to order our results
select * from planets order by planet_name; --by default it is ascending
select * from planets order by planet_name desc;
select * from planets order by planet_name asc; --unnecessary, because it's the default behavior


select planet_name as name, number_of_moons as moons 
	from planets as p where p.number_of_moons > 0 order by planet_id desc;


---------------------------------------------------------------------------------------------------
--INSERT
truncate planets; --I don't lose the table strucutre, so it stilll keep track of the id
drop planets; --table structure is lost, and so the id won't be tracked!

--inserting values into a table, the values must corespond to the appropriate type in the table
insert into planets values(1, 'Mercury', 'Never too close', false,0);

insert into planets(planet_id,planet_name,planet_description,has_rings,number_of_moons)
	values(1, 'Mercury', 'Never too close', false,0);

--If you don't want to put inall the values, i.e. fro colums that can be null or have dfault values. 
insert 
	into 
	planets(planet_name,planet_description)
	values('Mercury','Never too close');

insert into planets values(3, 'Earth', 'cradle of civilization', false, 1);

insert into planets values(4, 'Mars', 'Earth 2.0', false, 2);

insert into planets values(5, 'Jupiter', 'Big', true, 67);

insert into planets values(6, 'Saturn', 'very ringy', true, 82);

insert into planets values(7, 'Uranus', 'blue', true, 27);

insert into planets values(8, 'Neptune', 'getting nippy', true, 14);

insert into planets values(9, 'Pluto', 'you cannot get rid of me', false, 2);

--alternnatively we can input miltiple values like this!
insert 
	into
	planets(planet_name,planet_description,has_rings,number_of_moons)
	values
	('Mercury', 'Never too close', true, 0),
	('Venus', 'Getting a tad warm', false, 0),
	('Earth', 'cradle of civilization', false, 1),
	('Mars', 'Earth 2.0', false, 2),
	('Jupiter', 'Big', true, 67),
	('Saturn', 'very ringy', true, 82),
	('Uranus', 'blue', true, 27),
	('Neptune', 'getting nippy', true, 14),
	('Pluto', 'you cannot get rid of me', false, 2);
	


---------------------------------------------------------------------------------------------------

--UPDATING tables
--UPDATE table_name SET column_name = *new column property* WHERE column = *filter_value*; 
update planets set has_rings = false; --very danger without a filter
update planets set has_rings = true where planet_name = 'Saturn';

---------------------------------------------------------------------------------------------------

--DELETING from tables
delete from planets where planet_name = 'Earth';

delete from planets; --delete from without a filter, will remove all the records/rows from the table
-- unlike a truncate, this operation is not autmoatically committed!
-- in general, delete should only be used with deleting a few records or a single record at a time. 
-- truncate should be used when you're deleting all the data!

