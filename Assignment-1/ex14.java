/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex14.java
	Execution:    java ex14
  
	1.4 Boolean operators
	You own two dogs. You know that if both wag their tails, they are guilty of causing some trouble
	earlier. Declare a boolean variable for each dog that indicates whether it is wagging its tail:
	boolean dog1wags;
	boolean dog2wags;
	a) Declare a boolean variable dogsAreGuilty. Use a boolean operator to set this variable to
	true when they are guilty, and false otherwise.
	b) If only one of the dogs is wagging its tail, they are both just happy. Declare a boolean
	variable dogsHappy that is true when only one of the dogs wags its tail, but not both!
*/

public class ex14 {
    public static void main(String[] args) {
		boolean dog1wags;
		boolean dog2wags;
		boolean dogsHappy; // for the exercise ex1.4(b)
		
		/* tests */
		dog1wags = true;
		dog2wags = false;
		
		boolean dogsAreGuilty;
		
		if (dog1wags==true && dog2wags==true) {
			dogsAreGuilty = true;
			System.out.println("Dogs are guilty");
		}
		
		else if ( (dog1wags==true && dog2wags==false) || (dog1wags==false && dog2wags==true) ) {
			dogsHappy = true;
			System.out.println("Dog is happy");
		}
		
		else {
			dogsAreGuilty = false;
		}
    }
}