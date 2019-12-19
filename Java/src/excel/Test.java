package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test {

	public static void main(String[] args) throws BiffException, IOException {
	    File file = new File("lotto.xls");
	    Workbook w = Workbook.getWorkbook(file);
	    Sheet s = w.getSheet(0);
	 
	    int rows = s.getRows();
	    int count=0;
	    //shift + alt + a 한번에 열편집!
	    
	    for (int i=3; i < rows; i++){
	    	String n1 = s.getCell(13, i).getContents();
	    	int d1 = Integer.parseInt(n1);//기본자료형이 아니기때문에 라이브러리 메소드를 사용하는것!
	    	String n2 = s.getCell(14, i).getContents();
	    	int d2 = Integer.parseInt(n2);//기본자료형이 아니기때문에 라이브러리 메소드를 사용하는것!
	    	String n3 = s.getCell(15, i).getContents();
	    	int d3 = Integer.parseInt(n3);//기본자료형이 아니기때문에 라이브러리 메소드를 사용하는것!
	    	String n4 = s.getCell(16, i).getContents();
	    	int d4 = Integer.parseInt(n4);//기본자료형이 아니기때문에 라이브러리 메소드를 사용하는것!
	    	String n5 = s.getCell(17, i).getContents();
	    	int d5 = Integer.parseInt(n5);//기본자료형이 아니기때문에 라이브러리 메소드를 사용하는것!
	    	String n6 = s.getCell(18, i).getContents();
	    	int d6 = Integer.parseInt(n6);//기본자료형이 아니기때문에 라이브러리 메소드를 사용하는것!
	    	String bonus = s.getCell(19, i).getContents();
	    	int dbonus = Integer.parseInt(bonus);//기본자료형이 아니기때문에 라이브러리 메소드를 사용하는것!
	    	
	    	if(d1 + d2 == d3 && d6 >35 ){
	    		System.out.println(++count);
	    		
	    	}
	    //	System.out.printf("%s %s %s %s %s %s %s\n",n1,n2,n3,n4,n5,n6,bonus);
//	    			n1.getContents(),n2.getContents(),
//	    			n3.getContents(),n4.getContents()
//	    			,n5.getContents(),n6.getContents()
//	    			,bonus.getContents());
	    }//for
	    
	    Cell c = s.getCell(0, 0);
	    String contents = c.getContents();
	//    System.out.println(contents);
	}

}
