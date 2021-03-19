-- 7.1
select * from customer inner join invoice on customer.customer_id = invoice.customer_id;

--7.2
select customer.customer_id, first_name, last_name, invoice_id, total from customer full outer join invoice on customer.customer_id = invoice.customer_id;

--7.3
select name, title from album right join artist on album.artist_id = artist.artist_id;

--7.4
select * from album cross join artist order by name asc;

--7.5
select * from employee a, employee b where a.reports_to = b.employee_id;

--3.1
select current_time;
select length("name") from media_type;

--3.2
select avg ("total") from invoice;
select max ("unit_price") from track;

--3.3
select avg ("unit_price") from invoice_line;

--3.4
select * from employee where birth_date between '1968-01-01' and current_date;