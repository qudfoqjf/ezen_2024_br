package day02; //현재 클래스파일 폴더위치

public class Step1 {// 1. 자바의 모든코드는 클래스 안에서 작성. //class start

    public static void main(String[] args) {// 2. main()함수: main스레드 포함// main start
        System.out.println(); // 3. 콘솔 출력

        //4. 실행[ctrl + shft + f10]

        /*

            src 폴더내 Step1 클래스 파일 생성[.java] 문자[자연어]
                실행[ctrl+shifr+f10]/ 컴파일
            자동으로 out 폴더내에 Step1 클래스 파일 [.class] 이진코드[기계어]

            //p.53 자동타입 변환
                //1. 작은 타입 허용범위가 큰 타입 허용범위내 대입될때
                //byte < short , char< int < long < float < double
                //큰 타입 = 작은 타입

         */

        byte byteValue= 10;
        int intValue = byteValue;   //byte -> int 대입(자동)
        System.out.println("intValue:"+intValue);

        char charValue= '가';
        intValue=charValue;
        System.out.println("intValue:"+intValue);

        intValue=50;
        long longValue=intValue;    //int -> long 대입(자동)
        System.out.println("longValue:"+longValue);

        longValue=100;
        float floatValue=longValue;
        System.out.println("floatValue:"+floatValue);

        floatValue=100.5F;   //100.5F[실수 리터럴 double]F
        double doubleValue=floatValue; // float ->double 대입(자동)
        System.out.println("doubleValue:"+doubleValue);





                //p.55 강제타입 변환 = 캐스팅
                    //1. 큰 타입 허용범위가 작은 타입 허용범위내 대입될 때
                        //byte > short,char >int> long> float> double
                      // 2. 데이터 손상(목적:원래 값이 유지되면서 타입만 변환),()소괄호 이용해서 변환할 타입을 명시한다.
                      // 작은타입= (작은 타입) 큰 타입
        int var1 = 10;
        byte var2= (byte) var1; // int->byte (강제)
        System.out.println("var2:"+var2);

            long var3=300;
            int var4= (int) var3;
        System.out.println("var4:"+var4);

        int var5=65;
        char var6 = (char) var5;
        System.out.println("var6:"+var6);

        double var7=3.14;
        int var8= (int)var7;
        System.out.println("var8:"+var8);
        // *
        int result= (int)(30000* 0.1);
                //1. (int* double)
                //2. 연산결과의 타입은 자동타입 변환

        //p.58 연산식에서 자동 타입변환
            //1. byte,short 연산시 결과 타입이 int
            //2. int, int=> int
            //3. long, ing=> long
            //4. float ,float=> float
            //5. double, float=> double

        //p.62
        byte result1= 10+20;

        byte v1=10;
        byte v2=20;
        int result2= v1+v2;//   byte+byte= int

        byte v3 =10;    int v4=100; long v5=1000L;
        long result3 =v3+v4+v5; // byte + int => int + long => long

        char v6='A';    char v7 =1;
        int result4= v6+v7;     //char+char=> int

        int v8 =10;
        int result5= v8/10;     // int/int=> int

        int v9= 10;
        double result6= v9/4.0; // int/ double => double

        int v10= 1;
        int v11= 2;
        //int result7=v10/v11;            //0 int/int =>int [소수점 표현이 불가능]

        double result7 =(double) v10/v11;   //0.5  int/int=>   (캐스팅)해서 소수점 표현 하자.


    }// main end

}//class end

/*

    타입
        종류:
        1.기본타입: 저장하는 데이터 형식이 리터럴 데이터
        2.참조타입: 기본타입 외 모든타입

        기본타입 8가지
    [정수]
        boolean 1바이트    true false
        byte    1바이트    -128~127
        short   2바이트    +-32,000
        int     4바이트    +-21억
        long    8바이트    +- 21억이상
    [실수]
        float   4바이트    유효소수점자리7자리,8자리출력
        double  8바이트    유효소수점자리15자리,16자리출력
    [문자열]
        String  문자열길이에 따름

 */
