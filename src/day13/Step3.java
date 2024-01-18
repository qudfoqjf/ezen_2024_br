package day13;

public class Step3 {
    public static void main(String[] args) {
        //p.297
            //1. 자식객체를 만들면 부모객체도 같이 만들어진다.
        SupersonicAirplane sa=new SupersonicAirplane();
            //2. 자식객체는 부모객체멤버를 사용할 수 있다.
        sa.takeOff();
        // 단 자식객체가 부모객체 메소드를 재정의(오버라이딩) 했을 때, 본인객체 메소드가 우선순위가 된다
        sa.fly();
        sa.flyMode=SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode=SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
