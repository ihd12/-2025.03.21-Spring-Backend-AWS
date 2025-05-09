package 자바프로그래밍활용;

import java.util.HashMap;
import java.util.Scanner;

class Phone{
	String name;
	String tel;
	String address;
	public Phone(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	@Override
	public String toString() {
		return name + "의 번호와 주소는 " + tel + ", " + address + " 입니다.";
	}
	
	
}

public class PhoneManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Phone> map = new HashMap<>();
		System.out.print("인원수 >>");
		int count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >>");
			Phone phone = new Phone(sc.next(), sc.next(), sc.next());
			map.put(phone.name, phone);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			System.out.print("검색할 이름 >>");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			Phone phone = map.get(name);
			if(phone == null) {
				System.out.println(name+"은(는) 없습니다.");
			}else {
				System.out.println(phone);
			}
		}
	}

}





