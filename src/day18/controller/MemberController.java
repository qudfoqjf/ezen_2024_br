package day18.controller;

import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;

public class MemberController {

    //싱글톤
    private MemberController(){}
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

    //1.회원가입
    public int signup(MemberDto memberDto){
        //1.반환변수
        int result = 0;

        //3.가공처리/로직
        //1. 만약에 입력받은 아이디의 길이가 8글자 미만이면 실패
        /*
            if (memberDto.getMid().length()<8){
                return 3;
            }
  */
        //2. 아이디 중복검사
        if(MemberDao.getInstance().idCheck(memberDto.getMid())){
            return 2;
        }
        //3. 회원가입요청
        result= MemberDao.getInstance().signup(memberDto);

        //2.반환
        return result;
    }

    //- 로그인 상태 필드 [boolean 했다/안했다, String 아이디/null, int 회원번호/0, memberDto 객체/null]
    public int loginMno = 0;

    //2-1로그인
    public boolean login(MemberDto memberDto){

        boolean result = false;//반환 결과 기본값
        //1. DAO에게 login 처리 요청하고 결과 받기
        result = MemberDao.getInstance().login(memberDto);
        //2. 만약에 login 성공이면 로그인상태 변경
        if(result){
            //3. login 성공한 회원번호 DAO 에게 요청
            loginMno = MemberDao.getInstance().findMno(memberDto.getMid());
        }

        return result;
    }

    //2-2로그아웃
    public void logout(){
        loginMno = 0;
    }



}//c e