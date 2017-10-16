/*
    Student: Levindo Gabriel Taschetto Neto
	Matriculation Number: 3292080
    Compilation:  javac ex21.java
    Execution:    java ex21
  
	2.1 A First-grade problem
	Mary, Peter, and Lisa want to buy a Java book. The book costs 29 Euros. Mary has 12 Euros,
	Peter has half as much as Mary, and Lisa has 5 Euros more than Mary. Write a program that
	prints whether they can afford the book together.
*/

public class ex21 {
    public static void main(String[] args) {
		float price_book = 29.0f;
		float has_mary = 12.0f;
		float has_peter = has_mary / 2f;
		float has_lisa = has_mary + 5f;
		
		
		if ( (has_mary + has_peter + has_lisa) > price_book ) { //a
			System.out.println("They can afford the book together");
		}
		else {
			System.out.println("They cannot afford the book together");
		}
    }
}