package ch14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx3 {
	public static void main(String[] args) {
		copyFileByStream("ch14/aaa.pdf", "ch14/aaa.pptx");
	}
	
	
	public static void copyFileByStream(String sourcePath, String targetPath) {   //ppt나 .. pdf파일을 스트림으로 짤라서 .. 보내고.. 받고.. 할건가보네   
		File source = new File(sourcePath);		//소스경로에 있는 파일을..
		File target = new File(targetPath);		   // 타겟(목적) 경로를... 
		
		
		if(!source.exists()) {  // 소스에 존재하면 true -> !true == false     ===> 소스에 존재하지 않으면 !false == true  = >  소스에 존재하지 않으면 아래 코드 실행 ! 
			return; 
		}
		
		if(!target.getParentFile().exists()) {  // 타겟에 . 부모파일을.. 존재하면 {
			target.getAbsoluteFile().mkdirs();   // 타겟에. 절대경로가. mkdirs(실행!)

		}
		
		try {
			InputStream is  = new FileInputStream(source);		  // 파일을 받아오는 애를 실행!  (소스를 받아올거야 ~)
			OutputStream os = new FileOutputStream(target);		// 파일을 내보내는 애를 실행 !   (타겟을 받아올거야 ~)
			int temp = 0; 				
			byte[] data = new byte[1024];			  //데이터를 바이트 코드로 읽어올건가 ?! 아 ,, 스트림으로 보낼꺼니까.. 스트림은 1byte밖에 안되니, 바이트로 받을건가 보네. 
			while ((temp = is.read(data)) != -1) {   // data를 읽어라 !  > 결과값 temp에 저장 ~   > read(실행!) 잘 되면 0 반환, 실패하면 -1 반환   ==> temp != -1  :: 실행한 결과가 -1이 아니면 ~ 반복문 돌림 !  
				os.write(data, 0, temp);	// 파일 output 해주는 os에.. 
				
			}
			os.close();
			is.close();
			System.out.println("Copy End ~~");
		} catch (Exception e) {

		}
	}
}



