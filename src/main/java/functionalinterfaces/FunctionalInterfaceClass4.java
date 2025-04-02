package functionalinterfaces;

public class FunctionalInterfaceClass4 {

	public static void main(String[] args) {
		
		FunctionalInterfaceClass1 fi1 = (a,b)->a+b;
		System.out.println(fi1.sum(1, 2));
		
		FunctionalInterfaceClass0 fi2 = x -> x*x;
		System.out.println(fi2.square(2));
		
		FunctionalInterfaceClass fi3 = (p,i) -> {
			double interest = (p*i) /100;
			double finalAmount = p+interest;
			return finalAmount;
		};
		System.out.println(fi3.amount(1000, 9));
		
	}

}
