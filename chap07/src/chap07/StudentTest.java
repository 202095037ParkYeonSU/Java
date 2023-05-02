package chap07;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();	// 객체 생성
		System.out.println("s1 변수가 Student 객체 참조");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체 참조");
		
		// s1 과 s2 는 서로 다른 객체
		// heap 영역에 2개의 Student 객체 생성됨

	}

}
