/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex24.java
	Execution:    java ex24
	
	2.4 Buzz
	This is a simplified version of a popular game. We count from 1 to infinity. I say 1, you say
	2, I say 3, etc. However, if the number you would say next is divisible by 5, you don't say the
	number, but instead, you say \buzz". Here's an example:
	1
	2
	3
	4
	buzz
	6
	7
	8
	9
	buzz
	11
	...
	Write a program that plays buzz up to 100. I.e., write a loop that counts up to 100 that outputs
	buzz if the number is divisible by 5, and the number itself otherwise.
*/

public class ex24 {
    public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i%5 == 0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			} 
		}
    }
}