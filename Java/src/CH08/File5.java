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
			//json형태로 가져오는거! 서버에서 받는 데이터형식이 대부분임!
		URLConnection con = url.openConnection();
		InputStream in = con.getInputStream();
		
		//FileInputStream in = new FileInputStream("C:/dev/text.txt");
		
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//보조 stream, utf-8 형식으로 읽겠다는 옵션 추가!
		BufferedReader reader = new BufferedReader(isr);//inputstream 형식이 호환이 안되기 때문에 위와같은 다른 라이브러리를 사용.
		
		//JSON jar 파일 다운로드
		
		String result = "";
		while(true){
			String data1 = reader.readLine();//한줄씩 읽음!
			if(data1 == null) break;// 기본변수형이 아니기때문에 최초 값이 Null임! 그래서 다읽을때까지!!
			result = result + data1;			
		}//while
		
		//Parsing 시작이 중괄호인지, 대괄호인지를 확인하고 진행해야함!
//		JSONObject obj = new JSONObject(result);//중괄호일때!
//		String name = obj.getString("name");// 단순 get 을 안쓰는 이유는 Key 값이 이미 있는 HTML 홈페이지이기 때문입니다.
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
