package utilities.test;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtil;

public class ExcelTest {

	public static void main(String[] args) {
		
		List<Map<String, String>> sheet1data = ExcelUtil.readData("TestData.xlsx", "Sheet1");
		System.out.println(sheet1data.get(1).get("StudentName"));
		
		String [][] sheet2data = ExcelUtil.readExcelData("TestData.xlsx", "Sheet2");
		System.out.println(sheet2data[1][0]);

	}

}
