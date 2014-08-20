import java.util.*;

public class Library {

    private static List<Book> books;

    public Library(){
    	books = new ArrayList<Book>();
    }

    public void addBook(String name, String author, boolean available){
    	Book book = new Book(name, author, available);
    	books.add(book);
    }

    public void removeBook(String name){
        for (int i=0; i<books.size(); i++){
            Book book = books.get(i);
            if (book.getName().equals(name)){
               books.remove(book);
            }
        }
    }

    public boolean isBookWithNameAvailable(String name){
    	for (int i=0; i<books.size(); i++){
    		Book book = books.get(i);
    		if (book.getName().equals(name)){
                if(book.getAvailable() == true) {
                    return true;
                }
    		}
    	}

    	return false;

    }

    public void listAvailableBooks(){
        System.out.println("Available Books:");
        for (int i=0; i<books.size(); i++){
            Book book = books.get(i);
            System.out.println(book.getName() + " by " + book.getAuthor() + "\t\t\t - Available: " + book.getAvailable());
        }
    }

    public void borrowBook(String name){
        for (int i=0; i<books.size(); i++){
            Book book = books.get(i);
            if (book.getName().equals(name)){
                if (book.getAvailable()==true){
                    book.bookOut();
                } else {
                    System.out.println("Sorry, " + book.getName() +  " is currently on loan");
                }
            }
        }
    }

    public void returnBook(String name){
        for (int i=0; i<books.size(); i++){
            Book book = books.get(i);
            if (book.getName().equals(name)){
                if (book.getAvailable()==false){
                    book.bookIn();
                } else {
                    System.out.println(book.getName() + " has already been returned");
                }
            }
        }
    }




}