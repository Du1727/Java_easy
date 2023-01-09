package ch06;


/*static 필드 및 메소드는 클래스명.필드 or 메소드 일때
 * 메모리 로딩이 되지만 non-static 필드 및 메소드는
 * 반드시 객체를 생성해야 메모리 로딩된다.
 * 그래서 non-static 필드 및 메소드는 static 필드 및 메소드에
 * 사용 할 수 없다.
 * */


// 일반필드는 반드시 객체를 만들어야함


public class StaticEx2 {
	
		static int a = 10; 
		int b = 10; // non-static
		
		static void prn1() {
			System.out.println(a);
			//static메소드에는 non-static사용불가
			//System.out.println(b);  
		}
		
		//객체 생성해야 만들어지는 ?? 기때문에  ??사용이 가능하다
		static void prn2() {
			System.out.println(a);
			//System.out.println(b);
		}
		
		
		//1000단위 ,가 (기능)이 목적이지 함수 생성이 목적이 아니잖아 ~ 그런게static
		
		public static void main(String[] args) {
			StaticEx2 st = new StaticEx2();
			st.prn1();   //이거는 객체생성안하고도 사용할 수 잇는데 왜 생성했니 ~ 조언 정도 ?!//누워잇어  - 그러면 static변수, static함수다 ~
			
			
			prn1();
			/*객체생성해서 사용하면 다 접근이 가능해.
			하지만 class.해서 접근할 경우에는 static만 가능하단 말이야*/
		}
		
	
}
