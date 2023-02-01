package ch14;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) {
		int i = 'A';
		char c = 'b';
		char c1 = '공';
		
		
		try {
			OutputStream os = System.out;
			Writer writer = new OutputStreamWriter(os);  // 얘가 깨진 글자를 다시 번역해주네... 
			writer.write(i);
			writer.write(c);
			writer.write(c1);
			writer.flush();          // 스트림에 남아있는 data를 비운다. 
			writer.close(); 		// 사용하지 않는 스트림은 반드시 닫는다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
}
