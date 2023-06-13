package chap11;

class A {}

class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromationExample {

	public static void main(String[] args) {
		B b = new B ();
		C c = new C ();
		D d = new D ();
		E e = new E ();
		
		// 상위 클래스 객체 변수에 하위 클래스에서 생성된 객체 배정 허용
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속관계 아니므로 컴파일 에러
		// B b1 = e;
		// C c2 = d;
		

	}

}
