package ch10;

public class ExceptionEx6 {
	public static void main(String[] args) {
		try {
			excel3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void excel1() throws Exception{}
	public static void excel2() throws Exception {
		excel1();  // throws하는 메소드기 때문에, 얘도 던지거나, 아니면 얘가 받아서 처리해줘야함
	}
	public static void excel3() throws Exception {
		excel2();
	}
	
	
	
}
