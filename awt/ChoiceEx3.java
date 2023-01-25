package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import ch08.MFrame;

public class ChoiceEx3 extends MFrame implements ItemListener{

	Choice name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	public ChoiceEx3() {
		name  = new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new Choice();
		
		for (int i = 0; i < ms.length; i++) {
			star.add(ms[i]);
		}
		
		add(name);
		add(star);
		name.addItemListener(this);
		star.addItemListener(this);
	}
	

	public void inputItem(Choice c, String item[]) {
		c.removeAll();
		for (int i = 0; i < item.length; i++) {
			star.add(item[i]);
		}
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		String sel_nm =name.getSelectedItem();
		String sel_st = star.getSelectedItem();
		
		
		//name ���ÿ� ���� star����
		star.removeAll(); //�ʱ�ȭ
		String arr[] ;
		if(sel_nm == "���ڿ�����") arr = ms;
		else 							  arr = fs;
		
		for (int i = 0; i < arr.length; i++) {
			star.add(arr[i]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}

	
}
