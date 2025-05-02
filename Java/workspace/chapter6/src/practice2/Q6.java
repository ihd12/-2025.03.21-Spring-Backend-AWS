package practice2;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6.반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요6. .
//		*******
//		 *****
//		  ***
//		   *
		int count = 0;
		for(int i=7; i>0; i-=2) {
			for(int j=0; j<count; j++) {
				System.out.print(" ");
			}
			count++;
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}






