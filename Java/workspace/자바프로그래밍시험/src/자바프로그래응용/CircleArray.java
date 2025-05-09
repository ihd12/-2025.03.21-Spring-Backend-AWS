package 자바프로그래응용;

import java.util.Scanner;

class Circle {
	private int radius;
	
	public Circle(int radius) { 
		this.radius = radius;
	}
	
	public double getArea() { 
		return radius*radius*3.14; 
	}
}

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle[] arr = new Circle[4];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+" 반지름 >>");
			arr[i] = new Circle(sc.nextInt());
		}
		System.out.println("저장하였습니다...");
		double sum = 0;
		for(Circle circle : arr) {
			sum += circle.getArea();
		}
		System.out.println("원의 면적 전체 합은 "+sum);
	}

}









