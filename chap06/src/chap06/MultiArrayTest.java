/**
 * 2023/04/11
 * 박연수
 * 2차원 배열의 값은 난수로 초기화
 * 2치원 배열의 각 행의 합계 출력
 */
package chap06;

import java.util.Random;
public class MultiArrayTest {

	public static void main(String[] args) {
		Random ran = new Random();	// 난수 발생
		int[][] score = new int [4][4];	// 2차원 배열 생성
		
		for (int i = 0 ; i < 4 ; i++)	// 행 
			for (int j = 0 ; j < 4 ; j++)	// 열
				score[i][j] = ran.nextInt(10);	// 0~9사이의 난수 발생
		
		for (int k = 0 ; k < 4 ; k++)	// 행
		{
			int sum = 0;
			for (int value : score[k])
			{
				System.out.print(value + " ");
				sum += value;	// 행의 합계
			}
			System.out.println("배열 요소의 합은 : " + sum);	// 행의 합계 출력
		}
		
		
	}

}
