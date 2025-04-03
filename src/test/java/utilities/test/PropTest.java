package utilities.test;

import java.util.Properties;

import utilities.PropUtil;

public class PropTest {

	public static void main(String[] args) {
		
		Properties prop = PropUtil.readData("Config.properties");
		
		System.out.println("Launch the application using url :"+prop.getProperty("url"));
		System.out.println("Enter username as :"+prop.getProperty("username"));
		System.out.println("Enter password as :"+prop.getProperty("password"));
	}

}
