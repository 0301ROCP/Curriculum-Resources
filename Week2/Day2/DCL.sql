--DCL
-- Managing who has access to the database

--GRANT 
-- Grants privlelles to a user!
create role rando_login LOGIN password 'p4ssw0rd';

grant all privileges on schema public to rando_login;

--REVOKE 
-- removes privileges to a user!