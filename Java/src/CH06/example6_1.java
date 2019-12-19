package CH06;

public class example6_1 {

	int plus(int a, int b){
		
		return a + b;
	}
	
	int minus(int a, int b){
		return a - b;
	}
	
	public static void main(String[] args) {
		example6_1 m = new example6_1();
		
		int result1 = m.plus(5,3);
		System.out.println(result1);
		int result2 = m.minus(5,3);
		System.out.println(result2);
	}
}
