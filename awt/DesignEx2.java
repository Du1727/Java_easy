package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;



public class DesignEx2 extends MFrame2{

	TextField tf;
	TextArea ta;
	Button btn1, btn2;
	Panel p1, p2;
	
	public DesignEx2() {
		super(500,400);
		setTitle("디자인 예제2");
		
		setLayout(new BorderLayout());
		
		Panel p1 = new Panel();
		p1.add(tf = new TextField("Hello JUN!", 30));
		add(p1, BorderLayout.NORTH);
		
		
		add(ta = new TextArea(), "Center");
		
		
		
		Panel p2 = new Panel();
		btn1 = new Button("마우스 시험용");
		btn2 = new Button("종료");
		p2.add(btn1);
		p2.add(btn2);
		add(p2, BorderLayout.SOUTH);
		validate();
		
	}
	
	
	public static void main(String[] args) {
		new DesignEx2();
	}
}

