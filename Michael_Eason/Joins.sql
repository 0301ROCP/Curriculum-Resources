--7.0 Joins

--7.1  INNER

--Task – Create an inner join that joins customers and orders and 
	--specifies the name of the customer and the invoiceId.

select c.first_name, c.last_name, i.invoice_id 
from customer as c
inner join invoice as i 
on i.customer_id = c.customer_id;


--7.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, 
	--specifying the CustomerId, firstname, lastname, invoiceId, and total.
	
select c.customer_id, c.first_name, c.last_name, i.invoice_id, i.total
from customer as c
full outer join invoice as i
on c.customer_id = i.customer_id;

--7.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and 
	--title.
	
select a.artist_id, a.name, b.album_id, b.title
from artist as a
right join album as b
on a.artist_id = b.artist_id;


--7.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in 
	--ascending order.
	
select a.artist_id, a.name, b.album_id 
from artist as a 
cross join album as b;

--7.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.

select e2.employee_id, e2.first_name, e.reports_to, e.first_name as manager
from employee as e, employee as e2
where e.reports_to = e2.employee_id;




