package CH09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Except {

	static void method1(){
		method2();
	}
	
	static void method2(){
		method3();		
	}
	
	static void method3(){
		//������ ���� �߻�
		throw new RuntimeException();
	}
	
	
	
	public static void main(String[] args){
//		try {
//			FileInputStream in = new FileInputStream("C:/dev/text100000.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		method1();
		System.out.println("���α׷� ����");

		
	}//main

}//class

//1.����ó�� ���
//2.����ó�� ����(���� � �������?)