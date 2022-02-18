--Joins
-- Useful to combine tables that reference other tables
-- combine both tables to get information from both in a single view. 
-- Inner join, Left outer join, Right outer join, Full outer join, 
-- self join and cross join 

--Why do we have multiple tables in the first place?
-- Normalization! Splitting up our tables is a by product of normalizing them. 
-- (Joins allow us to then more effectively query together normalized tables!)


select count(*) from "Album" ;
select * from "Album" ;

select * from public."Artist" where "ArtistId" = 1;
select count(*) from public."Artist" a ;
select * from public."Artist" a ;

select * from "Album" where "ArtistId" = 1 ;

select count(*) from public."Customer";

-------INNER JOIN (only matching values will be shown)
-- Return records from both tables as long as the matching condition has been met! 
-- Joins can be established on any matching condition, but usually on primary key 
-- foreign key equality. 


select * from "Artist", "Album" where "Artist"."ArtistId" = "Album"."ArtistId" order by "Artist"."ArtistId" ;
select count(*) from "Artist", "Album" where "Artist"."ArtistId" = "Album"."ArtistId";

select * from "Album" a inner join "Artist" a2 on a."ArtistId" = a2."ArtistId" ;
select count(*) from "Album" a inner join "Artist" a2 on a."ArtistId" = a2."ArtistId" ;

select * from "Album" a inner join "Genre" g on a."AlbumId" = g."GenreId";

select * from "Genre" g inner join "Album" a on g."GenreId" = a."AlbumId" ;
select count(*) from "Genre" g inner join "Album" a on g."GenreId" = a."AlbumId" ;


-----------LEFT OUTER JOIN (All the values from the left table!)

select * from "Artist" a left outer join "Album" a2 ON a."ArtistId" = a2."ArtistId" order by a."ArtistId" ;
select count(*) from "Artist" a left outer join "Album" a2 ON a."ArtistId" = a2."ArtistId" ;

select * from "Album" a left outer join "Artist" a2 ON a."ArtistId" = a2."ArtistId" ;
select count(*) from "Album" a left outer join "Artist" a2 ON a."ArtistId" = a2."ArtistId" ;

-----------RIGHT OUTER JOIN (All the values from the right table!)

select * from "Artist" a right outer join "Album" a2 ON a."ArtistId" = a2."ArtistId" order by a."ArtistId" ;
select count(*) from "Artist" a left outer join "Album" a2 ON a."ArtistId" = a2."ArtistId" ;

select * from "Album" a right outer join "Artist" a2 ON a."ArtistId" = a2."ArtistId" ;
select count(*) from "Album" a left outer join "Artist" a2 ON a."ArtistId" = a2."ArtistId" ;


-----------FULL OUTER JOIN  (All the values from all the tables!)

select * from "Artist" a full outer join "Album" a2 on a."ArtistId" = a2."ArtistId" ;
select count(*) from "Artist" a full outer join "Album" a2 on a."ArtistId" = a2."ArtistId" ;

-----------SELF JOIN 

select e."FirstName", e."LastName" , e."Title" , 
	managers."FirstName" , managers."LastName" , managers."Title"  
	from "Employee" e inner join "Employee" managers ON e."ReportsTo" = managers."EmployeeId" ;

-----------CROSS JOIN 
select * from "Album" a cross join "Artist" a2;




