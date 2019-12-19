package CH12;

public class Equals {
	public static void main(String[] args) {
		String s1 = "가";
		String s2 = "가";
		String s3 = new String("가");
		
		
		
		if(s1!=s3){
			System.out.println("new string과 같지 않음");
		}
		
		if(s1.equals(s3)){
			System.out.println("s1==s3");
		}
		
				
	}
}
