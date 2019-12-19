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

import org.json.JSONArray;
import org.json.JSONObject;

public class File5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://ggoreb.com/http/json2.jsp");
			//json���·� �������°�! �������� �޴� ������������ ��κ���!
		URLConnection con = url.openConnection();
		InputStream in = con.getInputStream();
		
		//FileInputStream in = new FileInputStream("C:/dev/text.txt");
		
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//���� stream, utf-8 �������� �аڴٴ� �ɼ� �߰�!
		BufferedReader reader = new BufferedReader(isr);//inputstream ������ ȣȯ�� �ȵǱ� ������ ���Ͱ��� �ٸ� ���̺귯���� ���.
		
		//JSON jar ���� �ٿ�ε�
		
		String result = "";
		while(true){
			String data1 = reader.readLine();//���پ� ����!
			if(data1 == null) break;// �⺻�������� �ƴϱ⶧���� ���� ���� Null��! �׷��� ������������!!
			result = result + data1;			
		}//while
		
		//Parsing ������ �߰�ȣ����, ���ȣ������ Ȯ���ϰ� �����ؾ���!
//		JSONObject obj = new JSONObject(result);//�߰�ȣ�϶�!
//		String name = obj.getString("name");// �ܼ� get �� �Ⱦ��� ������ Key ���� �̹� �ִ� HTML Ȩ�������̱� �����Դϴ�.
//		int age = obj.getInt("age");
		
		JSONArray arr = new JSONArray(result);
		for(int i=0; i< arr.length(); i++){
			JSONObject obj = arr.getJSONObject(i);
			int age = obj.getInt("age");
			String name = obj.getString("name");
			System.out.printf("%s %s \n",age,name);
			
		}//for
		
	
	}//main

}//class
