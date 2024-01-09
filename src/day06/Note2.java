package day06; // 패키지

import java.util.Scanner;

public class Note2 {// class start

    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);
        System.out.println("시간(hhmmss 형식):");
        String time= scanner.nextLine();
        System.out.println("시간(숫자:");
        String second= scanner.nextLine();
        int hh = Integer.parseInt(time.substring(0,2));
        int mm = Integer.parseInt(time.substring(2,4));
        int ss = Integer.parseInt(time.substring(4,6));
        String result ="";

        //입력받은 time 에서 second 만큼 지난 시간을 hhmmss 형식으로 출력
        System.out.println("result = " + result);

    }//main end

}//class end
