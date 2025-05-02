package practice2;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요(continue 사용)
		for(int i=2; i<=9; i++) {
			if(i%2 != 0) {
				continue;
			}
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}








