package HTTP;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;//CTRL + Spacebar
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//jar ���̺귯�� �߰� ���
// ������Ʈ ������ ���� �ű��(�ʼ�X)
// Project ���콺 ��Ŭ�� -> properties -> Java build Path -> Libraries -> �߰��ϱ�!
public class HTTP1 {

	public static void main(String[] args) throws IOException {
		Connection con = Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=641253&weekday=fri");
		Document doc = con.get();
		Elements elements = doc.select("td.title > a");
		
		for(int i=0; i < elements.size(); i++){
			Element element = elements.get(i); // elements[i]
			String src = element.text();
			System.out.println(src);
		}//for
		

	}

}
