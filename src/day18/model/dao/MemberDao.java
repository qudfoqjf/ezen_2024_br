package day18.model.dao;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends Dao {

    private MemberDao(){} //생성자
    private static MemberDao memberDao = new MemberDao();    //객체 생성
    public static MemberDao getInstance(){return memberDao;} // memberView 객체를 리턴

    // 연동
    //1. 회원가입
    public int  signup(MemberDto memberDto){
        try {


        //1. SQL 작성
        String sql= "insert into member(mid,mpw,mphone)values(?,?,?)";
        //2. SQL 기재
        ps=conn.prepareStatement(sql);
            //? 매개변수 대입
            ps.setString(1, memberDto.getMid()); //  기재된 SQL내 첫번째 ?에 값 대입
            ps.setString(2, memberDto.getMpw()); //  기재된 SQL내 두번째 ?에 값 대입
            ps.setString(3, memberDto.getMphone()); //  기재된 SQL내 세번째 ?에 값 대입
        //3. SQL 실행//4. SQL 결과
        int count = ps.executeUpdate(); //executeUpdate() 기재된 sql 실행하고 insert된 레코드 개수 반환.
        if(count==1){return 0;} // 만약에 insert 처리된 레코드가 1개면 회원가입 성공
        }catch (Exception e){
            System.out.println(e);
        }

        //5. 함수 종료

        return 1; //실패
    }
    //0. 아이디 검사용(아이디 중복검사용)
    public boolean idCheck(String mid){
        try{
        //1. SQL을 작성한다.
        String sql= "select mid from member where mid =? ";

        //2. SQL을 기재한다.

        ps= conn.prepareStatement(sql);
        //+? 매개변수 대입
        ps.setString(1,mid);    //sql문법내 첫번째 ?에 mid변수 값 대입
        //3. SQL을 실행한다.
        rs= ps.executeQuery();  //질의/검색 (select) 결과를 rs 인터페이스를 대입한다.
        //4. SQL을 출력한다.
        if(rs.next()){      //rs.next():검색 결과 테이블에서 다음레코드 이동. [다음레코드 이동]
            return true;

        }
        }catch (Exception e){
            System.out.println(e);
        }

        //5. 함수종료
        return false;
    }

    //2. 로그인
    public boolean login(MemberDto memberDto){
        try{
        //1. SQL을 작성한다.
        String sql= "select * from member where mid=? and mpw=? ";
        //2. SQL을 기재한다.
        ps=conn.prepareStatement(sql);
            //+? 매개변수 대입
            ps.setString(1,memberDto.getMid()); //sql 문법내 ? 순서 위치 번호
            ps.setString(2,memberDto.getMpw()); //sql 문법내 ? 순서 위치 번호
        //3. SQL을 실행한다.
        rs=ps.executeQuery();
        //4. SQL을 출력한다.
            //if vs while   : 만약에 SELECT의 결과물이 하나의 레코드가 존재하면 로그인 성공 아니면 실패
        if(rs.next()){return true;}
        }catch (Exception e){
            System.out.println(e);  //sql 문제발생
        }
        //5. 함수종료

        return false;
    }
    //0. 아이디를 이용한 회원번호 찾기
    public int findMno(String mid){
        try {
            //1. SQL을 작성한다.
            String sql = "select mno from member where mid=?";
            //2. SQL을 기재한다.
            ps = conn.prepareStatement(sql);
            //+? 매개변수 대입
            ps.setString(1,mid );
            //3. SQL을 실행한다.
            rs = ps.executeQuery();
            //4. SQL을 출력한다.
            if (rs.next()) {
                return rs.getInt(1);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        //5. 함수종료
        return 0;
    }

}
