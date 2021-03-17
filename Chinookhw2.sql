2.0 SQL Queries
[X]In this section you will be performing various queries against the Oracle Chinook database.
2.1 select


Task – Select all records from the Employee table.

  SELECT * FROM Employee;


Task – Select all records from the Employee table where last name is King.

SELECT * FROM Employee where last_name = 'King';


Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is null


SELECT * FROM Employee where first_name = 'Andrew' and reports_to is null
;


2.2 ORDER BY
Task – Select all albums in Album table and sort result set in descending order by title.
  select * from album;
  select * from album order by title desc;



Task – Select first name from Customer and sort result set in ascending order by city

select * from customer;
select * from customer order by city;

select first_name from customer order by city asc;


2.3 INSERT INTO
Task – Insert two new records into Genre table

select * from Genre;
insert 
	into
Genre(genre_id, name)
	values
	('28', 'Light Music');
insert 
	into
Genre(genre_id, name)
	values
	('27', 'Janapada');
	

Task – Insert two new records into Employee table

select * from employee 
INSERT INTO Employee (
employee_id, 
last_name, 
first_name, 
title, 
reports_to, 
birth_date, 
hire_date,
address , 
city, 
state, 
country, 
postal_code, 
phone, 
fax, 
email) VALUES (
9, 
'Ramana', 
'Subba', 
'Production Dept', 
6, 
TO_DATE('1970-4-21 00:00:00',
'yyyy-mm-dd hh24:mi:ss'), 
TO_DATE('2007-9-11 00:00:00',
'yyyy-mm-dd hh24:mi:ss'), 
'31 James ST', 
'College Park', 
'MD', 
'US', 
'21201',
'+1 (232) 237-3421',
'+1 (232) 343-5773', 
'ks12@chinookcorp.com');

INSERT INTO Employee (
employee_id, 
last_name, 
first_name, 
title, 
reports_to, 
birth_date, 
hire_date,
address , 
city, 
state, 
country, 
postal_code, 
phone, 
fax, 
email) VALUES (
10, 
'Harey', 
'Rama', 
'Food Dept', 
6, 
TO_DATE('1972-3-06 00:00:00',
'yyyy-mm-dd hh24:mi:ss'), 
TO_DATE('209-09-11 00:00:00',
'yyyy-mm-dd hh24:mi:ss'), 
'91  Bark Blvd', 
'Owen Mills', 
'MD', 
'US', 
'21201',
'+1 344) 237-34341',
'+1 (242) 453-5573', 
'HareRama@chinookcorp.com');



Task – Insert two new records into Customer table

select * from customer;
INSERT INTO Customer (
customer_id,
first_name, 
last_name, 
address, 
city, 
state, 
country, 
postal_code, 
phone, 
email, 
support_rep_id
) 

        VALUES (
  60, 
'Blake', 
'Kruppa', 
'2441 Reston Pk', 
'Canton', 
'NC', 
'USA', 
'20170', 
'+1 (432) 388-5641', 
'blakgolea@gmail.com', 5);


INSERT INTO Customer (
customer_id,
first_name, 
last_name, 
address, 
city, 
state, 
country, 
postal_code, 
phone, 
email, 
support_rep_id
) 

        VALUES (
  61, 
'John', 
'Trivilta', 
'2322 contry blvd', 
'Steak', 
'SC', 
'USA', 
'22320', 
'+1 (432) 228-5641', 
'johntrv@gmail.com', 7);

2.4 UPDATE
Task – Update Aaron Mitchell in Customer table to Robert Walter

select * from customer 

  UPDATE customer SET 
  first_name = 'Robert', last_name = 'Walter'
  WHERE first_name = 'Aaron' And last_name = 'Mitchell';

Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”

select * from Artist where name = 'Creedence Clearwater Revival';

update Artist set
name = 'CCR'
where  name = 'Creedence Clearwater Revival';



2.5 LIKE
Task – Select all invoice with a billing address like “T%”

select * from invoice
where
billing_address like 'T%';



2.6 BETWEEN
Task – Select all invoices that have a total between 15 and 50

select * from invoice
where total between  15 and 50;



Task – Select all employees hired between 1st of June 2003 and 1st of March 2004

select * from employee 
where hire_date between 
('2003-6-1 00:00:00') and ('2004-3-1 00:00:00');




2.7 DE LETE
Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).

select * from customer
WHERE 
first_name = 'Robert';

delete from customer 
   WHERE 
        first_name = 'Robert'

   AND 
        last_name = 'Walter';
        
     delete from
      invoice_line where 
     invoice_id in 
    (select invoice_id from invoice where invoice_id = 32);
       

  
       
       
       
       7.0 JOINS
In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.
7.1 INNER
Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.

select * from customer a 
inner join 
invoice b on 
a.customer_id = b.invoice_id;


7.2 OUTER
Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.

select  
invoice_id, first_name, last_name 
from customer a
full outer join
invoice b  on 
a.customer_id= b.invoice_id;



7.3 RIGHT
Task – Create a right join that joins album and artist specifying artist name and title.

select name, title 
from album a 
right join artist b 
on
a.artist_id = b.artist_id;

7.4 CROSS
Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.



select name, artist, album 
from album 
cross join artist
order by name;

7.5 SELF
Task – Perform a self-join on the employee table, joining on the reportsto column.

select * from employee a, employee b 
where a.reports_to = b.reports_to;
       
       
       
       