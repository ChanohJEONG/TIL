package CH11;

import java.util.ArrayList;

public class ListExam {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		// �� �Է�
		list.add("A");
		list.add("��");
		list.add("09");
		
		// �� Ȯ��
		for(int i = 0; i < list.size(); i++){
			String data = list.get(i);
			System.out.println(data);
		}//for
	
	}//main

}
