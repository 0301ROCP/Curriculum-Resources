--7.1 INNER
--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.
select * from customer, invoice where customer.customer_id = invoice.customer_id;

--7.2 OUTER
--Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.
select * from customer a full outer join invoice b on a.customer_id = b.customer_id ;

--7.3 RIGHT
--Task – Create a right join that joins album and artist specifying artist name and title.
select * from artist b right join album a on b.artist_id = a.artist_id;

--7.4 CROSS
--Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.
--select * from album a cross join artist b 
--select * from album a cross join artist b 
select * from album a2 cross join artist a3 order by a3.artist_id asc;

--select * from album a cross join artist b 
--select * from artist order by artist asc;

--7.5 SELF
--Task – Perform a self-join on the employee table, joining on the reportsto column.
select * from employee a , employee b where a.reports_to = b.employee_id ;

--3.1 System Defined Functions
--Task – Create a function that returns the current time.
--Task – Create a function that returns the length of a mediatype from the mediatype table
select CURRENT_TIMESTAMP;
select name, LENGTH(name) from media_type mt ;


--3.2 System Defined Aggregate Functions
--Task – Create a function that returns the average total of all invoices
--Task – Create a function that returns the most expensive track
select AVG(total) from invoice group by invoice_id;
select MAX(total) from invoice;


--3.3 User Defined Scalar Functions
--Task – Create a function that returns the average price of invoiceline items in the invoiceline table
select AVG(unit_price) from invoice_line;

--3.4 User Defined Table Valued Functions
--Task – Create a function that returns all employees who are born after 1968.
select * from employee e where e.birth_date > '1968-01-01';








