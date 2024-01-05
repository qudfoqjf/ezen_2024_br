package day04;

import java.util.Scanner;

//p.139
public class Step4 { //class
    public static void main(String[] args) {//main start

        Scanner scanner=new Scanner(System.in);
        while (true) {//while start
            System.out.println("---------------------------------");
            System.out.println("1.예금 2.출금 3. 잔고 4. 종료");
            System.out.println("---------------------------------");
            System.out.println("선택>");
            int money=0;
            int ch = scanner.nextInt();

            if (ch == 1) {
                System.out.println("예금액>");
                int inmoney = scanner.nextInt();
                money+=inmoney;
            }
            if (ch == 2) {
                System.out.println("출금액>");
                int outmoney = scanner.nextInt();
                money-=outmoney;
            }
            if (ch == 3) {
                System.out.println("잔고>"+money);
            }
            if (ch == 4) {
                System.out.println("프로그램 종료");
                break;
            }
        }// while end
    }//main end
}//class end

/*

    은행 프로그램 구현
    [요구사항 설계]
    1. 반복적으로 기능 사용[단* 종료기능 선택시 종료]
    2. 기능: 예금,출금,잔고,종료
        예금 : 더하기 작업
            금액에서 예금액을 입력받아 금액에 더한다.
        출금 : 빼기 작업
            금액에서 출금액을 입력받아 금액에서 뺀다.
        잔고 : 확인 작업
            금액의 값을 출력한다.
        종료 : 종료작업
            프로그램을 종료한다.

* */