package chapter24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex14_ObjectInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream("object.bin"))){
//			readObject() : 파일에서 인스턴스를 읽는 메서드
			Ex12_Unit unit1 = (Ex12_Unit)ois.readObject();
			System.out.println(unit1.getName());
			Ex12_Unit unit2 = (Ex12_Unit)ois.readObject();
			System.out.println(unit2.getName());
			
		}catch(ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} 
	}

}






