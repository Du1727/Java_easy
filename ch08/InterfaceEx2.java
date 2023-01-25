package ch08;

interface Interface2{
	
	//int a; // 인터페이스 클래스내에서.. 하늘색 누워있는 애는 자동 상수화됨
	int a = 10; 
	 
	//void prn() {}  //일반 메서드는 선언 불가(구현 불가, 선언만 !)
	void prn(); 
		
	
}


// 인터페이스끼리 상속 가능 
interface Interface2_1 extends Interface2{
	void prn1();
}


class MyClass3 implements Interface2_1{

	@Override
	public void prn() {
	}

	@Override
	public void prn1() {
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		
	}
}
