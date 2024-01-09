package day06; // 패키지

import java.util.Scanner;

public class Step5 {// class start

    public static void main(String[] args) {//main start
        Scanner scanner=new Scanner(System.in);
        System.out.println("시간(hhmmss 형식):");
        String time= scanner.nextLine();
        System.out.println("시간(숫자:");
        String second= scanner.nextLine();
        String result ="";


        //1. 입력받은 time 의 초 추출
        int ss = Integer.parseInt(time.substring(4,6));
        //2. second 를 더한다
        ss+=Integer.parseInt(second);
        //3. 분
        int mm = Integer.parseInt(time.substring(2,4));
        mm+=(ss/60); //초를 60으로 나눈값을 분에 더한다.
        //4. 시
        int hh = Integer.parseInt(time.substring(0,2));
        hh+=(mm/60); //분을 60으로 나눈값을 시에 더한다.
        hh=hh>23?00:hh;

       /* System.out.printf("%2s: %2s: %2s",
                hh<10? "0"+hh:hh,
                mm%60<10? "0"+mm%60:mm%60,
                ss%60<10? "0"+ss%60:ss%60);
        */

        result=(hh<10? "0"+hh:hh)+":"+
                (mm%60<10? "0"+mm%60:mm%60)+":"+
                (ss%60<10? "0"+ss%60:ss%60);

        //입력받은 time 에서 second 만큼 지난 시간을 hhmmss 형식으로 출력
        System.out.println("result = " + result);





    }//main end

}//class end
