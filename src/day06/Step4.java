package day06;  //패키지

import java.util.Scanner;

public class Step4 { //class start
    public static void main(String[] args) {//main start
        //1. 문자열로 받은 금액을 천단위 쉼표를 넣어주는 코드
        Scanner scanner= new Scanner(System.in);
        System.out.println("입력(숫자형식으로 입력받기):");
        String money =scanner.nextLine();
        String result="";
            //입력받은 문자열 타입의 금액을 천단위 쉼표로 변환

        for(int i=0;i<money.length();i++) {
            System.out.println(money.charAt(i)+" "); //입력받은 문자열들을 for문을 이용한 한 문자씩 추출.
            //천단위 쉼표: 천단위마다, 추가, 패턴 3자리마다(수%3==0)
            if(i>0 &&((money.length()-i)%3)==0){
                result+=",";
            }
            result +=money.charAt(i);
        }
        System.out.println("\nresult = " + result);

    }   //main end
}//class end
