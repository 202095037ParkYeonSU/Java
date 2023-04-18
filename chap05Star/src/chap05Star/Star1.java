package chap05Star;

import java.util.Scanner;
public class Star1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = stdin.nextInt();
		int i = 1;
		while(i<=num)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
				

	}

}
