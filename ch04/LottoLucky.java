package ch04;

import java.util.Arrays;
import java.util.Iterator;

public class LottoLucky {
	public static void main(String[] args) {
		int lotto[] = getLotto();
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
		
	}
	
	public static int[] getLotto(){
		int lotto[] = new int[6];
		//배열 및에 항상 for문 있다.
		//중복로직 추가
		for (int i = 0; i < lotto.length; i++) {
		
		//	System.out.println(i + " 번째 배열 " );
			
			lotto[i] = (int)(Math.random()*45)+1;
			
			if( i >0) {
				for (int j = 1; j <= i; j++) {
					if(lotto[i] == lotto[i-1] ) {
						//		System.out.println("중복되었습니다. 다시뽑습니다.");
								i--;
								continue; 
					}
				}	
			}
			
	//		System.out.println(" 뽑았다! : " + lotto[i] );
			
			
			
			
		} 
		
		
		
		
		
		Arrays.sort(lotto); //오름차순 정렬
		
		return lotto;
		
		
	}

}
