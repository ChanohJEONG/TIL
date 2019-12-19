package Ch05;

public class ArraySort {
	public static void main(String[] args) {
		char[] arr = {'b', 'e', 'z', 'a', 'w'};
		for (int i = 0; i < arr.length - 1; i++){
			for (int j = i + 1; j < arr.length; j++){
						if(arr[i] > arr[j]){
						char temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}//if
			}//Inner for
		}//Outer for
		System.out.print(arr);
		
	}//main

}//class
