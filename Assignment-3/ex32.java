/*
    Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex32.java
    Execution:    java ex32
	
	3.2 Loops
	a) Write a for loop to print the string "Hi!" 5 times.
	b) Write a for loop for i between 1 and 7 that prints sqrt(i) (so the output should be 1 4 9 and
	so on).
	c) Write a for loop for i between 1 and 11 that prints i + 10 (i.e., the output should be 11
	12 13 and so on).
*/

public class ex32 {
    public static void main(String[] args) {
		System.out.println("\n*** Exercise 3.2 (a) ***");
		for (int i=1; i<=5; i++) {
			System.out.println("Hi!");
		}
		
		System.out.println("\n*** Exercise 3.2 (b) ***");
		for (int i=1; i<=7; i++) {
			System.out.print((int)Math.pow(i,2) + " ");
		}
		
		System.out.println("\n\n*** Exercise 3.2 (c) ***");
		for (int i=1; i<=11; i++) {
			System.out.print( (i+10) + " ");
		}
    }
}