package 과제.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		String string=scanner.nextLine();
		System.out.println("회원명 String : " + string);

		boolean bool=scanner.nextBoolean();
		System.out.println("상태 boolean : " + bool);

		byte b = scanner.nextByte();
		System.out.println("회원번호 byte : " + b);

		char ch= scanner.next().charAt(0); //첫글자 추출
		System.out.println("성별 char : " + ch);

		short s = scanner.nextShort();
		System.out.println("나이 short : " + s);

		int i= scanner.nextInt();
		System.out.println("포인트 int : " + i);

		long l= scanner.nextLong();
		System.out.println("예금액 long : " + l);

		float f= scanner.nextFloat();
		System.out.println("키 float : " + f);

		double d= scanner.nextDouble();
		System.out.println("몸무개 double : " + d);

		System.out.println("==========회원 개인정보=============");
		System.out.printf("|\t\t회원명: %s\t\t\t|\n",string);
		System.out.printf("|\t\t상태: %b\t\t\t\t|\n",bool);
		System.out.printf("|\t\t회원번호: %d\t\t\t\t|\n",b);
		System.out.printf("|\t\t성별: %c\t\t\t\t\t|\n",ch);
		System.out.printf("|\t\t나이: %d\t\t\t\t|\n",s);
		System.out.printf("|\t\t포인트: %d\t\t\t|\n",i);
		System.out.printf("|\t\t예금액: %d\t\t\t|\n",l);
		System.out.printf("|\t\t평균: %3.1f\t\t\t\t|\n",f);
		System.out.printf("|\t\t평균: %4.2f\t\t\t\t|\n",d);
		System.out.println("=================================");

		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
