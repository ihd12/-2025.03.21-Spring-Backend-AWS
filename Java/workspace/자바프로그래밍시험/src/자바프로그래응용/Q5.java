package 자바프로그래응용;

import java.util.HashMap;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<>();
		System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			nations.put(sc.next(), sc.nextInt());
		}
		int minValue = Integer.MAX_VALUE;
		String name = "";
		for(String key : nations.keySet()) {
			if(nations.get(key) < minValue) {
				minValue = nations.get(key);
				name = key;
			}
		}
		System.out.println("제일 인구가 적은 나라는 ("+name+", "+nations.get(name)+")");
	}

}






