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


}
