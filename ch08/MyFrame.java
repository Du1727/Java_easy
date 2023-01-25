package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends MFrame implements ActionListener{

	
	Button btn ;
	Boolean flag = false;
	
	public MyFrame() {
		btn = new Button();
		add(btn, BorderLayout.SOUTH);
		setBackground(Color.orange);
		// actionPerformed 연결 메서드
		// 내 자신이 ActionListener 타입 이므로 this가 가능
		// 버튼을 클릭을 하면 ActionEvent 객체가 내부적으로 생성됨.
		btn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(flag) setBackground(Color.orange);
		   else setBackground(Color.pink);
		
		flag =! flag;
			
		
	}
	
	
}
