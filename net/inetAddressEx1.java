package net;

import java.net.Inet4Address;
import java.net.InetAddress;

public class inetAddressEx1 {

	
	
	/* 네트워크 수업 ~~~  */
	public static void main(String[] args) {
		try {
			// ip 및 도메인 객체화  >> 각 도메인별 ip주소 받아오기 !! 
			InetAddress add = /* new대신 이렇게도 쓸수 있음 */ InetAddress.getLocalHost();  
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
