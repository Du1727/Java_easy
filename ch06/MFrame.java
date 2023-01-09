package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame extends Frame{
	
	public MFrame() { // 생성자 : 초기화 시켜줌
		this(300,300, new Color(220,220,220), false);
	}
	
	public MFrame(int w, int h) {
		this(w, h, new Color(220,220,220), false);
		System.out.println("자 ! 창이 떴지?");
	}
	
	public MFrame(Color c) {
			this(300, 300, c , false);
	}
	
	public MFrame(int w, int h, Color c, boolean flag) {
		setSize(w, h);
		setBackground(c);
		
		//종료시켜주는 기능 (신경쓰지x)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setResizable(flag);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
//		new MFrame(); //실행 1
//		new MFrame(Color.cyan); // 실행 2
		new MFrame(500, 500, 	new Color(100,200,100), true);   // 실행 3
	}
}
