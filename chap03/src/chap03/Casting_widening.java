/**
 * 확대 형 변환
 * 2023/03/21
 * 박연수
 */
package chap03;

import java.util.Scanner;
public class Casting_widening {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("first Integer : ");
		int first = stdIn.nextInt(); //첫번째 정수 저장
		
		System.out.print("second Integer : ");
		int second = stdIn.nextInt(); //두번째 정수 저장
		
		double avg1 = (first + second)/2; //정수 정수 연산
		double avg2 = (first + second)/2.0; // 정수 실수 연산(확대형변환)
		double avg3 = (first + second)/(float)2; //정수 실수(형변환) 연산
		
		System.out.println("정수 연산 : " + avg1);
		System.out.println("실수 연산 : " + avg2);
		System.out.println("실수 연산 : " + avg3);
				
	}

}
