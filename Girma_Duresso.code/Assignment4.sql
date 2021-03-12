create table ta(
   num int,
     chars varchar(30)
);

create table tb(
      other_num int, 
     other_chars varchar(30)
);

insert into ta values(1, 'a');
insert into ta values(2, 'b');
insert into ta values(3, 'c');
insert into ta values(4, 'd');
insert into ta values(5, 'e');


insert into tb values(1, 'Charlie');
insert into tb values(2, 'Delta');
insert into tb values(3, 'Echo');
insert into tb values(4, 'foxtrot');
insert into tb values(5, 'gomma');
insert into tb values(6, 'Hotel');
insert into tb values(7, 'India');

select* from ta;
select* from ta union all select* from tb;


--7.0 JOINS
--In this section you will be working with combining various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.
--7.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
    select * from customer, invoice where customer.customer_id = invoice.invoice_id;

--7.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
   --select* from customer, full outer join invoice on customer.id = customer_id;
select*  from customer full outer join invoice on customer.customer_id = invoice.customer_id;
   
--7.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.
   select* from artist b right join album a on b.artist_id = a.artist_id;

--7.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
select * from album a2 cross join artist a3 order by a3.artist_id asc;


--7.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.
 select A.first_name as first_name, A.last_name as last_name, A.title, B.last_name as reports_to from employee A, employee B where A.reports_to = B.employee_id;

--3.0	SQL Functions
--In this section you will be using the Oracle system functions, as well as your own functions, to perform various actions against the database
--3.1 System Defined Functions
--Task – Create a function that returns the current time.
create function currentTime()
returns text as $$
begin
    return current_time;
end;
$$ language plpgsql;

select currentTime();


--Task – Create a function that returns the length of a mediatype from the mediatype table
create function mediatypeLength(idinput int)
returns int as $$
begin
	return (select length(name) from mediatype where mediatypeid = idinput);
 end;
$$ language plpgsql;

	select mediatypeLength();

--3.2 System Defined Aggregate Functions
--Task – Create a function that returns the average total of all invoices
create or replace function averageTotal()
returns float as $$
begin
	return avg(total) from invoice;
 end;
$$ language plpgsql;

select averageTotal();


