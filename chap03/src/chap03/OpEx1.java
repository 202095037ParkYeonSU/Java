/**
 * 동전교환 프로그램
 * 입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환해주는 프로그램 작성
 * 조건 1 : 동전의 총 개수를 최소화
 * 조건 2 : 고액의 동전 우선 교환
 * 
 */
package chap03;

import java.util.Scanner;
public class OpEx1 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("동전으로 교환하라 금액 입력 : ");
		int money = stdin.nextInt();
		
		int chg1 = money / 500;
		int rst1 = money % 500;
		
		int chg2 = rst1 / 100;
		int rst2 = rst1 % 100;
		
		int chg3 = rst2 / 50;
		int rst3 = rst2 % 50;
		
		int chg4 = rst3 / 10;
		int rst4 = rst3 % 10;
		
		System.out.println("500원짜리 " + chg1 + "개");
		System.out.println("100원짜리 " + chg2 + "개");
		System.out.println("50원짜리 " + chg3 + "개");
		System.out.println("10원짜리 " + chg4 + "개");
		System.out.println("남은 금액 " + rst4 + "원");
		
		
	}

}
