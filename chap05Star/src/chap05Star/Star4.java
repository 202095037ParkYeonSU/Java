package chap05Star;

import java.util.Scanner;
public class Star4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = stdin.nextInt();
		
		int i = 1;
		while(i<=num)
		{
			int x = 1;
			while(x<=num-i)
			{
				System.out.print(" ");
				x++;
			}
			
			int j = 1;
			while(j<=i*2-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
