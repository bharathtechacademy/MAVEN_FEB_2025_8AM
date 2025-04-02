package nonAccessModifiers;

public class FinalClass1 {
	
	// final ==> data, method and class
	
	// final ==> final properties can't modified
	
	// final data can't be modified
	// final method can't be override
	// final class can't be extended
	
	double pi = 3.14;
	
	public void changeTheValue(double newValue) {
		pi = newValue;
	}
	
	public void printName() {
		System.out.println("Bharath");
	}

}
