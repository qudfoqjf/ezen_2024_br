package day14;

public class Car {

    Tire tire;

    public void run(){
        tire.roll();
    }

}
/*
    // 1. 한국타이어 객체 + 하위객체
    HankookTire hankookTire;
    // 2. 금호타이어 객체 + 하위객체1
    KumhoTire kumhoTire;
    // 3. 타이어 타입 + 하위객체(한국 타이어,금호 타이어)
    Tire tire;
    // 4. 객체 + 자바의 모든 객체
    //Object object;*/