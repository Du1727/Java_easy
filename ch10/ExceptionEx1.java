package ch10;

public class ExceptionEx1 {
	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			System.out.println("a + b = " + (a+b));
			System.out.println("a - b = " + (a-b));
			System.out.println("a * b = " + (a*b));
			System.out.println("a / b = " + (a/b));
		} catch (Exception e) {
			System.err.println("0으로 나누면 안되요");
//			System.err.println(e.getMessage());
		}
		System.out.println("");
		System.out.println("성공 !");
		
		
	}
}
