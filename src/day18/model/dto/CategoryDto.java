package day18.model.dto;

public class CategoryDto {
    //필드
    private int cno;
    private String cname;

    //생성자
    public CategoryDto(){}

    public CategoryDto(int cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    //메소드
    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}