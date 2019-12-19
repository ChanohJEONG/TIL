package Ch05;

public class array {
	public static void main(String[] args) {
/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		String sep = " ";
		
		for(int i=0; i < arr.length; i=i+2){
			System.out.print(sep + arr[i]);
			sep = ", ";
		}
		*/
		int[] numbers = {3, 2, 1, 0, 4};
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < min ) {
				min = numbers[i];
			}//if
		}//for
		System.out.println("ÃÖ¼Ò°ª : " + min);
		
		
	}//main
}//class
