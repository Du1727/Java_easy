package awt;

import java.awt.Choice;
import java.awt.Color;

import ch08.MFrame;

public class ChoiceEx1 extends MFrame{
	
	
	String city[]   = { "도시를 선택하세요.","베를린","파 리",	"하와이","런 던","평 양","뉴 욕" };
	Choice ocity; 
	
	public ChoiceEx1(){
		super(300, 300, new Color(100, 200, 100));
		ocity = new Choice();
		
		for (int i = 0; i < city.length; i++) {
			ocity.add(city[i]);
		}

		add(ocity);
		
	}
	
	
	public static void main(String[] args) {
		new ChoiceEx1();
	}
}
