/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex31.java
	Execution:    java ex31
	
	3.1 Fizz-Buzz
	An extension of the game is fizz-buzz. Here, we also have to replace every number that is divisible
	by 3 by fizz. If a number is divisible by 3 and 5, we have to output fizzbuzz. Example:
	1
	2
	fizz
	4
	buzz
	fizz
	7
	8
	fizz
	buzz
	11
	fizz
	13
	14
	fizzbuzz
	...
	Use a for loop to play fizz-buzz.
*/

public class ex31 {
    public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i%5 == 0) {
				System.out.println("buzz");
			}
			if (i%3 == 0) {
				System.out.println("fizz");
			}
			else {
				System.out.println(i);
			} 
		}
    }
}