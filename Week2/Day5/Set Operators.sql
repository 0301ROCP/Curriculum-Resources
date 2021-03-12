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

insert into tb values(3,'c');
insert into tb values(4,'d');
insert into tb values(5,'Echo');
insert into tb values(6,'Foxtrot');
insert into tb values(7,'Gamma');
insert into tb values(8,'Hotel');
insert into tb values(9,'India');

--SET OPERATORS
--Values are apendeded row-wise 

--UNION the columns have to have matching datatypes! 
-- REturn values that exist in both tables, ignoring duplicate values 
select nums, chars from ta union select other_nums, other_chars from tb order by nums;

--UNION ALL : return all the records that exists in both tables, also including duplicate records
select * from ta union all select * from tb order by nums; 

--INTERESECT : return records that exist in both tables
select nums from TA intersect select other_nums from tb;

--select chars from TA intersect select other_nums from tb; This won't work, because the column data-type don't match.

--EXCEPT : return records that ONLY exist on the left hand side
select other_nums, other_chars from tb except select nums, chars from TA;

select nums, chars from TA except select other_nums, other_chars from tb;



(select other_nums, other_chars from tb except select nums, chars from TA)
	union 
		(select nums, chars from TA except select other_nums, other_chars from tb) order by other_nums ;
	
(select nums, chars from TA union select other_nums, other_chars from tb)
	except 
		(select nums, chars from TA intersect select other_nums, other_chars from tb) order by nums;

