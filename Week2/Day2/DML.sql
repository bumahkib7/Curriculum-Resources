--DML
--Data Manipulation Language
-- Being able to manipulate the individual rows/records in our tables
-- CRUD: Create, Read, Update and Delete 
-- DML: Insert, Select, Update and Delete

truncate fruits;

--Select 
select * from fruits;
select fruit_name, is_berry from fruits;
select * from fruits where is_berry = true and stock > 50;
select color from fruits where is_berry = true and stock > 50;

--Insert 
insert into fruits values('Apple',false,true,100,'Red');
insert into fruits (fruit_name,color) values ('Banana','Yellow');
insert into fruits (fruit_name,color,stock,is_berry) values 
	('Strawberry','Red',50,true),
	('Kiwi','Brown and Green',70,false),
	('Melon','Green',10,false);

--Update 
update fruits set stock = 100, is_berry = true where fruit_name = 'Banana'; 

--delete 
delete from fruits; --this is very dangerous, most DML commands should have a WHERE condition 
--delete from without condition will act similar to the truncate command!
--truncate is designed to act on a table, will not cache the removed data. 
--delete is designed to act on a single row, and will cache data so that it can be reverted!

delete from fruits where is_berry = false;

