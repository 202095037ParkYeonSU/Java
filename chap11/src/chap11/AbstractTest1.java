/**
 * 추상클래스
 *  1. 공통부분을 추출 후 추상 클래스 작성
 *  2. 무엇인지만 정의, 어떻게는 하위 클래스에서 정의
 *  3. 추상메소드 - 추상 클래스 내에 정의 /선언만 있고 구현은 없음.
 *  4. 추상클래스는 객체 생성 안됨. /구현부분이 없는 메소드이기 떄문
 */
package chap11;

abstract class Shape1{
	abstract void draw();
	abstract void computerArea(double a, double b);
}

class Rectangle extends Shape1{
	void draw() {
		System.out.println("사각형 그리기");
	}
	void computerArea(double a, double b) {
		System.out.println("사각형의 넓이 : " + (a * b));
	}
}

class Triangle extends Shape1{
	void draw() {
		System.out.println("삼각형 그리기");
	}
	void computerArea(double a, double h) {
		System.out.println("삼각형의 넓이 : " + (a * h /2));
	}
}

public class AbstractTest1 {

	public static void main(String[] args) {
		System.out.println("추상 메소드 이용한 다형성");
		
		Shape1 s = new Rectangle();	// upcasting
		s.draw();	// Rectangle의 draw 호출
		s.computerArea(5.0, 10.0);
		
		s = new Triangle();
		s.draw();
		s.computerArea(5.0, 10.0);

	}

}
