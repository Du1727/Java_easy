package CodingTest;

import java.util.Arrays;

class Solution {
	
	public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if( s1[i].equals(s2[j]) ) answer++;
			}
		}
        return answer;
    
	
	
	
	}

	
	
	
	
	public static void main(String[] args) {
		
		int a1 ;
		int a2 ;
		int a3 ;
		
		int num ;
		int target = 999;
		
		a1 = target/5;
		a2 = target%5/3;
		a3 = target%5%3/1;
		
		num = a1+a2+a3;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(num);
		
	}
	
}

