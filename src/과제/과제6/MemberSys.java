package 과제.과제6;

import 과제.과제6.Member;

import java.util.Scanner;

public class MemberSys { // class s
	static Member[] 객체배열 = new Member[100];
	static Scanner sc= new Scanner(System.in);
	public static void signup(){
		sc.nextLine();
		System.out.println("회원정보를 입력하세요");
		System.out.println("아이디:");	String id = sc.nextLine();
		System.out.println("비밀번호:");	String pw = sc.nextLine();
		System.out.println("이름:");		String name = sc.nextLine();
		System.out.println("번호:");		String num = sc.nextLine();
		System.out.println("나이:");		String age = sc.nextLine();
		System.out.println("회원가입성공!");

		Member member =new Member(id, pw, name, num, age);


		for (int i = 0; i < 객체배열.length; i++) {
			if (객체배열[i] == null) {// 만약에 비어 있으면 객체 저장
				객체배열[i] = member;
				System.out.println("객체배열= " + 객체배열[i]);
				break;
			}
		}
	}

	public static void login(){
		sc.nextLine();
		System.out.print("아이디:");	String id = sc.nextLine();
		System.out.print("비밀번호:"); String pw = sc.nextLine();
		for (int i = 0; i < 객체배열.length; i++) {
			if(객체배열[i]!=null){
				if (id.equals(객체배열[i].getId()) && pw.equals(객체배열[i].getPw())) {
					System.out.println("로그인성공");
					return;
				}
			}
		}
		System.out.println("회원 정보가 일치하지 않습니다.");
	}

	public  static void idFind(){
		sc.nextLine();
		System.out.print("이름:");	String name = sc.nextLine();
		System.out.print("전화번호:"); String num = sc.nextLine();
		for (int i=0;i<객체배열.length;i++) {
			if (객체배열[i] != null) {
				if (name.equals(객체배열[i].getName()) && num.equals(객체배열[i].getNum())) {
					System.out.println("id는 " + 객체배열[i].getId() + "입니다.");
					break;
				}
			}
		}
		System.out.println("회원 정보가 일치하지 않습니다.");
	}
	public  static void pwFind(){
		sc.nextLine();
		System.out.print("id:");	String id = sc.nextLine();
		System.out.print("전화번호:"); String num = sc.nextLine();
		for (int i=0;i<객체배열.length;i++) {
			if (객체배열[i] != null) {
				if (id.equals(객체배열[i].getId()) && num.equals(객체배열[i].getNum())) {
					System.out.println("pw는 " + 객체배열[i].getPw() + "입니다.");
					break;
				}
			}
		}
		System.out.println("회원 정보가 일치하지 않습니다.");
	}

	public static void main(String[] args) {

		while(true) {


			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
				signup();
			}
			else if( ch == 2 ) {
				login();
			}
			else if( ch == 3 ) {
				idFind();
			}
			else if( ch == 4 ) {
				pwFind();
			}

		} // w e
	} // m e 
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














