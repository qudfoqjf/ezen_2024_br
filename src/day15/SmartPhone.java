package day15;

public class SmartPhone extends Phone{
    //부모 생성자를 호출

     SmartPhone(String owner){
         super(owner);
    }


    void ineternetSearch(){
        System.out.println("인터넷에 검색을 합니다");
    }
}
