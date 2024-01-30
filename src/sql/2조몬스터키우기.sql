# 2조 DB설계

drop database if exists monster;

create database monster;

use monster;

# 테이블 생성 =================================================

# 회원 테이블
drop table if exists member;

create table member(
	mno int auto_increment ,			-- 회원 번호
    mid varchar(30) not null unique ,	-- 회원 아이디
    mpw varchar(30) not null ,			-- 회원 비밀번호
    mphone char(13) not null unique ,	-- 회원 전화번호
    mname varchar(30) not null , 		-- 회원 이름
    primary key(mno)
);



insert into member values(
	1 , 'qwer' , '1234' , '010-1111-1111' , '유재석'
);

insert into member values(
	2 , 'asdf' , '4567' , '010-2222-2222' , '강호동'
);

# 몬스터리스트 테이블
drop table if exists monsterlist;

create table monsterlist(
	stepno char(3)  ,
    img longtext not null  ,
    stat3 int not null ,
    stat4 int not null ,
    primary key(stepno)
);



insert into monsterlist values(
	'A_1' , 'img1' , 10 , 10 
);

insert into monsterlist values(
	'A_2' , 'img2' , 20 , 25 
);

insert into monsterlist values(
	'A_3' , 'img3' , 40 , 45
);

insert into monsterlist values(
	'B_1' , 'img4' , 11 , 9 
);


# 몬스터 테이블
drop table if exists monster;

create table monster(
	mno int auto_increment ,		 		 -- 회원번호
    nickname varchar(30) not null ,  		 -- 몬스터 이름
    stepno char(3) not null unique ,		 -- 몬스터 번호
    stat1 int not null ,			 		 -- 몬스터 체력
    stat2 int not null ,			 		 -- 몬스터 스트레스
	stat3 int not null ,			 		 -- 몬스터 지능
    stat4 int not null ,        	   		 -- 몬스터 힘
    foreign key(mno) references member(mno) ,-- 회원테이블 mno 참조 
    foreign key(stepno) references monsterlist(stepno)	-- 몬스터리스트테이블 stepno 참조
);


insert into monster values(
	1 , 'asd' , 'A_2' , 10 , 10 , 10 , 10 
);

insert into monster values(
	2 , 'qwe' , 'B_1' , 5 , 4 , 3 , 1
);

# 이벤트 카테고리 테이블
drop table if exists eventcategory;

create table eventcategory(
	cno int auto_increment ,
    cname varchar(30) ,
    primary key(cno)
);



insert into eventcategory values(
	1 , 'exercise'
);

insert into eventcategory values(
	2 , 'eat'
);

insert into eventcategory values(
	3 , 'study'
);

insert into eventcategory values(
	4 , 'rest'
);

# 스탯 카테고리 테이블
drop table if exists statcategory;

create table statcategory(
	sno int auto_increment ,
    sname varchar(30) ,
    primary key(sno)
);



insert into statcategory values(
	1 , 'hp'
);

insert into statcategory values(
	2 , 'stress'
);

insert into statcategory values(
	3 , 'int'
);

insert into statcategory values(
	4 , 'str'
);


# 이벤트 테이블
drop table if exists event;

create table event(
	cno int auto_increment ,
    statup int not null ,
    statdown int not null ,
    primary key(cno),
    foreign key(statup) references statcategory(sno),
    foreign key(statdown) references statcategory(sno)
);



insert into event values(
	1 , 4 , 1
);

insert into event values(
	2 , 1 , 3
);

insert into event values(
	3 , 3 , 2
);

insert into event values(
	4 , 2 , 4
);
select * from member;
select * from monsterlist;
select * from monster;
select * from eventcategory;
select * from statcategory;
select * from event;

