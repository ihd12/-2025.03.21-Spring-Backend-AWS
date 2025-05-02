package ifpractice1;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원
//		짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력하라. 힌트 참조. [난이도 중] 
//		돈의 액수를 입력하세요>>65245 
//		오만원1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>>");		
		int money = sc.nextInt();
		int m50000 = money/50000; // 1
		money = money%50000;
		int m10000 = money/10000;
		money = money%10000;
		int m1000 = money/1000;
		money = money%1000;
		int m500 = money/500;
		money = money%500;
		int m100 = money/100;
		money = money%100;
		int m10 = money/10;
		money = money%10;
		System.out.println("오만원"+m50000+"개, 만원"+m10000+"개, 천원"+m1000+"개, 500원"+m500+"개, 100원"+m100+"개, 10원"+m10+"개, 1원"+money+"개");
		
	}

}











