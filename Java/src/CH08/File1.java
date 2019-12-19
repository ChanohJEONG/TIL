package CH08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:/dev/test.bin");
		FileOutputStream out = new FileOutputStream("C:/dev/test2.bin");
	
		while(true){
			int data = in.read();
			if(data == -1) break;
			out.write(data);
			System.out.println((char)data);		
		}//while
		
	
	}//main

}//class
