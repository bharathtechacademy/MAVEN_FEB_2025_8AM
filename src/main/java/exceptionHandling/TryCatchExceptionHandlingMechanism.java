package exceptionHandling;

import java.util.concurrent.TimeoutException;

public class TryCatchExceptionHandlingMechanism {

	public static void main(String[] args) {
		
		int [] empIds = new int [3];

		
		try {
			empIds[0] = 1234;
			empIds[1] = 1235;
			empIds[2] = 1236;
			empIds[3] = 1237;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getLocalizedMessage());
			System.out.println("There is a exception caused by Array, Please check");
			empIds[3] = 1238;
		}catch(Exception ex) {
			System.out.println(ex.getLocalizedMessage());
			System.out.println("There is a exception caused by Array, Please check");
			empIds[3] = 1238;
		}finally {	
			System.out.println("Execution Is Completed");
		}
		


	}

}
