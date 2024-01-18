package day13.step4.pakage2;

import day13.step4.pakage1.A;

public class D extends A {//자식객체가 만들어질 때 부모객체가 자동으로 생성
    private A a;
    public D(){super();}    //부모의 생성자 호출
    public void method1(){
        this.field="value"; //부모의 필드 호출
        this.method();      //부모의 메소드 호출
    }
    public void method2(){
       // A a=new A();      //직접 객체를 생성해서 호출
       // a.field="value";
        // a.method();
    }

}
