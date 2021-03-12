--Assignment
--2.1 SELECT
--Task � Select all records from the Employee table.
select* from Employee;

--Task � Select all records from the Employee table where last name is King.
select* from Employee where last_name = 'King';

--Task � Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL
select* from Employee where first_name = 'Andrew';

--2.2 ORDER BY
--Task � Select all albums in Album table and sort result set in descending order by title.
select* from album order by title desc;

--Task � Select first name from Customer and sort result set in ascending order by city
select* from customer order by first_name = (select first_name order by city asc);

--2.3 INSERT INTO
--Task � Insert two new records into Genre table
    insert into genre (genre_id, name) values (26,'Poetry'), (27, 'Nonfiction');
--Task � Insert two new records into Employee table


--Task � Insert two new records into Customer table

--2.4 UPDATE
--Task � Update Aaron Mitchell in Customer table to Robert Walter
delete from customer where first_name = 'Robert' and last_name = 'Walter';

--Task � Update name of artist in the Artist table �Creedence Clearwater Revival� to �CCR�
insert into employee (employee_id, last_name, first_name, title, reports_to, birth_date, hire_date, address) values 
	(9,'John', 'Thomas', 'Recruiter', null, '1976-07-29', '2008-02-01', '234 SW St Atlanta'),
	(10, 'Will', 'William', 'Customer Rep', null, '1980-07-21', '2012-02-01', 'SW ST Washington DC');

--2.5 LIKE
--Task � Select all invoices with a billing address like �T%�
select* from invoice where billing_address like 'T%';

--2.6 BETWEEN
--Task � Select all invoices that have a total between 15 and 50
select* from invoice between 15 and 50;

--Task � Select all employees hired between 1st of June 2003 and 1st of March 2004
select* from employee where hire_date between '2003-05-03 00:00:00' and '2004-03-04 00:00:00';

--2.7 DE LETE
--Task � Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
delete from invoice  where customer_id in (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter');

select* from employee;

