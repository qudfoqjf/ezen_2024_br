package day21;

import java.awt.*;

public class Step5 {
    public static void main(String[] args) {

        //1.[우리가 만든] 버튼 객체 생성
        Button button= new Button();

        //2.[우리가 만든] 버튼 추상메소드 정의.
        button.setClickListener(new Button.ClickListener(){
            public void onClick(){
                System.out.println("OK버튼을 클릭했습니다.");
            }
        });

        // --- 만일 익명 구현객체가 없을때
            //1. 구현 클래스가 필요.
        Button.ClickListener cl = new Click();
            //2. 구현객체 만들어서 사용
        button.setClickListener(cl);
    }
}
