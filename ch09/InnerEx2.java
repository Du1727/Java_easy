package ch09;

class Outer2{
	int a = 22; 
	
	void p() {
		System.out.println("a" + a);
	}
	
	//Outr클래스에서 Inner클래스를 메서드처럼 바라본다니...!
	class Inner2{
		int b = 23; 
		void p1() {
			p();
//			System.out.println("a+b = " + (a+b));
			System.out.println("a+b = " + a+b);
			// 내부클래스는 외부클래스 내에서만 일반적으로 사용을 하고 
			// 상당히 밀접한 관계가 있는 기능의 클래스로 선언
		}
		
	}  // --Inner

	
}

public class InnerEx2 {
	public static void main(String[] args) {
		
		// 일반적으로 내부클래스는 다른 클래스에서 생성하고 사용하는것은 거의 없음 but 문법적으로는 가능
		Outer2 aa = new Outer2();
		Outer2.Inner2 in = aa.new Inner2();
		in.p1();
		// Inner안에 메서드 어떻게 쓰지... 
		//그럼 Outer2에서는 어떻게 실행해...  ...>>> 해결 ! 
		
	}
}
