package ch05;

public class Ex2 {
	public static void main(String[] args) {
		//다차원 배열 : n * for
		
	
		int arr[][] = new int[2][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
//				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}
		
		//문제1 arr2의 모든값의 합을 구하시오.
		int arr2[][] = {{1,2,},
						     {3,4,5},
							 {6},
							 {1,2,3,4},
							 {2,3,4},
						    };
		int sum =0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum+= arr2[i][j];
			}
		}

		System.out.println(sum);
	
		//문제2 arr3의 평균을 구하시오.
		double arr3[][] = {{1.0},
					              {2.3, 3.4},
					              {4.5, 6.2, 4.3},
					              {9.0}
					             };
		
		double sum2 = 0;;
		int num=0;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				num++;
				sum2 += arr3[i][j];
				
			}
		}
//		System.out.println(sum2);
//		System.out.println(num);
		System.out.println(sum2/num);
		
		
		
	}
}
