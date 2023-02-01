package ch12;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JFrame;

public class RunnableFrameEx3  extends JFrame implements Runnable{

	static Random random =  new Random();  //전역변수면.. 어디서든 쓸 수 있는거 아니야? 왜 static해줘야 하는거지... 
	int x, y; 
	int rr, gg, bb;
	Color c; 
	
	
	
	
	public RunnableFrameEx3(int a, int b) {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(200,200);
//		setLocation(size.width/2, size.height/2);
		setLocation(a, b);
		setTitle("RunnableFrame");
		setVisible(true);
	
	
		
		
		
		
	}
	

	@Override
	public void run() {
		// 
		
		
		// 원 위치 랜덤하게 주기 
		for (int i = 0; i < 100; i++) {
			
			rr = random.nextInt(256);
			gg = random.nextInt(256);
			bb = random.nextInt(256);
			
			
			x = random.nextInt(200);  // Random하게 .. 300 이내의 숫자에서 랜덤하게 수를 받아오나보네.. 
			y = random.nextInt(200);
			try {
				Thread.sleep(70);
				repaint();
			} catch (InterruptedException e) {
			
			}
		}
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(new Color(rr, gg, bb));
		g.fillOval(x, y, 10, 10);
	}
	

	public static void main(String[] args) {
		
		RunnableFrameEx3 [][] frame = new RunnableFrameEx3 [3][3];
		
		int f_x = 0, f_y = 0;
		for (int i = 0; i < 3; i++) {
			f_x = 0;
			for(int j = 0; j < 3; j++) {
				frame[i][j] =  new RunnableFrameEx3(f_x, f_y);
				f_x += 200; 
			}
			f_y += 200; 
		}
		
		Thread t9 = new Thread(frame[2][2]);
		t9.start();
		
	}
}
