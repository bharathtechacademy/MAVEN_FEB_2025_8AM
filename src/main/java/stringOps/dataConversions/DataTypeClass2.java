package stringOps.dataConversions;

public class DataTypeClass2 extends DataTypeClass1{

	public static void main(String[] args) {
		
		DataTypeClass2 obj1 = new DataTypeClass2();
		DataTypeClass1 obj2 = new DataTypeClass2(); // upcasting

		DataTypeClass2 obj3 =(DataTypeClass2) obj2; //downcating
	}

}
