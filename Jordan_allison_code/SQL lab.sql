---2.1

select * from employee;

select * from employee where last_name = 'King';
select * from employee where first_name = 'Andrew' and reports_to is null;

--2.2

select * from album order by title desc;

select first_name from customer order by city;

--2.3

insert into genre(name) values('Country'),('Video Game Music');

insert into employee(last_name,first_name, title, state, country) 
	values('Booth', 'Carlie', 'staff', 'AB', 'Canada'),
		  ('Vanderspec', 'Dirk', 'staff', 'AB', 'Canada');
		 
		 
insert into customer(first_name, last_name, email) 
	values('Adam', 'Court','Adam.Court@gmail.com'),
		  ('David', 'Popa', 'David.Popa@gmail.com');
		 
--2.4

update customer set first_name = 'Robert', last_name = 'Walter' where first_name = 'Aaron' and last_name = 'Mitchell';

update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

--2.5

select * from invoice where billing_address like 'T%'

--2.6

select * from invoice where total between 15 and 50;

select * from employee where hire_date between '2003-06-01' and '2004-03-01';

--2.7


delete from customer where first_name = 'Robert' and last_name = 'Walter';
delete from invoice_line where invoice_id in (select invoice_id from invoice group by customer_id having customer_id IN (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter'));


