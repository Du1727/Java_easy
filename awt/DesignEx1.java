package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class DesignEx1 extends MFrame2{
	
	
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	
	public DesignEx1() {
		super(250,150);
		setTitle("������ ����1");
		
		setLayout(new BorderLayout());
		
		Label label = new Label();
		
		label.setText("�����߿� ����");
		 
		 
	
		add(label = new Label("�����߿� ����", label.CENTER), BorderLayout.NORTH);
		label.setBackground(Color.green);

		
		
		Panel p2 = new Panel();
		//���� ��ư ���� (�׷����� �ٷ� ����)
		cbg = new CheckboxGroup();
		add(cb1 = new Checkbox("���", cbg, true));
		add(cb2 = new Checkbox("����", cbg, true));
		add(cb3 = new Checkbox("�޵�", cbg, true));
		
		p2.add(cb1);
		p2.add(cb2);
		p2.add(cb3);

		add(p2, BorderLayout.CENTER);
//		add(p2);
		

		Panel p3 = new Panel();
		btn1 = new Button("Start");
		btn2 = new Button("End");
		p3.add(btn1);
		p3.add(btn2);
		add(p3, BorderLayout.SOUTH);
		
		setResizable(true);
		validate(); //���ΰ�ħ

	}	

	public static void main(String[] args) {
		new DesignEx1();
	}

	
}

