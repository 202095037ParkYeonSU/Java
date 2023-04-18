/**
 * 2023/04/18
 * 박연수
 * null과 NullPointException
 * 참조변수의 ==연산과 equals()메소드
 */
package chap06test;

public class ArrayReference1 {

	public static void main(String[] args) {
//		int[] intArray = null;
//		intArray[0]=10;  // 참조 객체 없으므로 NullPointException
		
		String strVal1 = "java";
		String strVal2 = "java";
		
		if (strVal1 == strVal2)
			System.out.println("strVal1과 strVal2는 같은 참조입니다.");
		else
			System.out.println("strVal1과 strVal2는 다른 참조입니다.");
		
		if (strVal1.equals(strVal2))
			System.out.println("strVal1과 strVal2는 같은 객체입니다.");
		
		String strVal3 = new String("pys");
		String strVal4 = new String("pys");
		
		if (strVal3==strVal4) 
			System.out.println("strVal3과 strVal4는 같은 참조입니다.");
		else
			System.out.println("strVal3과 strVal4는 다른 참조입니다.");

		if (strVal3.equals(strVal4))
			System.out.println("strVal1과 strVal2는 같은 객체입니다.");
	}

}
