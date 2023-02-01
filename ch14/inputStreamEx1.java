package ch14;

import java.io.IOException;
import java.io.InputStream;

public class inputStreamEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;  // 얘는 키보드야 !
		while(true) {
			try {
				int a = is.read();						// 내부적인 쓰레드에서.. 입력전 대기상태 ! 로 되어잇음 지금
				if (a == -1 /* ctrl+Z */) break;
				System.out.print((char)a);	// 아스키코드(숫자)를 -> 문자형으로 바꿔서 출력 ! 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
