package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import graphics.MFrame;

public class FileCopyEx2 extends MFrame 
implements ActionListener{
	
	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;
	
	public FileCopyEx2() {
		super(400,500);
		setTitle("FileCopyEx2");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==open) {
			FileDialog dlg = new FileDialog(this, "파일열기", FileDialog.LOAD);
			dlg.setSize(700,500);
			dlg.setVisible(true);
			
			String sel_dir = dlg.getDirectory();
			String sel_file = dlg.getFile();
			
//			System.out.println("sel_dir : "  + sel_dir);
//			System.out.println("sel_file : "  + sel_file);
			
			fileReader(sel_dir+sel_file);
			
			
		}else if(obj==save) {
			FileDialog dlg = new FileDialog(this, "파일저장", FileDialog.SAVE);
			dlg.setSize(700,500);
			dlg.setVisible(true);
			
			String sel_dir = dlg.getDirectory();
			String sel_file = dlg.getFile();
			
			fileWriter(sel_dir + sel_file);
			
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
	

	//선택된 파일의 내용이 ta에 append 해야함
	public void fileReader(String file){

		try {
			FileReader fr = new FileReader(file);   // ch14패키지 안에 있는 .. aaa.txt를 읽어와 ! 
			int a; 
			while((a = fr.read()) != -1) {   // read가 왜 int로 받지 ? 바이트 코드로 뱉어내는 건가? - 바이트코드로 뱉어냄
				ta.append(String.valueOf((char)a));
			}
			fr.close();

		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		
	}
	
	//ta에 오픈된 텍스트를 지정한 파일로 저장 해야함
	public void fileWriter(String file){
		try {
			FileWriter fw = new FileWriter(file);
			 fw.write(ta.getText());  //
	         fw.flush();
	         fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new FileCopyEx2();
	}
}










