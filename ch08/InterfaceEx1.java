package ch08;

interface Calc{
	void plus(int a, int b); // 인터페이스는 .. 이렇게 쓴게 바로 자동 추상메서드가 됨 .
}

class Function implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

class Graphics implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		
	}
}
