package CH09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Except2 {

	static void method() throws FileNotFoundException{
		FileInputStream in = new FileInputStream("C:/dev/text100000.txt");
	}
	//�����߻� �� ȣ���� �κп� ������ �����°�!! ���߿� �Ը� Ŀ�涧 �ٷ� Ȯ���ϱ� ����!
	
	
	public static void main(String[] args){
		
		//method();

		
	}//main

}//class

//1.����ó�� ���
//2.����ó�� ����(���� � �������?)