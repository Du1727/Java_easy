package graphics;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class imageViewEx3 extends JFrame implements ActionListener{

	
	Image img;
	JButton btn[] = new JButton[6];
	String str[] = {"����׸�","�Ϻα׸�","��ұ׸�","�¿������"
			,"���ϵ�����","���ε�����"};
	int idx;
	String name;
	
	static final int SHOW_NORM = 0;//����׸�
	static final int SHOW_PART = 1;//�Ϻα׸�
	static final int SHOW_SCALE = 2;//��ұ׸�
	static final int SHOW_HORIZONTAL = 3;//�¿������
	static final int SHOW_VERTICAL = 4;//���ϵ�����
	static final int SHOW_ALL = 5;//���ε�����
	
	public imageViewEx3(String name) {
		setSize(600,400);
		this.name = name;  // ���ϸ� ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		for (int i = 0; i < btn.length; i++) {
			p.add(btn[i]=new JButton(str[i]));
			btn[i].addActionListener(this);
		}
		img = Toolkit.getDefaultToolkit().getImage("graphics/" + name);
		add(p,BorderLayout.SOUTH);
		setResizable(false);
		setVisible(true);
		idx = SHOW_NORM;  
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setTitle(name + " - " + str[idx] + " ( idx : " + idx + " )");
		int iw = img.getWidth(this);
		int ih = img.getHeight(this);
		
		switch(idx) {
			case SHOW_NORM :
				g.drawImage(img, 0, 0, iw, ih,	// <- �� 4�� : �����̳�(�׸��� �����ϴ�) ��ǥ  // ����, ����, ���α���, ���α��� 
						0, 0, iw, ih, this);  // �տ� 3��  : �̹��� ��ǥ 
				break;
			
			case SHOW_PART :
//				g.drawImage(img, 100, 100, 300, 300,	// <- �� 4�� : �����̳�(�׸��� �����ϴ�) ��ǥ  // ����, ����, ���α���, ���α��� 
//						220, 20, 420, 220, this);  // �տ� 3��  : �̹��� ��ǥ
				g.drawImage(img, iw/2, 0, iw, ih,	// <- �� 4�� : �����̳�(�׸��� �����ϴ�) ��ǥ  // ����, ����, ���α���, ���α��� 
						iw/2, 0, iw, ih, this);  // �տ� 3��  : �̹��� ��ǥ 
				break;
			
			case SHOW_SCALE :
				g.drawImage(img, 0, 0, iw/2, ih/2,	// <- �� 4�� : �����̳�(�׸��� �����ϴ�) ��ǥ  // ����, ����, ���α���, ���α��� 
						0, 0, iw, ih, this);  // �տ� 3��  : �̹��� ��ǥ 
				break;
				
			case SHOW_HORIZONTAL :   //�¿������
				g.drawImage(img, iw, 0, 0, ih,	// <- �� 4�� : �����̳�(�׸��� �����ϴ�) ��ǥ  // ����, ����, ���γ�, ���γ� 
						0, 0, iw, ih, this);  // �տ� 3��  : �̹��� ��ǥ 
				break;
				
				
			case SHOW_VERTICAL :   //���ϵ�����
				g.drawImage(img, 0, ih, iw, 0,	// <- �� 4�� : �����̳�(�׸��� �����ϴ�) ��ǥ  // ����, ����, ���γ�, ���γ�  
						0, 0, iw, ih, this);  // �տ� 3��  : �̹��� ��ǥ 
				break;
				
			case SHOW_ALL :   //���ε�����
				g.drawImage(img, iw, ih, 0, 0,	// <- �� 4�� : �����̳�(�׸��� �����ϴ�) ��ǥ  // ����, ����, ���γ�, ���γ�  
						0, 0, iw, ih, this);  // �տ� 3��  : �̹��� ��ǥ 
				break;
		}
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		for (int i = 0; i < btn.length; i++) {
			if(obj == btn[i]) {
				idx = i;
				break;
			}
		}
		repaint(); //�ٽ� �׷��� ! 
	}
	
	public static void main(String[] args) {
		new imageViewEx3("aaa.png");
		
	}

}
