package keywords;

public class thisAndSuper2 extends thisAndSuper1{
	
	String name = "Balu Mahendran";
	
	public void printName (String name) {
		System.out.println(name);
//		System.out.println(new KeyClass2().name);
//		System.out.println(new KeyClass1().name);
		System.out.println(this.name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		thisAndSuper2 obj = new thisAndSuper2();
		obj.printName("Balu Mahendran M");
	}

}
