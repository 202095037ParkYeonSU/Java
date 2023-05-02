package chap08;

public class Car1 {
	// 필드
	String company = "쉐보레";
	String model;	// null
	String color;	// null
	int maxSpeed;	// 0
	
	// 생성자 1
	public Car1() {
		
	}
	
	// 생성자 2
	public Car1(String model) {
		this.model=model;
	}
	
	// 생성자 3
	public Car1(String model, String color) {
		this.model=model;
		this.color=color;
	}
	
	// 생성자 4
	public Car1(String model, String color, int maxSpeed) {
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

}
