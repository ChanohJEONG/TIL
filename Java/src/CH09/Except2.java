package CH09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Except2 {

	static void method() throws FileNotFoundException{
		FileInputStream in = new FileInputStream("C:/dev/text100000.txt");
	}
	//문제발생 시 호출한 부분에 문제를 던지는것!! 나중에 규모 커길때 바로 확인하기 위함!
	
	
	public static void main(String[] args){
		
		//method();

		
	}//main

}//class

//1.예외처리 방법
//2.예외처리 종류(언제 어떤 방식으로?)