package day18.view;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

public class MemberView {
    private MemberView(){}; //생성자
    private static MemberView memberView = new MemberView();    //객체 생성
    public static MemberView getInstance(){return memberView;} // memberView 객체를 리턴

    //1. 회원가입
    public void signup(){
        //1. 입력받기
        System.out.println("id:");      String id= MainView.getInstance().scanner.next();
        System.out.println("pw:");      String pw= MainView.getInstance().scanner.next();
        System.out.println("전화번호");     String phone= MainView.getInstance().scanner.next();
        //2. 객체화
        MemberDto memberDto = new MemberDto(id,pw,phone);

        //3. 컨트롤러에게 전달
        int result= MemberController.getInstance().signup(memberDto); // 0: 성공  1: DB오류 2: 아이디중복 3~: 각필드별 유효성검사 실패
        //4. 결과에 따른 출력
        if(result==0){
            System.out.println("<안내> 회원가입 성공");
        } else if (result==1) {
            System.out.println("<안내> 시스템 내부 오류 관리자에게 문의");
        }else if(result==2){
            System.out.println("<안내> 사용중인 아이디입니다.");
        }
    }

    //2. 로그인
    public void login(){
        //1. 입력
        System.out.println("아이디:"); String id=MainView.getInstance().scanner.next();;
        System.out.println("비밀번호:");String pw=MainView.getInstance().scanner.next();;
        //2. 객체화
        MemberDto memberDto=new MemberDto();
        memberDto.setMid((id));memberDto.setMpw(pw);
        //3. 전달 후 결과
        boolean result=MemberController.getInstance().login(memberDto); ;
        //4. 결과 출력
        if(result){
            System.out.println("<안내> 로그인 성공");
            //게시판 화면으로 이동할 예정 <페이지 전환>
            BoardView.getInstance().run();
        }else{
            System.out.println("<안내> 로그인 실패");
        }
    }














}
