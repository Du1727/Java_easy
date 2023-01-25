package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ch08.MFrame;

public class DialogEx1 extends MFrame implements ActionListener{
	
	
	
	Button btn ;
	String title = "메세지 대화상자";
	
	public DialogEx1() {
		super(300, 300);
		setLayout(new BorderLayout());
		add(btn = new Button("보이기"), BorderLayout.SOUTH);
		setResizable(true);
		btn.addActionListener(this);
		setLocationRelativeTo(this);
	
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		MyDialog md =  new MyDialog(this, title, true);
		int x = getX();
		int y = getY();
		int width = 200;
		int height = 150;
		
		
		md.setBounds(x + getWidth()/2 - width/2 , y + getHeight()/2 - height/2 , width, height);
		md.setVisible(true);
		
	}
	
	
	// 내부클래스 : 외부클래스와 아주 밀접한 관계가 있는 클래스 
	class MyDialog extends Dialog implements ActionListener{
		
		Button b; 
		
		public MyDialog(Frame owner, String title, boolean modal) {
			super(owner, title, modal);
			setLayout(new FlowLayout());
			b = new Button("확인");
			b.addActionListener(this);
			System.out.println(getX());
			System.out.println(getY());

			
			add(b);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();   // 창이 사라지는 기능 
		}
	}
	
	public static void main(String[] args) {
		new DialogEx1();
	}
}
