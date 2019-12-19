package Ch05;

public class example5_3 {

	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c', 'd', 'e','f','g'};
		for (int i = 0; i < arr.length; i++){
			int num = (int) (Math.random() * arr.length);
				char temp = arr[0];
				arr[0] = arr[num];
				arr[num] = temp;

		}// for
		
		System.out.print(arr);
		
	}//main
	
}//class
