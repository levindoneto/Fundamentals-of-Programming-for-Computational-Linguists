/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex44.java
	Execution:    java ex44
	
	4.4 Functions
	a) Write a function
	static void sayHi()
	that prints "Hi!". Then, in your main function, write a loop that prints \Hi" 10 times,
	using your public static void main(String[] args) { function.
	b) Write a function
	static int absoluteValue(int x)
	that computes the absolute value ("Betrag") of x. In the main function, compute the
	absolute values of the numbers 11, 5, 0, -24, and -3.34. (Note: There may or may not be
	a problem here.)
	c) Adapt your "array search" program from above so that the search is moved into a function.
	So, write a function search. The function will take two arguments (int[] anArray, int aNumber)
	and print the solution for those. Test the function with three examples.
	d) Now modify the function so that the result is no longer printed but instead returned. Test
	the function again.
*/

public class ex44 {
	
	// Exercise 4.4 (a)
	public static void sayHi() {
		System.out.println("Hi!");
	}
	
	// Exercise 4.4 (b)
	static int absoluteValue(int x) {
		return Math.abs(x);
	}
	
	// Exercise 4.4 (c)
	public static void search(int[] anArray, int aNumber) {
		boolean find = false;
		
		for (int i=0; i<anArray.length; i++) {
			if (anArray[i] == aNumber) {
				System.out.println("Position in the array: " + i);
				find = true;
			}
		}
		if (find == false) {
			System.out.println("-1");
		}
	}
	
	// Exercise 4.4 (d)
	static int searchWithReturn(int[] anArray, int aNumber) {		
		for (int i=0; i<anArray.length; i++) {
			if (anArray[i] == aNumber) {
				return i;
			}
		}
		return -1; // Element not found
	}
	
    public static void main(String[] args) {
		System.out.println("*** Exercise 4.4 (a) ***");
		for (int i=0; i<10; i++) {
			sayHi();
		}
		
		System.out.println("\n*** Exercise 4.4 (b) ***");
		System.out.println(absoluteValue(11));
		System.out.println(absoluteValue(5));
		System.out.println(absoluteValue(0));
		System.out.println(absoluteValue(-24));
		System.out.println(absoluteValue((int)-3.34)); // the function has an int parameter, not a float
		
		System.out.println("\n*** Exercise 4.4 (c) ***");
		System.out.println("* Example 01: \n* Vector: {1, 3, 99, 4, 5}\n* Searched number: 4");
		int[] numbers_1 = {1, 3, 99, 4, 5};
		int x_1 = 4;
		search(numbers_1, x_1);
		
		System.out.println("\n* Example 02: \n* Vector: {1, 3, 99, 4, 5}\n* Searched number: 2");
		int[] numbers_2 = {1, 2, 3, 4, 5};
		int x_2 = 2;
		search(numbers_2, x_2);
		
		System.out.println("\n* Example 03: \n* Vector: {1, 3, 99, 4, 5}\n* Searched number: 600");
		int[] numbers_3 = {100, 200, 300, 400, 500};
		int x_3 = 600;
		search(numbers_3, x_3);
		
		System.out.println("\n*** Exercise 4.4 (d) ***");
		System.out.println("* Example 01 with return: \n* Vector: {1, 3, 99, 4, 5}\n* Searched number: 4");
		int[] numbers_1r = {1, 3, 99, 4, 5};
		int x_1r = 4;
		if (searchWithReturn(numbers_1r, x_1r) != -1) { // Found element on the array
			System.out.println("Position in the array: " + searchWithReturn(numbers_1r, x_1r));
		}
	}
}




