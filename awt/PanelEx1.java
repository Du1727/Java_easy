package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;

import ch08.MFrame;

public class PanelEx1 extends MFrame{
	
	
	Label label[] = new Label[3]	;
	Button btn[] = new Button[3];
	String str1[] = {"ù��°", "�ι�°", "����°"};
	String str2[] = {"ù��°", "�ι�°", "����°"};
	
	public PanelEx1() {
		setLayout(new BorderLayout());  //BorderLayout : �������� ���̾ƿ�
		
		Panel p1, p2; 	// �׷����� ���ؼ��� Panel �Ƕ��Ⱑ �ʿ��ϴ�. 
		p1 = new Panel();
		
		for (int i = 0; i < label.length; i++) {
			
			p1.setBackground(MColor.rColor());
			p1.add(label[i] = new Label(str1[i], Label.CENTER));
			label[i].setBackground(MColor.rColor());
		
			
		}
		p2 = new Panel();
		p2.setBackground(MColor.rColor());
		for (int i = 0; i < btn.length; i++) {
			p2.add(btn[i] = new Button(str2[i]));
			btn[i].setBackground(MColor.rColor());
		}
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		
		
	
	}
	
	
	
	public static void main(String[] args) {
		new PanelEx1();
	}
}