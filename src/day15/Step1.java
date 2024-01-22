package day15;

import day13.step4.pakage2.D;

public class Step1 {
    public static void main(String[] args) {

        //1. 객체 생성
        Driver driver = new Driver();

        //2. 객체 생성
        Bus bus = new Bus();
        driver.drive(bus);

        //3. 객체 생성
        Taxi taxi= new Taxi();
        driver.drive(taxi);

    }
}
