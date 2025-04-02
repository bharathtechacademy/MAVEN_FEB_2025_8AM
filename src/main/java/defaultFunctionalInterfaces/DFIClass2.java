package defaultFunctionalInterfaces;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DFIClass2 {

	public static void main(String[] args) {
		
//		DFIClass1 cls1 = x -> x.isEmpty();
//		System.out.println(cls1.isEmpty("Gogu"));
		
		Predicate<String> pc = y -> y.isEmpty();
		System.out.println(pc.test("Gogu"));
		
		Function<Integer, Integer> fn = x -> x*x;
		System.out.println(fn.apply(2));
		
		BiFunction<Integer,Integer, Integer> bfn = (a,b)-> a+b;
		System.out.println(bfn.apply(1, 2));
		
		Supplier<String> sp = () -> {
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
			Date dateAndTime = Calendar.getInstance().getTime();				
			String uniqueId = sdf.format(dateAndTime);
			return uniqueId;
		};
		System.out.println(sp.get());
		
		Consumer<String> cn = x -> System.out.println(x.toUpperCase());
		cn.accept("Ajay");
		
	}

}
