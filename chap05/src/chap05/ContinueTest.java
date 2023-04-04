/**
 * 2023/04/04
 * 박연수
 * 1~100까지의 숫자 중에서 사용자로부터 입력받은 숫자의 배수의 합을 구하여라.
 * (while, continue 이용)
 * 
 * # 문제분석
 *  - 변수 : num, sum, i
 * # 알고리즘
 *  
 */
package chap05;

import java.util.Scanner;
public class ContinueTest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = stdin.nextInt();
		int sum = 0, i = num;
		
		while(i <= 100)
		{
			if (i % num != 0) continue;
			
			sum = sum + i;
			i++;
		}
		System.out.print(num + "의 배수의 합은 : " + sum);

	}

}
