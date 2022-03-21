--DQL 
-- Data Query Language 
-- There is an argument that DQL should be part of DML.
-- Or DQL (select) is seperate to DML, because it does not modify the data
-- SELECT 

select * from fruits;
select count(*) from fruits;
select count(*) as number_of_different_fruits from fruits;

select count(*) from fruits where is_berry = true; --number of fruits that are berries
select sum(stock) as berry_stock from fruits where is_berry = true;

--group by clause 
select count(*) from fruits group by is_berry; -- returns the number of berry fruits and non-berry fruits!
select is_berry, sum(stock) from fruits group by is_berry; -- returns the number of berry fruits and non-berry fruits!
select color, sum(stock) as total_stock from fruits where is_berry = false group by color having sum(stock) > 20;
select color, sum(stock) as total_stock from fruits 
	where is_berry = false and fruit_name like '%'
		group by color 
			having sum(stock) > 20;

-- where vs having 
-- where is used on individual records, having is used on a group of records. 
-- where is on the left side of group by , having is opn the right side!

--Functions in SQL 
-- Difference between a function, a method, and a stored procedure. 
-- (function and method are similar, method is associated with a object.)
-- both function and method can have return values. 
-- stored procedures don't have a return type. (PgLSQl - Programming language sql extension)


--Scalar function in SQL 
-- Takes in a single input and returns a single output. 
select fruit_name from fruits;
select upper(fruit_name) from fruits;
select lower(fruit_name) from fruits;
select upper(lower(upper(fruit_name))) from fruits;

--Agregate functions in SQL 
-- Take in multiple inputs and return a single output. 
select * from fruits;
select count(*) from fruits;
select sum(stock) as number_of_fruits from fruits ; --alias 
select max(stock) as max_number_of_fruits from fruits;
select min(stock) as min_fruits from fruits;
select avg(stock) as avg_stock from fruits;


select now();