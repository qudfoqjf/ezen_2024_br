package day04; //패키지

import java.util.Scanner;

public class Step3 {// class start

    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);
        boolean run=true;   //무한루프의 상태를 저장하고 있는 변수[on/off]
        int speed =0;// 현재속도를 저장하는 변수[증속시 ++,감속시 --

        while(run) {// 무한루프 시작
            //====================무한루프 시작=======================//
            System.out.println("==================================");
            System.out.println("1. 증속|2. 감속 | 3. 중지");
            System.out.println("==================================");
            System.out.println("선택:");
            //==================== ================== =======================//
            //====================무한루프 입력=======================//
            String strNum= scanner.nextLine(); // 엔터를 입력할때 까지 console 이 대기상태유지
            //==================== ================== =======================//
            //==================== 입력값에 따른 경우의수 판단 =======================//
            if(strNum.equals("1")){// 입력한 값이 문자 1이면
                speed++;
                System.out.println("speed = " + speed);
            }else if(strNum.equals("2")){// 입력한 값이 문자 2면
                speed--;
                System.out.println("speed = " + speed);
            }else if(strNum.equals("3")){// 입력한 값이 문자 3이면
                //1. while문으로 다시 이동해서 false 이므로 반복문 종료->무한루프 종료로 이동
                run=false;
                //2. 무한루프 종료로 이동
                //break; //가장 가까운 반복문 탈출; 현재는 while(true);
                //3. 함수 나가기 -> main end 로 이동
                //return; // 현재 함수 종료. = 프로그램 종료(main)함수에는 코드를 읽어주는 스레드가 존재
            } // if end
        }//무한루프 종료
    }//main end
}// class end


/*

    무한루프 =무한반복
        1.
            while(true){}
        2.
            boolean run = true;
            while(run){}

 */