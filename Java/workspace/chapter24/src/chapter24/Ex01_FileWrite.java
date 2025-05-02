package chapter24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		data.txt 파일을 생성
		OutputStream file = new FileOutputStream("data.txt");
//		data.txt파일에 65라는 데이터를 저장
		file.write(67);
//		file을 닫는 메서드
		file.close();
	}

}







