package ch04;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		//입력한 1~20 사이의 숫자 중에 3,6,9인지를 판단하세요.
		Scanner sc = new Scanner(System.in);
		
		
		
		int a = 0;
		
		while(a<=20)
		{
			System.out.println("숫자를 입력하세요.");
			a = sc.nextInt();
			if (a<=0) {
				
			}
			if(a<10) 
			{
				if(a%3==0) System.out.println("Clap");
				else 			 System.out.println(a);
			}
			else if (a<=20)
			{
				if((a-10)%3 ==0) System.out.println("Clap");
				else					 System.out.println(a);
			}else break;
						
		}	
		
		
	}
}
