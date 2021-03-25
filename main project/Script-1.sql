create table employee(
     id serial primary key,
     firstName varchar(30),
     lastName varchar(30),
     userName varchar(30),
	 passw0rd varchar(30)
	 );
drop table employee ;
create table customer(
     id serial primary key,
	 firstName varchar(30),
	 lastName varchar(30),
	 loginStatus boolean,
	 userName varchar(30),
	 passw0rd varchar(30) 
	 );
insert into customer(firstName,lastName,loginStatus,userName,passw0rd)
    values('jhon','king',true,'j001','j002'),
          ('jim','allen',false,'j003','j004'); 

alter table customer drop loginStatus;

create table BankAccount (
   id serial primary key,
   Saving boolean,
   Checking boolean,
   Balance int,
   customer_id int references customer(id)
     );

select * from BankAccount;
insert into bankaccount (saving,checking,balance,customer_id)
    values(true,false,200,1),
          (true,false,380,2);

         
insert  into employee (id,firstName,lastName,userName,passw0rd)
            values(1,'ali','jason','j001','j002'),
                  (2,'mike','jims','j003','j004');