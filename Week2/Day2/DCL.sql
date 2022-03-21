--DCL
--Data Control Language
--Used to provide privillege and access to users and also to restrict them. 
-- using grant and revoke. 
--GRANT
--REVOKE

create role new_login LOGIN password 'pass';

grant all privileges on schema public to new_login;

grant select on table public.fruits to new_login;

select * from fruits;
insert into fruits values (5,'Kiwis','green',true);
insert into fruits values (6,'tomatoe','green',true);

revoke all privileges on schema public from new_login;
revoke select on table public.fruits from new_login;

