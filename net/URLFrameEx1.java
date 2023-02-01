package net;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;



public class URLFrameEx1 extends MFrame implements ActionListener {

	TextArea ta;
	TextField tf;
	Button connect;
	Button save;
	URL url ;

	public URLFrameEx1() {
		super(500, 500);
		setTitle("ViewHost");
		Panel p = new Panel();
		p.add(tf = new TextField("http://", 40));
		p.add(connect = new Button("connect"));
		p.add(save = new Button("save"));
		ta = new TextArea();
		add(p, BorderLayout.NORTH);
		add(ta);
		save.setEnabled(true);
		connect.addActionListener(this);
		save.addActionListener(this);
		tf.addActionListener(this);
		validate();
	}

	@Override 
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj==connect) {
			
			try {
				url = new URL(tf.getText());
				BufferedReader br = new BufferedReader(
												new InputStreamReader(
														url.openStream(), "UTF-8"));
				String line = "";
				while(true) {
					line = br.readLine();
					ta.append(line+"\n");
					if(line==null)
						break;
					
					
				}
				br.close();
			
			} catch (Exception e1) {
				ta.setText("host를 찾을 수 없습니다.");
			}
			
		}else if(obj==save) {
			
			
			String cFile = url.getHost()+".txt";
			System.out.println(cFile);
			 
			FileWriter fw;
			try {
				 fw = new FileWriter("net/"+cFile);
				 fw.write(ta.getText());
		         fw.flush();
		         fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
			
	        ta.setText("저장하였습니다. 2초뒤에 사라집니다.\n");
				
			for (int i = 2; i > 0; i--) {
	        	  try {
					Thread.sleep(1000);
					ta.append(i + "\n "); 
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
	        	 
			}
	        System.exit(0);  
			
		}
		
	}
	

	
	public static void main(String[] args) {
		URLFrameEx1 ex = new URLFrameEx1();
	}
}








