package 과제.과제6;

import day12.view.MemberView;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String num;
    private String age;

      Member(String id, String pw,String name,String num, String age){
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.num=num;
        this.age=age;
    }

  /*  @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", age='" + age + '\'' +
                '}';
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
