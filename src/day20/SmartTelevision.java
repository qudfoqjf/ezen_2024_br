package day20;

public class SmartTelevision implements RemoteControl2, Searchable {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url+"를 검색합니다");
    }
}
