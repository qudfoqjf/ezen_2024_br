package day18.model.dto;

//DtO : 데이터 이동 객체
/*
    관례적
    1. 필드는 private
    2. 기본생성자, 모든 필드생성자, + 상황에 맞는 생성자
    3. get/set 메소드 이용
    4. toString: 주소 대신 필드 정보 출력메소드

 */
public class MemberDto {
    //1. 필드
    private int mno;
    private String mid;
    private String mpw;
    private String mphone;
    private String mdate;   // DB 타입변환 필요
    //2. 생성자
    public MemberDto() {}
    public MemberDto(int mno, String mid, String mpw, String mphone, String mdate) {
        this.mno = mno;
        this.mid = mid;
        this.mpw = mpw;
        this.mphone = mphone;
        this.mdate = mdate;
    }

    public MemberDto(String mid, String mpw, String mphone) {
        this.mid = mid;
        this.mpw = mpw;
        this.mphone = mphone;
    }
    //3. 메소드


    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMpw() {
        return mpw;
    }

    public void setMpw(String mpw) {
        this.mpw = mpw;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }
    //4. toString
    @Override
    public String toString() {
        return "MemberDto{" +
                "mno=" + mno +
                ", mid='" + mid + '\'' +
                ", mpw='" + mpw + '\'' +
                ", mphone='" + mphone + '\'' +
                ", mdate='" + mdate + '\'' +
                '}';
    }
} //class end
