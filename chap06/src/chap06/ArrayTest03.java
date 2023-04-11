/**
 * 2023/4/11
 * 박연수
 * 1차원 배열에서 입력받은 값 검색하기 (선형 검색)
 */
package chap06;

import java.util.Scanner;
public class ArrayTest03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int inum[] = {8, 7, 3, 6, 8, 7, 0, 4, 1, 2};
		
		System.out.print("찾기 원하는 숫자 입력 : ");
		int key = stdin.nextInt();
		int cnt = 0;	// 동일한 데이터의 갯수
		
		for (int i = 0; i < inum.length; i++) 
		{
			if (inum[i] == key)
			{
				cnt++;
				System.out.println((i+1) + "번째");
			}
		}
		
		if (cnt == 0)
			System.out.println(key + "와 같은값 없음.");
		else
			System.out.println(key + cnt + "개 있음.");
		
	}

}
