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
		
		String aString = new String("a");
		String bString = new String("a");
		
		String cString = "b";
		String dString = "b";
		
		System.out.println(aString == bString);
		
		System.out.println(cString == dString);
	}
	
}

