/**
 * 2023/04/18
 * 박연수
 * 열거타입 Week이용하려면 날짜 정보 필요
 * 컴퓨터의 날짜, 요일, 시간을 얻기 위해 Calendar 클래스 필요
 * Calendar.getInstance() Calendar 객체 얻기
 * 
 * today는 스택 영역에 생성, Week 객체는 힙 영역에 생성,
 *  Week.Sunday는 메소드 영역에 생성
 *  
 * today에 저장되는 값은 Week.SUNDAY 열거 상수가 참조하는 객체 번지
 * Week.SUNDAY 와 today 변수는 서로 같은 Week 객체 참조
 * 
 */
package chap06test;

import java.util.Calendar;
import chap06test.EnumWeek.Week;
public class EnumWeek2 {
	
	public static void main(String[] args) {
		Week today = null;	// 열거 타입 변수 생성
		
		Calendar cal = Calendar.getInstance();	// Calendar 객체 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 일(1) ~ 토(7)까지 숫자 리턴
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;	// 열거 상수 대입
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;	
			break;
		case 6:
			today = Week.FRIDAY;	
			break;
		case 7:
			today = Week.SATURDAY;	
			break;
		
		}

		System.out.println("오늘은 " + today);
		
		if (today == Week.SUNDAY)
			System.out.print("일요일에는 휴식");
		else
			System.out.print("java");
		
	}

}
