/**
 * 윤년 계산 프로그램
 * 조건 1 : 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년.
 * 조건 2 : 400으로 나누어 떨어지는 해도 윤년에 포함.
 * 
 */
package chap03;

import java.util.Scanner;
public class OpEx2 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = stdin.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.print(year + "년은 윤년입니다");
//		else if (year % 400 == 0)
//			System.out.print(year + "년은 윤년입니다");
		else
			System.out.print(year + "년은 윤년이 아닙니다");
		
	}

}
