package ch14;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		String dir = "C:/Windows";
		File fdir = new File(dir);	// 파일... ? 만듬
		if(fdir.isDirectory()) {
			System.out.println("검색 디렉토리 %s\n" + dir);
			System.out.println("=================");
			String list[] = fdir.list();
			for (int i = 0; i < list.length; i++) {
//				System.out.println(list[i]);
				File f = new File(dir+File.separator + list[i]);
				if(f.isDirectory()) {
					System.out.println("[" + list[i] + "]");
				}else {
					System.out.println(list[i]);
					
				}
			}
		}else {
			System.out.printf("지정한 %s는 디렉토리가 아닙니다.", dir);
		}
	}
}
