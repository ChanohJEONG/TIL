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
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//���� stream, utf-8 �������� �аڴٴ� �ɼ� �߰�!
		BufferedReader reader = new BufferedReader(isr);//inputstream ������ ȣȯ�� �ȵǱ� ������ ���Ͱ��� �ٸ� ���̺귯���� ���.
		
		while(true){
			String data1 = reader.readLine();//���پ� ����!
			if(data1 == null) break;// �⺻�������� �ƴϱ⶧���� ���� ���� Null��! �׷��� ������������!!
			System.out.println(data1);
			
			
//			int data = reader.read();
//			if(data == -1) break;
//			System.out.println((char)data);
		}//while
		
	
	}//main

}//class
