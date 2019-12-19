package Ch04;

public class star {
	public static void main (String[] args){
		int space = 4;
		
		 for(int i = 1; i <= 5; i++) {
			 for(int j = 1; j <= 5; j++) {
				 if(j  <= space){
				 System.out.print(" ");
				 }
				 else{
				 System.out.print("*");
				 }
			 }//1차 for
			 System.out.println();
			 space--;
		}//2차 for
		 System.out.println();
		 
		 space = 1;
		 for(int i = 1; i <= 5; i++) {
			 for(int j = 1; j <= 5; j++) {
				if(j>=space){	
				 System.out.print("*");}
				else{
					System.out.print(" ");
				}
			 }//1차 for
			 System.out.println();
			 space++;
		 }//2차 for
		 	
		 
	}//main
}//class
