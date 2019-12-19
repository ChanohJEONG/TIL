package Ch05;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("빙고 크기를 입력해주세요");
		int size = s.nextInt();
		
		int[][]bingo = new int[size][size];
		for(int i =0; i < size * size; i++){
			bingo[i/size][i%size] = i + 1;
		}
		for(int i = 0; i < size; i++){
			for(int j=0; j < size; j++){
				System.out.print(
						bingo[i][j] < 10 ?  "0" + bingo[i][j] + " "
								: bingo[i][j] + " ");
			}
			System.out.println();
		}
		
		s.close();
	}//main

}//class
