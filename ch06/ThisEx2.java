package ch06;


import java.lang.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThisEx2 extends MFrame
implements ActionListener{
	
	Button btn;
	
	
	
	
	public ThisEx2() {
		super(700,700);
		btn = new Button("my Button"); // 버튼을 만들고
		add(btn, "South");					// 클래스와 연결해줬어 ! 
		btn.addActionListener(this); // 버튼 객체주소값을 주는건가? 클래스 객체 주소값을 주는건가?
												// 클래스도 객체야? 클래스 주소를 주는거네 ! 
		
	}
	
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭했네? 모달을 만들자~");
		MDialog md = new MDialog(this, "보이나요");
		
	}
	
	
	class MDialog extends Dialog
	implements ActionListener{
		
		Button mbtn; 
		
		
		public MDialog(ThisEx2 f, String title) {
			super(f, title, true); // Dialog클래스를 이용하여 Modal을 만든
			
			setLayout(new FlowLayout());
			setSize(150, 100);
			
			mbtn = new Button("Click~~");
			mbtn.addActionListener(this);
			
			f.btn.setBackground(Color.red);
			add(mbtn);
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("모달안에 클릭버튼을 눌렀네 ?");
			
			dispose(); // 자신의 창이 사라짐
		}
	}
	

	public static void main(String[] args) {
		new ThisEx2();
		
	}
	
}
