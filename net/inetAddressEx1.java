package net;

import java.net.Inet4Address;
import java.net.InetAddress;

public class inetAddressEx1 {

	
	
	/* ��Ʈ��ũ ���� ~~~  */
	public static void main(String[] args) {
		try {
			// ip �� ������ ��üȭ  >> �� �����κ� ip�ּ� �޾ƿ��� !! 
			InetAddress add = /* new��� �̷��Ե� ���� ���� */ InetAddress.getLocalHost();  
			System.out.println("Host Name : " + add.getHostName());
			System.out.println("Host Address : " + add.getHostAddress());
			
			add = InetAddress.getByName("auction.co.kr");
			System.out.println("auction address : " + add.getHostAddress());
			InetAddress adds[] = InetAddress.getAllByName("naver.com");
			for (int i = 0; i < adds.length; i++) {
				System.out.println("naver : " + adds[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
