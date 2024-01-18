package day13;

public class Phone {

    //멤버
    //1. 접근제한자 (정적/인스턴스)필드 (final)
    public String model;
    public String color;

    //2. 접근제한자 생성자 //인스턴스만 사용가능
    public Phone(){}

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    //3. 접근제한자 (정적/인스턴스)메소드 (final)
        //1.//2.매개변수:X, 반환값:X
    public void bell(){ //f start
        System.out.println("벨이 울립니다");
    }// f end
        //2.매개변수:String, 반환값:X
    public void sendVoice(String message){
        System.out.println("자기:"+message);
    }
        //3.매개변수:String, 반환값:X
    public void receiveVoice(String message){
        System.out.println("상대방:"+message);
    }
        //4 .매개변수:X, 반환값:X
    public void hangUp(){
        System.out.println("전화를 끊습니다");
    }
}
