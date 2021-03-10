--Assignment

--2.1
select * from employee

select * from employee where last_name = 'King';

select * from employee where first_name = 'Andrew' and reports_to is null;

--2.2
select * from album order by title desc;

select first_name from customer order by city;

--2.3
insert into genre (name) values
('Genre1'), ('Genre2');

insert into employee (first_name, last_name, email) 
	values ('Apoorv', 'Pandey', 'apandey@yahoo.com'), ('Akshat', 'Pandey', 'akpandey@yahoo.com');

insert into customer (first_name, last_name, email) 
	values ('Apoorv', 'Pandey', 'apandey@yahoo.com'), ('Akshat', 'Pandey', 'akpandey@yahoo.com');

select * from genre;
select * from employee;
select * from customer;

--2.4
update customer set (first_name, last_name) = ('Robert', 'Walter')
	where (first_name, last_name) = ('Robert', 'Waleter');

update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

--2.5
select * from invoice where billing_address like 'T%';

--2.6
select * from invoice where total between 15 and 50;
select * from employee where hire_date between '2003-06-01' and '2004-03-01'; 

--2.7
delete from customer where (first_name, last_name) = ('Robert', 'Walter');
delete from invoice where customer_id = 32;
delete from invoice_line where invoice_id in (select invoice_id from invoice where customer_id=32);