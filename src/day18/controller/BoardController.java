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



}