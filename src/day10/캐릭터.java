package day10;

import java.util.Random;

public class 캐릭터 {

    //클래스 구성멤버
    //1. 필드
    String 닉네임;
    String 직업="초보자";
    int 레벨= 1;
    int 체력=100;
    //2. 생성자
    캐릭터(String 닉네임){
        this.닉네임=닉네임;
        }

    //3. 메소드
    public void  공격(){
        Random random= new Random();
        this.체력 -= random.nextInt(10);
        return; //메소드 종류/ 상황에 따라 사용 / 생략가능

    }
    public String toString(){
        return "캐릭터{"+
                "닉네임='" +닉네임+'\''+
                ",직업='"+ 직업 + '\''+
                ",레벨="+ 레벨+
                ", 체력=" +체력+
                '}';
    }

}
