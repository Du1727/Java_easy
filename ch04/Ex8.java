package ch04;

public class Ex8 {
	public static void main(String[] args) {
		
		int sum = 0; 

		//문제1. 1~30사이의 값중에 3의 배수의 합을 구하시오.
		for (int i = 1 ; i <=30 ; i++) {
			if(i%3 ==0) {
				sum += i;
			}
		}
		System.out.println("result 1 : " + sum);
		
		int sum_j=0, sum_h=0;
		//문제2. 1~30사이의 값중에 짝수와 홀수의 합을 각각 구하시오.
		for (int i = 1 ; i <=30 ; i++) {
			if(i%2 == 0) {
				sum_j += i;
			}else {
				sum_h += i;
			}
		}
		
		System.out.println("result 2 짝수 : " + sum_j);
		System.out.println("result 2 홀수 : " + sum_h);
		
		
		/*문제3. 1~50사이의 3,6,9의 합은?
		Hint : %와 /를 사용. 33/10 => 3
		sum : 627*/
		
		int game_sum=0;
		for (int i = 1 ; i <=50 ; i++) {
			if((i%10)%3==0 && i%10 !=0)  game_sum += i;
			else if(i/10 ==3)	 game_sum += i;
			
		}
		
		System.out.println("result 3 : " + game_sum);
		
	}
}
