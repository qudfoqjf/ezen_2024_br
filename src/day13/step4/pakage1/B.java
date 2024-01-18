package day13.step4.pakage1;

public class B {
    public void method(){
        //-같은 패키지이니까 가능.
        A a= new A();
        a.field ="value";
        a.method();
    }
}
