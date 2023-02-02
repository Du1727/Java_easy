package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static final int PORT = 8000;
	
	public EchoServer() {
		try {
			int cnt = 0;//Client 접속 개수
			ServerSocket server  = new ServerSocket(PORT);
			System.out.println("EchoServer Start.......");
			while(true) {
				System.out.println("서버클래스 - 생성자 들어옴 1");
				//Client가 접속 할때까지 대기 상태
				Socket sock = server.accept(); // 여기서 계속 대기...
				System.out.println("서버클래스 - 생성자 2");
				EchoThread et = new EchoThread(sock);
				System.out.println("서버클래스 - 생성자 3");
				et.start();
				System.out.println("서버클래스 - 생성자 4");
				cnt++;
				System.out.println("Client " + cnt + " Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("생성자 끝 !");
	}
	
	//Client를 대응 관리 하기 위한 Thread 상속 내부 클래스 선언
	class EchoThread extends Thread{
		
		BufferedReader in;
		PrintWriter out;
		Socket sock;
		
		public EchoThread(Socket sock) {
			try {
				this.sock = sock;
				in = new BufferedReader(
						new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(sock.getOutputStream(),true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@Override
		public void run() {
			System.out.println("서버 run메서드 호출!");
			try {
				//Client가 접속하면 처음으로 받는 메세지
				out.println("Hello Enter BYB to exit");
				while(true) {
					System.out.println("run() - while들어옴");
					//Client가 메세지 보낼때까지 대기
					String line = in.readLine();
					System.out.println("line : " + line);
					if(line == null) {
						System.out.println("line - null이야 ! ");
						break;
					}else{
						System.out.println("*"+line+"*");
						out.println("Echo : " + line);
						if(line.equalsIgnoreCase("BYB")) {
							System.out.println("BYB들어왔어 ! ");
							break;
						}
							
					}
				}//while
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("run메서드 끝 !");
		}
	}
	
	
	public static void main(String[] args) {
		EchoServer server = new EchoServer();
	}
}






