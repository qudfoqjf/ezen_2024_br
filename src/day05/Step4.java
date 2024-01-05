package day05;// 패키지

import java.util.Scanner;

public class Step4 {// class start

    // 입력 객체
    static Scanner scanner= new Scanner(System.in);
    //5. int 형 데이터를 여러개 저장할 수 있는 배열 선언.
    static int[] students= new int[0];
    //1. 무한루프
    public static void main(String[] args) {//main start
        while(true) {
            //2. 출력
            System.out.println("-------------------------------------");
            System.out.println("1.학생수| 2.점수입력 | 3.점수리스트|4.분석|5.종료");
            System.out.println("-------------------------------------");
            //3. 입력
            System.out.print("선택>"); String ch = scanner.nextLine();
            //4. 경우의 수
            if(ch.equals("1")){
                System.out.println("학생수>");
                String count=scanner.nextLine();
                //while 밖에서 입력받은 수 만큼 배열 성언 => 다른 if{}에서 사용하기 위해서
                //[p.172]
                students= new int[Integer.parseInt(count)]; //기존 데이터 사라짐
            }
            else if(ch.equals("2")){
                //6. [1]번에서 입력받은 학생 수만큼 점수를 입력받기.
                for(int i=0; i<students.length;i++){
                    System.out.printf("scores[%d]>",i);
                    //입력받은 문자열-> 정수 변환해서 i번째 인덱스에 저장
                    students[i]=Integer.parseInt(scanner.nextLine());
                }
            }
            else if(ch.equals("3")){
                for(int i=0;i<students.length;i++){
                    System.out.printf("scores[%d]:%d\n",i,students[i]);// i번째 인덱스 호출
                }
            }
            else if(ch.equals("4")){
                //8.
                int max= 0; //임의로 최저점수 대입
                int sum =0; //총합계
                for(int i=0;i<students.length;i++){
                    if(students[i]>=max){max=students[i];}
                    sum+= students[i];
                }
                System.out.println("max = " + max);

                double avg= sum/students.length;
                System.out.printf("avg = %.1f\n" ,avg);
            }
            else if(ch.equals("5")){
                System.out.println("프로그램 종료"); break;
            }
            else{}


        }
    }//main end
}// class end
