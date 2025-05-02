package practice2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4.  소문자 알파벳을 하나 입력받아서 다음과 같은 결과가 나타나도록 코드를 작성하시오.
//		소문자 알파벳 하나를 입력하시오>> e
//		 abcde
//		 abcd
//		 abc
//		 ab
//		 a
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char ch = sc.next().charAt(0);
		for(char i=ch; i>='a';i--) {
			for(char j='a'; j<=i; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}












