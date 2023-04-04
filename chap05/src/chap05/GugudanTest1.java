/**
 * 2023/03/28
 * 박연수
 * 반복문을 활용해서 구구단 출력하기
 */
package chap05;

import java.util.Scanner;
public class GugudanTest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = stdin.nextInt();
		
		for (int i = 1 ; i <= 9 ; i++)
		{
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

	}

}
