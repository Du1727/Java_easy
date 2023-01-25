package awt;

import java.awt.Label;

import ch08.MFrame;

public class LabelEx1 extends MFrame{
	
	Label label[] = new Label[4];
	int pos[] = {Label.LEFT, Label.CENTER , Label.RIGHT , Label.LEFT}; 
	
	public LabelEx1() {
		super(200,200);
		setTitle("Label Example");
		String str = "오늘은 즐거운 수요일 !";
		label[0] = new Label(str);
		label[1] = new Label(str, Label.CENTER);
		label[2] = new Label(str, Label.RIGHT);
		label[3] = new Label(str, Label.LEFT);
		
	
		
		for( int i = 0; i < label.length; i++) {
			label[i].setBackground(MColor.rColor());
			add(label[i]);
			
		}
		
//		validate();  // 새로고침 (그림을 그리다가 그냥 나와버리니까..)
		
		
	}
	
	
	public static void main(String[] args) {
		new LabelEx1();
	}
}
