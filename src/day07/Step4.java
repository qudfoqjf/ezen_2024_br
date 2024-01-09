package day07;

import java.util.Scanner;

public class Step4 {//class start

    public static void main(String[] args) {//main start
        Scanner scanner= new Scanner(System.in);
        //1. 객체 생성
        Phone[] phoneBook=new Phone[100];


        //2. 기능 구현
        while(true){
            Phone phone=new Phone();
            System.out.println("==========전화번호부==========");
            System.out.println("순번\t 이름\t\t전화번호");
            for(int i=0; i<phoneBook.length;i++){
                if(phoneBook[i]!=null){
                    System.out.printf("%d\t%s\t%s-%s-%s\n",i+1,
                            phoneBook[i].name,
                            phoneBook[i].number.substring(0,3),
                            phoneBook[i].number.substring(3,7),
                            phoneBook[i].number.substring(7,11));
                }
            }
            System.out.println("\n1.전화번호등록| 2.전화번호삭제");
            System.out.print("선택>");
            int ch =scanner.nextInt();
            scanner.nextLine(); //의미없는 입력  (입력 중복방지)
            //1. 전화번호등록
            if(ch==1){
                System.out.print("이름,전화번호를 입력해주세요\n");
                String[] info = scanner.nextLine().split(",");
                for(int i=0; i<phoneBook.length;i++) {
                    if(phoneBook[i]==null) {
                        phone.name = info[0];
                        phone.number = info[1];
                        phoneBook[i] = phone;
                        System.out.println(phoneBook[i].name+phoneBook[i].number);
                        break;
                    }
                }

            }
            else if (ch==2){
                System.out.print("삭제하고 싶은 번호의 순번을 입력해주세요\n");
                int d=scanner.nextInt();
                phoneBook[d-1]=null;
                for(int i=0;i<phoneBook.length-1;i++){
                    if(phoneBook[i]==null){
                        phoneBook[i]=phoneBook[i+1];
                        phoneBook[i+1]=null;
                    }
                }
            }
            else{
                System.out.println("1,2번중에 선택하여 주세요");
            }

        }


    }//main end

}//class end



/*   [1.조건]
        - 하나의 클래스(Phone)를 설계해서 여러개의 객체 생성하고 관리하시오.
        - 설계한 클래스(Phone)를 이용하여 배열(phoneBook)을 하나만 선언합니다. 단 배열에 최대 100개의 객체만 저장할수 있습니다.
        Phone[] phoneBook = new Phone[100];

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 객체 생성후 배열에 순서대로 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
            - 삭제된 객체 뒤 로 객체가 있을경우 한칸씩 앞으로 이동하시오.
                예)
                    0(객체A) 1(객체B) 2(객체C) 3(객체D)  null
                        만일 2번 인덱스의 객체 삭제시
                    0(객체A) 1(객체B) 3(객체D)  null    null
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력
            - 단 배열 항목/요소내 객체가 없을경우에만 출력하지 마시오.

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>

        */