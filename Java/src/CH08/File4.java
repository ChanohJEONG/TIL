package CH08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class File4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://ggoreb.com/http/html2.jsp");
		URLConnection con = url.openConnection();
		InputStream in = con.getInputStream();
		
		//FileInputStream in = new FileInputStream("C:/dev/text.txt");
		
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//���� stream, utf-8 �������� �аڴٴ� �ɼ� �߰�!
		BufferedReader reader = new BufferedReader(isr);//inputstream ������ ȣȯ�� �ȵǱ� ������ ���Ͱ��� �ٸ� ���̺귯���� ���.
		
		while(true){
			String data1 = reader.readLine();//���پ� ����!
			if(data1 == null) break;// �⺻�������� �ƴϱ⶧���� ���� ���� Null��! �׷��� ������������!!
			System.out.println(data1);
			
		}//while
		
	
	}//main

}//class
