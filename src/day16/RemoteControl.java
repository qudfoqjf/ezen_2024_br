package day16;

public interface RemoteControl { //텔레비전,오디오 조작하는 리모컨
    // 인터페이스는 인스턴스필드와 정적필드(상수필드)를 가질 수 없다
    // 상수 필드: public static final
    int MAX_VOLUME=10;
    public static final int MIN_VOLUME=0;   //public static final 생략가능
    // 추상메소드: 서로 다른 객체들 간의 공통적인 메소드를 추출한 것
        // -1. 선언부만 작성하고 구현부는 하지 않는다.
        // -2.
            // 추상클래스의 public 추상메소드는 abstract를 필수로 작성한다.
            // 인터페이스의 public 추상메소드는 abstract를 생략이 가능하다.
        //텔레비전과 오디오의 공통적인 메소드 추출(= 전원 버튼)

    // 구현클래스: 추상메소드를 구현한 클래스
        // 구현클래스가 반드시 필요한 이유
        // 추상클래스와 인터페이스는 스스로 객체를 생성할 수 없다.
    // 텔레비전과 오디오의 공통적인 메소드 추출

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
