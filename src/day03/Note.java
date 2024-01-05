package day03; //패키지

import java.util.Scanner;

public class Note { //class start
    public static void main(String[] args) { //main start
        Scanner scanner= new Scanner(System.in);


        //문제1 : 점수를 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
        /*System.out.println("점수:"); int score=scanner.nextInt();
        System.out.printf(score>=90?"합격":"불합격");*/

        //문제2 : 점수를 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급',
        //      그외 '재시험' 으로 출력 하시오.
        /*System.out.println("점수:");int score=scanner.nextInt();
        System.out.printf(score>=90?"A등급":score>=80?"B등급":score>=70?"C등급":"재시험");*/

        //문제3 : 임의의 정수 3개 를 입력받아서 오름차순 으로 3개의 변수를 출력하시오.
        /*System.out.println("변수1:");int a=scanner.nextInt();
        System.out.println("변수2:");int b=scanner.nextInt();
        System.out.println("변수3:");int c=scanner.nextInt();
        int temp=0;
        if(a>b){temp=a;a=b;b=temp;}
        if(a>c){temp=a;a=c;c=temp;}
        if(b>c){temp=b;b=c;c=temp;}
        System.out.printf("%d %d %d",a,b,c);*/

        //문제4 : 가위바위보 게임 구현하기.
        //      - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
        //     - 승리자 판단과 무승부 경우의수를 출력하시오.
        //      [입력 조건] 플레이어1 과 플레이어2 에게 각각 입력을 받습니다.
        //     [출력 조건] 플레이어1 이기면 ' 플레이어1 승리 ', 플레이어2 이기면 ' 플레이어2 승리 ' 무승부 이면 '무승부' 출력 하시오.
        /* System.out.println("플레이어1:"); int player1=scanner.nextInt();
        System.out.println("플레이어2:"); int player2=scanner.nextInt();
        if(player1==(player2+1)%3){
            System.out.println("플레이어1 승리");
        }else if(player1==player2){
            System.out.println("무승부");
        }else{
            System.out.println("플레이어2 승리");
        }*/

        //문제5 : 윤년/평년 판단하기
        //   [ 입력조건 ] 하나의 연도를 입력 받습니다.
        //   [ 윤년/평년 조건 ]
        //   -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
        //   -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
        //   -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
        //   [ 출력조건] '입력한OOOO년 은' 윤년 입니다.  혹은 평년 입니다 로 출력하시오.
        /*System.out.println("연도:"); int year=scanner.nextInt();
        if(year%4==0 && year%100==0 && year%400==0){
            System.out.println("입력한 "+year+"년은 윤년입니다");
        }else if(year%100==0&&year%4==0){
            System.out.println("입력한 "+year+"년은 평년입니다");
        }else if(year%4==0){
            System.out.println("입력한 "+year+"년은 윤년입니다");
        }*/
        //문제6 : 주차 사용요금 계산하기
        //   [ 선언 변수 조건 ] 입차시간이 14시30분 입니다. int 시 = 14;  int 분 = 30;
        //   [ 입력 조건 ] 현재시간의 시 와 분을 입력받아 각 변수에 저장하시오. *단 입차 시간 이전 으로 입력 할 경우에는 '현재시간오류' 출력하시오.
        //   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
        /*int 입차시= 14;int 입차분=30;
        System.out.print("현재 시:"); int 현재시=scanner.nextInt();
        System.out.print("현재 분:"); int 현재분=scanner.nextInt();
        int 요금=0;
        if (현재시>입차시){
            요금=((현재시-입차시)*60+현재분-입차분)*1000;
            System.out.println(요금);
        }else if(현재시==입차시){
            if(현재분>입차분){
                요금=(현재분-입차분)*1000;
                System.out.println(요금);

            }else{
                System.out.println("시간을 잘못 입력하였습니다");
            }
        }else{System.out.println("시간을 잘못 입력하였습니다");}*/


        //문제7 : 로그인 처리
        //   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
        //   [처리출력 조건]
        //      1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
        //      2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
        //      3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
        System.out.println("id:"); String id=scanner.next();


    } //main end
}// class end
