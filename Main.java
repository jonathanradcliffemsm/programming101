import java.util.*;
public class Main {
	public static void main(String[] args){
		System.out.println("Welcome to the Library");

		Library library = new Library();
		library.addBook("Pride and Prejudice", "Jane Austen", true);
		library.addBook("Sherlock Holmes", "Arthur Conan Doyle", true);
		library.addBook("BFG", "Roald Dahl", true);
                library.addBook("The Colour of Magic", "Terry Pratchett", true);
                library.addBook("The Light Fantastic", "Terry Pratchett", true);
                library.addBook("Soul Music", "Terry Pratchett", true);
                library.addBook("Feet of Clay", "Terry Pratchett", true);
                library.addBook("Equal Rites", "Terry Pratchett", true);
                library.addBook("Mort", "Terry Pratchett", true);
                library.addBook("Reaper Man", "Terry Pratchett", true);

                library.listAvailableBooks();

                System.out.println();

                library.borrowBook("Mort");
                library.borrowBook("BFG");

                boolean isBFGAvailable = library.isBookWithNameAvailable("BFG");
                System.out.println("BFG availability is " + isBFGAvailable);

                boolean isMortAvailable = library.isBookWithNameAvailable("Mort");
                System.out.println("Mort availability is " + isMortAvailable);


                System.out.println();



                library.returnBook("Mort");
                isMortAvailable = library.isBookWithNameAvailable("Mort");
                System.out.println("Mort availability is " + isMortAvailable);





	}
}