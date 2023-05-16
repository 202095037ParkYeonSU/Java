package chap09.exam03;

import chap09.A;

public class C {

	// 필드
	A a1 = new A(true); // 가능
	// A a2 = new A(1); // 불가능 - default 다른 패키지 접근 불가
	// A a3 = new A("문자열"); // 불가능 - private 다른 패키지 접근 불가
}
