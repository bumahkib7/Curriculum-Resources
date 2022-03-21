--Transactions
-- A transaction is a set of DML queries on a database. 
-- I want to transfer money from one bank account to another. 
-- Update Ben's account (--money)
-- Uddate Jakub's account (++money)

--Transcation Property
--Transaction should follow 4 properties, abreviated with ACID
-- Atomicity: 
-- (Something is indivisable) Either all of the transcation is executed or
-- none of the transcation is executed! 

-- Consistency: 
-- Every transcation on the database must keep the integrity of the database. 
-- (i.e. no orphan records or constraint violation)

-- Isolation:
-- (4 levels of isolation)
-- When 2 transcation are executing at the same time (concurrently) and working
-- on the same data then they should not intefere with each other! 

-- 4 Levels of Isolation: 
-- Serializable: 
	-- Read and write locks. 
	-- Stops Phantom Reads, Non-Repeatable Reads and Dirty Reads 
	-- Tables that is being read cannot be modified until the reading is done (no DML)

-- Repeatable Reads: 
-- Read Committed:

-- Read Uncomitted:
--	You can read data that was not committed to the databasae. 
-- 	This is terrible. Never use a database with this level of isolation. 
--  Very inconsistent! 

--Read phenomena (Bad things that can happen with you database)
-- Dirty Read: reading data that is uncommiteed. 
-- Non-Repeatable Read: 
-- Phantom Read: 

-- Durability 
-- Once a transcation is complete, that traansactino should be recorded in the 
-- database regarless of system crash or power outage. 



--TCL
--Transaction Control Language 
--COMMIT : any DML operation that were executed before will be persisted. 
-- e.g: 
-- Update ben account set amount = 50; 
-- Update jakub account set amount = 150;
-- commit;

--ROLLBACK: any DML operation between COMMIT statements to be completely erased. 
-- ROLLBACK will revert the state of the database to the previous SAVEPOINT

--SAVEPOINT : checkpoint, it is utilized by ROLLBACK to go to. 


-- [many DML operations]
-- SAVEPOINT A
-- [Many more DML operation]
-- ROLLBACK TO A 