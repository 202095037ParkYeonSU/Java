package chap09.exam05;

import chap09.exam04.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1; // 불가 : default 다른 패키지 접근 불가
		//a.field3 = 1; // 불가 : private 접근 불가
		
		a.method1();
		//a.method2(); // 불가 : default 다른 패키지 접근 불가
		//a.method3(); // 불가 : private 접근 불가
	}
}
