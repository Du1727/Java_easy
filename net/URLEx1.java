package net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx1 {

	public static void main(String[] args) {
//		String str = "https://search.naver.com:80/search.naver?"
//						+ "where=nexearch&sm=top_hty&fbm=1&ie=utf8&"
//						+ "query=java#top";
//		
//		try {
//			URL url =  new URL(str);
//			System.out.println("Protocol : " + url.getProtocol());
//			System.out.println("Host : " + url.getHost());
//			System.out.println("Port : " + url.getPort());
//			System.out.println("Path : " + url.getPath());
//			System.out.println("Query : " + url.getQuery());
//			System.out.println("Filename : " + url.getFile());
//			System.out.println("ref : " + url.getRef());			// ��ũ�Ѿй� ������.. �ؿ�ȭ�鿡 ��Ŀ�� �ϰ������ div�������ָ��
//					//�α��� ������ ���ÿ� , �ش� url(������ div�� �ٷ� �̵����� !)
//			url = new URL("https://naver.com");
//			
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")); //?? �� �ո�?
//			
//			String line = "";
//			
//			while(true) {
//				line = br.readLine();
//				if(line == null) break;
//				System.out.println(line);
//					
//				br.close();
//				System.out.println("END~~~~~~");
//	
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		String str = "https://search.naver.com:80/search.naver?"
		+ "where=nexearch&sm=top_hty&fbm=1&ie=utf8&"
		+ "query=java#top";
		
		try {
		URL url =  new URL(str);
		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("Host : " + url.getHost());
		System.out.println("Port : " + url.getPort());
		System.out.println("Path : " + url.getPath());
		System.out.println("Query : " + url.getQuery());
		System.out.println("Filename : " + url.getFile());
		System.out.println("ref : " + url.getRef());			// ��ũ�Ѿй� ������.. �ؿ�ȭ�鿡 ��Ŀ�� �ϰ������ div�������ָ��
			//�α��� ������ ���ÿ� , �ش� url(������ div�� �ٷ� �̵����� !)
		url = new URL("https://action.co.kr");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")); //?? �� �ո�?
		
		String line = "";
		
		while(true) {
		line = br.readLine();
		if(line == null) break;
		System.out.println(line);
			
		br.close();
		System.out.println("END~~~~~~");
		
		}
		
		
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
		
		
	}
}
