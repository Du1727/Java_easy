package CT_BackJoon;

public class ct1 {

	public static void main(String[] args) {
		
		
		int a = 3;
		int b = 2;
		int c= 1;
		int bep;
		int n = 1;
		int income; 
		int minus;
	
		while(true) {
		income = c*n; 
		minus = a+(b*n);
		if(income > minus) {
			System.out.println("수입 : " +income+"  / minus :  " +minus+"  / 판매대수 :  " +n);
			break;
		}
		n++;
		}
		
		

		
	}
}
