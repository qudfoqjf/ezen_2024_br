package day03; //패키지

import java.util.Scanner;

public class Step4 { //class start
    public static void main(String[] args) { //main start
        Scanner scanner= new Scanner(System.in);
            //!!!: 클래스 입력시[라이브러리 호출/ 가져오기]
            // 자동완성시 자동으로 클래스 위에 import java


        //if 조건문
        //1.

        System.out.print("정수 입력:"); int point= scanner.nextInt();
            //만약에 내가 입력한 값이 저장된 point변수
        // 80보다 이상이면(true) 출력문이 실행되고(false)아니면 실행 안된다.
        if(point>=80){
            System.out.println("입력받은 값은 80이상입니다");
        }
        //2.
            //만약에

        if (point >= 90) {
            System.out.println("합격");
        }else {
            System.out.println("불합격");
        }
        //3.다수조건
        if(point>=90){System.out.println("A등급");}
        else if(point>=80){System.out.println("B등급");}
        else if(point>=70){System.out.println("C등급");}
        else{System.out.println("탈락");}
            //vs
        // :{}는 조건 충족에 따라 여러번 실행 될 수 있다.
        if(point>=90){System.out.println("A등급");}
        if(point>=80){System.out.println("B등급");}
        if(point>=70){System.out.println("C등급");}

        //4. 중첩조건
        char sex= 'M';
        if(sex=='M'||sex=='m'){
            if(point>=90){//남자면
                System.out.println("남자 우수상");
            }
        }
        else{//여자면
            if (point>=90){System.out.println("여자 우수상");}
        }
        //예시) 스위치 변수 활용[step3 16번]
        String id =scanner.next();
        String pw = scanner.next();
        boolean sw=false;
        if(id.equals("admin")&& pw.equals("1234")){sw=true;}
        if (sw) {System.out.println("로그인 성공");}
        else{
            System.out.println("로그인 실패");}




            } //main end
}//class end



/*

    if문 [조건문]
        - 경우의수에 따른 실행 흐름 제어
        - 조건: boolean
            -if(true), if(false)
            -boolean 변수 = true; if(변수)
            -if(3>5), if (3>5 && 3<10)
            -int 변수 =10; if(변수-10>5)
        - 삼항연산자: 간단한 조건식 사용 vs 조건문 if: 일반적으로 사용
           1.삼항연산자 단점:
            1.조건이 길어지면 읽기 힘듬.
            2. 참.거짓: 함수 정의/실행제약
                vs
           2. 조건문

        - 형태
            1.
                if(조건){(참)선언문; 실행문}
            2.
                if(조건){(참) 선언문; 실행문
                else{(거짓 선언문; 실행문

            3.하나의{}실행: if~else if ~ else if 하나의 조건문으로 취급 [다수조건에 따른 결과 1개]


            4.중첩
                if(조건1){
                if(조건1 t->
                }


*/