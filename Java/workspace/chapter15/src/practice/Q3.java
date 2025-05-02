package practice;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 정수를 입력받아 짝수이면 “짝”, 홀수이면 “홀”을 출력하는 프로그램을 작성하라. 사용자
//		가 정수를 입력하지 않는 경우에는 프로그램을 종료하라. [목적-자바의 예외 처리 연습] 
//		[난이도 하] 
//		정수를 입력하세요>>352 
//		짝수 
//		정수를 입력하세요>>java 
//		수를 입력하지 않아 프로그램을 종료합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
//		숫자인지 확인할 수 있도록 문자열로 입력받기
		String str = sc.next();
//		문자열의 개수만큼 반복문을 실행
		for(int i=0; i<str.length(); i++) {
//			charAt()을 이용하여 한글자씩 char 저장
			char c = str.charAt(i);
//			글자가 숫자인지 문자인지 확인하는 if문
			if(c<'0' || c>'9') {
				System.out.println("수를 입력하지 않아 프로그램을 종료합니다.");
				return;
			}
		}
//		모든 문자가 숫자라면 int로 변경
		int num = Integer.parseInt(str);
//		짝수인지 홀수인지 확인하는 if문
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}

}
