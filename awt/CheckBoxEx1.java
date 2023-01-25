package awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import ch08.MFrame;

public class CheckBoxEx1 extends MFrame implements ItemListener{
	
	Checkbox cb1, cb2, cb3;
	Checkbox rb1, rb2, rb3; 
	CheckboxGroup grp; 
	
	
	public CheckBoxEx1() {
		super(220,250);
		
		// 체크박스 생성
		add(cb1 = new Checkbox("선택1", false));
		add(cb2 = new Checkbox("선택2", true));
		add(cb3 = new Checkbox("선택3", false));
		
		
		//라디오 버튼 생성 (그룹으로 바로 묶기)
		grp = new CheckboxGroup();
		add(rb1 = new Checkbox("라디오1", grp, true));
		add(rb2 = new Checkbox("라디오2", grp, true));
		add(rb3 = new Checkbox("라디오3", grp, true));
		
		
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		rb3.addItemListener(this);
		
		
		setResizable(true);
		validate(); //새로고침
	}
	
	

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		String str = cb.getLabel() + " : " + cb.getState();
		setTitle(str);
	}
	
	

	public static void main(String[] args) {
		new CheckBoxEx1();
	}
	
}
