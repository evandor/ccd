package ccd.red;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class QuartalRechner {

	public String getQuarter(Date when) {

		Calendar cal = new GregorianCalendar();
		cal.setTime(when);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		switch (month) {
		case 1:
		case 2:
		case 3:
			return createQuarter(1, year);
		case 4:
		case 5:
		case 6:
			return createQuarter(2, year);
		case 7:
		case 8:
		case 9:
			return createQuarter(3, year);
		case 10:
		case 11:
		case 12:
			return createQuarterString(4, year);
		}
		return "";
	}

    private String createQuarter(int month, int year) {
        return month + "/" + String.valueOf(year);
    }

	private String createQuarterString(int month, int year) {
	    return month + "/" + year;
	}
}
