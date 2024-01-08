package day05;

import java.util.Scanner;

public class Notes {// class start
    public static void main(String[] args) {// main start
        Scanner scanner=new Scanner(System.in);
        int[] students= new int[0];
        while(true){
            System.out.println("-------------------------------------");
            System.out.println("1.학생수| 2.점수입력 | 3.점수리스트|4.분석|5.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 >"); int ch =scanner.nextInt();

            if(ch==1) {
                System.out.print("학생수:"); int count = scanner.nextInt();
                students =new int[count];
            }
            else if(ch==2){
                for(int i=0;i<students.length; i++){
                    System.out.print("점수입력:");
                    students[i]=scanner.nextInt();
                }
            }else if(ch==3){
                for(int i=0;i<students.length; i++) {
                    System.out.printf("점수:%d\n", students[i]);
                }
            }else if(ch==4){
                int max=0;int sum= 0;
                for(int i=0;i<students.length; i++){
                    if(max<students[i]){max=students[i];}
                    sum+= students[i];
                }
                double avg= sum/students.length;
                System.out.printf("최고점수:%d\n",max);
                System.out.printf("평균:%.1f",avg);
            }else if (ch==5){break;}
        }
    }//main end
}//class end

//System.out.printf("점수:%d",students[i]);