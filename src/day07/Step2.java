package day07;

//=================클래스용도: 실행클래스===================//
public class Step2 { // class start
    public static void main(String[] args) {//main start

        // p.215
        //1. 객체 생성
            //1. new
        //new
            //2. 생성자/클래스명
        //new 생성자/클래스명();
            //3. 변수 선언
        Car mycar=new Car();

        //. :접근연산자: 변수가 가지고 있는 주소로 이동
        System.out.println("모델명: "+mycar.model);
        System.out.println("시동여부: "+mycar.start);
        System.out.println("현재속도: "+mycar.speed);

        Car yuorcar=new Car();

        //. :접근연산자: 변수가 가지고 있는 주소로 이동
        System.out.println("모델명: "+yuorcar.model);
        System.out.println("시동여부: "+yuorcar.start);
        System.out.println("현재속도: "+yuorcar.speed);

        //p.217
        //* 필드는 객체의 데이터이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
            //1. 객체 생성
        Car2 mycar2= new Car2();
            //2. 객체내 필드 호출
        System.out.println("제작회사:"+ mycar2.company);
        System.out.println("모델명:"+ mycar2.model);
        System.out.println("색깔:"+ mycar2.color);
        System.out.println("최고속도:"+ mycar2.maxSpeed);
        System.out.println("현재속도:"+ mycar2.speed);
            //3. 객체 내 필드의 값 수정
        mycar2.speed=60;
        System.out.println("현재속도:"+ mycar2.company);

        // =========================================
        Car2 yourCar2= new Car2();
        System.out.println("제작회사:" + yourCar2.company);

        System.out.println("현재속도:"+ yourCar2.speed);




    }//main end
}// class end
