package day13;

public class Step1 {//class start

    public static void main(String[] args) {// main start
    //p.286
            //1. smartPhone 객체(+phone)
        SmartPhone myphone=new SmartPhone("갤럭시","은색");

            //2. smartPhone 객체내 필드 호출(+ phone 필드 호출)
        System.out.println("모델:"+myphone.model);
        System.out.println("색상:"+myphone.color);

            //3. smartPhone 객체내 필드 호출
        System.out.println("와이파이 상태:" +myphone.wifi);

            //4.
        myphone.bell();
        myphone.sendVoice("여보세요");
        myphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
        myphone.sendVoice("아~네 반갑습니다");
        myphone.hangUp();

        //SmartPhone 의 메소드 호출
        myphone.setWifi(true);
        myphone.internet();

    }// main end
}//class end
