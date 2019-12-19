package Ch04;

public class example4_7 {

	public static void main(String[] args) {

		for(int i = 1; i <= 1000; i++) {
			int num = i;
			while(num > 0) {
				 int n = num % 10;
				 if(num%10 == 3){
					 System.out.println(i);
					 break;
				 }//if
				 num = num / 10;
			}//while
		}//for
		
	}//main

}//class

