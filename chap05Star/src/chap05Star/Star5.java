package chap05Star;

import java.util.Scanner;
public class Star5 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = stdin.nextInt();
		
		for(int i = 1; i<=num; i++)
		{
			for(int j = 0;j<=num-i;j++)
				System.out.print(" ");		
			for(int j = 1; j<=i*2-1; j++)
				System.out.print("*");
			
			System.out.println();
			
		}
	}

}
