package CH11;

import java.util.HashMap;

public class MapExam {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("key1", 1000);
		map.put("key2", 1000);
		map.put("key3", 1000);
		map.put("key4", 1000);
		map.put("key1", 111000); // key1°¡ µ¤¾î¾º¿öÁü
		
		
		int a = map.get("key1");
		
		
		
	}//main

}//class
