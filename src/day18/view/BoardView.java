package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {

    //싱글톤
    private BoardView(){}
    private static BoardView boardView = new BoardView();
    public static BoardView getInstance(){return boardView;}
    //입력객체
    Scanner scanner = MainView.getInstance().scanner;

    //0. 로그인 성공시 출력되는 화면
    public void run(){
        while (true){
            System.out.println("===========ezen 게시판===========");
            ArrayList<BoardDto> boardDtos = BoardController.getInstance().boardPrint(new BoardDto());
            for(int i = 0 ; i<boardDtos.size();i++){
                String mid = BoardController.getInstance().mid(i);
                String cname = BoardController.getInstance().category(i);
                System.out.println(mid+cname);
            }
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택 > ");int ch = scanner.nextInt();

            if(ch==1){
                WriteView.getInstance().write();
            }
            else if(ch==2){}
            else if(ch==3){
                System.out.println("<안내> 로그아웃이 되었습니다.");
                MemberController.getInstance().logout(); //회원컨트롤러에 로그아웃처리 요청
                return; //현재 메소드 종료
            }

        }// w e
    }//m e

}//c e