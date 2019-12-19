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

public class practice {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://api.visitkorea.or.kr/openapi/service/rest/KorService/"
				+ "searchFestival?serviceKey=A2usf4txsthrBPXx7%2FckSjISrlOOF3DRCXlpwxFKcl1KPyvOOWSD%2FUhcapvCkM51AdZOieooIvkMdz2XQCt33w%3D%3D&MobileOS=ETC&MobileApp=AppTest&eventStartDate=20191101&_type=json");
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
	
		//parsing!!!
		
		JSONObject obj = new JSONObject(result);//�߰�ȣ�϶�!
		JSONObject response = obj.getJSONObject("response");
		JSONObject body = response.getJSONObject("body");
		JSONObject items = body.getJSONObject("items");
		JSONArray item = items.getJSONArray("item");
		
		for(int i=0; i< item.length(); i++){
			JSONObject item2 = item.getJSONObject(i);
			String addr1 = item2.getString("addr1");
			String firstimage = item2.getString("firstimage");
			String title = item2.getString("title");
			System.out.printf("%s, %s, %s\n",addr1,firstimage,title);
		}
		/*
		JSONObject response = obj.getJSONObject("response");
		JSONObject body = response.getJSONObject("body");
		JSONObject items = body.getJSONObject("item");
		
		JSONArray arr = new JSONArray(items);
		
		for(int i=0; i< arr.length(); i++){
			JSONObject item = arr.getJSONObject(i);
			String addr1 = item.getString("addr1");
			String title = item.getString("title");
			System.out.printf("%s %s \n",addr1,title);
			
		}//for
	*/
	}//main

}//class
