package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. gugudan.txt 파일에 1~9단까지의 구구단을 출력해보자
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("gugudan.txt"))) {
			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					bw.write(i + "*" + j + "=" + (i * j));
					bw.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		2. year.txt 파일에 1900년도부터 2025년 까지의 윤년을 출력해보자
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("year.txt"))) {
			for (int i = 1900; i <= 2025; i++) {
				if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
					bw.write(i + "");
					bw.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		3. 가위바위보 게임의 결과를 log.txt파일에 출력해보자.
//		저장예시 : 가위vs바위 승리:0/5, 패배:1, 비김:0
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt"))) {
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			String[] strArr = { "가위", "바위", "보" };
			int win = 0, tie = 0, lose = 0;
			while (win < 5) {
				System.out.print("가위(1), 바위(2), 보(3) 중에 입력해주세요>>");
				int player = sc.nextInt();
				int computer = rd.nextInt(3) + 1;
				int result = player - computer;
				String str = "플레이어:" + strArr[player - 1] + "vs" + strArr[computer - 1] + ":컴퓨터 ";
				if (result == 0) {
					str += "비김";
					tie++;
				} else if (result == 1 || result == -2) {
					str += "승리";
					win++;
				} else {
					str += "패배";
					lose++;
				}
				str += " 승리:" + win + "/5, 패배:" + lose + " 비김:" + tie;
				System.out.println(str);
				bw.write(str);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// git 확인용 주석
	}

}









