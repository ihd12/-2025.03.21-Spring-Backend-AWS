package 자바프로그래응용;

import java.util.HashMap;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println("<< 통장 관리 프로그램입니다. >>");
		while(true) {
			System.out.print("이름과 금액 입력>>");
			String name = sc.next();
			if(name.equals("exit")) {
				break;
			}
			int money = sc.nextInt();
			if(map.get(name) == null) {
				map.put(name, money);
			}else {
				map.put(name, money+map.get(name));
			}
			for(String key : map.keySet()) {
				System.out.print("("+key+">"+map.get(key)+"원)");
			}
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다...");
	}

}









