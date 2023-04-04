/**
 * 2023/04/04
 * 202095037 박연수
 * 두 숫자를 입력 받아서 두 수 사이의 합계 출력하기
 * # 문제분석
 *  - 변수 : first, second, total
 * # 알고리즘
 *  1. 정수 입력(first, second)
 *  2. 선택문(if (first < second))
 *  3. 반복문(for (first; second; first ++))
 *  			total = total + first
 * 
 */
package chap05;

import java.util.Scanner;
public class TestEx5 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("숫자 2개 입력 : ");
		int first = stdin.nextInt();
		int second = stdin.nextInt();
		int i, temp, total = 0;
		
		if (first > second)
		{
			temp = first;
			first = second;
			second = temp;
		}
		// for문
//		for (i=first; i<=second; i++)
//		total = total + i;
		
		// while문
		while (first <= second)
		{
			total += first;
			first++;
		}
		
		System.out.println("두 수 사이의 합은 : " + total);
		
	}

}
