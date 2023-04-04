/**
 * 2020/03/28
 * 박연수
 * 조건문 연습 if - else if
 */
package chap04;

import java.util.Scanner;
public class SimpleTest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int grade = stdin.nextInt();
		
		if (grade >= 90)
			System.out.println("A 학점");
		else if (grade >= 80)
			System.out.println("B 학점");
		else if (grade >= 70)
			System.out.println("C 학점");
		else if (grade >= 60)
			System.out.println("D 학점");
		else
			System.out.println("F 학점");
		
	}

}
