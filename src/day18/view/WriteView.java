package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WriteView {
    //싱글톤
    private WriteView(){};
    private static WriteView writeView = new WriteView();
    public static WriteView getInstance(){return writeView;}
    //입력객체
    Scanner scanner = MainView.getInstance().scanner;

    // 1. 글쓰기
    public void write(){




        System.out.println("카테고리 선택");
        ArrayList<CategoryDto> categoryDtos = BoardController.getInstance().categoryPrint(new CategoryDto());
        for(int i = 0 ; i < categoryDtos.size();i++){
            System.out.print(categoryDtos.get(i).getCno()+". ");
            System.out.println(categoryDtos.get(i).getCname());
        }
        System.out.println("선택>");
        int category = scanner.nextInt();

        int mno = MemberController.getInstance().loginMno;
        System.out.println("제목을 써주세요"); String title = scanner.next();
        System.out.println("내용을 적어주세요"); String content = scanner.next();


        BoardDto boardDto = new BoardDto(mno,category,title,content);
        boolean result = BoardController.getInstance().write(boardDto);

    }
    //개별글출력






}