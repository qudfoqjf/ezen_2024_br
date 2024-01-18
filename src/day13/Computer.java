package day13;

public class Computer extends Carculator {

    /*
        오버라이딩:
            -부모에게 물려받은 메소드가 이상적으로 적합하면 좋지만 아니면 재정의
           1. 상위 클래스의 메소드 재정의한다.
           2. 재정의(Override)된 메소드가 우선순위를 갖는다.

    */

    @Override
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle");
        return Math.PI*r*r;
    }
}
