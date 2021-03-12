--2.1 SELECT
select * from employee;
select * from employee where last_name = 'King';
select * from employee where first_name = 'Andrew' and reports_to is null;

--2.2 ORDER BY
select title from album order by title desc;
select first_name from customer order by city;

--2.3 INSERT INTO
insert into genre(name) values('Genre1'),('Genre2');
insert into employee(first_name,last_name) values('Chris','Sei'), ('Tan','Ha');
insert into customer(first_name,last_name, email) values('Eli','Fin' , 'email@gmail.com'), ('Apo','Pan','email2@gmail.com');

--2.4 UPDATE
update customer set (first_name, last_name) = ('Robert','Walter') where (first_name, last_name) = ('Aaron' , 'Mitchell');
update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

--2.5 LIKE
select * from invoice where billing_address like 'T%';

--2.6 BETWEEM
select * from invoice where total between 15 and 30;
select * from employee where hire_date between '2003-06-01' and '2004-03-01';

--2.7 DELETE
delete from invoice_line where invoice_id in (select invoice_id from invoice where customer_id=32);
delete from invoice where customer_id = 32;
delete from customer where first_name = 'Robert' and last_name = 'Walter';

--7.1 INNER
select * from customer a inner join invoice b on a.customer_id = b.invoice_id ; 

--7.2 OUTER
select first_name, last_name, invoice_id, total from customer a full outer join invoice b on a.customer_id = b.invoice_id;

--7.3 RIGHT
select name , title from album a right join artist b on a.artist_id = b.artist_id;

--7.4 CROSS
select name,artist, album from album cross join artist order by name;

--7.5 SELF
select * from employee a, employee b where a.reports_to b.reports_to;
 
	
