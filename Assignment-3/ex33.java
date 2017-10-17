/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex33.java
	Execution:    java ex33
	
	3.3 Our first array
	Copy the following array into a new program:
	String[] words = {"a", "book", "about", "aardvarks", "for",
	"the", "student", "by", "Prof.", "Smith"}
	a) Print the element number 3 of the array
	b) Use an assignment to change "aardvarks" to "dogs"
	c) Print the length of the array
	d) Print all elements in the array
*/

public class ex33 {
    public static void main(String[] args) {
		String[] words = {"a", "book", "about", "aardvarks", "for", "the", "student", "by", "Prof.", "Smith"};
		
		System.out.println("\n*** Exercise 3.3 (a) ***");
		System.out.println(words[3]);
		
		System.out.println("\n*** Exercise 3.3 (b) ***");
		words[3] = "dogs";
		System.out.println("New words in the position 3: " + words[3]);
		
		System.out.println("\n*** Exercise 3.3 (c) ***");
		System.out.println(words.length);
		
		System.out.println("\n*** Exercise 3.3 (d) ***");
		for (int i=0; i<words.length; i++) { 
			System.out.println(words[i]);
		}
    }
}