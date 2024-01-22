package day15;

import day13.step4.pakage1.B;

public class Driver {
    public void drive(Vehicle vehicle){
        vehicle.run();
        System.out.println(vehicle instanceof Bus ? "버스타입":"택시타입");
        System.out.println(vehicle instanceof Taxi? "택시타입":"버스타입");
        System.out.println(vehicle instanceof Object);

        Bus bus2 =new Bus();

        System.out.println(bus2 instanceof Vehicle);
        System.out.println(vehicle instanceof Object);
    }
}
