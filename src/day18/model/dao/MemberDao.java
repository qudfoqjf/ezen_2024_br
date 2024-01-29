package day18.model.dao;


import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends Dao{

    //싱글톤
    private MemberDao(){}//생성자 : 객체 생성시 초기화 담당
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

    //1. 회원가입
    public int signup(MemberDto memberDto){
        try {
            //1.SQL 작성 [변수가 들어갈 자리에는 '?' 대체한다]
            String sql = "insert into member(mid,mpw,mphone)values(?,?,?)";
            //2.SQL 기재
            ps = conn.prepareStatement(sql);
            // '?' 매개변수 대입
            ps.setString(1,memberDto.getMid());     //기재된 SQL내 첫번째 '?' 에 값 대입
            ps.setString(2,memberDto.getMpw());     //기재된 SQL내 두번째 '?' 에 값 대입
            ps.setString(3,memberDto.getMphone());  //기재된 SQL내 세번째 '?' 에 값 대입
            //3.SQL 실행 //4.SQL 결과
            int count = ps.executeUpdate(); //.executeUpdate() 기재된 sql 실행하고 insert 된 레코드 개수 반환
            if(count == 1){//만약에 insert 처리된 레코드가 1개이면 회원가입 성공
                return 0; //회원가입성공
            }
        }catch (Exception e){
            System.out.println(e);
        }

        //5.함수종료

        return 1; //실패
    }

    //아이디중복검사
    public boolean idCheck(String mid){
        try {
            //1. SQL 작성
            String sql = "select mid from member where mid = ? ";
            //2. SQL 기재
            ps = conn.prepareStatement(sql);
            //+'?' 매개변수
            ps.setString(1,mid); //sql 문법내 첫번째 '?'에 mid 변수 값 대입
            //3.SQL 실행
            rs = ps.executeQuery(); // 질의/검색 (select) 결과를 rs 인터페이스 대입
            // 4.SQL 결과
            if(rs.next()){ //rs.next() : 검색 결과 테이블에서 다음레코드 이동 [다음레코드 이동
                return true; //중복있음
            }
        }catch (Exception e){
            System.out.println(e);
        }

        //5.함수종료
        return false; //중복 없음
    }

    //2.로그인
    public boolean login(MemberDto memberDto){
        try {
            //1. SQL 작성
            String sql = "select*from member where mid = ? and mpw = ?";
            //2. SQL 기재
            ps = conn.prepareStatement(sql);
            //+'?' 매개변수
            ps.setString(1, memberDto.getMid()); //sql 문법내 첫번째'?'에 매개변수 값 대입
            ps.setString(2, memberDto.getMpw()); //sql 문법내 두번째'?'에 매개변수 값 대입
            //3. SQL 실행
            rs = ps.executeQuery();
            //4. SQL 결과
            if (rs.next()) {
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        //5. 함수종료
        return false;
    }

    //0. 아이디를 이용한 회원번호 찾기
    public int findMno(String mid){
        try {
            //1. SQL 작성
            String sql = "select mno from member where mid=?";
            //2. SQL 기재
            ps = conn.prepareStatement(sql);
            //+'?' 매개변수 대입
            ps.setString(1, mid);
            //3.SQL 실행
            rs = ps.executeQuery();
            // 4.SQL 결과
            if(rs.next()){
                //rs.next() : 다음 레코드로 이동
                //rs.get타입(호출할 필드번호 or 필드이름) : 현재 레코드의 필드 값 호출
                return rs.getInt("mno");
            }
        }catch (Exception e){
            System.out.println(e);
        }


        return 0;
    }

}//c e