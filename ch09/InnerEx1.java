package ch09;


/* 내부(중첩) 클래스
 * 1. 클래스 안에 선언.(활용도 100%)
 * 2. 클래스 안에 선언이지만, static클래스로 선언이 됨 (활용도는 거의 X)
 * 3. 메서드안에 클래스 선언(활용도 별로.. )
 * 4. [메서드안에 선언 & 선언과동시에 생성]익명클래스 (활용 : 100%)  
 * 
 *  굳이 만드는 이유 ? 
 *   > 
 *  */

interface MyInter{
	void prn();
}

//더부살이 클래스.. 셋방살이 클래스 
class Outer1{
	class Inner1{
		
	}
	
	//정적 클래스 : 객체생성없이 접근가능 ( static )
	static class Inner2{
		
	}
	
	// 메서드 안에 메서드 선언 불가 
	
	void prn() {
		class Inner3{
			
		}
		
		new MyInter() {  //선언과 동시에 객체 생성하자 ! 클래스 따로 만들면 지저분해져
			
			@Override
			public void prn() {
			}
		};
	}
	
}// 여기서 닫히잖아.. 밑에 클래스랑 독립적이야 -> .class가 만들어짐 


public class InnerEx1 {
	
	
	
	public static void main(String[] args) {

		
	}
}
