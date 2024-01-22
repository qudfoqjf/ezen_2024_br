package day15;
// 부모클래스를 다형성(타입변환) 목적으로 많이 사용되서 --> 추상클래스

public class Dog extends Animal{
    // 만일 상위클래스에 추상메소드가 있으면 반드시
    // 추상메소드를 재정의/오버라이딩한다.
    public void sound(){
        System.out.println("멍멍");
    }

    public void breath(){
        super.breathe();
    }

}
