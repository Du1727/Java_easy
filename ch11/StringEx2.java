package ch11;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "Java Programming";
		
		int len = str.length();
		System.out.println("len : " + len);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str2 = str.substring(5);
		String str3 = str.substring(5, 10);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		//.charAt(8)
		char c1 = str.charAt(8);
		System.out.println("8번째 문자 : " +c1);
		
		//짝수자리 문자만 출력하세요.
		for( int i =0; i <str.length(); i++) {
			if ( i%2 == 0) System.out.println(str.charAt(i));
		}
		
		
		// indexOf   /   lastIndexOf
		// a 문자는 몇번쨰 자리에 있는가?
		// Java Programming
		int idx1 = str.indexOf('a');
		System.out.println("\n" + "idx1 : " + idx1);
		int idx2 = str.lastIndexOf('a');
		System.out.println("idx2 : " + idx2);
		
		
		// a를 q로 변환 출력하시오  : charAt , ?
		System.out.println(str.replace('a','q'));
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				System.out.print('q');
			}else {
				System.out.print(str.charAt(i));
			}
		}
		
		
		System.out.println("\n********************");
		// str을 반대로 출력 : chatAt, ?
		
		// 1) StringBuffer클래스 사용
		StringBuffer sb = new StringBuffer(str);
		str = sb.reverse().toString();
		System.out.println(str);
				
		
		// 2) for문 돌려서 사용
		String rv = "";
		for(int i = (str.length() -1) ; i >= 0 ; i--) {
			rv += str.charAt(i);
		}
		System.out.println(rv);
		
		
		
		
		String str5 = "Java&JSP&Android&IoT&Spring";
		//* 자르긴 하는데, 의미있는 단위로 자르는게 토큰
		String str6[] = str5.split("&");
		
		for(int i = 0; i<str6.length; i++) {
			System.out.println(str6[i]);
		}
		
		String str7 = "                    JSPStudy              ";
		System.out.println("***" + str7.trim() + "***");
		int idx3 = 22;  // 정수를 문자로 변환
		String str8 = String.valueOf(idx3);  // valueOf는 static메서드
		String str9 = idx3+"";  //꼼수... ! 이렇게 해도 문자로 변환 됨 ,, ! 
		
	}
}
