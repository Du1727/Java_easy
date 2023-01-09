package ch06;

import java.awt.Frame;

// java.awt.Frame에 paramString의 결과값을 출력하시오. 


public class AccessEx5 extends Frame{
	
	AccessEx5(){
		MethodAAA();
		
	}
	
	public void MethodAAA() {
		String str = paramString();
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		new AccessEx5();
		
	}
	
	
	

}
