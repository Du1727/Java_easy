package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

/********************  날짜 함수   ******************/

public class DateEx1 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		// 1970.01.01 ~ 초단위를 1/1000 해서 계산되어진 값 (type : Long)
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd - hh:mm:ss");
		String str = sdf.format(d);
		System.out.println(str);
	}
}
