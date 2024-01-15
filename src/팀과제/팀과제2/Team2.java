package 팀과제.팀과제2;

import java.util.Scanner;

public class Team2 {
     static Scanner scanner=new Scanner(System.in);
    static MemberInfo[] info = new MemberInfo[100];
    static boolean login=false;


    //메소드
     static void 회원가입(){
         scanner.nextLine();
        System.out.println("회원정보를 입력하세요");
        System.out.println("아이디:"); String id=scanner.nextLine();
        System.out.println("비밀번호:"); String pw=scanner.nextLine();
        System.out.println("이름:"); String name=scanner.nextLine();
        System.out.println("번호:"); String num=scanner.nextLine();
        System.out.println("생일:"); String birth=scanner.nextLine();
        System.out.println("회원가입성공!");
        MemberInfo member=new MemberInfo(id,pw,name,num,birth);
         for (int i=0;i<info.length;i++){
             if(info[i]==null){// 만약에 비어 있으면 객체 저장
                 info[i]=member;
                 break;
             }
         }
    }
    static void 로그인(){
        scanner.nextLine();
        System.out.print("아이디:"); String id=scanner.nextLine();
        System.out.print("비밀번호:"); String pw=scanner.nextLine();
        for(int i=0;i<info.length;i++){
            if(id.equals(info[i].id)&&pw.equals(info[i].pw)){
                System.out.println("로그인성공");
                login=true;
                break;
            } else{System.out.println("회원 정보가 일치하지 않습니다.");}
        }
    }

    static void 회원정보창(){
        System.out.println("==================================");
        System.out.println("1.구독 신청 | 2.사용 현황|3. 구독연장");
        int ch = scanner.nextInt();
        if(ch==1){
            System.out.println("1. 구독신청");
            구독신청();
        }
        else if(ch==2){
            System.out.println("2. 사용현황");
            사용현황();
        }
        else if(ch==3){
            System.out.println("3. 구독연장");
            구독연장();
        }
    }

    static void 구독신청(){}

    static void 사용현황(){}

    static void 구독연장(){}

    public static void main(String[] args) {
        while (true) {
            System.out.println("==================================");
            System.out.println("1.회원가입 | 2.로그인");
            int ch = scanner.nextInt();
            if(ch==1){회원가입();}
            else if(ch==2){
                로그인();
                if(login){
                    회원정보창();
                }
            }
        }
    }
}
