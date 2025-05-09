package 자바프로그래응용;

import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		map.put("밀키스", 700);
		map.put("코카콜라", 800);
		map.put("펩시", 1000);
		map.put("칠성사이다", 1200);
		System.out.println("밀키스, 코카콜라, 펩시, 칠성사이다 있습니다.");
		while(true) {
			System.out.print("선택 >> ");
			String input = sc.next();
			if(input.equals("그만")) {
				break;
			}
			System.out.println(input+"는 "+map.get(input)+"원 입니다.");
		}
		System.out.println("종료합니다...");
	}

}















