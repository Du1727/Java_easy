package awt;

import java.awt.Label;

import ch08.MFrame;

public class LabelEx1 extends MFrame{
	
	Label label[] = new Label[4];
	int pos[] = {Label.LEFT, Label.CENTER , Label.RIGHT , Label.LEFT}; 
	
	public LabelEx1() {
		super(200,200);
		setTitle("Label Example");
		String str = "������ ��ſ� ������ !";
		label[0] = new Label(str);
		label[1] = new Label(str, Label.CENTER);
		label[2] = new Label(str, Label.RIGHT);
		label[3] = new Label(str, Label.LEFT);
		
	
		
		for( int i = 0; i < label.length; i++) {
			label[i].setBackground(MColor.rColor());
			add(label[i]);
			
		}
		
//		validate();  // ���ΰ�ħ (�׸��� �׸��ٰ� �׳� ���͹����ϱ�..)
		
		
	}
	
	
	public static void main(String[] args) {
		new LabelEx1();
	}
}
