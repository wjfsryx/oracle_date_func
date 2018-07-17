package demo_test.date;

import java.sql.Date;

/**
 * 
 * @author James
 * @date 2018Äê7ÔÂ17ÈÕ
 */
public class DateUtils {

	/**
	 * 
	 */
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new java.util.Date());
		System.out.println(new Date(new java.util.Date().getTime()));
		System.out.println(new DateEx(new java.util.Date().getTime()));
	}

}
