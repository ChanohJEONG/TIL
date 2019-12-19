package CH07;

import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
	}

}
