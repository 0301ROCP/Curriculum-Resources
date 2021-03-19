-- 2.1
select * from employee;
select * from employee where last_name = 'King';
select * from employee where first_name = 'Andrew' and reports_to is null;

-- 2.2
select * from album order by title;
select first_name from customer order by city asc;

-- 2.3
insert into genre (genre_id) values(default);
insert into genre (genre_id) values(default);
insert into employee (employee_id, last_name, first_name) values(default,'NewEmployee1','NewEmployee1');
insert into employee (employee_id, last_name, first_name) values(default,'NewEmployee2','NewEmployee2');
insert into customer (customer_id, first_name, last_name, email) values(default,'Customer1','Customer1','email1');
insert into customer (customer_id, first_name, last_name, email) values(default,'Customer2','Customer2','email2');

-- 2.4
select * from customer where first_name = 'Aaron' and last_name = 'Mitchell';
update customer set first_name = 'Robert',last_name = 'Walter' where customer_id = (select customer_id from customer where first_name = 'Aaron' and last_name = 'Mitchell');
update artist set name = 'CCR' where name like '%Clear%';

-- 2.5
select * from invoice where billing_address like 'T%';

-- 2.6
select * from invoice where total between 15 and 50;
select * from employee where hire_date between '2003-06-01' and '2004-03-01';

-- 2.7
delete from invoice_line where invoice_id in (select invoice_id from invoice where customer_id = (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter'));
delete from invoice where customer_id = (select customer_id from customer where first_name = 'Robert' and last_name = 'Walter');
delete from customer where first_name = 'Robert' and last_name = 'Walter';



