package day10;

import java.util.Arrays;

public class Computer {

    //클래스멤버
    //1. 필드
    //2. 생성자
    //3. 메소드
    int sum2(int x, int y){
        int result= x+y;
        return result;
    };
        //1. 가변길이 매개변수
    int sum(int ...values){

        System.out.println("values="+values);
        System.out.println("values="+ Arrays.toString(values));

        int sum= 0;

        for (int i= 0;i<values.length;i++){
            sum+= values[i];
        }
        return sum;
    }
    int sum3(int[] values){
        System.out.println("values = " + Arrays.toString(values));

        return 0;
    }
}
