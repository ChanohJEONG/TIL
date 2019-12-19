package Ch04;

public class example4_5 {
	public static void main (String[] args){
		
		boolean isContinue = true;
		 int count = 0;

		 while(isContinue) {
		 int num1 = (int) (Math.random() * 6 + 1);
		 int num2 = (int) (Math.random() * 6 + 1);

		 if(num1 + num2 == 10){
			 System.out.println("( "+num1+","+num2+" )");
			 break;
		 }
		 else{
			 System.out.println("( "+num1+","+num2+" )");
		 }
		 count++;
		 }
		 System.out.println("주사위를 던진 횟수 : " + count);
		
	}//main

}//class
