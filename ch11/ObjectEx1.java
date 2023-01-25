package ch11;

import  java.lang.*;  //생략 되어 있음,,, !! Object의 패키지... 


class Point{}

public class ObjectEx1 {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println("클래스이름 : " + p.getClass());
		System.out.println("해쉬코드 : " + p.hashCode());  //메모리 주소값 
		System.out.println("객체문자열 : " + p.toString());
		System.out.println("객체문자열 : " + p);  // toString()은 생략가능 (p출력하면 자동으로 toString 사용해서 출력해줌! ) 
	
		Point p1 = new Point();
		System.out.println("클래스 이름 : " + p1.getClass());
		System.out.println("해쉬코드 : " + p1.hashCode());  //메모리 주소값 
		System.out.println("객체문자열 : " + p1.toString());
		
		
		String s  = new String("금요일");
		System.out.println("객체문자열 : " + s.toString());
	}
	
	
}
