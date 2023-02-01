package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import graphics.MFrame;



public class RunnableFrameEx2 extends MFrame implements Runnable{

	
	Random r =  new Random();
	int x, y; 
	Color c; 
	
	public RunnableFrameEx2(Color c) {
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
		RunnableFrameEx2 r1 = new RunnableFrameEx2(Color.RED);
		RunnableFrameEx2 r2 = new RunnableFrameEx2(Color.BLUE);  // 창이 두개도 만들어지네..... 이게 객체를 만드는건가...?
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
		
	}
}
