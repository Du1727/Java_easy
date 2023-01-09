package ch06;

import common.util.StringUtil;

//public 쓰면 오류남 : 접근제어자 
class Static3{
	/* static필드는 동일한 클래스의 모든 객체가 공유의 목적으로 
	 * 하나만 메모리에 만들어진다. 
	 * */
	static int a; 
	int b; 
	
	
}

// static 인스턴스변수인 필드는 공유할 목적으로 only 하나만 만들어짐 
// 굉장히 응용해서 사용할 수 있는 기능 
public class StaticEx3 {
	public static void main(String[] args) {
		Static3 st1 = new Static3();
		Static3 st2 = new Static3();
		st1.b = 10; 
		st2.b = 20; 
		System.out.println(st1.b);
		System.out.println(st2.b);
		
		
		/////////////
		
		st1.a = 10;   // st1, st2는 의미가 없음   i 는 공간이 따로 만들어져 , 공유될거야 
		st2.a = 20; 
		System.out.println(st1.a);
		System.out.println(st2.a);
		
		
		String str = "1000000000000000000000";
		System.out.println(StringUtil.addComma(str));
	
	}
}
