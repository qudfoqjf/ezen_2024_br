package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dao.MemberDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.view.WriteView;

import java.util.ArrayList;

public class BoardController {

    //싱글톤
    private BoardController(){}
    private static BoardController boardController = new BoardController();
    public static BoardController getInstance(){return boardController;}

    //글쓰기
    public boolean write(BoardDto boardDto){
        //반환변수
        boolean result = false;

        result = BoardDao.getInstance().write(boardDto);

        //반환
        return result;

    }

    public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){
        ArrayList<CategoryDto> result = null;
        result = BoardDao.getInstance().categoryPrint(categoryDto);
        return result;

    }

    //모든글 출력
    public ArrayList<BoardDto> boardPrint(BoardDto boardDto){
        ArrayList<BoardDto> result = null;
        result = BoardDao.getInstance().boardPrint(boardDto);
        return result;
    }

    //작성자 아이디가져오기
    public String mid(int mno){
        String result = null;
        result = BoardDao.getInstance().mid(mno);
        return result;
    }

    //카테고리 가져오기
    public String category(int cno){
        String result = null;
        result = BoardDao.getInstance().category(cno);
        return result;
    }


}