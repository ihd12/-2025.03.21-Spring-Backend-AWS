package 자바프로그래밍활용;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int randomValue = (int)(Math.random()*100+1);
		System.out.println(randomValue);
		int value = 0;
		int count = 0;
		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		System.out.println("컴퓨터가 숫자를 생각했습니다.");
		if(randomValue%2==0) {
			System.out.println("힌트는 짝수입니다.");
		}else {
			System.out.println("힌트는 홀수입니다.");
		}
		
		while(value != randomValue) {
			System.out.print("1~100 사이의 값을 입력 >>");
			value = sc.nextInt();
			count++;
			if(value == randomValue) {
				System.out.println(count+"회 만에 맞춰습니다.");
				break;
			}else if(value < randomValue) {
				System.out.println("더 큰 수입니다.");
			}else {
				System.out.println("더 작은 수입니다.");
			}
		}
		System.out.println("=== 게임을 종료합니다. ===");
	}

}












