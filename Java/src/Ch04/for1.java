package Ch04;

public class for1 {
	public static void main (String[] args){
		int sum=0;
		
		 for(int i = 1; i <= 5; i++) {
			 for(int j = 1; j <= i; j++) {
				 System.out.print("*");
			 }//for
			 System.out.println();
		}//for
		 	System.out.println();
		 	
		 for(int i = 5; i >= 1; i--) {
			 for(int j = 1; j <= i; j++) {
				 System.out.print("*");
			 }//for
			 System.out.println();
		 }//for
		 
	}//main
}//class
