package day06;  //패키지

import java.util.Scanner;

public class Note { //class start
    public static void main(String[] args) {//main start
        //1. 문자열로 받은 금액을 천단위 쉼표를 넣어주는 코드
        Scanner scanner= new Scanner(System.in);
        System.out.println("입력(숫자형식으로 입력받기):");
        String money =scanner.nextLine();
        //입력받은 문자열 타입의 금액을 천단위 쉼표로 변환
        String[] split= money.split("");
        String result="";
        for(int i=0;i< split.length;i++) {
            result += split[i];
        }
        System.out.println("result = " + result);


    }   //main end
}//class end
