package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends MFrame{

	Button btn;
	
	public MyFrame() {
		add(btn = new Button("Exit"), BorderLayout.SOUTH);
		btn.addActionListener(new ActionListener() /* 액션리스너타입의 익명클래스를 만들겠다 */{   //익명클래스를 선언과동시에구현을 했다.. implement 코드 안짜고 !
		//액션리스터 타입의 익명클래스 구현부분.. 	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
