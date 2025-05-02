package practice2;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2.구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
//		을 만들어 보세요(break사용)
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
				if(j==i) {
					break;
				}
			}
		}
	}
}
