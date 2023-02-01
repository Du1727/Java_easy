package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);  		// 1byte 단위로 들어온 data를 문자단위로 변환
		
		while(true) {
			try {
				int a = reader.read();   //내부적인 쓰레드  :입력전에 대기	
				if (a == -1 /* ctrl+Z */) break;
				System.out.print((char)a);	// 아스키코드(숫자)를 -> 문자형으로 바꿔서 출력 ! 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End");
	}

}
