package day21;

public class Step3 {
    public static void main(String[] args) {
        Car car=new Car();
        car.run3(new Tire(){
            @Override
            public void roll(){
                System.out.println("기아타이어가 굴러갑니다.");
            }
        });

        Tire tire=new Tire(){
            //======== tire 클래스로 부터 상속받은 객체정의========//
          //필드 생성 가능
            int a =10;
            //생성자X
            //메소드 생성 가능
            public void method(){
                System.out.println("ddd");
            }

            public void roll(){
              System.out.println("기아타이어가 굴러갑니다. 2");
          }
        };
        // 2
        car.run3(tire);



    }

}
