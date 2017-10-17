/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex45.java
	Execution:    java ex45
	
	4.5 Strings
	String text = "a book about aardvarks for the student by Prof. Smith";
	a) Use substring to get the fourth word
	b) Use split to get the fourth word
	c) Write a loop to print each of the words of the sentence on its own line.
	d) Write a loop to print the first letter of each word.
*/

public class ex45 {
    public static void main(String[] args) {
		String text = "a book about aardvarks for the student by Prof. Smith";
		System.out.println("*** Exercise 4.5 (a) (With substring) ***");
		System.out.println(text.substring(13,22) );
		
		System.out.println("\n*** Exercise 4.5 (b) (With split) ***");
		String[] words = text.split(" ");
		System.out.println(words[3]); 
		
		System.out.println("\n*** Exercise 4.5 (c) ***");
		for (int i=0; i<words.length; i++) {
			System.out.println(words[i]); 
		}
		
		System.out.println("\n*** Exercise 4.5 (d) ***");
		for (int i=0; i<words.length; i++) {
			System.out.println(words[i].substring(0, 1)); 
		}
	}
}




