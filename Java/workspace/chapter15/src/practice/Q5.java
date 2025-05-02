package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5.정수를 10개 입력받아 배열에 저장하고 증가 순으로 정렬하여 출력하라. 
//		[목적-배열과 for 반복문 연습] [난이도 중] 
//		정수 10개 입력>>17 3 9 -6 77 234 5 23 -3 1 
//		-6 -3 1 3 5 9 17 23 77
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 10개 입력>>");
		int[] intArr = new int[10];
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = sc.nextInt();
		}
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr.length-1; j++) {
				if(intArr[j]>intArr[j+1]) {
					int num = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = num;
				}
			}
		}
		
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i]+" ");
		}
		
//		메서드를 이용하는 방식
//		Arrays.sort(intArr);
//		System.out.println(Arrays.toString(intArr));
	}

}







