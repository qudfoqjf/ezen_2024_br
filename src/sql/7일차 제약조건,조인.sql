
/*

	#
		DB: 데이터베이스: 기계어 구성된 데이터들의 집합
        
			DBMS(RDBMS -> MYSQL, ORACLE)			<-- MYSQL WORKBENCH: DB연동
					| SQL 명령어
					|
        개발자(DBA): 영어, 한글
	#제약조건
    1. not null
    2. unique
    3. default 값/함수()
    4. (*mysql pk일 경우) auto_increment
    5. primary key( pk필드명 )
    6. foreign key( fk필드명 ) references 참조할테이블(참조할pk필드명)
		# 1.제약조건에 이름 달기.(제약조건 이름을 부여해서 삭제,수정) 생략시 자동 이름 부여
			1. constraint 제약조건명 primary key(pk필드명)
            2. constraint 제약조건명 foreign key(fk필드명) references 참조할테이블(참조할pk필드명)
            
		# 2. 제약조건에 무결성 옵션 설정.
			*무결성: 데이터의 정확성, 일관성 , 유효성을 유지
            constraint 제약조건명 
            foreign key(fk필드명) 
            references 참조할테이블(참조할pk필드명)
            (무결성 옵션)
				on [delete/update] [restrict/ cascade/ noaction/ set null]
                1. on delete restrict	: PK데이터를 삭제할 때 PK데이터를 참조하는 FK데이터가 있으면 삭제 취소. [기본값/ no action]
                2. on delete cascade	: PK데이터를 삭제할 때 PK데이터를 참조하는 FK데이터가 있으면 같이 삭제 .
                3. on delete set null	: PK데이터를 삭제할 때 PK데이터를 참조하는 FK데이터가 있으면 PK데이터를 삭제하고 FK데이터는 null값 설정.
                4. on update restrict	: PK데이터를 수정할 때 PK데이터를 참조하는 FK데이터가 있으면 수정 취소.
                5. on update cascade	: PK데이터를 수정할 때 PK데이터를 참조하는 FK데이터가 있으면 수정 취소.
                6. on update set null	: PK데이터를 수정할 때 PK데이터를 참조하는 FK데이터가 있으면 수정 취소.
                
        # 3. 조인 = 두가지 이상의 테이블 합치기
			# pk-fk
            1. select * from 테이블명A,테이블명B where 테이블명A.pk필드명=테이블B.fk필드명;
            2. select * from 테이블명A natural join 테이블명B;
            3. select * from 테이블명A join 테이블명B on 테이블명A.pk필드명 = 테이블명B.fk필드명;
            4. select * from 테이블명A join 테이블명B using(필드명);
            5. select * from 테이블명A innerjoin 테이블명B on 테이블명A.pk필드명=테이블명B.fk필드명;
            6. select * from 테이블명A RIGHT OUTER JOIN 테이블명B on 테이블명A.pk필드명=테이블명B.fk필드명; 
            7. select * from 테이블명A LEFT OUTER JOIN 테이블명B on 테이블명A.pk필드명= 테이블명B.fk필드명;
            집합
                
                
*/

drop database if exists test7;
create database test7;
use test7;

drop table if exists member;
#1. 회원테이블
create table member(
	mno int auto_increment, mid varchar(30), mpw varchar(30),
    constraint member_mno_pk primary key(mno) 
);

#2. 게시판테이블
create table board(
	bno int auto_increment, btitle text, bcontent text,
    mno int,
    constraint board_bno_pk primary key (bno), 
    constraint board_mno_fk 
    foreign key(mno)
    references member(mno)
    #on delete restrict 		# pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 취소/실행불가. [기본값] 
    #on delete cascade			# pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 같이 삭제 
    #on delete set null			# pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 pk삭제하고 fk를  null로 설정
    #on update restrict			#
    #on update cascade			#
    #on update set null			#
);
#3. 샘플...
	#1. 1명 회원 가입.
insert into member(mid, mpw) values('ezen01', '1234');
	#2. 1번 회원이 게시물 작성
insert into board(btitle,bcontent, mno) values('자바', '안녕하세요',1);
	
select * from member;
select * from board;

	#3. 1번 회원 탈퇴
#delete from member where mno=1;
#delete from member where mno=2;

	#4. 1번 회원 회원번호를 수정
#update member set mno= 3 where mno=1;

##-------------------------------------관계 검색----------------------------------##
insert into member(mid,mpw) values('ezen01','1234');
insert into member(mid,mpw) values('ezen02','5678');
insert into member(mid,mpw) values('ezen03','7899');

insert into board(btitle,bcontent,mno) values('자바','안녕',2);
insert into board(btitle,bcontent,mno) values('파이썬','안녕',1);

############################# 1. 다중 테이블의 데이터 검색 ###############################
#1. 1번 게시물의 작성자 아이디를 알고 싶다.
	# 1. 1번 게시물의 작성자(mno) 찾기
select mno from board where bno=1;			-- 2
	# 2. 찾은 mno를 가지고 회원의 아이디(mid) 찾기.
select mid from member where mno= 2;		-- ezen02

############################# 2. 관계[pk-fk]가 있는 테이블 간의 조인###########################
#1. where 절 이용 [일반조건where인지 테이블 간의 조인조건where인지 가독성이 떨어진다.]
select * from member; -- 회원테이블 모든 레코드 검색
select * from board;  -- 게시물 테이블 모든 레코드 검색
select * from member, board; -- 두개 이상의 테이블을, (쉼표) 구분
#select * from member, board where mno=mno; -- pk필드와 fk필드가 일치했을때 (mno식별불가능)
	# 다중 테이블 selecct 할 때 필드명이 중복일 경우
	# 1. 필드명 앞에 테이블을 붙인다.
	# 2. 테이블명에 별칭 (검색시에만 사용되는 이름- 원본과 상관없음)
select* from member m, board b where m.mno= b.mno;

#2. JOIN 절 이용
#[교집합-> 두개 이상의 테이블의 공통 데이터 찾기.]
 
	#1. A natural join B
select * from member natural join board;
	#2. A join B on pk필드 = fk필드  
select * from member join board on member.mno = board.mno;
	#3. A join B using(관계필드명)
select * from member join board using(mno);
	#4. A inner join B on pk필드 = fk필드
select * from member inner join board on member.mno= board.mno;
	#5. A right outer join B on pk필드 = fk필드 
select * from member right outer join board on member.mno= board.mno;
	#6. A left outer join B on pk필드= fk필드
select * from member left outer join board on member.mno= board.mno;



