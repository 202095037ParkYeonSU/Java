/**
 * add, sub, mul, div 클래스 생성
 * 각 클래스의 공통 필드 메소드
 *  - int a, b : 2개으 ㅣ피연산자
 *  - void setValue(int a, int b) : 피연산자 값 객체 내에 저장
 *  - int calculate() : 클래스 목적에 맞는 연산 실행 후 결과 return
 * main() 메소드
 *  - add, sub, mul, div 객체 생성
 *  - setValue, calculate() 호출 후 결과 출력
 * 실행 결과
 * - 두 정수 연산자 입력 >> 5 7 *
 * 35 
 */
package Test;

import java.util.Scanner;

public class Test1 {
	int a, b, result;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate(char x) { 
		if (x == '+') 
			this.result = a + b;
		else if (x == '-')
			this.result = a - b;
		else if (x == '*')
			this.result = a * b;
		else if (x == '/')
			this.result = a / b;
		
		return result;

	}
	
	
	
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Test1 test = new Test1();
		
		System.out.print("두 정수와 연산자 입력 : ");
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		char x = stdin.next().charAt(0);
		
		test.setValue(a, b);
		int num = test.calculate(x);
		
		System.out.print("실행 결과 : " + num);
		
		

	}

}
