package J13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {
	public static void main(String[] args) {
		 Calendar cal = Calendar.getInstance();
		 System.out.println(
				 cal.get(Calendar.YEAR) + "년 "
				 + (cal.get(Calendar.MONTH)+1) + "월 "
				 + cal.get(Calendar.DAY_OF_MONTH) + "일 "
				 + (cal.get(Calendar.AM_PM) == 0 ? "오전" : "오후")
				 );
		 switch(cal.get(Calendar.DAY_OF_WEEK)) {
		 case Calendar.SUNDAY : System.out.println("일요일"); break;
		 case Calendar.MONDAY : System.out.println("월요일"); break;
		 case Calendar.TUESDAY : System.out.println("화요일"); break;
		 case Calendar.WEDNESDAY : System.out.println("수요일"); break;
		 case Calendar.THURSDAY : System.out.println("목요일"); break;
		 case Calendar.FRIDAY : System.out.println("금요일"); break;
		 case Calendar.SATURDAY : System.out.println("토요일"); break;
		 
		 }
		 
		 Calendar c = new GregorianCalendar();
		 System.out.println(
				 c.get( GregorianCalendar.HOUR_OF_DAY) + "시 "
				 + c.get(c.MINUTE) + "분 "
				 + c.get(c.SECOND) + "초 "
				 );
	}

}
