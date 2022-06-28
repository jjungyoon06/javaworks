package builtinclass;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//날짜 - 년, 월, 일
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		//시간 - 시, 분, 초
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.println(hour + "시" + min + "분" + sec + "초");
		System.out.println(day); //일(1) 월(2) 화(3) ...
		
		
		
	}

}
