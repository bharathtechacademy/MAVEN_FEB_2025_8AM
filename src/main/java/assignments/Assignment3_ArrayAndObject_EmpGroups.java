package assignments;

public class Assignment3_ArrayAndObject_EmpGroups {

	public static void main(String[] args) {
		Assignment3_ArrayAndObject_Employees obj = new Assignment3_ArrayAndObject_Employees();
		String[] employeeNames = { obj.employeeName1, obj.employeeName2, obj.employeeName3 };
		int[] employeeIDs = { obj.employeeID1, obj.employeeID2, obj.employeeID3 };

		System.out.println(employeeNames[0] + " : " + employeeIDs[0]);

	}

}
