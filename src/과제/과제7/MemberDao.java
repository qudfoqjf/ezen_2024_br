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

}
