package day16;

//클래스: 일반 클래스가 인터페이스의 추상메소드를 구현했으면 구
public class Television implements RemoteControl {
    // - implements 재정의한 메소드가 있다는 뜻
    // - 무조건 오버라이딩 필요

    // 인스턴스 필드
    private int volume;
    @Override
    public void turnOn(){
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(this.volume> RemoteControl.MAX_VOLUME ){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(this.volume <RemoteControl.MIN_VOLUME){
            this.volume= RemoteControl.MIN_VOLUME;
        }else{
            this.volume=volume;
        }
        System.out.println("현재 Tv 볼륨: " +this.volume);
    }
}

/*

    오버로딩: 생성자/메소드에서 매개변수의 타입/개수/순서에 따라 여러개 선언
    오버라이딩: 메소드에서 extends/ implements 한 베소드를 재정의

*/