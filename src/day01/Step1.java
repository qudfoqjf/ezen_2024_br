package day01;      //현재파일의 패키지(폴더) 위치

public class Step1 { // 클래스 선언 //class start
    // public class: 클래스 선언     [자바는 무조건 클래스 안에서만 작성가능]
    // 클래스명: Step1
        //* 숫자시작 X ,공백X, 첫글자 대문자!!~
    //  {}: 클래스 블록/지역/정의 하는곳
    public static void main(String[] args) {

        // main: main()메소드
        // {}:메소드 블록/ 지역 정의하는곳
        //* 실행하면 main()메소드 블록이 실행된다.[프로그램의 진입/시작점]
            // 실행[선언/정의말고]은 무조건 main()안에서 시작한다.
            // main()안에 main 스레드 [코드를 읽는 흐름] 포함
        System.out.println("안녕 자바");    //console.log 콘솔에 출력하는 코드

        // 한줄주석
        /* 여러줄 주석 */

        // 실행문: 1. 변수 선언,2/변수 대입 3. 메소드호출
            //코드마다: 끝마침![생략시 오류 :java:';' expected]

    }//main end
}   //class end
