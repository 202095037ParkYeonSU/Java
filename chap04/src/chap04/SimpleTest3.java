/**
 * 2023/03/28
 * 박연수
 * 조건문 연습 switch
 */
package chap04;

import java.util.Scanner;
public class SimpleTest3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("성적 입력 : ");
		int grade = stdin.nextInt();
		
		switch (grade / 10) {
		case 10:
		case 9:
			System.out.println("A 학점");
			break;
		case 8:
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		case 6:
			System.out.println("D 학점");
			break;
		default:
			System.out.println("F 학점");
			break;
		}
		
		
	}

}
