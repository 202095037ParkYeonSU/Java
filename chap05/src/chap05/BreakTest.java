/**
 * 2023/04/04
 * 박연수
 * 숫자를 반복적으로 입력 받아서 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력.
 * # 문제분석
 *  - 변수 : i, num, sum
 * # 알고리즘
 *  1. 반복문
 * 
 */
package chap05;

import java.util.Scanner;
public class BreakTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int sum = 0, num = 0, i = 0;
		
		while (true)
		{
			System.out.print("정수 입력 : ");
			num = stdin.nextInt();
			sum += num;
			i++;
			
			if (sum >= 1000) break;
		}
		System.out.print("1000을 넘은 수 : " + num + ", 입력값의 평균은 : " + sum / i);
		
		
	}

}
