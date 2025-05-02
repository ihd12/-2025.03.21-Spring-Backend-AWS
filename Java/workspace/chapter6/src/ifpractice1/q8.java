package ifpractice1;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8. 음료수 종류와 잔 수를 입력받으면 가격을 알려주는 프로그램을 작성하라. 에스프레소
//		는 2000원, 아메리카노 2500원, 카푸치노 3000원, 카페라떼 3500원이다. [난이도 중] 
//		커피 주문하세요>>카푸치노 3 
//		9000원입니다. 
		Scanner sc = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int count = sc.nextInt();
		String str = "원 입니다.";
//		(1) if문을 활용하라.
		if(coffee.equals("에스프레소")) {
			System.out.println((count*2000)+str);
		}else if(coffee.equals("아메리카노")) {
			System.out.println((count*2500)+str);
		}else if(coffee.equals("카푸치노")) {
			System.out.println((count*3000)+str);
		}else if(coffee.equals("카페라떼")) {
			System.out.println((count*3500)+str);
		}else {
			System.out.println("에스프레서,아메리카노,카푸치노,카페라떼 중에 선택해주세요.");
		}
//		(2) switch문을 활용하라. 
		switch(coffee) {
		case "에스프레소":
			System.out.println((count*2000)+str);
			break;
		case "아메리카노":
			System.out.println((count*2500)+str);
			break;
		case "카푸치노":
			System.out.println((count*3000)+str);
			break;
		case "카페라떼":
			System.out.println((count*3500)+str);
			break;
		default : 
			System.out.println("에스프레서,아메리카노,카푸치노,카페라떼 중에 선택해주세요.");
		}
		
	}

}
