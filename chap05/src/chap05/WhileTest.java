/**
 * 2023/03/28
 * 박연수
 * 반복문(while, for, do while)
 * 1~10 합 구하기
 */
package chap05;

public class WhileTest {

	public static void main(String[] args) {
		//while 반복
		int sum = 0, cnt = 1;
		while (cnt <= 10) 
		{
			sum = sum + cnt;
			cnt += 1;
		}
		System.out.println("(while)1~10의 합은 : " + sum);
		
		//for 반복
		int total=0;
		for (int i=1;i<=10;i++)
		{
			total = total + i;
		}
		System.out.println("(for)1~10의 합은 : " + total);
		
		//do while
		int j = 1, hap = 0;
		
		do 
		{
			hap = hap + j;
			j += 1;
		}while (j<=10);
		
		System.out.println("(do while)1~10의 합은 : " + hap);
	}

}
