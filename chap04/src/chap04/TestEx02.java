/**
 * 2023/03/28
 * 박연수
 * 입력된 숫자가 양수, 0, 음수인지 판별하는 프로그램 작성
 */
package chap04;

import java.util.Scanner;
public class TestEx02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = stdin.nextInt();
		
		if (num > 0) System.out.print(num + "은(는) 양수입니다.");
		else if (num < 0) System.out.print(num + "은(는) 음수입니다.");
		else System.out.print(num + "은 zero 입니다.");

	}

}
