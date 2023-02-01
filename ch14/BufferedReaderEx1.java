package ch14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {

	public static void main(String[] args) {
		
		// 데이터를 읽어와서.. 번역기(리더)에게 전달해주고..
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
		
		
		// 버퍼 (완충제)에다가 그거를 넣어서 완충시키고.. 
//		BufferedReader br = new BufferedReader(isr);
		
		//무슨 완충역할을 한다는 거지...?  - 보관하고 있다가.. 뱉어준다는 건가..?
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String s = "";
		while(true) {
			try {
				s = br.readLine();
				System.out.println("출력 : " + s);
			} catch (Exception e) {
				
			}
		}
	}
}
