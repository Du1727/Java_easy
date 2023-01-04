package ch06;

class Car2{
	
	// 클래스 선언 >  필드 &메서드 > 객체생성(new 활용, 객체생성 목적 : 필드/메서드 사용하기 위해 )
	void stop() {
		speed = 0;
	}
	
	String name;
	int speed;
	int gear;
	
	
}


public class CarEx2 {
	public static void main(String[] args) {
		int a = 10; 
		int b = a + 10; 
		
		for(int i = 0; i < 100; i++) {
			Car2 c1 = new Car2();
//			System.out.println(c1.toString());//Car2객체 주소값 출력
		}
		
		// 요청된 소문자 > 대문자로 변경하여 출력 
		String s = new String("aksdjglkad");
		System.out.println(s.toUpperCase());
		//32라는 10진수를 2진수로 출력하세요. 
		//hint// Integer : 정수를 객체화 시킨 클래스 - 모르면 API 찾아봐) 
		System.out.println(Integer.toBinaryString(32));
		
		Integer i = new Integer(32);  //줄쳐진것 : Deprecated (이제 권장하지 않는다)
		String str = i.toBinaryString(32);
		System.out.println(str);
	}
}
