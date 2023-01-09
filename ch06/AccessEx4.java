package ch06;

import ch06_1.Access3;


class Access4 extends Access3{
	int k = b + c;
	
	public Access4() {
		
		// 상속에서 
		
		int k = b + c;
		
		System.out.println(" k   : " + k);
		
		
	}
}



public class AccessEx4 extends Access3{
	public static void main(String[] args) {
		
		
		
		Access3 ac = new Access3();  //서로다른 패키지에 있는 클래스 사용할때 : import해줘야 함 
		
		int k = ac.b + ac.c;
		
		System.out.println(" k   : " + k);
		
		
		
		 
	}
	
	public static void aaa() {
		int k = b + c;
		
		System.out.println(" k   : " + k);
	}
}
