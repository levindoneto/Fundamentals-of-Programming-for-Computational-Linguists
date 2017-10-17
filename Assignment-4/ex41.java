/*
    Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex41.java
    Execution:    java ex41
	
	4.1 Array search
	Given an array of numbers, e.g.,
	int[] numbers = {1, 3, 99, 4, 5};
	and a single integer variable int x = 4;
	use a loop to determine the position at which you can find the number in the array. In this
	example, the output should be 3. If the number is not in the array, the output should be -1
	(because we know that there is no position -1). Test whether your code works!

*/

public class ex41 {
    public static void main(String[] args) {
		int[] numbers = {1, 3, 99, 4, 5};
		int x = 4;
		boolean find = false;
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i] == x) {
				System.out.println("Position in the array: " + i);
				find = true;
			}
		}
		if (find == false) {
			System.out.println("-1");
		}
    }
}