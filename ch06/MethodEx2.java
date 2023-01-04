package ch06;

class Method2{
	
	
	// 메서드 오버로딩(Over loading)
	// 이름/기능은 동일한데, 매개변수의 갯수/타입을 다르게 선언
	// 동일한 메서드명으로 매개변수의 개수를 다르게 선언한다. 
	
	void prn(int a) {
		System.out.println(a);
	}
	
	void prn(int a, int b) {
		System.out.println(a + "\t"+ b);
	}
	
	void prn(int a, int b, int c) {
		System.out.println(a + "\t"+ b + "\t"+ c);
	}
	
	// 매개변수 4개는 어떡할꺼야? 
	void prn(int arr[]) { // case1. 배열로 받는 경우 .. 별로 사용을 추천하지는 않음. 쓰기 불편함
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
	}
	
}


public class MethodEx2 {
	public static void main(String[] args) {
	// Math클래스에 abs메소드는 절댓갓ㅂ 리턴
		int a= Math.abs(-10);  //Math클래스에 abs메소드 사용했다. // 메서드 오버로딩
  															     // (이름/기능은 똑같은데, 매개변수가 달라)
		double d = Math.abs(3.14);
		
		Method2 mt = new Method2();
		mt.prn(10);
		mt.prn(10, 20);
		mt.prn(10, 20, 30);
		// 여기까지 하면 매개변수 4개는 못써.. 
		
	}
}
