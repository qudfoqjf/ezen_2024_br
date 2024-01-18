package day13;

public class Car {
    public int speed;
    public void speedUp(){
        speed+=1;
    }
    public  void stop(){
        System.out.println("차를 멈춥니다.");
        speed=0;
    }
}
