package day13;

public class Step2 {

    public static void main(String[] args) {
        int r= 10;
        //1. 상위클래스로 객체 생성해서 메소드 호출시
        Carculator carculator=new Carculator();
        System.out.println(carculator.areaCircle(r));

        //2. 하위 클래스로 객체생성새서 메서드 호출시
        Computer computer=new Computer();
        System.out.println(computer.areaCircle(r));
    }
}
