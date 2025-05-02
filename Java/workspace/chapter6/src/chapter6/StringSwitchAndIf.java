package chapter6;

public class StringSwitchAndIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "홍길동";
		System.out.println(name == "홍길동"); // 메모리 주소로 비교하기 때문에 결과가 정확하지 않음
		System.out.println(name.equals("홍길동"));// 저장되어있는 글자끼리 비교하여 결과를 출력
		int i = 0;
//		switch는 문자열을 == 연산자로 비교 가능
		switch(name) {
		case "홍길동":
			System.out.println("제 이름은 홍길동 입니다.");
			break;
		case "전우치":
			System.out.println("제 이름은 전우치 입니다.");
			break;
		case "손오공":
			System.out.println("제 이름은 손오공 입니다.");
			break;
		default:
			System.out.println("같은 이름이 없습니다.");
		}
//	 	if문의 경우 문자열 비교시 ==을 사용하여 비교할 수 없음
		name = "손오공";
		String name2 = "홍길동";
		String name3 = new String("홍길동"); // 클래스 선언문으로 새롭게 변수를 생성
		System.out.println(name == name2); // true가 출력되지만 상황에따라 false출력될 가능성도 있음
		System.out.println(name2 == name3); // 메모리 주소가 다르기 때문에 false 출력
//		equals() : String의 경우 클래스 자료형이 때문에 equals로 비교해야 결과 정상적으로 출력됨
		System.out.println(name2.equals(name3)); // true
		if(name2.equals(name3)) {
			System.out.println("name2와 name3은 같습니다.");
		}

//기초자료형 : byte,short,int,long,float,double,boolean,char 는 == 으로 비교
//클래스자료형 : Byte,Short,Integer,Long,Float,Double,Boolean,Character는 equals로 비교
		
	}

}




