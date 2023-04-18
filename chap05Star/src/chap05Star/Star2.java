package chap05Star;

import java.util.Scanner;
public class Star2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = stdin.nextInt();
		
		int i = 1;
		while(i<=num)
		{
			int j = num;
			while(j>=i)
			{
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}

	}

}
