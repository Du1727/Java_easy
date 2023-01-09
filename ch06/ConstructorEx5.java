package ch06;

class Constructor5{
	
	int a; 
	String str;
	
	public Constructor5() {
		/* 
		 * 중복된 기능 
		 * */
	}

	public Constructor5(int i) {
		a = 1;
		
		/* 
		 * 중복된 기능 
		 * */
	}
	
	public Constructor5(String s) {
		/* 
		 * 중복된 기능 
		 * */
	}

}

class Constructor5_1{
	int a;
	String str;
	
	public Constructor5_1() {
		super();
		/* 
		 * 중복된 기능은 여기에 !!! 
		 * */
	}
	public Constructor5_1(int i) {
		//super();
		this(); // 본인 디폴트 생성자로 가라 ! 
		a=i;
	}
	public Constructor5_1(String s) {
		this();
		str=s;
	}
}


public class ConstructorEx5 {
	public static void main(String[] args) {
		
	}
}
