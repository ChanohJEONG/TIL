package CH12;

public class Equals {
	public static void main(String[] args) {
		String s1 = "��";
		String s2 = "��";
		String s3 = new String("��");
		
		
		
		if(s1!=s3){
			System.out.println("new string�� ���� ����");
		}
		
		if(s1.equals(s3)){
			System.out.println("s1==s3");
		}
		
				
	}
}
