show tables;

create table hoiwon(
	idx int not null auto_increment primary key,
	name varchar(20) not null,
	id varchar(20) not null,
	pw varchar(20) not null,
	phone_number varchar(20) not null,
	email_address varchar(15)
);
 drop table hoiwon;

desc hoiwon;

insert into hoiwon values (
	default,
	'홍길동',
	'honggildong',
	'1234',
	'01011111111',
	'sf@sadfsda'
); 

select * from hoiwon;