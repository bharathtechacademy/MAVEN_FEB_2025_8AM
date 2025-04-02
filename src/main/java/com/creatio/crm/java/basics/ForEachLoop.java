package com.creatio.crm.java.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachLoop {

	// for each loop ==> extended for loop ==> It will be used to iterate multiple
	// values available in pre-defined list

//	for(datatype variable : list) {
//		
//	}

	public static void main(String[] args) {

		int[] empIds = new int[3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;

		// for loop
		for (int i = 0; i < empIds.length; i++) {
			System.out.println(empIds[i]);
		}

		// for-each loop
		for (int empId : empIds) {
			System.out.println(empId);
		}

		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Ashok");
		empNamesHashSet.add("Maha");
		empNamesHashSet.add("Afreen");
		empNamesHashSet.add("Ajay");
		empNamesHashSet.add("Bharath");

		// for-each loop
		for (String empName : empNamesHashSet) {
			System.out.println(empName);
		}
		
		List<String> empNamesArrayList1 = new ArrayList<String>();
		empNamesArrayList1.add("Ashok");
		empNamesArrayList1.add("Maha");
		empNamesArrayList1.add("Afreen");
		empNamesArrayList1.add("Ajay");
		empNamesArrayList1.add("Bharath");
		empNamesArrayList1.add("Ashok");
		
		List<String> empNamesArrayList2 = new ArrayList<String>();
		empNamesArrayList2.add("Ashok1");
		empNamesArrayList2.add("Maha1");
		empNamesArrayList2.add("Afreen1");
		empNamesArrayList2.add("Ajay1");
		empNamesArrayList2.add("Bharath1");
		empNamesArrayList2.add("Ashok1");
		
		List<List<String>> list = new ArrayList<List<String>>();
		list.add(empNamesArrayList1);
		list.add(empNamesArrayList2);
		
		for (List<String> data : list) {			
			for (String val :data) {
				System.out.println(val);
			}
		}
	}

}
