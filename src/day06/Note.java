package day06;  //패키지

import java.util.Scanner;

public class Note { //class start
    public static void main(String[] args) {//main start
        int[] array={3,10,8,4,7};
        int temp =0;
        int count=0;
        for(int i=0;i< array.length;i++){
            for(int j=count;j< array.length;j++){
                if(array[i]!=array[j]&&array[i]>array[j]){
                    temp= array[i]; array[i]=array[j];array[j]=temp;
                }
            }
            count++;
            System.out.println(array[i]);
        }
    }   //main end
}//class end
