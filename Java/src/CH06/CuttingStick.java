package CH06;

import java.util.Arrays;

import org.omg.CORBA.portable.ValueInputStream;

public class CuttingStick {

	void CutOperation (int[] a){
		int min = Integer.MAX_VALUE;

		for(int i = 0; i < a.length; i++) {
			if(a[i] < min || min == 0) {
			min = a[i];}//if
			}//for 최소값 찾기
		
		for(int i = 0; i < a.length; i++) {
			a[i] = a[i]- min;
		}
		System.out.print(Arrays.toString(a));
	}//method
	
	public static void main(String[] args) {
		CuttingStick c = new CuttingStick();
		
		int[] stick = {5,4,4,2,2,8};
		int[] stick2 = {1,2,3,4,3,3,2,1};
		
		System.out.print(Arrays.toString(stick));		
		System.out.println();		
		c.CutOperation(stick);
	}
	
	

}
