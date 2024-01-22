package 팀과제.팀과제4.p380예제;

public class Bus implements Vehicle {
    // 추상 메소드 오버라이딩

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
