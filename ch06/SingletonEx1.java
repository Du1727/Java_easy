package ch06;


class Singleton1{
	
	
	private static Singleton1 instance = null; // static : 모든객체가 공유한다. 그러기 위해 사용..

		 
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		if(instance==null)
			instance = new Singleton1();
		return instance;
	} 
	
}



public class SingletonEx1 {
	public static void main(String[] args) {
		
	}
}


