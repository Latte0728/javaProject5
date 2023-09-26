show tables;

create table hoiwon(
	idx int not null auto_increment primary key,
	id varchar(20) not null,
	pw varchar(20) not null,
	phone_number int not null,
	email_address varchar(15)
);
 drop table hoiwon;

desc hoiwon;

select * from hoiwon;