package dateAndCalender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DateAndCalender {

	public static void main(String[] args) throws ParseException {
		// TO use system date
//		Date date = new Date();
//		SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
//		String formatedDate = simpledateformat.format(date);
//		System.out.println(formatedDate);
		
		// to use required date
//		SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy");
//		Date date = simpledateformat.parse("10/16/1993");
//		//System.out.println(date);
//		System.out.println(simpledateformat.format(date));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar today = Calendar.getInstance();
		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar.get(calendar.YEAR));
//		System.out.println(calendar.get(calendar.MONTH));
//		System.out.println(calendar.get(calendar.DAY_OF_MONTH));
//		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
//		System.out.println(calendar.get(calendar.DAY_OF_YEAR));
		Date dob = dateFormat.parse("10/16/1993");
		calendar.setTime(dob);
		System.out.println("Age: "+(today.get(Calendar.YEAR)- calendar.get(Calendar.YEAR)));
	}

}
