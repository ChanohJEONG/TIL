package CH08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:/dev/text.txt");
		FileOutputStream out = new FileOutputStream("C:/dev/test2.bin");
	
		byte[] buffer = new byte[1024];
		
		while(true){
			int data = in.read(buffer);
			System.out.println(data);		
			System.out.println((char)data);		
			if(data == -1) break;
			out.write(data);
			System.out.println((char)data);		
		}//while
		
	
	}//main

}//class
