package Ch05;
import java.util.Scanner;

public class Card_number {
 public static void main(String[] args) {
	 int startNum = 0; // 최소 카드 번호
	 int endNum = 0; // 최대 카드 번호
	 int count=0;;
	 
	 Scanner scan = new Scanner(System.in);
	
	 System.out.print("카드의 시작 번호를 입력해주세요. > ");
	 	startNum = scan.nextInt(); // 시작 번호 입력
	 	
	 while(true) {
		 System.out.print("카드의 마지막 번호를 입력해주세요. > ");
		 endNum = scan.nextInt(); // 마지막 번호 입력
		 	if(endNum <= startNum) { // 마지막 번호가 시작 번호보다 크지 않다면
		 			System.out.println("시작 번호보다 큰 번호를 입력해주세요.");
		 			}
		 	else { // 마지막 번호가 시작 번호보다 크다면
		 		break; // 반복문 강제 종료 
		 		}//else
	 }//while
	 
	 int cardNum = 0; // 랜덤으로 추출할 카드 번호
	 	while(true) {
	 		cardNum = (int) (Math.random() * (endNum + 1));
	 // 시작과 마지막 번호 범위내의 숫자인지 확인
	 		if(cardNum >= startNum && cardNum <= endNum) break;
	 }//while
	 	System.out.println("카드 번호를 입력해주세요.");
	 while(true) {
		 int userNum = scan.nextInt();
		 count++;
		 	if(userNum == cardNum) {
		 		System.out.println("맞혔습니다.");
		 		System.out.println("시도 횟수 : " +count);
		 		break;
		 		} 
		 	else {
		 		if(userNum >= 99999){System.out.println("프로그램을 종료합니다."); break;}
		 		else if(userNum < startNum || userNum > endNum){ System.out.println("입력 범위를 초과하였습니다."); count--;}
		 		else if(userNum > cardNum){ System.out.println("입력된 숫자보다 카드번호가 적습니다.");}
		 		else {System.out.println("입력된 숫자보다 카드번호가 큽니다.");}
		 	System.out.println("다시 입력해주세요.");
		 		}//else
	 	}//while
	 scan.close();
	 
	 }//main
 
	}//class
