package CH06;

public class example6_2 {

	int checkGrade(int kg){
		
		int grade=0;
		if ( kg > 10) grade = 1;
		else if (kg > 7) grade = 2;
		else if (kg > 4) grade = 3;
		else grade = 4;
		
		return grade;
	}
	
	int getBetweenSum(int a, int b){
		int sum=0;
		
		if(a<b){
		for(int i=a;i<=b;i++){
			sum = sum+i;}//for
		}//if
		
		else {
			for(int i=b;i<=a;i++){
			sum = sum+i;}
		
		}//else
		return sum;
	} //삼항연산자 사용 해도 됨! ex) start = a > b ? b : a;
	
	int getLastYear(int a){
		int[] day= {31,28,31,30,31,30,31,31,30,31,30,31};
		return day[a-1];
	}
	void dilemma(boolean xa, boolean xb){
/*		if(xa == true && xb == true) System.out.println("A,B 둘다 5년 복역");
		else if(xa == true && xb == false) System.out.println("A석방, B 10년 복역");
		else if(xa == false && xb == true) System.out.println("A 10년복역, B석방");
		else System.out.println("A,B 둘다 1년 복역");
	*/
		if(xa && xb) System.out.println("A,B 둘다 5년 복역");
		else if(xa && !xb) System.out.println("A석방, B 10년 복역");
		else if(!xa && xb) System.out.println("A 10년복역, B석방");
		else System.out.println("A,B 둘다 1년 복역");
		
		//type자체가 boolean이라 true or false값을 따로 대입안해도됨!
	}//string type으로 선언해서 return 해도 될듯!
	
	
	
	
	
	
	public static void main(String[] args) {
		example6_2 e = new example6_2();
		
		System.out.println(e.checkGrade(5));
		System.out.println(e.checkGrade(11));
		System.out.println(e.checkGrade(8));
		System.out.println(e.checkGrade(4));
		System.out.println(e.getBetweenSum(3, 5));
		System.out.println(e.getBetweenSum(7, 7));
		System.out.println(e.getBetweenSum(5, 3));
		System.out.println(e.getBetweenSum(1, 10));
		System.out.println(e.getLastYear(1));
		System.out.println(e.getLastYear(2));
		System.out.println(e.getLastYear(9));
		System.out.println(e.getLastYear(11));
		e.dilemma(true, true);
		e.dilemma(true, false);
		e.dilemma(false, true);
		e.dilemma(false, false);

	}

}
