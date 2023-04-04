/**
 * 2023/04/04
 * 박연수
 * 입력받은 숫자의 약수를 모두 출력하시오.
 * # 문제분석
 *  - 변수 : num, i
 * # 알고리즘
 *  1. 정수 입력(num)
 *  2. 복합논리 (반복문 안에 선택문 포함)
 *  	for (int i = 1; i <= num; i++) {
 *  		if (num % i == 0)
 *  			System.out.print(i + " ");
 *  	}
 *  
 */
package chap05;

import java.util.Scanner;
public class ForTest01 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = stdin.nextInt();
		
		System.out.print(num + "의 약수는 : ");
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0) // i는 num의 약수
				System.out.print(i + " ");
		}

	}

}
