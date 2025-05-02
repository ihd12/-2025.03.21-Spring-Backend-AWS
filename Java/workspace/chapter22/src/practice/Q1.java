package practice;

@FunctionalInterface
interface Test{
	void add(int a, int b);
}
@FunctionalInterface
interface Test1{
	int test1(int start, int end, int num);
}
@FunctionalInterface
interface Test2{
	int test2(int f);
}
@FunctionalInterface
interface Test3{
	int test3(int x);
}
@FunctionalInterface
interface Test4{
	String test4(String s);
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = (a,b) -> {
			int c = 10;
			System.out.println(a+b+c);
			System.out.println("a+b의 값은"+(a+b));
		};
		test.add(5,10);
		
//		아래의 문제를 람다식을 이용하여 풀어보자 입력부분은 매개변수로 설정할 것
//		1. 1~100까지의 수 중에서 3의 배수의 합을 출력하라
		Test1 test1 = (start, end ,num) -> {
			int sum = 0;
			for(int i=start; i<=end; i+=num) {
				sum+=i;
			}
			return sum;
		};
		System.out.println(test1.test1(0,100,3));
//		2. 한층의 높이가 5m일때 건물의 층을 입력하면 몇미터인지 출력하라
		Test2 test2 = (f) ->{
			return f*5;
		};
		System.out.println(test2.test2(5)+"m 입니다.");
//		3. y = x*x-3*x+7을 계산하여 y를 출력하라
		Test3 test3 = x -> x*x-3*x+7;
		System.out.println(test3.test3(5));
//		4. 학점이 A,B면 Excellent, D,C이면 Good, F이면 Bye라고 출력하라
		Test4 test4 = (s) ->{
			String result = "";
			if(s.equals("A") || s.equals("B")) {
				result = "Excellent";
			}else if(s.equals("C") || s.equals("D")) {
				result = "Good";
			}else if(s.equals("F")){
				result = "Bye";
			}
			return result;
		};
		System.out.println(test4.test4("F"));
	}

}






