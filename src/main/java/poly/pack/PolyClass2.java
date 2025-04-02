package poly.pack;

public class PolyClass2 extends PolyClass1{	
	
	//Overriding
	public int sumOfNumbers(int a, int b) {
		int c= a+b;
		return c;
	}
	
	//Overloading
	public int sumOfNumbers(int a, int b, int c) {
		int d= a+b+c;
		return d;
	}
	
	//Overloading
	public double sumOfNumbers(double a, double b) {
		double c= a+b;
		return c;
	}

	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2();
		System.out.println(obj.sumOfNumbers(1,2));
		System.out.println("Bharath");
		System.out.println(1234);
		System.out.println(true);
		System.out.println(10.2345);
	}

}
