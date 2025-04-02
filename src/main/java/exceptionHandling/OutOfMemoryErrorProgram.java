package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorProgram {

	public static void main(String[] args) {
		List<Integer[]> data = new ArrayList<Integer[]> ();
		while(1>0) {
			data.add(new Integer[10000000]);
		}
	}

}
