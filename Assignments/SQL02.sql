--2.1 SELECT
--Task – Select all records from the Employee table.
select * from employee;
--Task – Select all records from the Employee table where last name is King.
select * from employee where last_name='King';
--Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
select * from employee where first_name = 'Andrew' and reports_to is null;
--2.2 ORDER BY
--Task – Select all albums in Album table and sort result set in descending order by title.
select * from album order by title desc;
--Task – Select first name from Customer and sort result set in ascending order by city
select first_name, city from customer order by city ;
--2.3 INSERT INTO
--Task – Insert two new records into Genre table
-- take a look first
select * from genre g2 ;
-- insert records 
insert into genre (genre_id, name) values (default, 'Art Pop'), (default, 'Vaporwave');
--Task – Insert two new records into Employee table
insert into 
	employee (employee_id, last_name, first_name, title)
	values 
	(default, 'Dixon', 'Tom', 'Does Stuff Guy'),
	(default, 'Chimpanzee', 'Sally', 'Eats bananas');
--Task – Insert two new records into Customer table
insert into 
	customer (customer_id, first_name, last_name, company, email)
	values
	(default, 'Paulo','Diaz', 'Powell Peralta', 'bla@gmail.com'),
	(default, 'Mama','Jeronimo', 'Greenhaired Gimmies', 'blah@gmail.com');

--2.4 UPDATE
--Task – Update Aaron Mitchell in Customer table to Robert Walter
update customer set first_name = 'Robert', last_name = 'Walter' where first_name = 'Aaron' and last_name = 'Mitchell';
--Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';
--2.5 LIKE
--Task – Select all invoices with a billing address like “T%”
select * from invoice i2 where billing_address like 'T%';
--2.6 BETWEEN
--Task – Select all invoices that have a total between 15 and 50
select * from invoice where total between 15 and 50;
--Task – Select all employees hired between 1st of June 2003 and 1st of March 2004
select * from employee where hire_date between '2003-6-1' and '2004-3-1'; 
--2.7 DELETE
--Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).
-- first try 
delete from customer where first_name = 'Robert' and last_name = 'Walter'; -- error delete on customer table violates fk constraint on table invoice
-- so we begin delete from invoice table 
delete from invoice where customer_id = (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter'); -- another error!
-- this time the delete on invoice violates foreign key constraint on invoice line table so we begin delete there 

delete from invoice_line where invoice_id = (select invoice_id from invoice where customer_id = (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter'));
-- this throws error "more than one row returned by a subquery used as an expression" because there are multiple invoice_lines returned by the nested queries, so the first '=' must be changed to an IN keyword

-- the complete working script
delete from invoice_line 
	where invoice_id in (
		select invoice_id from invoice where customer_id = (
			select customer_id from customer where first_name = 'Robert' and last_name = 'Walter'
		)
	);