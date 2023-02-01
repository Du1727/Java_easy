package ch12;

/* 단일스레드 예제코드 */

class NoThread2 extends Thread{
	
	String name;
	
	
	
	public NoThread2(String name) {
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
	
	
	@Override
	public synchronized void start() {
		run();
	}
	
}


public class ThreadEx2 {
	public static void main(String[] args) {
		NoThread2 n1 = new NoThread2("First");
		NoThread2 n2 = new NoThread2("Second");
		n1.start();
		n2.start();
	}
}
