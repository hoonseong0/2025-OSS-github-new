 use cookdb;
 create view v_userTBL
 as
	select userId, username, addr
    from usertbl;
--
select *
from v_usertbl;
-- 강호동 구매 목록 2개테이블 조인
select U.userid, u.username, b.prodname, u.addr, concat(U.mobile1, U.mobile2) as "연락처"
from userTBL u, buytbl b
where u.userid = b.userid and u.username = "강호동" ;
-- View 생성
create view v_userbuyTbl
as select u.userid, u.username, b.prodname, u.addr, concat(u.mobile1, u.mobile2) as "연락처"
from userTbl u , buytbl b
where u.userid = b.userid;
-- View 생성 하고 강호동 구매 목록(1View)
select * from v_userbuytbl
where username = "강호동";

alter view v_usertbl
as 
select u.userid as '사용자 아이디', u.userName as '이름', b.prodname as '제품 이름',
u.addr, concat(u.mobile1, u.mobile2) as '전화 번호'
	from userTBL u
		inner join buytbl b
			on u.userid = b.userid;

select '이름', '전화 번호' from v_userbuytbl;

drop view v_userbuytbl;

use cookdb;
create or replace view v_userTBL
as 
	select userid, username, addr from usertbl;

----------------------------------------- 
-- index

user cookdb;
create table tbl1
( a int primary key, 
  b int,
  c int
);
show index from tbl1;

create table tbl2
(a int primary key,
 b int unique,
 c int unique,
 d int
);
show index from tbl2;

create table tbl3
( a int unique,
  b int unique,
  c int unique,
  d int
);
show index from tbl3;

create table tbl4
( a int unique not null,
  b int unique,
  c int unique,
  d int
);
show index from tbl4;

create table tbl5
(a int unique not null,
 b int unique,
 c int unique,
 d int primary key
);
show index from tbl5;




select * from usertbl;
-- index 확인( 수정후 pk username 변경)
drop table buytbl;
alter table usertbl drop primary key;
alter table usertbl add constraint pk_username primary key (username);
select * from usertbl;

-- 보조 index
select * from usertbl;
create index idx_usertbl_addr
on usertbl(addr);
show index from usertbl;

-- 보조 unique index
create unique index idx_usertbl_addr
on usertbl(addr);
show index from usertbl;
-- 보조 unique
create unique index idx_utbl_name
on usertbl(username);
show index from usertbl;

-- 인덱스 삭제
show index from usertbl;

drop index idx_usertbl_addr on usertbl;
drop index idx_usertbl_username_birthday, on usertbl;
drop index idx_usertbl_mobile1 on usertbl;

alter table usertbl drop primary key;

















