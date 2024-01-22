package day18.controller;

import day18.model.dto.MemberDto;
import day18.view.MemberView;

public class MemberController {

    private MemberController(){}; //생성자
    private static MemberController memberController = new MemberController();    //객체 생성
    public static MemberController getInstance(){return memberController;} // memberView 객체를 리턴
    //1. 회원가입
    public int signup(MemberDto memberDto){
        //1. 반환변수
        int result = 0;
            //3. 가공처리/로직
                //1. 만약에 입력받은 아이디의 길이가 8글자 미만이면 실패.
        if(memberDto.getMid().length() <8){
            return 3;
        }
                //2. 아이디 중복검사
        if(true){return 2;}

                //3. 회원가입 요청
        result =0;
        // 2. 반환
        return  result;
    }


}//class end
