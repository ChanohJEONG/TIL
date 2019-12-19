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
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

public class File8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://kapi.kakao.com/v1/translation/translate?src_lang=kr&target_lang=en&query="+
		URLEncoder.encode("�ȳ��ϼ���. ���� �ڹ� �������Դϴ�.","utf-8"));
			//json���·� �������°�! �������� �޴� ������������ ��κ���!
		
		URLConnection con = url.openConnection();
		con.addRequestProperty("Authorization", "KakaoAK d4be7b479f4b4cbd99bd19ae87f88b4b");
		InputStream in = con.getInputStream();
		
		//FileInputStream in = new FileInputStream("C:/dev/text.txt");
		
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//���� stream, utf-8 �������� �аڴٴ� �ɼ� �߰�!
	
		BufferedReader reader = new BufferedReader(isr);//inputstream ������ ȣȯ�� �ȵǱ� ������ ���Ͱ��� �ٸ� ���̺귯���� ���.
		
		String result = "";
		
		while(true){
			String data1 = reader.readLine();//���پ� ����!
			if(data1 == null) break;// �⺻�������� �ƴϱ⶧���� ���� ���� Null��! �׷��� ������������!!
			result = result + data1;			
		}//while
			System.out.println(result);
	}//main

}//class
