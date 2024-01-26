# DAY18 회원가입 게시판
#1. 데이터베이스 생성
drop database if exists java;
create database java;
use java;

# 2. (회원가입) 테이블
drop table if exists member;
create table member(
	mno	int auto_increment ,			-- 번호	*mysql*만 제공하는 제약조건
    mid	varchar(30) not null unique,	-- 아이디
	mpw	varchar(30) not null,			-- 비밀번호
    mphone char(13) not null unique,	-- 전화번호 010-0000-0000 형식
    mdate datetime default now(),		-- 가입날짜
    primary key(mno)					-- 번호가 기본키(pk) -not null , unique 생략가능
);
select* from member;

select * from member;

select mid from member where mid ='"+ +"';

#2.회원가입
insert into member(mid,mpw,mphone)values('qweqweqwe','qweqweqwe','010-0000-0000');
delete from member where mid='qweqweqwe';
#3. R(select) 로그인 : 아이디와 비밀번호 비교 and( java &&, db and), or(java ||, db or)
select * from member where mid='qweqweqwe' and mpw= 'qweqweqwe';
select * from member where mid=? and mpw=?;
#4  R(select) 회원번호찾기: 
select mno from member where mid= 'qweqweqwe';
#select mno from member where mid=?; 










