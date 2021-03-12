-- 2.0 SQL Queries

-- 2.1 Select

-- Task 1 

select * from employee;


-- Task 2

select * from employee where last_name = 'King';

-- Task 3

select * from employee where first_name = 'Andrew' and reports_to isnull;


-- 2.2 Order By

-- Task 1

select * from album order by title desc;

-- Task 2

select * from album order by title;


-- 2.3 Insert Into 

-- Task 1 

insert into genre (genre_id, name) values
	(26, 'Ben'),(27, 'Andrew');


-- Task 2

insert into employee (employee_id,last_name,first_name,title,reports_to,birth_date,hire_date,address,city,state,country,postal_code,phone,fax,email) values
	(10, N'Peterson', N'Peter', N'Sales Support Agent', 2, '1947/9/17', '2003/7/3', N'683 10 Street SW', N'Calgary', N'AB', N'US', N'T2P 5G3', N'+1 (403) 263-4423', N'+1 (455) 266-4289', N'peterpeterson@chinookcorp.com'),
	(11, N'Carson', N'Joe', N'IT Staff', 6 , '1950/2/17', '2003/7/3', N'683 12 Street SW', N'Calgary', N'AB', N'US', N'T2P 5G3', N'+1 (403) 263-4423', N'+1 (455) 266-4289', N'joecarlson@chinookcorp.com');

-- Task 3

INSERT INTO customer (customer_id, first_name, last_name, address, city, country, postal_code, phone, email, support_rep_id) values 
	(300, N'Margaux', N'Maral', N'Ullev lsveien 14', N'Oslo', N'Norway', N'0171', N'+47 22 44 22 22', N'bjorn.hansen@yahoo.no', 4),
	(350, N'Percy', N'Norma', N'Ullev lsveien 14', N'Oslo', N'Norway', N'0171', N'+47 22 44 22 22', N'bjorn.hansen@yahoo.no', 4);

-- 2.4 Update

-- Task 1

update customer set first_name = 'Robert', last_name = 'Walter'
where customer_id = 32;
-- Task 2

select * from artist where name = 'Creedence Clearwater Revival';

update artist set name = 'CCR'
where artist_id = 76;
-- 2.5 Like

-- Task 1

select * from invoice where billing_address like 'T%';

-- 2.6 Between

-- Task 1

select * from invoice where total between 15 and 50;
-- Task 2

select * from employee where hire_date between '2003-6-1' and '2004-4-1';

-- 2.7

-- Task 1

delete from customer where customer_id in (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter');

