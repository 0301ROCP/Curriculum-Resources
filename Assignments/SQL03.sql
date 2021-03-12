--7.0 JOINS

--7.1 INNER
--Create an inner join that joins customers and orders (invoice) and specifies the name of the customer and the invoiceId.

select first_name, invoice_id from customer inner join invoice on customer.customer_id= invoice.customer_id;

--7.2 OUTER
--Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.

select c.customer_id, first_name, last_name, invoice_id, total from customer c full join invoice i on c.customer_id = i.customer_id;

--7.3 RIGHT
-- Create a right join that joins album and artist specifying artist name and album title.

select a.name, a2.title from artist a right join album a2 on a.artist_id = a2.artist_id order by a.name;

--7.4 CROSS
--Create a cross join that joins album and artist and sorts by artist name in ascending order.
select * from artist a cross join album order by a.name asc;


--7.5 SELF
--Perform a self-join on the employee table, joining on the reportsto column.
select e1.employee_id, e1.first_name, e1.last_name, e2.employee_id , e2.first_name, e2.last_name from employee e1 inner join employee e2 on e1.reports_to = e2.employee_id;

