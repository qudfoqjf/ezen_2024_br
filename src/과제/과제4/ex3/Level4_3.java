package 과제.과제4.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		int[] point = { 97 , 73 ,52 , 76 , 51 };

		/* 문제풀이 위치 */
		int num=0;
		int temp=0;
		System.out.print("정렬 전:");
		for (int i=0;i<point.length;i++){
			System.out.print(point[i]+" ");
		}
		for(int j=0;j<point.length;j++){
			for(int k=num;k<point.length;k++){
				if(point[j]>point[k]&&point[j]!=point[k]){
					temp=point[j];point[j]=point[k];point[k]=temp;
				}
			}
			num++;
		}
		System.out.print("\n정렬 후:");
		for (int i=0;i<point.length;i++){
			System.out.print(point[i]+" ");
		}
		/* ----------- */
	}
}
/* 
	[문제]
		1. int[] point = { 97 , 73 ,52 , 76 , 51 }; int형 배열입니다.
		2. 오림차순으로 정렬하시오.
		3. 정렬 전 과 정렬 후 배열을 그림과 같이 출력하시오.
*/
