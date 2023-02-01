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
//			System.out.println("ref : " + url.getRef());			// 스크롤압박 잇을때.. 밑에화면에 포커스 하고싶을때 div설정해주면됨
//					//로그인 성공과 동시에 , 해당 url(이정도 div로 바로 이동해줘 !)
//			url = new URL("https://naver.com");
//			
//			
//			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")); //?? 예 먼말?
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
		System.out.println("ref : " + url.getRef());			// 스크롤압박 잇을때.. 밑에화면에 포커스 하고싶을때 div설정해주면됨
			//로그인 성공과 동시에 , 해당 url(이정도 div로 바로 이동해줘 !)
		url = new URL("https://action.co.kr");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")); //?? 예 먼말?
		
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
