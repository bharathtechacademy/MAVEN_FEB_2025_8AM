package nonAccessModifiers;

public class FinalClass2 extends FinalClass1 {
	
	public void printName() {
		System.out.println("Bharath Reddy");
	}

	public static void main(String[] args) {
		FinalClass1 obj = new FinalClass1();
		obj.changeTheValue(3.14159);
		System.out.println(obj.pi);
		obj.printName();
	}

}
