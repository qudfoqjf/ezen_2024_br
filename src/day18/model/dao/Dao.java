package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    // 접근제한자
    /*
        public           : 모든 패키지 접근 가능
        private          : 현재 클래스 접근 가능
        protected        : 동일 패키지 접근 가능 + 상속관계 가능
        default(생략시)   : 동일 패키지 접근 가능

        클래스/인터페이스   : public , default
        필드               :   public ,  private , protected , default(생략시)
        생성자             : public ,  private , protected , default(생략시)
        메소드             : public ,  private , protected , default(생략시)
    */

    //1.필드
    //DB 연동 관련 인터페이스
    protected Connection conn; //여러 메소드에서 사용하려고 필드에 생성 //1. DB연동객체, PreparedStatement객체생성
    protected PreparedStatement ps; //2. 작성된 SQL 가지고 있고, 실행담당
    protected ResultSet rs;    //3. SQL 실행 결과

    /*
        - 연동확인용
    public static void main(String[] args) {
        MemberDao.getInstance();
    }
     */


    protected Dao() {//생성자 : 객체 생성시 초기화 담당
        //객체 생성시 db연동
        try {
            //1. MYSQL 회사의 JDBC관련된 (Driver)객체를 JVM에 로딩 / 불러오기
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. 연동된 결과의 (구현체)객체를 Connection 인터페이스에 대입
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root",
                    "1234"
            );
            System.out.println("DB연동 성공");
        } catch (Exception e) {
            System.out.println("DB연동 실패" + e);
        }
    }
}