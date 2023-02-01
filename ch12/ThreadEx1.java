package ch12;

public class ThreadEx1 extends Thread {

	String name;
	
	
	
	public ThreadEx1(String name) {
		this.name = name; 
	
	}
	
	

	// 얘가 실질적으로 일하는 애기때문에.. 
	// 강제적으로 오버라이딩 해야하는 애는 아니지만 강제적으로 오버라이딩 해야하는아이다..
	@Override
	public void run() {  // run메서드가 강제성은 아니지만.. 추상클래스도 아니고,, 인터페이스도 아니엇을때 강제적으로 만들라 할수잇는건 없어.. 
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(200); //  20  :  0.02초  ( 1/1000 초 )
				System.out.println(name + " : " + i);
			} catch (Exception e) {
				
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ThreadEx1 t1 = new ThreadEx1("첫번째");
		ThreadEx1 t2 = new ThreadEx1("두번째");
		t1.start();  // 결과적으로 run메서드를 호출함
		t2.start();
	}
}
