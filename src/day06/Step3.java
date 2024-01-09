package day06;  //패키지

import javax.xml.stream.Location;
import java.util.Locale;
import java.util.Scanner;

public class Step3 {//class start

    public static void main(String[] args) {//main start

        //p.157: 문자열객체 함수
        //1. 문자 추출.charAt(인덱스); 매개변수 :/ 리턴값 : 추출된 문자(char)
        String ssn="9506241230123";
        char sex= ssn.charAt(6);
        switch (sex){//switch start
            case '1':
            case '3':
                System.out.println("남자입니다.");
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }//switch end
        //-- 문자 입력받기.
        Scanner scanner=new Scanner(System.in);
        char c= scanner.next().charAt(0);   //한글자 입력받기
        //--문자열에서 색인 /특정문자 검색
        String str="안녕하세요";
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i));
        }

        //2. 문자열 길이: 문자열.length(); 매개변수: 없음/ 반환값: 문자열길이(int)
            //- 공백 포함
        int length= ssn.length();
        if(length==13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }

        //3. 문자열 대체 :문자열.replace(); 매개변수 :변경할 문자열, 새로운 문자열/반환값: 대체된 새로운 문자열(String)
        String oldStr= "자바 문자열을 불변입니다. 자바 문자열은 String 입니다.";
        String newStr= oldStr.replace("자바","java");
        System.out.println(oldStr);
        System.out.println(newStr);

        // - 특정 불필요한 데이터 대체
        String str1="안녕하세요<br/>유재석";
        String newstr1 =str1.replace("<br/>","\n");
        //- 악의적인/ 욕설 필터링 데이터 대체

        String str2= "안녕하세요 alert() 유재석";

        //4. 문자열 잘라내기: 문자열.subString()
        //      매개변수: (1) (2)
        String ssn2="880815-1234567";

        String firstnum= ssn2.substring(0,6);
        System.out.println("firstNum="+ firstnum);

        String secnondNum =ssn2.substring(7); // 7~ 마지막 인덱스 추출
        System.out.println("secnondNum = " + secnondNum);

        //5. 문자열 찾기:문자열.index Of()
            //  매개변수: "찾을 문자열"/ 반환값: 찾은 문자열의 인덱스 번호(int)

        String subject="자바 프로그래밍";
        //"자바 프로그램" 문자열에서 "프로그래밍" 문지열 찾기

        int location =subject.indexOf("프로그래밍");
        System.out.println("location = " + location);
        //"자바 프로그래밍" 문자열에서 3번 인덱스부터 끝까지 문자열 잘라내기
        String subString= subject.substring(location);
        //--> 3번 인덱스부터 마지막 인덱스까지 자르기==> 프로그래밍

        //-----------//
        location =subject.indexOf("자바");
        if(location!=-1){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련 없는 책이국요.");
        }

        //
        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련 없는 책이군요");
        }
        //6. 문자열 분리 :문자열.split()
            //매개변수: 구분지// 반환타입: 배열(문자열[])
        String board= "1,자바 학습, 참조 타입 String 을 학습합니다.,홍길동";
            //1.
        String[] tokens= board.split(",");   //4조각
        //1.
        System.out.println("번호:"+tokens[0]);
        System.out.println("제목:"+tokens[1]);
        System.out.println("내용:"+tokens[2]);
        System.out.println("성명:"+tokens[3]);



    }   //main end
}//class end
