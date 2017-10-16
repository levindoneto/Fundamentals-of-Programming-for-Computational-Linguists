/*
    Compilation:  javac ex11.java
    Execution:    java ex11
  
	1.1 Numbers
	a) Declare two integer variables (a and b) with values 7 and 25. Print the following numbers:
		Sum of a and b
		Difference between a and b
		Product of a and b
		b divided by a (as a real number)
		Remainder of this division
	b) Do the same with two float variables (a and b) with values 0.1 and 0.2. Do you notice any difference? 
*/

public class ex11 {
    public static void main(String[] args) {
		int a = 7;
		int b = 25;
		int sum;
		int product;
		float division;
		int remainder;
		
		sum = a + b;
		product = a * b;
		division = (float)b / (float)a;
		remainder = b % a;
		
		System.out.println("***Exercise 1.1 (a) - Numbers ***");
        System.out.print("* Sum of a and b: ");
		System.out.println(sum);
		System.out.print("* Product of a and b: ");
		System.out.println(product);
		System.out.print("* b divided by a (as a real number): ");
		System.out.println(division);
		System.out.print("* Remainder of this division: ");
		System.out.println(remainder);
		
		
		// Exercise 1.1 (b)
		
		/* I've noticed the floats f_a and f_b were defined by default as double,
		   so I had to put 'f' next to the decimal number on the declaration.
		*/
		
		System.out.println("***Exercise 1.1 (b) - Numbers ***");
		float f_a = 0.1f; // for the exercise 1.1 (b)
		float f_b = 0.2f; // for the exercise 1.1 (b)
		
		float f_sum = f_a + f_b;
		float f_product = f_a * f_b;
		float f_division = b / a;
		float f_remainder = b % a;
		
		System.out.println("***Exercise 1.1 - Numbers ***");
        System.out.print("* Sum of a and b: ");
		System.out.println(f_sum);
		System.out.print("* Product of a and b: ");
		System.out.println(f_product);
		System.out.print("* b divided by a (as a real number): ");
		System.out.println(f_division);
		System.out.print("* Remainder of this division: ");
		System.out.println(f_remainder);
    }
}