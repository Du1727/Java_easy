package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("돼지국밥");
		list.add("순대국밥");
		list.add("섞어국밥");
		list.add("맛보기순대");
		list.set(3, "내장국밥");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------");
		
		Iterator<String> e = list.iterator();
		while (e.hasNext()) {
			System.out.println(e.next());
			
		}
	}
}
