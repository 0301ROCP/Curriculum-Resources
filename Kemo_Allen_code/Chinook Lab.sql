--2.1
--Select all records from the Employee table.
select * from employee;
--Select all records from the Employee table where last name is King.
select * from employee where last_name = 'King';
--Select all records from the Employee table where first name is Andrew and REPORTS_TO is NULL.
select * from employee where first_name = 'Andrew' and reports_to is null;

--2.2
--Select all albums in Album table and sort result set in descending order by title.
select * from album order by title desc ;
--Select first name from Customer and sort result set in ascending order by city
select *, first_name from customer order by city asc;

--2.3
--Insert two new records into Genre table
select * from genre;
insert into genre(name) values
	('New Genre 1'),
	('New Genre 2');
	
-- Insert two new records into Employee table
select * from employee;
insert into employee(last_name, first_name) values
	('Allen', 'Kemo'),
	('Frank', 'Ben');
	
--Insert two new records into Customer table
select * from customer;
insert into customer(first_name, last_name, email) values
	('Kemo', 'Allen', 'kemoallen@mail.com'),
	('Ben', 'Frank', 'benfrank@mail.com');
	
--2.4
--Update Aaron Mitchell in Customer table to Robert Walter
select * from customer where first_name = 'Aaron';
update customer 
	set first_name = 'Robert',
	    last_name = 'Walter'
	where customer_id = 32;
	
--Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
select * from artist;
update artist 
	set name = 'CCR'
	where name = 'Creedence Clearwater Revival';

--2.5
--Select all invoices with a billing address like “T%”
select * from invoice where billing_address like 'T%';

--2.6
--Select all invoices that have a total between 15 and 50
select * from invoice where total between 15 and 50;

--Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from employee where hire_date between '2003-06-01' and '2004-03-01';

--2.7
--Delete a record in Customer table where the name is Robert Walter 
select * from customer where first_name = 'Robert';
select * from invoice where customer_id = 32;
--invoice_id 50, 61, 116, 245, 268, 290, 342
select * from invoice_line;
--Delete invoice_line reference
delete from invoice_line where invoice_id in(50, 61, 116, 245, 268, 290, 342);
--delete from invoice_line where invoice_id in (select invoice_id from invoice where customer_id = 32);
--Delete invoice reference
delete from invoice where customer_id = 32;
--Delete customer reference
delete from customer where first_name = 'Robert' and last_name = 'Walter';










