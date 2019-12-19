package CH08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:/dev/text.txt");
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//보조 stream, utf-8 형식으로 읽겠다는 옵션 추가!
		BufferedReader reader = new BufferedReader(isr);//inputstream 형식이 호환이 안되기 때문에 위와같은 다른 라이브러리를 사용.
		
		while(true){
			String data1 = reader.readLine();//한줄씩 읽음!
			if(data1 == null) break;// 기본변수형이 아니기때문에 최초 값이 Null임! 그래서 다읽을때까지!!
			System.out.println(data1);
			
			
//			int data = reader.read();
//			if(data == -1) break;
//			System.out.println((char)data);
		}//while
		
	
	}//main

}//class
