package com.yovnne.utils;
/*
package com.javaweb.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

*/

/*
public class DateFormatter {

	private DateFormatter() {
		super();
	}

	private final static Logger logger = LoggerFactory.getLogger(DateFormatter.class);
	
	public final static String 	FORMAT_HOUR = "yyyy-MM-dd HH";
	
	public final static String 	FORMAT_SECOND = "yyyy-MM-dd HH:mm:ss";
	
	public final static String 	FORMAT_MINUTE = "yyyy-MM-dd HH:mm";
	
	public final static String 	FORMAT_DAY = "yyyy-MM-dd";
	*/


	/*
	public static Date getSysTime() {
		Calendar sysTime = Calendar.getInstance();
		return sysTime.getTime();
	}

	*/

	/*
	public static Date getSysDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	*/

	/*
	public static Date getSysAfterDay(int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		calendar.add(Calendar.DAY_OF_YEAR, num);
		return calendar.getTime();
	}

	*/

	/*
	public static String formatSencond(Date dateParam) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return fmt.format(dateParam);
	}

	public static Date formatSencond(String dateParam) throws ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return fmt.parse(dateParam);

	}
	
	*/

	/*
	public static Date formatMinute(String dateParam){
		if(StringUtils.isEmpty(dateParam)){
			return null;
		}
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			return fmt.parse(dateParam);
		} catch (ParseException e) {
			logger.error("dataParam === {}",dateParam);
			logger.error(e.getMessage(),e);
			return null;
		}
	}
	*/

	/*
	public static String formatMinute(Date dateParam) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return fmt.format(dateParam);
	}

	*/

	/*
	public static String formatHour(Date dateParam) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH");
		return fmt.format(dateParam);
	}
	
	*/

	/*
	public static Date parseMinute(String dateParam) throws ParseException{
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return fmt.parse(dateParam);
	}

	*/

	/*
	public static String formatDay(Date dateParam) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		return fmt.format(dateParam);
	}

	public static Date formatDay(String dateParam) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return fmt.parse(dateParam);
		} catch (ParseException e) {
			return null;
		}

	}

	*/

	/*
	public static String formatMonth(Date dateParam) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM");
		return fmt.format(dateParam);
	}

	*/

	/*
	public static String formatYear(Date dateParam) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy");
		return fmt.format(dateParam);
	}

	*/

	/*
	public static String formatMillSecond(Date date) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return fmt.format(date);
	}

	*/

	/*
	public static String formatMillSecond(long timeMills) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return fmt.format(timeMills);
	}

	*/

	/*
	public static Date formatYearMonthDayToDateForyyyyMMdd(String yearMonthDay) throws ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		return fmt.parse(yearMonthDay);
	}

	*/

	/*
	public static String getDateByMonth(int num) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, num);
		return formatDay(c.getTime());
	}
	
	

	*/

	/*
	public static Date getDateByYears(Date starDate,int num) {
		Calendar c = Calendar.getInstance();
	    c.setTime(starDate);
        c.add(Calendar.YEAR,num);
        Date date=c.getTime();
		return date;
	}
	
	

	*/

	/*
	public static Integer compareDate(Date date, Date comDate) {
		try {
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();

			c1.setTime(date);
			c2.setTime(comDate);

			return c1.compareTo(c2);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}

	*/

	/*
	public static Date getLastSecondOfDayBefore(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.SECOND, -1);
		return calendar.getTime();
	}

	*/

	/*
	public static String formatLastSecondOfDayBefore(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.SECOND, -1);
		return formatSencond(calendar.getTime());
	}

	*/

	/*
	public static Date getDateStart(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}
	
	*/

	/*
	public static Date getDateEnd(String dateStr) {

		if (StringUtils.isBlank(dateStr)) {
			return null;
		}

		Date date = DateFormatter.formatDay(dateStr);

		return getDateEnd(date);

	}

	*/

	/*
	public static Date getDateEnd(Date date) {
		if (date == null) {
			return null;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

	*/

	/*
	public static int daysBetween(Date smdate, Date bdate) {
		smdate = DateUtils.truncate(smdate, Calendar.DATE);
		bdate = DateUtils.truncate(bdate, Calendar.DATE);
		Calendar cal = Calendar.getInstance();
		cal.setTime(smdate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(bdate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(between_days));
	}
}
*/