package ch11;

import java.util.Scanner;

public class PalindromeEx1 {

	static final int MAX = 100000;
	static int nLen, nB, nA, n, sum = 0;
	static String nStr;
	static boolean chk;
	
	
	//숫자 100,000이하의 숫자중 대칭수 구하기
	static int Calc(int Q) {
		for(n = 1 ; n <= MAX; n++) {
			if		 ( Q == 1 )	sum += equal_chk(1, n);
			else if ( Q == 2)	sum += equal_chk(2, n);
			else if ( Q == 3) if((equal_chk(1, n) > 0) && (equal_chk(2, n) >0))  sum += n;
		}
		return sum;
	}
	
	
	// 대칭여부 확인
	static int equal_chk(int type, int n) {
			// 진수 변환 & 숫자-> 문자열 변환 
			if		 (type == 1)	 nStr = Integer.toString(n);
			else if (type == 2)	 nStr = Integer.toBinaryString(n);
			
			nLen = nStr.length(); // 숫자 자릿수 구하기
			
			if ( nLen % 2 == 0) { //짝수면 ~ 
				nB = nLen/2;  //뒤에를 기준으로 앞을 검사
				nA = nB -1; 
			}
			else { //홀수면 ~
				int mid = nLen/2;
				if(mid == 0) return n; // 한자리수일경우, 대칭처리
				nA  =  mid - 1;
				nB  =  mid + 1;
			}
			
			// 숫자 대칭여부 확인
			while(true){
				if(nA < 0) break;
				if(nStr.charAt(nA) == nStr.charAt(nB)) {
					chk = true;
					nA--;
					nB++;
				}
				else {
					chk = false;
					break;
				}
			}
			
			if (chk == true) return n;
			else return 0;
			
		}
	
	
		
	public static void main(String[] args) {

		while(true) {
			System.out.println("문제 유형을 고르시오. (Q1 : 1 / Q2 : 2 / Q3 : 3)");
			Scanner sc = new Scanner(System.in);
			int num_type = sc.nextInt();
			
			if	     (num_type == 1) System.out.println("Q1 : " + Calc(1));
			else if(num_type == 2)  System.out.println("Q2 : " + Calc(2));
			else if(num_type == 3)  System.out.println("Q3 : " + Calc(3));
			else System.out.println("문제 유형을 고르시오. (Q1 : 1 / Q2 : 2 / Q3 : 3)");
			
			sum = 0;  //합계 초기화
			
		}
			
	}

}
