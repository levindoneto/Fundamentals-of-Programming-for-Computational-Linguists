/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex42.java
	Execution:    java ex42
	
	4.2 Array shifting
	Write code that "shifts" an array by a given number of steps. For example, given the array
	String[] words = {"a", "book", "about", "aardvarks", "for", "the", "student", "by", "Prof.", "Smith"}
	and the number int n = 4, you need to produce a new array looking like this
	String[] words = {"student", "by", "Prof.", "Smith", "a", "book", "about", "aardvarks", "for", "the"}
	As you can see, the 4 last words moved to the beginning of the array.
	There are several ways to accomplish this (b) is a little more difficult):
	a) Make a second array of the same length. Copy each word over in the correct order.
	c) The problem can actually be solved with three reversals of parts of the array. Figure out
	how.
	Pick one, write a program, and test with different values!
	(Hint: you may need to use the modulo operation here)

*/

public class ex42 {
    public static void main(String[] args) {
		String[] words = {"a", "book", "about", "aardvarks", "for", "the", "student", "by", "Prof.", "Smith"};
		int n = 4;
    }
}