/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex23.java
	Execution:    java ex23

	2.3 Loops
	a) Declare a String variable containing "Hi!". Use a loop to print this string 7 times, i.e.,
	Hi!
	Hi!
	Hi!
	...
	b) Use a loop to print the square (x2) for each number between 1 and 10
	c) Use a loop to print the numbers from 11 to 18
	d) Write a loop that prints a count-down from 5 to 0. After the countdown reaches 0, print
	lift-off!.
	5
	4
	3
	2
	1
	lift-off
*/

public class ex23 {
    public static void main(String[] args) {
		String hi = "Hi!";
		
		System.out.println("*** Exercise 2.3 (a) ***");
		for (int i=0; i<7; i++) {
			System.out.println(hi);
		}
		
		System.out.println("*** Exercise 2.3 (b) ***");
		for (int j=1; j<=10; j++) {
			System.out.println(Math.pow(j, 2));
		}
		
		System.out.println("*** Exercise 2.3 (c) ***");
		for (int k=11; k<=18; k++) {
			System.out.println(k);
		}
		
		System.out.println("*** Exercise 2.3 (d) ***");
		for (int l=5; l>=0; l--) {
			System.out.println(l);
		}
		System.out.println("lift-off");
    }
}