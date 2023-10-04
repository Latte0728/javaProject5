show tables;

create table hoiwon(
	idx int not null auto_increment primary key,
	name varchar(20) not null,
	id varchar(20) not null,
	pw varchar(20) not null,
	phone_number varchar(20) not null,
	email_address varchar(200)
	);
	
create table medicine(
	name varchar(200) primary key,
	element varchar(200),
	company varchar(200),
	effect varchar(1000)
	
);

insert into hoiwon values (
	default,
	'박정환',
	'admin',
	'1234',
	'01026409654',
	'qkrwjdgkgk12@naver.com'
	); 

insert into medicine values('키트루다주','pembrolizumab  100mg/ 4mL','한국엠에스디','폐암');
insert into medicine values('티쎈트릭','Atezolizumab','한국 로슈','폐암');
insert into medicine values('아바스틴',	'Bevacizumab',	'한국 로슈',	'유방암');
insert into medicine values('퍼제타',	'Pertuzumab 30mg/mL',	'한국 로슈',	'유방암');
insert into medicine values('타이커브정'	,'Lapatinib Ditosylate 405mg',	'한국 노바티스',	'유방암');
insert into medicine values('옵디보주',	'Nivolumab 240mg/24ml',	'한국오노약품공업', '위암');
insert into medicine values('얼비툭스주'	,'Cetuximab',	'머크'	,'대장암');
insert into medicine values('UFT',	'Tegafur 100mg',	'제일 약품',	'대장암');
insert into medicine values('렌비마'	,'Lenvatinib Mesylate 12 25mg',	'한국에자이',	 '갑상선암');
insert into medicine values('카프렐사정',	'Vendetanib 300mg'	,'사노피아벤티스 코리아',	'갑상선암');
insert into medicine values('스티바가정','	Regorafenib Hydrate 41.49mg',	'바이엘코리아',	'간암');
	
desc medicine

select * from hoiwon;
select * from medicine

delete from hoiwon where id = "admins";

drop table medicine