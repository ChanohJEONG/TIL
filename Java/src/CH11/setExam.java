package CH11;

import java.util.HashSet;

public class setExam {

	public static void main(String[] args) {
		// Wrapper Class
		Integer i = 1;
		short s = 1;
		Character c = 'c';
		Long l = 100L;
		Float f = 10.0f;
		Double d = 10.0d;
		Byte b = 10;
		Boolean bb = true;
		
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(11);
		set.add(111);
		set.add(1111);
		
		System.out.println(set);//for¹® ¸ø¾¸..
	
	}//main

}
