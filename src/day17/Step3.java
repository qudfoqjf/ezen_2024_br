package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {
    /*
    0. Class.forName("JDBC드라이버 클래스경로");
        - 해당 클래스를 찾아서 JDBC드라이버 객체(DriverManager) 자동 등록한다.
    1. [클래스] DriverManager
        -연동 성공하면 Connection 구현체(객체)를 반환한다.
         1. 연동함수
            DriverManager.getConnection("jdbc:mysql://ip번호:port번호/db명", "계정명","비밀번호");
                - ip번호 = localhost:현재 pc.
                - port번호 = mysql 3306 사용권장
    2. [인터페이스] Connection
        - Statement , PreparedStatement 구현 객체를 반환한다.
        1.connection.prepareStatement(SQL);     SQL 서명/기재된 PreparedStatement 구현체 반환한다.
    3. [인터페이스] preparedStatement
        -DDL, DML문을 실행 할 때 사용한다.
        1. 실행
            1. insert, update, delete => . executeUpdate();
            2. select => .executeQuery();

    4. [인터페이스] resultSet
        -DB에서 가져온 데이터를 읽을때 사용한다.
        1. 다음 레코드 이동:               .next()       : 다음레코드 이동 후 존재하면 true/ 없으면 false 반환
        2. 현재 레코드에서 필드 값 호출      .get타입 (호출할 필드순서번호 or 필드명);
                                         getString: 문자열  ,getInt: 숫자
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //DB 연동
        Connection connection = null;  //try{}와
        try{
        //1. jdbc 드라이버를 로딩한다.
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                //2. db서버와 연동 후 연동객체를 반환 받는다.
                "jdbc:mysql://localhost:3306/test5",
                "root",
                "1234"
        );
        System.out.println("연동성공");
            //3. DB연동시 필요한 메소드중에 Class.forName,getConnection 일반예외 발생
        }catch (Exception e){
            System.out.println(e);
        }


        while (true) {// 무한루프
            System.out.println("1.삽입 2.출력 3.수정 4.삭제");
            System.out.println("선택>");

            try {
                int ch = scanner.nextInt(); //만일 int타입 범위 벗어난 입력시 오류 발생[InputMissmatchException]

                if (ch == 1) {
                    //1. 입력받기
                    System.out.println("저장할 고객명");
                    String name = scanner.next();
                    //2. DB에 저장한다.
                    // connection.prepareStatement("insert into members values("+유재석+")").executeUpdate();
                    String sql = "insert into members values('"+name+"')";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                } else if (ch == 2) {
                    //조건없이 모든레코드를 출력, 입력받기X
                    String sql="select * from members";
                    ResultSet resultSet= connection.prepareStatement(sql).executeQuery();
                        System.out.println(resultSet);  //select 결과물을 가지고 있는 인터페이스
                    // .next() : select 결과 테이블에서 다음 레코드로 이동후 존재여부 true/false 반환 함수
                    while (resultSet.next()){
                        // 하나씩 next()로 레코드를 이동하면서 반복처리 만약에 다음 레코드가 존재하면 실행.
                        // 다음레코드가 존재하지 않으면 false 이므로 while 종료
                        //System.out.println(resultSet.getString(1));
                        System.out.println(resultSet.getString("name"));
                            //.get타입(가져올필드순서번호or필드명)
                    }//while end



                } else if (ch == 3) {
                    //1. 입력받기
                    System.out.println("수정할 고객명:"); String oldName= scanner.next();
                    System.out.println("새로운 고객명:"); String newName= scanner.next();

                    //update members set name= '새로운 고객명' where name='수정할 대상';
                    String sql= "update members set name= '"+newName+"' where name='"+oldName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                } else if (ch == 4) {
                    // 1.입력받기 //누구를 삭제할지 입력
                    System.out.println("삭제할 고객명:"); String deleteName= scanner.next();
                    // 2. db에 삭제처리한다. //
                    String sql= "delete from members where name='"+deleteName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                }
            }catch (InputMismatchException e) {
                System.out.println("[시스템오류] 정상적인 입력값이 아닙니다."+e);
                scanner = new Scanner(System.in); //기존에 입격받은 바이트를 지우기/초기화
            }catch (SQLException e){
                System.out.println("[시스템오류] SQL에서 오류가 발생했습니다."+e);
            }

        }//w end
    }// m end
}// c end
