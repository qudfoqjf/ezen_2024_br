package day04; //패키지 폴더

import java.util.Random;

public class Step1 {// class start

    public static void main(String[] args) {//main start

        //p.110
            //제어문: 1.조건문 2.반복문
            //흐름제어 : 조건문({}이후 흐름)
            //       :반복문({}이후 제어문으로 되돌아감)= 루핑
        //if문
            //if(조건식){실행문;실행문;}
            //if(조건식)실행문;
        //p.111
        int score = 93; //1. 변수 초기화

        if(score>=90){// if start
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다");
        }// if end
        if(score<90){
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B등급 입니다.");//  IF조건식에 관련업이 무조건 실행
        }
        //p.113
        if(score>=90) {//if start
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }else{// 아니면
            System.out.println("점수가 90보다 적습니다");
            System.out.println("등급은 B입니다");
        }

        //p.114
        if(score>=90){// if start
            System.out.println("점수가 100~90입니다.");
            System.out.println("등급은 A등급입니다");
        }// if end
        else if(score>=80){
            System.out.println("점수가 90~80입니다.");
            System.out.println("등급은 B등급입니다");
        }else if(score>=70){
            System.out.println("점수가 80~70입니다.");
            System.out.println("등급은 C등급입니다");
        }else{ //그외
            System.out.println("점수가 70미만입니다.");
            System.out.println("등급은 D등급입니다");
        }

        //p.115 난수 만들기
        // 1. MAth random(): 난수/함수
        System.out.println("0이상~1미만 난수/랜덤 생성:"+Math.random());
        // 2..Random(): 난수 객체
        System.out.println(new Random());
        System.out.println(new Random().nextInt());

        // 주사위 난수: 1~6사이의 난수 생성

        //int num = Math.random();  0.xx ~ 1.xx
        //int num = Math.random();  0.xx ~ 1.xx*6 =>0~6미만
        //int num = Math.random();   0.xx ~ 1.xx*6+1 =1~7미만
        int num=(int)(Math.random()*6+1);   // 1~7미만
        //2.
        Random random=new Random();
        //클래스명 변수면 =new 클래스명(); //클래스에 해당하는 객체 생성(객체 만드는 이유: 라이브러리)
        //int num2= random.nextInt(); //int 범위내의 난수 생성
        //int num2= random.nextInt(6); //0~6미만
        int num2= random.nextInt(6)+1; //1~7미만

        if(num2==1){
            System.out.println("주사위가 1입니다");
        }else if(num2==2){
            System.out.println("주사위가 2입니다");
        }else if(num2==3){
            System.out.println("주사위가 3입니다");
        }else if(num2==4){
            System.out.println("주사위가 4입니다");
        }else if(num2==5){
            System.out.println("주사위가 5입니다");
        }else{System.out.println("주사위가 6입니다");}


    }//main end
}//class end
