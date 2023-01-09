package ch06;

/*
Static : 필드, 메소드, 클래스(부분)

static 필드 및 메소드는 객체를 생성하지 않아도 사용가능.
사용시점 : 클래스이름으로 접근하기 때문에 그때 메모리에 로딩.  <- 설명하면서 한번만 더 설명해달라..

class .   점 하면 그때 메모리에서 로드해서 가져옴

객체생성 없이 사용할수 있는
객체생성 없이도 사용할수 있는게 static인가?

 
 .... static강의 찾아서 들어야겠다...
 
*/


//static class Static1{ //외부 클래스에 static쓰면 에러남
class Static1{
	static int i = 0;
	int j = 0;
	
	static void prn() {}
	void prn2() {}
	
	static class Inner{}  //내부 클래스 앞에는 static 올 수 있음
}

public class StaticEx1 {
	public static void main(String[] args) {
		int a = Math.abs(-6);
		int b = (int)Math.round(3.14);
		
		Integer i = new Integer(22);
		int c = i.parseInt("23");	 // 살짝 누워있따 ?: static메소드  
		//노란색 권고알림 : 굳이 객체생성까지 하지말고.. 밑에처럼 쓸수있어 ~  
		int d = Integer.parseInt("23");
		// 노란색 : 선언해놓고 한번도 안썼네 ?! 알림 기능 
		
		
		//반지름이 5인 원의 넓이를 구하시오.
		System.out.println(5*5*Math.PI);//상수는 대문자로 표기하는게 일반적 , 누워잇다 ?static ?final이다 ~ 
		
	}
}
