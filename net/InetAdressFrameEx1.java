package net;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import com.mysql.cj.result.ZonedDateTimeValueFactory;



public class InetAdressFrameEx1 extends MFrame implements ActionListener{

	TextField tf; 
	TextArea ta;
	Button lookup;
	InetAddress intAddr;
	
	public InetAdressFrameEx1() {
		System.out.println("InetAdressFrameEx1 ������");
		
		setTitle("InetAddress Example");
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		p.add(new Label("ȣ��Ʈ�̸�"),BorderLayout.NORTH);
		p.add(tf = new TextField("",40));
		p.add(lookup = new Button("ȣ��Ʈ ���� ���"), BorderLayout.SOUTH);
		tf.addActionListener(this);
		lookup.addActionListener(this);
		add(p,BorderLayout.NORTH);
		ta = new TextArea("���ͳ��ּ�\n");
		ta.setFont(new Font("Dialog",Font.BOLD,15));
		ta.setForeground(Color.BLUE);
		ta.setEditable(false);
		add(ta);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if(object == lookup || object == tf) {
			String host = tf.getText().trim();
			System.out.println("host : " + host);
			try {
				intAddr = InetAddress.getByName(host);  
				System.out.println("intAddr : " + intAddr);
				String add = intAddr.getHostName();
				String ip = intAddr.getHostAddress();
				System.out.println("add : " + add);
				System.out.println("ip : " + ip);
				ta.append((" " + add + "\n"));
				ta.append((" " + ip + "\n"));
				
				
			} catch (Exception e2) {
				ta.append(" [" + host + "]\n");
				ta.append("�ش�Ǵ� ȣ��Ʈ�� �����ϴ�.");
			}
			tf.setText("");
			tf.requestFocus();
		}
	}

	public static void main(String[] args) {
		new InetAdressFrameEx1();
	}
	
}
