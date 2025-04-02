package stringOps.dataConversions;

public class StringOperations {

	public static void main(String[] args) {
		
		// Store text value in Java
		String value = " Username : Admin | Password : admin123 ";
		
		// Total chars available with in the String ==> String.length();
		System.out.println("Total chars available with in the String are :"+value.length());
		
		// Get Specific char from specific index ==> String.charAt(Index);
		System.out.println("Get char from 5th index :"+value.charAt(5));
		
		// Reverse the String
		String reverseString="";
		
		for(int i=value.length()-1 ;i>=0 ; i--) {
			reverseString+=value.charAt(i);
		}
		System.out.println(reverseString);
		
		// Remove unwanted spaces from the String ==> String.trim();
		System.out.println("Normal Value:"+value);
		System.out.println("Trimmed Value:"+value.trim());
		
		// Remove specific char from String ==> String.replace(oldChars, newChars);
		System.out.println("Value after removing Spaces:"+value.replace(" ", ""));
		System.out.println("Value after removing Spaces:"+value.replaceFirst(" ", ""));
		
		// Remove alphabets from String ==> String.replaceAll([reg. exp], newChars);
		System.out.println(value.replaceAll("[a-zA-Z]", ""));
		
		// Remove numbers from String ==> String.replaceAll([reg. exp], newChars);
		System.out.println(value.replaceAll("[0-9]", ""));
		
		// Remove special chars from String ==> String.replaceAll([reg. exp], newChars);
		System.out.println(value.replaceAll("[^a-zA-Z0-9]", ""));
		
		//Change the case of chars ==>String.toUpperCase(); String.toLowerCase();
		System.out.println(value);
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		
		// Extract the Specific part of the text ==> String.subString(beginingIndex,endIndex+1);
		System.out.println(value.substring(12,17));
		System.out.println(value.substring(31));
		
		// Extract the Specific part of the text from dynamic String ==> String.split(reg exp); [] array of Strings ,then we need to get specific part
		String [] values = value.split(" ");
		System.out.println(values[3]);
		System.out.println(values[7]);
		
		// How to compare String values
		String name = "Bharath";
		System.out.println(name.equals("Bharath"));//true
		System.out.println(name.equals("bharath"));//false
		System.out.println(name.equalsIgnoreCase("bharath"));//true
		System.out.println(name.contains("hara"));//true
		System.out.println(name.contains("Hara"));//false
		System.out.println(name.startsWith("Bha"));//true
		System.out.println(name.endsWith("ath"));//true
		
		String str1 = "Apple";
		String str2 = "Ball";
		System.out.println(str1.compareTo(str2)); //compare lexicographically
		
		// Verify the text is blank or empty
		String val1=" ";
		String val2 ="";
		
		System.out.println(val1.isBlank());
		System.out.println(val1.isEmpty());
		
		System.out.println(val2.isBlank());
		System.out.println(val2.isEmpty());
		
		// String, StringBuffer, StringBuilder 
		
		// String, StringBuffer, StringBuilder can be used to store text values / sequence of chars
		// String is a immutable class and it is thred-safe by default
		// StringBuffer is a mutable class and it is thread-safe along with synchronized
		// StringBuilder is a mutable class but non thread safe
		
		String empName = "Nanthini";
		empName.concat(" Kumari");
		System.out.println(empName); 		
		
		StringBuffer sbf = new StringBuffer("Niraj");
		sbf.append(" Chavan");
		System.out.println(sbf);		
		
		StringBuilder sbd = new StringBuilder("Niraj");
		sbd.append(" Chavan");
		System.out.println(sbd);
		
	}

}
