package ch11;





public class StringEx3 {
	public static void main(String[] args) {
		String str = "전지현이가 백화점에서 팬사인회를 연다."
					  + "전지현은 5일 오후 3시 서울 소공동 롯데 백화점"
					  + " 8층 이벤트홀에서... 구두 브랜드 조이제화의" 
					  + " 홍보를 위한 팬사인회에 참석한다.";
		
		
		
		/*1번.순방향으로 공백문자의 index번호를 출력하시오.
		5, 11,......87, : hint : indexOf을 사용한다.*/
		
		int a ; 
		for(int i = 0; i <= str.length(); i++) {
			a= str.indexOf(' ', i);

			if( a < 0) break;
			System.out.print(a + " ");
			i = a;
 
			
		}
		
		
		System.out.println(" ");
		
		/*2번.역방향으로 공백문자의 index번호를 출력하시오.
		87, 81, 78,....5,  : hint : lastIndexOf을 사용한다.*/
		
		int b ;
		int i = str.length();
		
		while(true) {
			b = str.lastIndexOf(' ', i);

			if ( b < 0 )break;
			System.out.print(b + " ");
			i = --b;

		}
		
		
		
		System.out.println("\n");
		
		
		
		/*3번.빈칸을 '_' 출력하시오. hint:charAt*/
		
		System.out.println(str.replace(' ', '_'));
		
		
		/*4번 첫단어 출력하기 : substring, indexOf*/
		String str1 = str.substring(0, str.indexOf(' '));
		
		System.out.println(str1);
		
		
		/*5번 마지막단어 출력하기 : substring, lastIndexOf*/
		
		
		System.out.println(str.substring(str.lastIndexOf(' ')+1, str.length()));
		
	}
}
