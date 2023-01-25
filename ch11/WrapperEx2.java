package ch11;

public class WrapperEx2 {
	public static void main(String[] args) {
		char c1 = 'J';
		char c2 = 'a';
		char c3 = '2';
		char c4 = ' ';
		
		if(Character.isLetter(c1)) System.out.println("문자입니다.");
		
		if(Character.isUpperCase(c2)) System.out.println("대문자입니다.");
		else System.out.println("소문자입니다.");
		
//		if(Character.isUnicodeIdentifierPart(c3)) System.out.println("문자입니다.");
//		else System.out.println("숫자입니다.");
		
		if(Character.isDigit(c3)) System.out.println("문자입니다.");
		else System.out.println("숫자입니다.");
		
		

//		if(Character.isSpace(c4)) System.out.println("공백입니다.");
//		else System.out.println("공백이 아닙니다.");
		
		if(Character.isWhitespace(c4)) System.out.println("공백입니다.");
		else System.out.println("공백이 아닙니다.");
		
		
		
		// 이런 애들이 있음 ...~
		Long l; 
		Boolean b;
		Short s;
		Double d;
		Float f;
		Byte bt;
		Integer i;
		Character c;
		
		

		
		
	}
}
