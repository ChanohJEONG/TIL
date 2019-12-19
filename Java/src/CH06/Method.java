package CH06;

import java.util.Scanner;

public class Method {
/**
 * 1000을 반환하는 메소드
 * 
 * @return
 */
	int sum(){
		return 1000;
	}//sum
	
	int sum(int i, int j){
		return i+j;
	}//sum
	
	String print(int count, String s){
		String result="";
		for (int a = 1; a <= count; a++) {
			for (int b = 1; b <= a; b++) {
				//System.out.print(s);
				result = result + s;
			}//inner for
			//System.out.println();
			result = result + "\n";
		}//outer for
		
		return result;
	}//method
	
	
	
	public static void main(String[] args) {
		String test;
		Method m = new Method();
		//	Scanner s = new Scanner(System.in);
	//	s.hasNext();
		test = m.print(7,"$");
		System.out.println(test);
	}//main

}//class
