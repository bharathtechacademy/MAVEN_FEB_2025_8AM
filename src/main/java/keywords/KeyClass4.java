package keywords;

public class KeyClass4 extends KeyClass3 {

	public static void main(String[] args) {
		KeyClass4 obj1 = new KeyClass4();
		KeyClass3 obj2 = new KeyClass3();

		System.out.println(obj2 instanceof KeyClass4);
		System.out.println(obj1 instanceof KeyClass4);
	}

}
