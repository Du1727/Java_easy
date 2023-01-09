package ch06;

import java.awt.Color;
import java.awt.Graphics;

public class MyFrame extends MFrame{

	public void paint(Graphics g) {
		g.setColor(Color.blue); //붓에 노란색 물감 셋팅
		g.drawString("반갑습니다.", 50, 50);
	}
	
	
	public static void main(String[] args) {
		MFrame f = new MFrame(500,500,Color.white, true);
		
		f.setResizable(false);
		f.setVisible(true);
		
		
		
		
	}
}
