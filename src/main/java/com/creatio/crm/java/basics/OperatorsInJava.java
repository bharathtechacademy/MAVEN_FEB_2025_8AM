package com.creatio.crm.java.basics;

public class OperatorsInJava {
	
//	Operators in Java

//	1. Arithmetic Operators (+, -, *, /, %, ++ (increment by 1), -- (decrement by 1)) (Special chars used to perform mathematical operations)
//	2. Assignment Operators (=,+=,-=,*=,/=,%=)  (Special chars used to assign value to variable)
//	3. Conditional Operators (==, !=, >, <, >=, <= ) (Special chars used to compare primitive values)
//	4. Logical Operators (&&, ||, ! ) (Special chars used to build conditions)
//	5. Ternary Operator	 ( ? --> Used as a shorthand for if-else statements.)

	public static void main(String[] args) {

//		1. Arithmetic Operators (+, -, *, /, % (modulus-remainder), ++ (+1,increment by 1), -- (-1,decrement by 1)) (Special chars used to perform mathematical operations)
		
		System.out.println("*******Arithmetic Operators (+, -, *, /, % (modulus), ++ (+1,increment by 1), -- (-1,decrement by 1))********");
		int a = 10;
		int b = 20;
		
		
//		a++ ==> post increment ==> post execution of current line increse the value
//		++a ==> pre increment ==> before executing increse the value
		
		//a++ ==> post-increment ==>execute current statement first and then increase the value by 1
		System.out.println(a++);//10 ==> a=a+1
		System.out.println(a);//11
		
		//++b ==> pre-increment ==>increase the value by 1 first and then execute the statements
		System.out.println(++b);//21
		
		System.out.println(a--);//11
		System.out.println(--b);//20
		
		
		int c = 10;
		int d = 2;
		System.out.println(c%d);//0		
		System.out.println(c+d);//12
		
//		2. Assignment Operators (=,+=,-=,*=,/=,%=)  (Special chars used to assign value to variable)
		System.out.println("*******Assignment Operators (=,+=,-=,*=,/=,%=) ********");
		
		int i = 10;
		
		i+=5;//i=i+5;
		System.out.println(i);//15
		
		i-=10;//i=i-10;
		System.out.println(i);//5
		
		i%=5;//i=i%5;
		System.out.println(i);//0
		
		
//		3. Conditional Operators (==, !=, >, <, >=, <= ) (Special chars used to compare primitive values)
		System.out.println("*******Conditional Operators (==, !=, >, <, >=, <= )********");
		
		int j = 10;
		int k = 20;
		
		System.out.println(j==k);
		System.out.println(j!=k);
		System.out.println(j>k);
		System.out.println(j<k);
		System.out.println(j<=k);
		
//		4. Logical Operators (&& (and),  ||, ! ) (Special chars used to build conditions)
		System.out.println("*******Logical Operators (&&, ||, ! )********");
		
		int x =10;
		int y =20;
		int z =10;
		
		System.out.println(x>y && x==z); //false and true ==> false
		System.out.println(x>y || x==z); //false or true ==> true
		System.out.println(!(x>y || x==z)); //not (false or true )==> not (true) ==> false
		
//		5. Ternary Operator	 ( ? --> Used as a shorthand for if-else statements.)
		
		//syntax: (condition) ? true : false
		
		int s = 30;
		int t = 20;

		int maxNumber = (s > t) ? s : t; // if (s > t)? then 's' is the output else(:) 't' is the output 
		System.out.println(maxNumber);
	}

}
