package ch06;
//package com.naver.utile;

// 클래스 선언 :클래스 풀네임 : ch06.Car1.class
// 클래스 : 객체를 만드는 틀 (붕어빵 틀)
class Car1/* 클래스명 */{
	
	// 필드(변수선언) : 객체의 속성 <- 절대로 ()는 없다 ! 
	String carName;  
	int velocity;
	String carColor;
	
	
	
	// 메서드 : 객체의 기능 <- 반드시 ()가 있다 !! ()없는 메서드가 없다 !! ()가 있다 ? == 메서드다 ~~~
	// 반복적으로 하는거를 메서드화 시키면 편함
	void speedUp() /* <- 여기까지 메서드의 선언부 */    /* {}사이는 메서드의 구현부 -> */ {
		velocity++;
	}
	
	void speedDown() {
		velocity--;
		if(velocity<0) 
			velocity = 0;
	}
	
	void stop() {
		velocity = 0;
		
	}
	
} // --class










// .java로 선언된 클래스만 public 사용가능
public class CarEx1 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println(arr.length);  //변수
		String str = "오늘의 메뉴는 수구레";  // new 없이 생성가능한 only 1 클래스 String클래스
		System.out.println(str.length()); //메서드
		
		//객체 생성
		Car1 c1 ; //선언만 ! 애는 아직 안태어났어.. 이름은 미리 지어놓을 수 있잖아? car1클래스를 c1이라고 이름을 정해놨어.. 
		c1 = new Car1();  //new가 중요해 ! new : 예약어 / 객체를 생성시켜주는 키워드 (new갯수만큼 객체를 생성시켜줌)  
		//만들어진 객체는 c1에 저장 .. (new Car1();만도 실행 가능함)
		// c1은 메모리에 생성된 객체를 가리킴 (참조변수)
		c1.carName = "소나타";
		c1.carColor = "은색";
		c1.speedUp();
		
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
		
	}
}
