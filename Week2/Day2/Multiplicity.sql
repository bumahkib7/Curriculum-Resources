--Multiplicity
-- Relationship between each other. 
-- RDBS has support for tables to be related to other tables. 
-- Tables can be related to another table via foreign keys! 

-- One to one 
-- One to Many 
-- Many to One 
-- Many to Many 

--One to Many example: 
--The 'Many' table has a reference to the 'one table'
-- The Planet can have many moons, a moon can have only one planet. 
-- i.e. the moons reference which planet they orbit. 

create table planets(
	planet_id int primary key,--every table should at least have a primary key, a unique way of identifing a row! 
	planet_name varchar(30) not null,
	has_rings boolean
	);
	
create table moons(
	moon_id serial primary key, --serial will generate int numbers for us! 
	moon_name varchar(30) not null,
	--Below is the foreign key column!
	foreign_planet_key int references planets(planet_id)
);

insert into planets values 
	(1,'Earth',false),
	(2,'Mars',false),
	(3, 'Jupiter', true);
	
insert into moons (moon_name, foreign_planet_key ) values 
	('The Moon 3', 1);

insert into moons (moon_name, foreign_planet_key) values 
	('Deimos', (select planet_id from planets where planet_name = 'Mars')),
	('Phobus', (select planet_id from planets where planet_name = 'Mars')),
	('Titan', (select planet_id from planets where planet_name = 'Jupiter'));

select * from moons;

select * from planets;

select * from moons where foreign_planet_key = (select planet_id from planets where planet_name = 'Jupiter');


-- One to one 
-- but this time one planet can only have one moon!

drop table planets_moons_junction ;
drop table moons;
drop table planets;


create table planets(
	planet_id int primary key,--every table should at least have a primary key, a unique way of identifing a row! 
	planet_name varchar(30) not null,
	has_rings boolean
	);
	
create table moons(
	moon_id serial primary key, --serial will generate int numbers for us! 
	moon_name varchar(30) not null,
	--Below is the foreign key column!
	foreign_planet_key int references planets(planet_id) unique -- THIS MAKES IT A 1-1 RELATIONSHIP
);


--Many to Many 
-- The tables don't directly reference each other!
-- Instead we create a Junction/Join table, that references both tables!
drop table planets_moons_junction ;
drop table moons;
drop table planets;

create table planets(
	planet_id serial primary key,--every table should at least have a primary key, a unique way of identifing a row! 
	planet_name varchar(30) not null
	);
	
create table moons(
	moon_id serial primary key, --serial will generate int numbers for us! 
	moon_name varchar(30) not null
);

create table planets_moons_junction(
	p_id int references planets(planet_id),
	m_id int references moons(moon_id)
);

select * from planets;

insert into planets (planet_name) values 
	('Earth'),
	('Mars'),
	('Jupiter');
	
insert into moons (moon_name) values 
	('The Moon 3');

insert into moons (moon_name) values 
	('Deimos'),
	('Phobus'),
	('Titan');
	
insert into planets_moons_junction values (1,1);
insert into planets_moons_junction values (2,1);
insert into planets_moons_junction values (3,1);
select * from planets_moons_junction;
select * from planets;
select * from moons;


select * from planets where planet_id 
	in (select p_id from planets_moons_junction where m_id = 
		(select moon_id from moons where moon_name = 'Deimos'));
		
	