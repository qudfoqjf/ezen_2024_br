package day18.model.dao;

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

}