/*
    Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex22.java
    Execution:    java ex22
  
	2.2 Going to the cinema
	Peter wants to go to the cinema. However, he's a very picky person. He will only go if
	1. it's a rainy day or his friend Paul is coming, too
	2. the movie's rating on IMDb is at least 7 out of 10
	Declare a variable for each of the four different values above. Pick an appropriate type for each.
	Write a program that prints whether Peter will go to the cinema. Hint: You need to use boolean
	operators for this. Try the following configurations:


	Use if for the output. The output needs to be a sentence, either
	Peter will go to the cinema.
	or
	Peter will not go to the cinema.
*/

public class ex22 {
    public static void main(String[] args) {
		boolean isRainy;
		boolean paulIsComing;
		double ratingOnImdb;
		
		/* Tests */
		/* a) */
		isRainy = true;
	    paulIsComing = false;
	    ratingOnImdb = 8.2;
		
		/* b) */
		//isRainy = false;
	    //paulIsComing = true;
	    //ratingOnImdb = 7.0;
		
		System.out.println("Running test (a).");
		System.out.println("To run test (b) the lines of the test b must be uncommented.\nAnd the lines of the test (a) must be commented");
		
		if ( (isRainy || paulIsComing) && (ratingOnImdb>=7 && ratingOnImdb<=10) ) { //a
			System.out.println("\n\nPeter will go to the cinema.");
		}
		else {
			System.out.println("\n\nPeter will not go to the cinema.");
		}
    }
}