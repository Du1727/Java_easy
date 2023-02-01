package ch13;

import java.util.Vector;

public class VectorEx2 {
	public static void main(String[] args) {
		String str[] = {"노르웨이","스위스","뉴질랜드","덴마크","캐나다"};
		
		Vector vlist1 = new Vector();
		Vector<String> vlist2 = new Vector<String>();
		for (int i = 0; i < str.length; i++) {
			vlist1.add(str[i]);
			vlist2.add(str[i]);
		}
		
		
		for (int i = 0; i < vlist1.size(); i++) {
			String s = (String)vlist1.get(i);  //첨부터 신분증을 안맡긴 애는 확인을 해야해,, 하지만 신분증 맡긴 애는 확인할 필요가 없어 
			String s1 = vlist2.get(i);
		}
		
		
		for(Object obj : vlist1) {
			
		}
		for(String string : vlist2) {
			
		}
	}
}
