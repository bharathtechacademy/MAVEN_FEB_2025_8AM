package stringOps.dataConversions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataConversions {

	public static void main(String[] args) {
		
		// convert String to other data types
		String balance = " Account Balance : 9999$";
		balance = balance.replaceAll("[^0-9]", "");
		int Balance = Integer.valueOf(balance); // for double => Double.valueOf, 		
		if(Balance>=10000) {
			System.out.println("Minimum Balance Available");
		}else {
			System.out.println("Minimum Balance is not Available");
		}
		
		// String to integer
		int stdCode = 144;
		int phone = 345676;
		String StdCode = String.valueOf(stdCode);
		System.out.println(StdCode+phone);
		
		// Converting timestamp into String
		//nanthinikumari+280320250834+@gmail.com
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		Date dateAndTime = Calendar.getInstance().getTime();				
		String uniqueId = sdf.format(dateAndTime);
		System.out.println(uniqueId);
		
		
		// Type Casting (Converting one data type to similar data type)
		
		// 1. Primitive Type Casting ==> byte-->short --> int --> long -->float -->double
		byte marks = 90; //1 byte 
		int newMarks = marks; //4 bytes  //widening casting
		
		int price= 20;
		byte newPrice = (byte) price; //narrow casting
		
		// 2. Reference Type Casting --> convert one class objects to another
		
		
	}

}
