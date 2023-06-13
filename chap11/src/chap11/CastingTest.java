package chap11;

class Parent{
	public void method1() {
		System.out.println("Parent-method1()");
	}
	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("child-method2()");
	}
	public void method3() {
		System.out.println("child-method3()");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// 자동 타입 변환(업캐스팅)
		parent.method1();
		parent.method2();	// 재정의된 메서드 호출
		// parent.method3();  // 호출 불가능

	}

}
