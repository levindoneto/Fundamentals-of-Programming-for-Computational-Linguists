/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
    Compilation:  javac ex15.java
	Execution:    java ex15
  
	1.5 Number comparison
	You are given the following variables:
	double a = 3.25;
	double b = 10.5625;
	int c = 17;
	Declare the variables in a new program. Write code that prints whether
	a) c/a is larger than b
	b) sqrt(a) is at least as large as b
	c) c - a is equal to 13.75
	c) c / 2 is equal to 8.5
*/

public class ex15 {
    public static void main(String[] args) {
		double a = 3.25;
		double b = 10.5625;
		int c = 17;
		
		if ( (c/a) > b ) { //a
			System.out.println("c/a is larger than b");
		}
		else if (Math.pow(a, 2) >= b) { //b
			System.out.println("sqrt(a) is at least as large as b");
		}
		else if ( (c - a) == 13.75 ) { //c
			System.out.println("c - a is equal to 13.75");
		}
		else if ( (c/2) == 13.75 ) { //d
			System.out.println("c / 2 is equal to 8.5");
		}
		else {
			System.out.println("Nothing to say!");
		}
    }
}