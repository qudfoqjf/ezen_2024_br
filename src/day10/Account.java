package day10;

public class Account {// class start 객체 설계 클래스
    //클래스 멤버

    //1. 필드
    String 계좌번호;
    String 계좌주;
    int 입금액;
    // 객체마다 들어가야 하기때문에 인스턴스 필드 선언
    // 공용으로 사용할때는 정적 필드

    //2. 생성자
        //1. 기본생성자
    Account(){}
        //2. 모든 필드를 받는 생성자
    Account(String 계좌번호, String 계좌주, int 입금액){
        this.계좌번호=계좌번호;
        this.계좌주=계좌주;
        this.입금액=입금액;
    }
    //3. 메소드

}// class end
