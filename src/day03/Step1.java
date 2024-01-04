package day03;  //패키지위치

import java.util.Scanner;

public class Step1 {//class start

    public static void main(String[] args) {// main start

        int x=10; int y= -3;

        //1. 산술연산자  (결과: 값)
        System.out.println("x+y:"+(x+y));
        System.out.println("x-y:"+(x-y));
        System.out.println("x*y:"+(x*y));
        System.out.println("x/y:"+(x/y));
        System.out.println("x%y:"+(x%y));

        //2. 비교연산자(결과:boolean)
        System.out.println("x==y:"+(x==y));
        System.out.println("x!=y:"+(x!=y));
        System.out.println("x>y:"+(x>y));
        System.out.println("x>=y:"+(x>=y));
        System.out.println("x<y:"+(x<y));
        System.out.println("x<=y:"+(x<=y));
        //3. 논리연산자
        System.out.println("10 < x < 20"+(x > 10 && x < 20));
        System.out.println("y==10 또는 y==20"+(y==10||y==20));
        System.out.println("x>=30의 반대:"+!(x>=30));
        //4. 증감연산자
        System.out.println("x++:"+(x++));
        System.out.println("x:"+(x));
        System.out.println("++x:"+(++x));

        System.out.println("x--:"+(x--));
        System.out.println("x:"+(x));
        System.out.println("--x:"+(--x));

        //5. (복합)대입연산자
        x=30; //= 오른쪽 값을 왼쪽에 대입
        x+=10;  // x에10을더한후에 x에 결과대입
        // -=,8=,/=,%=

        //6. 삼항연산자
        //  조건? 참:거짓
        //  조건1?참1:조건2? 참2:거짓
        String 결과 = x>= 90?"합격":"불합격";
        System.out.println("결과="+결과);

        String 결과2 = x>= 90?"A등급": x>=80?"B등급":"탈락";
        System.out.println("결과2 = " + 결과2);

        //7. 연결연산자
            //변수 + "문자열", "문자열+"문자열"
    }// main end

}//class end

//1. 변수:하나의 값을 저장하는 메모리 공간, 1.타입 2.변수명 3. 대입 4. 초기값
    //타입:boolean, byte, short, int, long, float, double, char, String
//2. 출력함수
    //1. System.out.print()
    //2. System.out.println()  sout
    //3. System.out.printf()   souf
//3. 입력객체/함수
//Scanner scanner=new Scanner(System.in);
//scanner.next()
