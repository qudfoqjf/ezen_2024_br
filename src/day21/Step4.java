package day21;

public class Step4 {

    public static void main(String[] args) {

        //1.
        Home home= new Home();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끕니다.");
            }
        });
    }
}
