package ch07;

import java.awt.Component;

// 추상클래스
abstract class Abstract1{
	//추상메서드 (추상메서드는 구현은 해놓지 않음) 오버라이딩 강제성을 띄고있는게 추상메서드! 
	abstract void prn();
	
}


class Normal1 extends Abstract1{
	@Override
	void prn() {
	}
}

// 설명 : 
class MComponent extends Component{
	
}


public class AbstractEx1 {
	public static void main(String[] args) {
		Abstract1 a;
		a = new Normal1(); 
			
			
		
	}
}
