package ch03;

public class Ex5 {

	public static void main(String[] args) {
		
		// 삼항연산자 : 잘쓰면 코드를 씸플하게 사용가능 ! return되는 값을 내가 정할 수 있음!
		int c = 10;
		String s = (c%2 == 0)?"짝수":"홀수";
	
		
		int b = (c>0) ?  c: -c; //절댓값 구하는 식 ! 
		Math.abs(10);
	}

}
