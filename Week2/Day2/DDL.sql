--DDL: Data Definitional Langauage
-- Is what allows us to manage our table structures altogether

--CREATE : create a brand new table in our schema!
--DROP : remove the data in a table and remove the table structure!
--TRUNCATE : remove the data in a table, but keep the table structure
--ALTER : modify an existing table in the schema!

truncate  fruits;
drop table if exists fruits;

create table fruits( 
	fruit_name varchar(30) not null unique,
	is_berry boolean,
	is_tasty boolean,
	stock smallint check(stock > 0)
	);

alter table fruits add color varchar(15) not null;
alter table fruits alter is_tasty set default true;

select * from fruits;


	
