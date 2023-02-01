package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import graphics.MFrame;

public class RunnableFrameEx1 extends MFrame{

	
	Random r =  new Random();
	int x, y; 
	Color c; 
	
	public RunnableFrameEx1(Color c) {
		super(300, 300);
		this.c = c;
	
	
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			x = r.nextInt(300);  // Random하게 .. 300 이내의 숫자에서 랜덤하게 수를 받아오나보네.. 
			y = r.nextInt(300);
			try {
				Thread.sleep(500);
				repaint();
			} catch (InterruptedException e) {
			
			}
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
	}
	
	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}
	
	
	public static void main(String[] args) {
		RunnableFrameEx1 r1 = new RunnableFrameEx1(Color.PINK);
		RunnableFrameEx1 r2 = new RunnableFrameEx1(Color.GREEN);  // 창이 두개도 만들어지네..... 이게 객체를 만드는건가...?
		r1.run();	
		r2.run();	// 따로따로 실행됨..  핑크 그리기 다 끝나고, 그린 그리기 시작 !    --> 단일스레드  
	}
}
