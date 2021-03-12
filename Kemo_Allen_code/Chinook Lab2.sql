--JOINS

--7.1 Inner
-- Create an inner join that joins customers and orders and specifies the 
-- name of the customer and the invoiceId.
select c.first_name, c.last_name, i.invoice_id 
from customer as c
inner join invoice as i 
on i.customer_id = c.customer_id;

--7.2 Outer 
-- Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, 
--lastname, invoiceId, and total.
select c.customer_id, c.first_name, c.last_name, i.invoice_id, i.total
from customer as c
full outer join invoice as i
on c.customer_id = i.customer_id;

--7.3 Right
select a.artist_id, a.name, b.album_id, b.title
from artist as a
right join album as b
on a.artist_id = b.artist_id;

--7.4 Cross
select a.artist_id, a.name, b.album_id
from artist as a 
cross join album as b;

--7.5 Self
select  e2.employee_id, e2.first_name, e.reports_to, e.first_name as manager
from employee as e, employee as e2 
where (e.reports_to = e2.employee_id);



--------------------------------------------------------------------------
--SQL Functions

--3.1 System Defined Functions



--3.2 System Defined Aggregate Functions








