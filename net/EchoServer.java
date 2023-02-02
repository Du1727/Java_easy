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
			int cnt = 0;//Client ���� ����
			ServerSocket server  = new ServerSocket(PORT);
			System.out.println("EchoServer Start.......");
			while(true) {
				System.out.println("����Ŭ���� - ������ ���� 1");
				//Client�� ���� �Ҷ����� ��� ����
				Socket sock = server.accept(); // ���⼭ ��� ���...
				System.out.println("����Ŭ���� - ������ 2");
				EchoThread et = new EchoThread(sock);
				System.out.println("����Ŭ���� - ������ 3");
				et.start();
				System.out.println("����Ŭ���� - ������ 4");
				cnt++;
				System.out.println("Client " + cnt + " Socket");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("������ �� !");
	}
	
	//Client�� ���� ���� �ϱ� ���� Thread ��� ���� Ŭ���� ����
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
			System.out.println("���� run�޼��� ȣ��!");
			try {
				//Client�� �����ϸ� ó������ �޴� �޼���
				out.println("Hello Enter BYB to exit");
				while(true) {
					System.out.println("run() - while����");
					//Client�� �޼��� ���������� ���
					String line = in.readLine();
					System.out.println("line : " + line);
					if(line == null) {
						System.out.println("line - null�̾� ! ");
						break;
					}else{
						System.out.println("*"+line+"*");
						out.println("Echo : " + line);
						if(line.equalsIgnoreCase("BYB")) {
							System.out.println("BYB���Ծ� ! ");
							break;
						}
							
					}
				}//while
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("run�޼��� �� !");
		}
	}
	
	
	public static void main(String[] args) {
		EchoServer server = new EchoServer();
	}
}






