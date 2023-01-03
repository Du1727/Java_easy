package ch03;

public class Ex4 {

	public static void main(String[] args) {
		int arr[] =  new int[2];

		System.out.println((3>13)&(arr[2] == 0));  // Error
		System.out.println((3>13)&&(arr[2] == 0)); // False
		
		System.out.println((3>13)|(arr[2] == 0)); // Error
		System.out.println((3>1)||(arr[2] == 0)); // True
		System.out.println((3>10)||(arr[2] == 0)); // Error

	
		System.out.println((3>2)^(3>4)); // XOR ???
		
		System.out.println(!true);// not  false
		
	}

}
