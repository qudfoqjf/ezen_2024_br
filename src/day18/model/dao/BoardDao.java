package day18.model.dao;

import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends Dao {
    //싱글톤
    private BoardDao(){}//생성자 : 객체 생성시 초기화 담당
    private static BoardDao boardDao = new BoardDao();
    public static BoardDao getInstance(){return boardDao;}

    //글쓰기
    public boolean write(BoardDto boardDto){
        try {
            //sql작성
            String sql = "insert into board(mno,cno,btitle,bcontent) values(?,?,?,?)";
            //sql 기재
            ps = conn.prepareStatement(sql);
            //? 매개변수 대입
            ps.setInt(1,boardDto.getMno());
            ps.setInt(2, boardDto.getCno());
            ps.setString(3, boardDto.getBtitle());
            ps.setString(4, boardDto.getBcontent());
            //sql실행
            int count = ps.executeUpdate();
            if(count==1){
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    // public BoardDto[] categoryPrint(BoardDto boardDto){
    public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){
        try {
            String sql ="select * from category order by cno";
            ps = conn.prepareStatement(sql);
            rs =    ps.executeQuery();

            ArrayList<CategoryDto>categoryDtos = new ArrayList<>();

            while( rs.next() ){

                CategoryDto dto = new CategoryDto();
                dto.setCno( rs.getInt("cno") );
                dto.setCname( rs.getString("cname"));
                categoryDtos.add( dto );
            }

            return categoryDtos;

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    //모든글출력
    public ArrayList<BoardDto> boardPrint(BoardDto boardDto){
        try{
            String sql = "select*from board";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ArrayList<BoardDto>boardDtos = new ArrayList<>();

            while (rs.next()){
                BoardDto dto = new BoardDto();
                rs.getInt("bno");
                rs.getInt("cno");
                rs.getInt("mno");
                rs.getString("bdate");
                rs.getInt("bview");
                rs.getString("btitle");
                boardDtos.add(dto);
            }
            return boardDtos;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;

    }

    //작성자 아이디 가져오기
    public String mid(int mno){
        try {
            String sql = "select*from member where mno=?";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            ps.setInt(1, MemberController.getInstance().loginMno);
            if(rs.next()){
                System.out.println(rs.getString("mid"));
                return rs.getString("mid");

            }

        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    //카테고리 가져오기
    public String category(int cno){
        try {
            String sql = "select*from category order by cno";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()){
                return rs.getString("cname");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

}