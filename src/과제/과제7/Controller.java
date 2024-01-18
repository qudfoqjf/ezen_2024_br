package 과제.과제7;

import day12.controller.MemberController;

public class Controller {
    private Controller(){}
    private static Controller Controller = new Controller();
    public static Controller getInstance(){ return Controller; }
    public boolean signup(MemberDto memberDto){
        boolean result =MemberDao.getInstance().signup(memberDto);

        return result;
    }
    public boolean login(MemberDto memberDto){
        boolean result=MemberDao.getInstance().login(memberDto);
        return result;
    }
    public String idFind(MemberDto memberDto){
        String result=MemberDao.getInstance().idFind(memberDto);
        return result;
    }
    public String pwFind(MemberDto memberDto){
        String result=MemberDao.getInstance().pwFind(memberDto);
        return result;
    }

}
