package accessmod.pack2;

import accessmod.pack1.AccessModClass1;

public class AccessModClass3 {

	public static void main(String[] args) {
		AccessModClass1 obj = new AccessModClass1();
//		AccessModClass3 obj = new AccessModClass3();
//		System.out.println(obj.name);
		System.out.println(obj.getName());
		obj.printEmpId();
//		AccessModClass1.main(args);
	}

}
