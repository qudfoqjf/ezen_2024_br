package day03;  //패키지

import java.util.Scanner;

public class Step2 {//class start

    public static void main(String[] args) { //main start
        // 객체 사용이유 : 미리 설계된 메소드를 사용하기 위해서
        Scanner scanner= new Scanner(System.in);
//        //예제1: 작성자, 내용 ,날짜 3가지를 문자로 입력받아 출력
//            //1. 입력,변수
//        System.out.print("작성자:"); String 작성자=scanner.next();
//        System.out.print("내용:"); String 내용=scanner.next();
//        System.out.print("날짜:"); String 날짜=scanner.next();
//
//         //2. 입력받은 데이터를 출력
//        System.out.printf("=================방문록==================") ;
//        System.out.printf("%4s %10s %20s %10s\n","번호","작성자","내용","날짜");
//        System.out.printf("%5d %10s %20s %10s\n",1,작성자,내용,날짜);
//        //2-2 입력받은 데이터 출력
//        System.out.println("=================방문록==================") ;
//        System.out.println("번호 | 작성자\t\t|내용\t\t|날짜");
//        System.out.println(01+"|"+작성자+"\t\t|"+내용+"\t\t|"+날짜);

        //예제2: 기본급과 수당을 정수로 입력받아 실수령액 계산해서 출력
            // 실수령액: 기본급+수당-세금[기본급10%]
            // 1.입력
        System.out.println("기본급: "); int 기본급 = scanner.nextInt();
        System.out.println("수당: "); int 수당=scanner.nextInt();
            // 2.처리
        int 실수령액 = 기본급 + 수당-(int)(기본급*0.1);

        System.out.println("실수령액="+실수령액);


    }// main end
}//class end
