package day02;  //패키지

import java.util.Scanner;

public class Step3 {//  class start

    public static void main(String[] args) { //main start

        //[p.70] 콘솔에서 키보드로부터 입력 받고 변수에 저장
            //[준비물]
            // 1. Scanner 클래스 : 입력에 관련된 메소드/속성 제공하는 설계도.
            // 2. Scanner 클래스 이용한 객체 생성
                // Scanner scanner = new Scanner(System.in);
                // 클래스명 변수명     new 클래스명(매개변수);
                    //System.in : 시스템 입력=키보드
                    //System.in : 시스템 출력=모니터(콘솔)
            // 3. 객체/변수 이용한 입력값 호출 메소드
                //객체/변수명.nextLine(): 엔터 키가 입력되면 지금까지 입력된 모든 내용을 읽어온다.

            //[1] 객체 생성
       // new Scanner(System.in);
            //[2] 객체를 생성했으면 변수에 담는다
        Scanner scanner= new Scanner(System.in);
            //[3] 객체를 통한 메소드 사용.
       // scanner.nextLine();
            //[4] 메소드 호출의 결과[return] 저장한다.
        String str = scanner.nextLine();
        System.out.println("str = " + str);// soutv
        
        // [Scanner 가 제공하는 메소드]
        //1. 입력받은 문자열(String) 반환 띄어쓰기 미포함
        String str1=scanner.next();
        System.out.println("str1 = " + str1);
        
        scanner.nextLine(); //의미없음 (next 와 nextLine 분리용)
        //2. 입력받은 문자열(String) 반환 띄어쓰기 포함 [주의할 점: 앞에next()가 있을경우 enter를 누르면 같이 반환됨
        String str2=scanner.nextLine();
        System.out.println("str2 = " + str2);
        
        //3. 입력받은 논리(Boolean)반환
        boolean bool=scanner.nextBoolean();
        System.out.println("bool = " + bool);
        
        //4. 입력받은 바이트(byte)반환
        byte b = scanner.nextByte();
        System.out.println("b = " + b);
        
        //5. 입력받은 쇼트(short) 반환
        short s = scanner.nextShort();
        System.out.println("s = " + s);
        
        //6. 입력받은 인트(int) 반환
        int i= scanner.nextInt();
        System.out.println("i = " + i);
        
        //7. 입력받은 롱(long) 반환
        long l= scanner.nextLong();
        System.out.println("l = " + l);
        
        //8. 입력받은 플롯(float) 반환
        float f= scanner.nextFloat();
        System.out.println("f = " + f);
        
        //9. 입력받은 더블(double) 반환
        double d= scanner.nextDouble();
        System.out.println("d = " + d);
        
        //10. 입력받은 문자(char) 반환 없음 --> 
            // "문자열".charAt(추출인덱스) : 문자열에서 문자 1개를 추출 하는 함수
        char ch= scanner.next().charAt(0); //첫글자 추출
        System.out.println("ch = " + ch);

        //* 기본타입 비교는 ==
        //      vs 참조타입(문자열) 비교는 "문자열".equals("비교할문자열");

        


    }// main end

}// class end

/*
    타입
        1. 기본타입(int,double,float 등 소문자)
        2. 참조타입(String,Scanner,System,Integer 등등)

 */

/*
    p.73~75 확인문제
        1.
            (1). 변수는 하나의 값만 저장할 수 있다.
            (2). 선언시 사용한 타입의 허용 범위내에서만 저장가능하다.
            (3). 변수는 변수가 선언된 중괄호 안에서만 사용 가능하다.
            (4). 변수는 초기값이 저장되지 않은 상태에서 읽을 수 없다.
        2.
            (1)modelName O, (2)class X ,(3)6hour X, (4) $value O, (5) _age O ,(6) #name X, (7) int X

        3.
            byte,short,int,long
                  char
                       float,double
            boolean
        4.
        타입: int, double
        변수: age,price
        리터럴: 10,3.14

        5.
            short= -32,XXX~ 32,XXX, char= 65,535

        6.
            String 은 문자열 길이에 따라 길이가 달라져서 char 로 변환 X

        7.
            char는 공백 X (space바는 가능)

        8.
            System.out.printf("형식",변수)는 주어진 형식대로 변수를 출력한다.

        9.
            byte+byte= 크기와 상관없이 int가 된다

        10.
           Int.parseInt() -> Integer.parseInt()

        11.
            지역변수:선언한 지역을 벗어나면 사라진다
 */