drop table ta;
drop table tb;

create table ta(
	nums int,
	chars varchar(30)
);

create table tb(
	other_nums int, 
	other_chars varchar(30)
);

insert into ta values(1,'a');
insert into ta values(2,'b');
insert into ta values(3,'c');
insert into ta values(4,'d');
insert into ta values(5,'e');

insert into tb values(3,'Charlie');
insert into tb values(4,'Delta');
insert into tb values(5,'Echo');
insert into tb values(6,'Foxtrot');
insert into tb values(7,'Gamma');
insert into tb values(8,'Hotel');
insert into tb values(9,'India');


select * from ta;
select * from tb;


-- INNER Join, will return values that exist in both tables!
	select * from ta, tb where ta.nums = tb.other_nums;

	select * from ta a, tb b where a.nums = b.other_nums ;

-- using the inner join keyword 
	select* from ta a inner join tb b on a.nums = b.other_nums ;

	select count(*) from ta a inner join tb b on a.nums  = b.other_nums ;

-- LEFT OUTER JOIN
--Will return all the records on the left table. 
	select * from ta a left outer join tb b on a.nums = b.other_nums;
	select count(*) from ta a left outer join tb b on a.nums = b.other_nums;

	select * from tb b left outer join ta a on b.other_nums = a.nums ;
	select * from tb b left join ta a on b.other_nums = a.nums ; --shorter syntax for the above statements
	
	
-- RIGHT OUTER JOIN
--Will return all the records on the right table. 
 select * from tb b right join ta a on b.other_nums = a.nums ;


-- FULL OUTER JOIN 
select * from ta a full outer join tb b on a.nums = b.other_nums ;
select count(*) from ta a full outer join tb b on a.nums = b.other_nums ;


drop table emps;

create table emps( 
	emp_id int primary key,
	emp_name varchar(30),
	title varchar(30),
	reports_to int references emps(emp_id)
);

insert into emps (emp_id, emp_name, title, reports_to) values
	(1 , 'bob', 'general manager', null),
	(2 , 'stevey', 'assitant manager', 1),
	(3 , 'franky', 'assitant to manager', 1),
	(4, 'alex', 'team member', 2 ),
	(5,'trevin', 'store manager', 3)

select * from emps;

--SELF JOIN (like an inner join, but to the same table)

select * from emps a, emps b where a.reports_to = b.emp_id; -- combine the same table together, where employess match who they report to!


-- CROSS JOIN / CARTESIAN JOIN 
select * from ta a cross join tb b ;

-- Equi & Theta joins!

