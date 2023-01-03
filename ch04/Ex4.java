package ch04;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Month를 입력하세요.");
			int m = sc.nextInt();
	
			
			switch(m) {
			case 12:  
			case 1:
			case 2: 
				System.out.println("겨울입니다.");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을입니다.");
				break;
				
				default : System.out.println("해당하는 계절이 없습니다.");
			}
								
		}
	}
}
