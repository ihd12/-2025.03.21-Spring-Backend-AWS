package practice2;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. 반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
//		  *
//		 ***
//		*****
//	   *******
		int count = 3;
		for(int i=0; i<7; i+=2) {
			for(int j=0; j<count; j++) {
				System.out.print(" ");
			}
			count--;
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}








