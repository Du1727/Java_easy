package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import ch08.MFrame;

public class ChoiceEx3 extends MFrame implements ItemListener{

	Choice name, star;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	
	public ChoiceEx3() {
		name  = new Choice();
		name.add("남자연예인");
		name.add("여자연예인");
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
		
		
		//name 선택에 따라 star변경
		star.removeAll(); //초기화
		String arr[] ;
		if(sel_nm == "남자연예인") arr = ms;
		else 							  arr = fs;
		
		for (int i = 0; i < arr.length; i++) {
			star.add(arr[i]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}

	
}
