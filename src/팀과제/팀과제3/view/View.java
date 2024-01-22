package 팀과제.팀과제3.view;

import day13.step4.pakage2.D;
import 팀과제.팀과제3.controller.Controller;
import 팀과제.팀과제3.model.Dto;

import java.util.Scanner;

public class View {
    public static void 계좌생성(){
        //1. 입력받기
        Scanner scanner =new Scanner(System.in);
        System.out.print("은행을 선택해주세요\n1.신한은행 | 2.국민은행 | 3.농협은행\n:");
        String 은행=scanner.next();
        System.out.print("이름을 입력해주세요\n:");
        String 계좌주=scanner.next();

        //2. 객체화
        Dto dto = new Dto(은행,계좌주,0);

        //3. 컨트롤한테 은행이랑 계좌주 이름 넘겨줌
        //처리 결과는 String으로 생성된 계좌 받아야함

        String result= Controller.getInstance().계좌생성(dto);
        if(result!=null){//계좌번호가 null이 아니면 성공 문구 보여주기
            System.out.println("계좌가 생성되었습니다.");
            System.out.println(
                    "이름: "+계좌주+
                            "\n계좌번호 : "+result
            );
        }else {
            System.out.println("계좌생성 실패");
        }

    }
    public static void 예금(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("계좌번호를 입력하세요\n:");
        String 계좌번호=scanner.next();
        System.out.print("예금액을 입력하세요\n:");
        int 금액=scanner.nextInt();

        //2. 객체화
        Dto dto = new Dto(계좌번호 , 금액);

        //3. 컨트롤한테 계좌번호랑 금액 넘겨줌
        //처리 결과는 int로 생성된 예금결과 받아야함

        int result= Controller.예금(dto);
        if(result>0){
            System.out.println("계좌번호: "+계좌번호+"\n통장 잔액: "+result+"원");
        }else {
            System.out.println("예금 실패");
        }

    }
    public static void 출금(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("계좌번호를 입력하세요\n:");
        String 계좌번호=scanner.next();
        System.out.print("출금액을 입력하세요\n:");
        int 금액=scanner.nextInt();

        //2. 객체화
        Dto dto = new Dto(계좌번호, 금액);

        //3. 컨트롤한테 계좌번호랑 금액 넘겨줌
        //처리 결과는 int로 생성된 예금결과 받아야함

        int result= Controller.출금(dto);
        if(result>0){
            System.out.println("계좌번호: "+계좌번호+"\n통장 잔액: "+result+"원");
        }else {
            System.out.println("출금 실패");
        }
    }

}
