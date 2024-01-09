package day06;  //패키지

import java.util.Scanner;

public class Step6 {//class start

    public static void main(String[] args) {//main start
        Scanner scanner= new Scanner(System.in);

        //1. 문자열
        String 전화번호부="";

        //2.기능
        while(true){
            //1. split
            String[] split=전화번호부.split("\n");
            
            System.out.println("==========전화번호부==========");
            System.out.println("순번\t 이름\t\t전화번호");
            if(!전화번호부.isEmpty()){
                for(int i=0; i< split.length;i++){
                    //System.out.printf("split[%d] = " + split[i]+"\n",i);
                    System.out.printf("%d\t%s\t%s-%s-%s\n"
                            ,i+1,split[i].substring(0,3),
                            split[i].substring(4,7),
                            split[i].substring(7,11),
                            split[i].substring(11,15));
                }
            }
            
            System.out.println("\n1.전화번호등록| 2.전화번호삭제");
            System.out.print("선택>");
            int ch =scanner.nextInt();
            scanner.nextLine();
            //1.전화번호 등록
            if(ch==1){
                System.out.print("이름과 전화번호를 입력해주세요\n");
                전화번호부+=scanner.nextLine()+"\n";
                System.out.println("전화번호부 = " + 전화번호부);

            } else if(ch==2){//2. 전화번호 삭제

                System.out.print("삭제하고 싶은 번호의 순번을 입력해주세요\n");
                int d=scanner.nextInt();
                전화번호부=전화번호부.replace(split[d-1]+"\n","");

            } else{
                System.out.println("1,2번중에 선택하여 주세요");
            }
        }



    }//main end
}//class end
