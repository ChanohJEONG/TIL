package CH07;

public class Class7_3 {
	int a = 0 ;
	
	public static void method1(){
		Class7_3 c = new Class7_3();
		System.out.println("method1 실행 시작");
			for(int i=0; i < 5; i++){
				c.method2();
				}//for
			System.out.println("method1 실행 종료");
		}//method1


	public void method2(){
		a = a + 1;
		System.out.println(a);
	}//method

}//class