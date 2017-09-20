package ccd.red;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class QuartalRechner {
	
	public String getQuarter(Date when) {

		String result;
		Calendar cal = new GregorianCalendar();
		cal.setTime(when);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		switch (month) {
		case 1:
			result = String.valueOf(1) + "/" + String.valueOf(year);
			break;
		case 2:
			result = String.valueOf(1) + "/" + String.valueOf(year);
			break;
		case 3:
			result = String.valueOf(1) + "/" + String.valueOf(year);
			break;
		case 4:
			result = String.valueOf(2) + "/" + String.valueOf(year);
			break;
		case 5:
			result = String.valueOf(2) + "/" + String.valueOf(year);
			break;
		case 6:
			result = String.valueOf(2) + "/" + String.valueOf(year);
			break;
		case 7:
			result = String.valueOf(3) + "/" + String.valueOf(year);
			break;
		case 8:
			result = String.valueOf(3) + "/" + String.valueOf(year);
			break;
		case 9:
			result = String.valueOf(3) + "/" + String.valueOf(year);
			break;
		case 10:
			result = String.valueOf(4) + "/" + String.valueOf(year);
			break;
		case 11:
			result = String.valueOf(4) + "/" + String.valueOf(year);
			break;
		case 12:
			result = String.valueOf(4) + "/" + String.valueOf(year);
			break;
		default:
			result = "";
			break;
		}
		return result;
	}
}
