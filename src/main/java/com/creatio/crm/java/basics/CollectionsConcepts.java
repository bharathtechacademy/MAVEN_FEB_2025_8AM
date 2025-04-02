package com.creatio.crm.java.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsConcepts {
	
	//Array Can Store Multiple Values With Same Data Type together at Same memory Location
	
	//Challenges with Array
	
	// 1. Arrays are fixed in length
	// 2. Array follows static memory allocation
	// 3. Arrays won't allow modifications
	// 4. Array allows only similar data types
	
	
	//Collections Framework ==> can solve all the above challenges of arrays
	
	// List ==> ArrayList, LinkedList	
	// 1. List can store multiple values with similar data type together at same memory location by allocating memory dynamically
	// 2. List allows duplicate values
	// 3. List can follow dynamic memory allocation
	// 4. List allows modifications
	
	// Set ==> HashSet, LinkedHashSet and TreeSet
	// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. Set won't allows duplicate values
	// 3. Set can follow dynamic memory allocation
	// 4. Set allows modifications
	
	// Map ==> HashMap, LinkedHashMap, TreeMap and Hashtable
//	1. Map can store multiple datatypes together in the form of Key and Values
//	2. Map can store duplicate values but, duplicate keys are not allowed
//	3. Map can follow dynamic memory allocation
//	4. Map can allow modifications


	public static void main(String[] args) {
		
		int [] empIds = new int [3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;
		
		System.out.println(empIds.length);
		
		/*********************ArrayList*************************/
		System.out.println("*********************ArrayList*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//ArrayList follows contiguous memory allocation
		//ArrayList follows Insertion order
		//ArrayList allow null values
		
		List<Object> empIdsArrayList = new ArrayList<>();
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Ashok");
		empNamesArrayList.add("Maha");
		empNamesArrayList.add("Afreen");
		empNamesArrayList.add("Ajay");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Ashok");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Bharath");
		
		System.out.println(empNamesArrayList.get(1)); //get 2nd value
		System.out.println("Size of ArrayList is :"+empNamesArrayList.size());
		System.out.println(empNamesArrayList);
		
		/*********************LinkedList*************************/
		System.out.println("*********************LinkedList*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//LinkedList won't follow contiguous memory allocation
		//LinkedList follows Insertion order
		//LinkedList allow null values
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Ashok");
		empNamesLinkedList.add("Maha");
		empNamesLinkedList.add("Afreen");
		empNamesLinkedList.add("Ajay");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Ashok");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("Bharath");
		
		System.out.println(empNamesLinkedList.get(1)); //get 2nd value
		System.out.println("Size of LinkedList is :"+empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);
		
		/*********************HashSet*************************/
		System.out.println("*********************HashSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//HashSet won't follow contiguous memory allocation
		//Order of Storing : Random Order
		//Null Values : Allowed
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Ashok");
		empNamesHashSet.add("Maha");
		empNamesHashSet.add("Afreen");
		empNamesHashSet.add("Ajay");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Ashok");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Bharath");
		
		System.out.println("Size of HashSet is :"+empNamesHashSet.size());
		System.out.println(empNamesHashSet);
		
		/*********************LinkedHashSet*************************/
		System.out.println("*********************LinkedHashSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//LinkedHashSet won't follow contiguous memory allocation
		//Order of Storing : Insertion Order
		//Null Values : Allowed
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Ashok");
		empNamesLinkedHashSet.add("Maha");
		empNamesLinkedHashSet.add("Afreen");
		empNamesLinkedHashSet.add("Ajay");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Ashok");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Bharath");
		
		System.out.println("Size of LinkedHashSet is :"+empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		/*********************TreeSet*************************/
		System.out.println("*********************TreeSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//TreeSet won't follow contiguous memory allocation
		//Order of Storing : Ascending Order
		//Null Values : Not Allowed
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Ashok");
		empNamesTreeSet.add("Maha");
		empNamesTreeSet.add("Afreen");
		empNamesTreeSet.add("Ajay");
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("Ashok");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Bharath");
		
		System.out.println("Size of TreeSet is :"+empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);
		
		
		/*********************HashMap*************************/
		System.out.println("*********************HashMap*************************");
		
		//Syntax to Initialize: Collection <Key,Value> variable = new Collection<Key,Value>();
		//Syntax to add data: variable.put(key, value);
		//Syntax to remove the data:variable.remove(key);
		//Syntax to get the total value : variable.size();
		
		//Order of Storing : Random Order
		//Null Values : Allowed	
		//Null Keys : Allowed

		Map<String, Integer> empNamesHashMap = new HashMap<String, Integer>();
		empNamesHashMap.put("Ashok",1);
		empNamesHashMap.put("Bharath",2);
		empNamesHashMap.put("Ashok",3);
		empNamesHashMap.put("Maha",4);
		empNamesHashMap.put("Ajay",5);
		empNamesHashMap.put("Gogu",null);
		empNamesHashMap.put(null,7);
		empNamesHashMap.remove("Bharath");
		
		System.out.println("Size of HashMap is :"+empNamesHashMap.size());
		System.out.println(empNamesHashMap.get(5));
		System.out.println(empNamesHashMap);
		
//		Map<Integer,String> empNamesHashMap = new HashMap<Integer,String>();
//		empNamesHashMap.put(1,"Ashok");
//		empNamesHashMap.put(2,"Bharath");
//		empNamesHashMap.put(3,"Ashok");
//		empNamesHashMap.put(1,"Maha");
//		empNamesHashMap.put(5,"Ajay");
//		empNamesHashMap.put(6,null);
//		empNamesHashMap.put(null,"Charan");
//		empNamesHashMap.remove(2);
//		
//		System.out.println("Size of HashMap is :"+empNamesHashMap.size());
//		System.out.println(empNamesHashMap.get(5));
//		System.out.println(empNamesHashMap);
		
		/*********************LinkedHashMap*************************/
		System.out.println("*********************LinkedHashMap*************************");
		
		//Syntax to Initialize: Collection <Key,Value> variable = new Collection<Key,Value>();
		//Syntax to add data: variable.put(key, value);
		//Syntax to remove the data:variable.remove(key);
		//Syntax to get the total value : variable.size();
		
		//Order of Storing : Insertion Order
		//Null Values : Allowed	
		//Null Keys : Allowed

		Map<String, Integer> empNamesLinkedHashMap = new LinkedHashMap<String, Integer>();
		empNamesLinkedHashMap.put("Ashok",1);
		empNamesLinkedHashMap.put("Bharath",2);
		empNamesLinkedHashMap.put("Ashok",3);
		empNamesLinkedHashMap.put("Maha",4);
		empNamesLinkedHashMap.put("Ajay",5);
		empNamesLinkedHashMap.put("Gogu",null);
		empNamesLinkedHashMap.put(null,7);
		empNamesLinkedHashMap.remove("Bharath");
		
		System.out.println("Size of LinkedHashMap is :"+empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap.get(5));
		System.out.println(empNamesLinkedHashMap);
		
		/*********************TreeMap*************************/
		System.out.println("*********************TreeMap*************************");
		
		//Syntax to Initialize: Collection <Key,Value> variable = new Collection<Key,Value>();
		//Syntax to add data: variable.put(key, value);
		//Syntax to remove the data:variable.remove(key);
		//Syntax to get the total value : variable.size();
		
		//Order of Storing : Ascending Order
		//Null Values : Allowed	
		//Null Keys : Not Allowed

		Map<String, Integer> empNamesTreeMap = new TreeMap<String, Integer>();
		empNamesTreeMap.put("Ashok",1);
		empNamesTreeMap.put("Bharath",2);
		empNamesTreeMap.put("Ashok",3);
		empNamesTreeMap.put("Maha",4);
		empNamesTreeMap.put("Ajay",5);
		empNamesTreeMap.put("Gogu",null);
//		empNamesTreeMap.put(null,7);
		empNamesTreeMap.remove("Bharath");
		
		System.out.println("Size of TreeMap is :"+empNamesTreeMap.size());
		System.out.println(empNamesTreeMap);
		
		
		/*********************Hashtable*************************/
		System.out.println("*********************Hashtable*************************");
		
		//Syntax to Initialize: Collection <Key,Value> variable = new Collection<Key,Value>();
		//Syntax to add data: variable.put(key, value);
		//Syntax to remove the data:variable.remove(key);
		//Syntax to get the total value : variable.size();
		
		//Order of Storing : Random Order
		//Null Values : Not Allowed	
		//Null Keys : Not Allowed

		Map<String, Integer> empNamesHashtable = new Hashtable<String, Integer>();
		empNamesHashtable.put("Ashok",1);
		empNamesHashtable.put("Bharath",2);
		empNamesHashtable.put("Ashok",3);
		empNamesHashtable.put("Maha",4);
		empNamesHashtable.put("Ajay",5);
		empNamesHashtable.put("Charan",6);
//		empNamesHashtable.put("Gogu",null);
//		empNamesHashtable.put(null,7);
		empNamesHashtable.remove("Bharath");
		
		System.out.println("Size of Hashtable is :"+empNamesHashtable.size());
		System.out.println(empNamesHashtable);
		
		
		
		HashMap<String,Object> data1 = new HashMap<String,Object>();
		data1.put("Name", "Bharath Reddy");
		data1.put("Id", 1234);
		data1.put("VisaStatus", true);
		
		HashMap<String,Object> data2 = new HashMap<String,Object>();
		data2.put("Name", "Charan Reddy");
		data2.put("Id", 1235);
		data2.put("VisaStatus", true);
		
		List<Map<String,Object>> dataSet = new ArrayList<Map<String,Object>> ();
		dataSet.add(data1);
		dataSet.add(data2);
		
		System.out.println(dataSet.get(1).get("Name"));
		

	}

}
