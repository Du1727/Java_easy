package ch11;

class Point2{
	int x, y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override    // String클래스의 .toString()메서드를 여기서 Override해준것 ! 
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}


public class ObjectEx2 {
	public static void main(String[] args) {
		Point2 p = new Point2(10,20);
		System.out.println(p);  //  .toString()생략되어있음 ! 
	}
}
