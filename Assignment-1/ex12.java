/*
    Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
    Compilation:  javac ex12.java
    Execution:    java ex12
  
	1.2 Strings
	You are given the following variables:
	String name = "Fido";
	String kind = "dog";
	int age = 11;
	double weight = 15.3;
	String hobby = "digging holes";
	Write a program that prints sentences with these variables using string concatenation. The
	output should look something like this:
	Fido is a dog. He is 11 years old and weighs 15.3 kg. His
	favorite hobby is digging holes.
*/

public class ex12 {
    public static void main(String[] args) {
		String name = "Fido";
		String kind = "dog";
		int age = 11;
		double weight = 15.3;
		String hobby = "digging holes";

		System.out.println(name + " is a " + kind + ". He is " + age + " years old and weighs " + weight + " kg. His");
		System.out.println("favorite hobby is " + hobby + ".");
    }
}