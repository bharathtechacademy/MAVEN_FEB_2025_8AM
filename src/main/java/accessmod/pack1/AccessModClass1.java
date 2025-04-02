package accessmod.pack1;

public class AccessModClass1 {
	
	private String name = "Ashok";
	
	public String getName() {
		return name;
	}
	
	public void setNewName(String newName) {
		name =newName;
	}
	
	public void printEmpId() {
		System.out.println(1234);
	}

	public static void main(String[] ashok) {
		AccessModClass1 obj = new AccessModClass1();
		System.out.println(obj.name);
		obj.printEmpId();
	}

}
