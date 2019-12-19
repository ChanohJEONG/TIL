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
		URLEncoder.encode("안녕하세요. 저는 자바 개발자입니다.","utf-8"));
			//json형태로 가져오는거! 서버에서 받는 데이터형식이 대부분임!
		
		URLConnection con = url.openConnection();
		con.addRequestProperty("Authorization", "KakaoAK d4be7b479f4b4cbd99bd19ae87f88b4b");
		InputStream in = con.getInputStream();
		
		//FileInputStream in = new FileInputStream("C:/dev/text.txt");
		
		InputStreamReader isr = new InputStreamReader(in,"utf-8");//보조 stream, utf-8 형식으로 읽겠다는 옵션 추가!
	
		BufferedReader reader = new BufferedReader(isr);//inputstream 형식이 호환이 안되기 때문에 위와같은 다른 라이브러리를 사용.
		
		String result = "";
		
		while(true){
			String data1 = reader.readLine();//한줄씩 읽음!
			if(data1 == null) break;// 기본변수형이 아니기때문에 최초 값이 Null임! 그래서 다읽을때까지!!
			result = result + data1;			
		}//while
			System.out.println(result);
	}//main

}//class
