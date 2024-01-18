package 과제.과제7;

import day13.Member;

import java.util.Scanner;

public class View {
    private View(){}
    private static View View=new View();
    public static View getInstance(){return View;}
    static Scanner scanner = new Scanner(System.in);
    //회원가입
    public static void signup(){
        //1. 입력
        scanner.nextLine();
        System.out.println("회원정보를 입력하세요");
        System.out.println("아이디:");	String id = scanner.nextLine();
        System.out.println("비밀번호:");	String pw = scanner.nextLine();
        System.out.println("이름:");		String name = scanner.nextLine();
        System.out.println("번호:");		String num = scanner.nextLine();
        System.out.println("나이:");		int age = scanner.nextInt();
        //2. 객체화
        MemberDto Member =new MemberDto(id,pw,name,num,age);
        //3. 컨트롤에 전달
        boolean result=Controller.getInstance().signup(Member);

        //4. 결과 출력
        if( result ){     System.out.println("회원가입 성공 ");}
        else{   System.out.println("회원가입 실패 ");   }
    }

    //로그인
    public static void login(){
        System.out.print("아이디 : ");    String id = scanner.next();
        System.out.print("비밀번호 : ");  String pw = scanner.next();
        MemberDto memberDto=new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        boolean result =Controller.getInstance().login(memberDto);

        if(result){
            System.out.println("로그인성공");
        }
        else{
            System.out.println("로그인 실패");
        }
    }
    public static void main(String[] args) {

    while(true){
        System.out.println("\n\n--------- 회원 시스템 ---------");
        System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
        int ch = scanner.nextInt();

        if( ch == 1 ) {
            signup();
        }
        else if( ch == 2 ) {
            login();
        }
        else if( ch == 3 ) {

        }
        else if( ch == 4 ) {

        }

        }
    }
}
