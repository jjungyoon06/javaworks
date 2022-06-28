package Information_hiding;

public class MyDate {

	//필드
	
	private int day;
	private int month;
	private int year;
	
	//set
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				if(day == 29) {
					if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						System.out.println("윤년입니다.");
							}
						}else {
					System.out.println("날짜 오류입니다.");
				}
				}else {
						this.day = day;
				}
				}
						this.day = day;
				}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//get
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
}
