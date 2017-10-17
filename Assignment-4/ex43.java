/*
	Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
	Compilation:  javac ex43.java
	Execution:    java ex43
	
	4.3 Nested loops
	a) Write a nested loop that prints the numbers from 0 to 99 using two for loops that look like
	this:
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
		// your solution here!
		}
	}
	b) You are given the following arrays:
	String[] prefixes = {"sleep", "walk", "talk", "fall", "go", "kiss"};
	String[] suffixes = {"ing", "ed", "s", "er"};
	String[] candidates = {"slept", "walker", "talking", "falls", "goes", "went", "kisses"};
	Write a program that checks for each word in the candidates array whether it can be
	produced by concatenating a prefix from prefixes and a suffix from suffixes. Print out
	the list of words that cannot be produced.
	Test whether your code does the right thing.
*/

public class ex43 {
    public static void main(String[] args) {
		System.out.println("Exercise 4.3 (a)");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i);
				System.out.print(j + "\n");
			}
		}
		
		//////////////////////////////////////
		System.out.println("\nExercise 4.3 (b)");
		String[] prefixes = {"sleep", "walk", "talk", "fall", "go", "kiss"};
		String[] suffixes = {"ing", "ed", "s", "er"};
		String[] candidates = {"slept", "walker", "talking", "falls", "goes", "went", "kisses"};
		
		
		for (int i=0; i<candidates.length; i++) { // Walking through all candidates
			for (int j=0; j<prefixes.length; j++) { // Walking through all prefixes
				for (int k=0; k<suffixes.length; k++) { // Walking through all suffixes
					//System.out.println(prefixes[j].concat(suffixes[k]));
					if ((prefixes[j].concat(suffixes[k])).equals(candidates[i])) {
						candidates[i] = "";
					}
				}
			}
		}
		
		for (int v=0; v<candidates.length; v++) {
			if (candidates[v].equals("")) {
				int notequal = 1;
			}
			else {
				System.out.println(candidates[v]);
			}
		}
    }
}




