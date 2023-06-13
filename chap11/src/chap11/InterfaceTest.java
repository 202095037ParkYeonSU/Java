/**
 * 인터페이스
 * 1. 상수와 메소드 선언들만을 가진 클래스로 정의
 * 2. 다중상속 흉내//객체 생성 안됨
 * 3. 현재 클래스가 이미 다른 클래스로부터 상속을 받고있는 상황이면서, 
 *    또 다른 클래스의 요소들이 필요할때 사용
 * 4. 인터페이스는 다중상속 허용
 * 5. 다중 상속된 인터페이스를 포함하는 클래스는 다중 상속된 모든 인터페이스에서 선언된 
 *    모든 메소드를 오버라이딩 해야한다.
 * 6. 인터페이스의 장점
 *   - 클래스가 일관된 사용방법을 가질 수 있다.
 */
package chap11;

interface PhoneInterface{
	final int TIMEOUT = 10000;//상수필드
	void sendCall();//추상메소드
	default void printLogo() {
		System.out.println("**phone**");
	}// default 메소드
}

interface MobilePhone extends PhoneInterface {//인터페이스 상속
	void sendSMS();
	void receiveSMS();
}

interface MP3 {//인터페이스 선언
	public void play();
	public void stop();
}

class PDA{//클래스 선언
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhone, MP3{
	@Override
	public void sendCall() {
		System.out.println("ring~ ring~");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("texting");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("receive text");
	}
	
	// mp3의 추상메소드 구현
	@Override 
	public void play() {
		System.out.println("play music");
	}
	
	@Override
	public void stop() {
		System.out.println("stop music");
	}
	
	// 추가로 작성한 메소드
	public void schedule() {
		System.out.println("schedule management");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3 + 5 = " + phone.calculate(3, 5));
		phone.schedule();
		
	}

}
