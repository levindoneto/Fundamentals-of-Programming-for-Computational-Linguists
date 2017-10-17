/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex34.java
	Execution:    java ex34
	
	3.4 Arrays and loops
	a) For a given array
	int[] numbers = {1, 3, 99, 4, 5};
	write a program that prints the sum of all numbers in it.
	b) For a given array
	int[] numbers = {1, 3, 99, 4, 5};
	write a program that prints the maximum value.
	c) Now assume that you have two arrays in the same program:
	int[] numbers = {1, 3, 99, 4, 5};
	int[] numbers2 = {2, 82, 11, 2, 9};
	Write a program that first prints the maximum for the first array, then the maximum for
	the second array. (The solution is really as dumb as you think { use copy & paste! But I
	want you to do it once.)
*/

public class ex34 {
    public static void main(String[] args) {
		int[] numbers = {1, 3, 99, 4, 5};
		
		System.out.println("\n*** Exercise 3.4 (a) ***");
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum+=numbers[i];
		}
		System.out.println("Sum: " + sum);
		
		////////////////////////////////////////////////
		System.out.println("\n*** Exercise 3.4 (b) ***");
		int max = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>max) {
				max = numbers[i];
			}
		}
		System.out.println("Max: " + max);
		
		////////////////////////////////////////////////
		System.out.println("\n*** Exercise 3.4 (c) ***");
		int[] numbers2 = {2, 82, 11, 2, 9};
		int max_2 = 0;
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>max) {
				max = numbers[i];
			}
		}
		for (int i=0; i<numbers2.length; i++) {
			if (numbers2[i]>max_2) {
				max_2 = numbers2[i];
			}
		}
		System.out.println("Max of numbers: " + max);
		System.out.println("Max of numbers2: " + max_2);
    }
}