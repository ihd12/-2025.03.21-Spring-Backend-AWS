package chapter6;

public class Ex03_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		switch(변수) {
//			case 비교값 : case 비교값 : case 비교값 :
//				실행할 코드;
//				break;
//			case 비교값 :
//				실행할 코드;
//				break;
//			default :
//				실행할 코드;
//		}
		int n=7;
		switch(n%4) {
		case 1:
			System.out.println("나머지가 1");
			break;
		case 2:
			System.out.println("나머지가 2");
			break;
		default:
			System.out.println("나머지가 0");
		}
		
//		banana, apple, totato, mango, melon, carrot
//		위의 과일과 야채 중에 banana,apple, mango, melon이라면 과일이라고 출력
//		totato, carrot이라면 야채라고 출력해보자
		String str = "banana";
		switch(str) {
		case "banana": 
		case "apple":
		case "mango": 
		case "melon":
			System.out.println(str+"은 과일입니다.");
			break;
		case "tomato": case "carrot":
			System.out.println(str+"은 야채입니다.");
			break;
		default :
			System.out.println("목록에 없는 물건입니다.");
		}
		
//		월별 날짜 출력하기
//		1,3,5,7,8,10,12 월은  31일
//		4,6,9,11 월은 30일
//		2 월은 28일
//		을 출력하는 switch문을 작성해보자
		int month = 515;
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println(month+"월은 31일 입니다.");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println(month+"월은 30일 입니다.");
			break;
		case 2:
			System.out.println(month+"월은 28일 입니다.");
			break;
		default:
			System.out.println("1~12월까지만 입력해주세요.");
		}
//		java 14 버전 이후부터 사용 가능
//		switch(month) {
//		case 1,3,5,7,8,10,12 -> System.out.println(month+"월은 31일 입니다.");
//		case 4,6,9,11 -> System.out.println(month+"월은 30일 입니다.");
//		case 2 -> System.out.println(month+"월은 28일 입니다.");
//		default ->
//			System.out.println("1~12월까지만 입력해주세요.");
//		}
	}

}





