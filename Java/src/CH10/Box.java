package CH10;

import java.util.ArrayList;

public class Box {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();//배열을 보완하여 만들어진 제네릭!
		list.add(11);
		list.add("22");
		list.add(true);
		
		
		int item = (int) list.get(0);
		System.out.println(item);
	}//main

}//class
