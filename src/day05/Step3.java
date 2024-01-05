package day05;//패키지

import java.util.Scanner;

public class Step3 { //class start
    public static void main(String[] args) {// main start
    // 입력 객체
        Scanner scanner= new Scanner(System.in);
        //5-1 저장할 변수 선언
        String[] 내용배열= new String[3];
        String[] 이름배열= new String[3];
        int[] 비밀번호배열 = new int[3];
    //1. 무한루프
        while(true){ //w start
            //2. 출력
            System.out.println("=============방문록=============");
            //7. for문 이용한 배열내 모든 항목/요소 호출: 0부터 2까지 1씩 증가.나머지는 코드가 빈
            for(int index=0; index<내용배열.length; index++){
                    System.out.printf("%2d \t %-5s \t %-20s \n",index+1,이름배열[index],내용배열[index]);
            }
            System.out.println("1. 방문록 작성 2. 방문록 삭제 3.종료");
            //3. 입력
            System.out.println("선택>"); int ch =scanner.nextInt();

            //4. 입력된 경우의 수 판단
            if(ch==1){
                //6-1.방문록 작성할(위치)인덱스를 입력 받는다.
                System.out.println("방문록 작성위치:1. 2. 3.:");  int no = scanner.nextInt();
                //6-2. ㅣ입력: 내용, 작성자, 비밀번호
                scanner.nextLine();
                System.out.print("내용:"); String content = scanner.nextLine();
                System.out.print("작성자:"); String writer = scanner.nextLine();
                System.out.print("비밀번호:"); int password = scanner.nextInt();
                //6-3. 저장
                내용배열[no-1]=content;
                이름배열[no-1]=writer;
                비밀번호배열[no-1]=password;
            }
            else if(ch==2){
                // 8-1 입력: 삭제할 방문록의 위치 입력
                System.out.println("방문록 삭제위치:1. 2. 3.:");
                int no= scanner.nextInt();
                // 8-2 입력[비밀번호]
                System.out.println("방문록 비밀번호:");
                int password = scanner.nextInt();
                // 8-3 초기화: 만약에 인덱스가 없는 번호를 선택했을때
                if(no<1||no>내용배열.length){
                    System.out.println("[경고] 알 수 없는 위치입니다 ");
                }
                else if(비밀번호배열[no-1]==password){
                    내용배열[no-1]=null; 이름배열[no-1]=null; 비밀번호배열[no-1]=0;
                }else{
                    System.out.println("[경고] 비밀번호가 다릅니다");
                }
            }
            else if(ch==3){break;}
            else{
                System.out.println("[경고] 알 수 없는 입력입니다.");
            }
        }// w end

    }// main end
}// class end
