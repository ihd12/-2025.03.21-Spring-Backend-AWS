package practice;

import java.util.Arrays;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 리스트의 숫자 합계 출력하기, 결과 : 15
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int sum = numbers.stream()
				.reduce(0, (a,b)->a+b);
		System.out.println(sum);
		//2. 문자열 연결해서 출력하기 , 결과 : JavaStreamAPI
		String[] strArr = {"Java", "Stream", "API"};
		String str = Arrays.stream(strArr)
				.reduce("", (a,b) -> a+b);
		System.out.println(str);
		//3. 리스트의 숫자를 모두 곱한 값 출력하기, 결과 : 750
		List<Integer> numList = Arrays.asList(5,10,15);
		int multi = numList.stream()
				.reduce(1, (a,b)-> a*b);
		System.out.println(multi);
	
	}

}








