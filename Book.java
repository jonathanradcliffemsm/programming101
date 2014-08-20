public class Book {
    // fields
    private String name;
    private String author;
    private boolean available;

    

    // constructor
    public Book(String name, String author, boolean available){
        this.name = name;
        this.author = author;
        this.available = available;

    }

    // methods
    public String getName(){
        return this.name;
    }

    public String getAuthor(){
        return this.author;
    }

    public boolean getAvailable() { return this.available; }

    public void bookOut() {
        this.available = false;
    }

    public void bookIn() {
        this.available = true;
    }


 }