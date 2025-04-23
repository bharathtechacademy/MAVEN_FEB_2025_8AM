package selenium.webactions;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateSelection {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		LocalDate dateAndTime = LocalDate.now();	
		LocalDate newDate = dateAndTime.plusDays(10);
		
		System.out.println(newDate);

	}

}
