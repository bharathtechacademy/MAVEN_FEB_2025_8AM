package nonAccessModifiers;

public class StaticClass1 {
	
	// static (data, method) ==> it can make normal property as global property
	
	static String name = "Amit";
	
	public static void printEmpId() {
		System.out.println(1234);
	}

	public static void main(String[] args) {
//		StaticClass1 obj = new StaticClass1();
//		System.out.println(obj.name);
//		obj.printEmpId();
		
		System.out.println(StaticClass1.name);
		StaticClass1.printEmpId();
	}

}
