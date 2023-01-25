package ch07;

//2대 클래스 (Object > Car1)
class Car1{ 
	
	int velocity;
	
	void speedUp() {
		System.out.println(" 1*bus : " + velocity);
		velocity++;
		System.out.println(" 2*bus : " + velocity);
	}
	
	void speedDown() {
		velocity--;
	}
	
	void stop() {
		velocity = 0;	
	}
}



 
class Taxi1 extends Car1{
	
	@Override   // annotation(Java 5.0추가)
	void speedUp() {
		velocity += 5;
	}
	
}

class Bus1 extends Car1{
	@Override
	void speedUp() {
		System.out.println(" *bus : " + velocity);
		super.speedUp();
		System.out.println(" ** bus : " + velocity);
		if( velocity > 100 ) velocity = 100;
	}
	
}





public class InheritanceEx1 {
	public static void main(String[] args) {
		Taxi1 t = new Taxi1();
		t.speedUp();
		System.out.println(" taxi : " + t.velocity);
		
		Bus1 b = new Bus1();
		System.out.println(" ##### : " + b.velocity);
		b.speedUp();
		System.out.println(" bus : " + b.velocity);
		
	}
}
