package day14;

public class Step3 {
    public static void main(String[] args) {
            //1. 객체생성
            Car mycar=new Car();
            //2. 객체의 필드 값 수정=> 타이어 장착
            mycar.tire=new Tire();
                //mycar.tire =Tire 객체참조;
            mycar.run();
            //----------필드 다형성: 필드가 가지고 있는 객체참조
            mycar.tire=new HankookTire();
                //mycar.tire=HankookTire 객체참조
            mycar.run();
            //
            mycar.tire=new KumhoTire();
            mycar.run();

    }
}
