/*
    Compilation:  javac ex13.java
    Execution:    java ex13
  
	1.3 Type conversion
	Take the variables from the previous section. Try to convert each of the doubles into an integer,
	and the integer into a double. Print the results.
*/

public class ex13 {
    public static void main(String[] args) {
		int age = 11;
		double weight = 15.3;
		
		System.out.print("Integer -> Double: ");
		System.out.println( (double)age );
		System.out.print("Double -> Integer: ");
		System.out.println( (int)weight );
    }
}