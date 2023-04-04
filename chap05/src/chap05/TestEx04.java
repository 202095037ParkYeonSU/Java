/**
 * 2023/03/28 
 * 박연수
 * 두 개의 숫자를 입력 받아서 두 숫자 사이의 홀수값을 모두 더하여 출력
 * # 문제분석
 *  - 변수 : num1, num2, sum, temp, i
 * # 알고리즘
 *  1. 정수 입력 (num1, num2)
 *  2. 선택문 (if (num1 < num2))
 *  3. 복합논리(반복문 안에 선택문 포함) 
 *  (for (i=num1 ; i<=num2 ; i++)) {
 *  	if (i % 2 != 0)
 * 			sum += i
 *  }
 *  
 */
package chap05;

import java.util.Scanner;
public class TestEx04 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.println("숫자 2개 입력 : ");
		int num1 = stdin.nextInt();
		int num2 = stdin.nextInt();
		int temp = 0;
		
		// num1은 num2보다 항상 작은 값을 가진다.
		if (num1 > num2) 
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		int i, sum = 0;
		for (i=num1 ; i<=num2 ; i++) 
		{
			if (i % 2 != 0)	// i값이 홀수일떄.
				sum = sum + i;
		}
		System.out.print(sum);
	} 

}
