/**
 * 2023/04/04
 * 박연수
 * 입력받은 숫자의 팩토리얼 구하기
 * # 문제분석
 *  - 변수 : fac, facvalue
 * # 알고리즘
 *  1. 정수 입력 (fac)
 *  2. 반복문 
 *  	while (fac > 1) 
 *  		facvalue = facvalue * --fac;
 *  3. 결과출력
 */
package chap05;

import java.util.Scanner;
public class WhileTest02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int fac = stdin.nextInt();
		int facvalue = fac;
		
		while (fac > 1) 
		{
			System.out.print(fac + " * ");
			facvalue = facvalue * --fac;
		}
			System.out.print("1 = " + facvalue);
		
	}

}
