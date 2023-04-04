/**
 * 2023/04/04
 * 박연수
 * 입력받은 숫자만큼 줄수를 반복하면서 직각삼각형 출력
 * # 문제분석
 *  - 변수 : i, j, num
 * # 알고리즘
 *  1. 줄수 입력 (num)
 *  2. 중첩반복
 *  	for (int i = 1; i <= num;i++) {	// 줄반복
 *  		for (int j = 1; j <= i; j++) // 별 찍기 반복
 *  			System.out.print(별찍기)
 * 
 */
package chap05;

import java.util.Scanner;
public class NestedLoop {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("줄 수 입력 : ");
		int num = stdin.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		

	}

}
