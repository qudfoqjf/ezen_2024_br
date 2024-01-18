package 과제.과제7;

import java.util.ArrayList;

public class MemberDao {
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){ return memberDao; }
    ArrayList<MemberDto> memberDtos= new ArrayList<>();
    public boolean signup( MemberDto memberDto ){
        memberDtos.add( memberDto );

        return true; // 회원가입 성공
    }

    public boolean login(MemberDto memberDto){
        for( int i = 0 ; i < memberDtos.size() ; i++ ){
            // i는 0부터 리스트내 요소 개수 까지 1씩 증가
            if( memberDtos.get( i ).getId().equals( memberDto.getId() ) ){
                // 리스트내 i번째 객체의 아이디 와 입력받은아이디(매개변수) 같으면
                if( memberDtos.get( i ).getPw().equals( memberDto.getPw() ) ){
                    // 리스트내 i번째 객체의 비밀번호 와 입력받은비밀번호(매개변수) 같으면
                    return true; // 로그인 성공
                }
            }
        }
        return false;
    }
    public String idFind(MemberDto memberDto){

        for (int i=0;i<memberDtos.size();i++) {
            if (memberDtos.get(i) != null) {
                if (memberDtos.get(i).getName().equals(memberDto.getName()) && memberDtos.get(i).getNum().equals(memberDto.getNum())) {

                    return memberDtos.get(i).getName();
                }
            }
        }
        return "존재하지 않습니다"; // id 찾기 실패
    }
    public String pwFind(MemberDto memberDto){
        for (int i=0;i<memberDtos.size();i++){
            if(memberDtos.get(i) != null){
                if(memberDtos.get(i).getId().equals(memberDto.getId())&&memberDtos.get(i).getNum().equals(memberDto.getNum())){
                    return memberDtos.get(i).getId();
                }
            }
        }


        return "정보가 일치하지 않습니다.";// 비밀번호 찾기 실패
    }

}
/*for (int i=0;i<memberDtos.size();i++) {
            if (memberDtos.get(i) != null) {
                if (memberDtos.get(i).getId().equals(memberDto.getId()) && memberDtos.get(i).getNum().equals(memberDto.getNum())) {
                    return memberDtos.get(i).getPw();
                }
            }
        }*/