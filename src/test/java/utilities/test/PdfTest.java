package utilities.test;

import utilities.PdfUtil;

public class PdfTest {

	public static void main(String[] args) {
		
		String pdfContent = PdfUtil.getText("Data.pdf");
		System.out.println(pdfContent);
	}

}
