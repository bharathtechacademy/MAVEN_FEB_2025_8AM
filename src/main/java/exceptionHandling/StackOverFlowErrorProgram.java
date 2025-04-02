package exceptionHandling;

public class StackOverFlowErrorProgram {
	
	
	public static void printName() {
		printName();
	}

	public static void main(String[] args) {
		printName();
	}

}
