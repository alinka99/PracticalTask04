
public class GregorianCalendarAction {

	public static boolean checkLeapYear(int year){
		
		boolean flag = false;
		
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					flag = true;
				}
			} else{
				flag = true;
			}
		}
		
		return flag;
	}
	
	public static int getNextDate(int day, int month, int year){
		
		int nextDay = day, nextMonth = month, nextYear = year;
		
		if ((year >= 0) && (month >= 1 && month <= 12) && day >= 1 && day < 28){
			nextDay += 1;
		} else if (day == 31){
				if (month == 12){
					nextDay = 1;
					nextMonth = 1;
					nextYear += 1;
				} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10){
					nextDay = 1;
					nextMonth += 1;
				} else {
					return -1;
				}
		} else if (day == 30 || day == 29) {
			if (month == 4 || month == 6 || month == 9 || month == 11 || (day == 29 && month == 2)){
				nextDay = 1;
				nextMonth += 1;
			} else if (day == 30 && month == 2){
				return -1;
			} else {
				nextDay += 1;
			}
		} else if (day == 28) { 
			if (month == 2 && !checkLeapYear(year)){
				nextDay = 1;
				nextMonth += 1;
			}
			else {
				nextDay += 1;			
			}
		} else {
			return -1;
		}
		
		System.out.printf("The next day is %02d.%02d.%04d", nextDay, nextMonth, nextYear);
		
		return 1;
	}
	
}
