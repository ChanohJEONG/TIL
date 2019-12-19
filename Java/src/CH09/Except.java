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
		//고의적 예외 발생
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
		System.out.println("프로그램 종료");

		
	}//main

}//class

//1.예외처리 방법
//2.예외처리 종류(언제 어떤 방식으로?)