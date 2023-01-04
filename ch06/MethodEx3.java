package ch06;

class Method3{
	void prn(int... arr/* 배열로 인식한다 */) {		 //가변인수로 만든 함수
		for (int i = 0; i < arr.length; i++) { 	 // ( 기능이 있기는 하지만 잘 쓰지는 않음 )
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}


public class MethodEx3 {
	public static void main(String[] args) {
		Method3 mt = new Method3();
		mt.prn(1);
		mt.prn(1,2);
		mt.prn(1,2,3);
		mt.prn(1,2,3,4,5);
		mt.prn(1,2,3,4,5,6,7,8,9);
		System.out.printf("%s","하하");  // printf : 가변인수 기능 함수 
	}
}
