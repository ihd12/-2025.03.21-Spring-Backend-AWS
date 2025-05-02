package chapter21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex11_ConvertExt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Arrays.asList 변경할 수 없는 리스트 생성
		List<String> fixedSizeList = Arrays.asList("홍길동","전우치","전우치","손오공");
//		변경가능한 list 생성
		ArrayList<String> list = new ArrayList<>(fixedSizeList);
//		리스트 안의 데이터 출력 for문
		for(String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();
		
//		list를 HashSet으로 변경하여 중복 데이터를 제거
		HashSet<String> set = new HashSet<>(list);	
//		중복이 제거된 데이터를 ArrayList로 변경
		list = new ArrayList<>(set);
		
//		리스트에 저장된 데이터 출력 for문
		for(String s : list) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}

}











