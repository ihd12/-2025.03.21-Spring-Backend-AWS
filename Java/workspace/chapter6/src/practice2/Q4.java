package practice2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4.반복문을 사용하여 다음 모양을 출력하는 프로그램을 만들어 보세요
//		*****
//		****
//		***
//		**
//		*
		int count = 5;
		for(int i=0; i<5; i++) {
			for(int j=0; j<count; j++) {
				System.out.print("*");
			}
			count--;
			System.out.println();
		}
		
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}










