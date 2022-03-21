--This is a comment in SQL !
--SQL is different to Java, we don't need to execute all the code!
--We can execute the whole script!
--We can highlight the SQL statement that we want to execute!


--Create a table

create table fruits(); --what can I store here?
-- absolutley nothing!

--SQL is not uppercase sensitive!
create table better_fruit_table(
	fruit_name varchar(15)
);

create table BetteR_Fruit_tABle(
	fruit_name varchar(15)
);

create table even_better_fruit_table(
	fruit_name varchar(15),
	fruit_description varchar(30),
	is_tasty bool,
	calories int 
);

--To view the information in the table 
select * from better_fruit_table;
select * from even_better_fruit_table ;

--insert data into the table! Insert Green Apple into  my table.
insert into better_fruit_table values ('Green Apple');
insert into better_fruit_table values ('Red Apple');
insert into better_fruit_table values ('Kiwi');

insert into even_better_fruit_table values('Red Apple','An Apple, but red',true,100);
insert into even_better_fruit_table values('Durian','very stinky');
insert into even_better_fruit_table (fruit_name,is_tasty,calories) values ('Green Apple',true,100);
insert into even_better_fruit_table (is_tasty,calories) values (true,-100);

--Stuff for tomorrow!
select fruit_name from better_fruit_table ;
select fruit_name as name from better_fruit_table ;
