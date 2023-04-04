/**
 * 1~1000까지의 정수 중에서 사용자가 입력한 숫자의 배수만을 더하여 출력하는 프로그램
 * for문 사용하여 작성 
 */
package chap05;

import java.util.Scanner;
public class TestEx03 {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("정수 1개 입력 : ");
		int num = stdin.nextInt();
		
		int sum = 0;
		for (int i = 1 ; i <= 1000 ; i++) 
		{
			if (i % num == 0)
				sum = sum + i;
		}
		System.out.print("1~1000 사이에서 " + num + "의 배수의 합은 : " + sum);
	}
}
