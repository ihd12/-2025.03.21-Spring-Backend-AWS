package practice2;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 다음 그림과 같이 위쪽과 왼쪽 숫자를 곱한 곱셈표를 출력하는 프로그램을 작성하시오
//		   | 1  2  3  4  5  6  7  8  9
//		---+------------------------
//		 1 | 1  2  3  4  5  6  7  8  9
//		 2 | 2  4  6  8 10 12 14 16 18
//		 3 | 3  6  9 12 15 18 21 24 27
//		             ~
//		 9 | 9 18 27 36 45 54 63 72 81
		
		System.out.println("   | 1  2  3  4  5  6  7  8  9");
		System.out.println("---+------------------------");
		for(int i=1; i<=9; i++) {
			System.out.print(" "+i+" | ");
			for(int j=1; j<=9; j++) {
				System.out.print(i*j);
				if((i*j)>=10) {
					System.out.print(" ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}








