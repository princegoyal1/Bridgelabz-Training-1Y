// Interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }

    // Abstract method
    abstract int getLoanDuration();
}

// Book
class Book extends LibraryItem implements Reservable {
    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 14; // days
    }

    public void reserveItem() {
        System.out.println("Book reserved");
    }

    public boolean checkAvailability() {
        return true;
    }
}

// Magazine
class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 7;
    }
}

// DVD
class DVD extends LibraryItem {
    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 3;
    }
}

// Main
class Main5 {
    public static void main(String[] args) {
        LibraryItem item1 = new Book(1, "Java Basics", "James");
        LibraryItem item2 = new Magazine(2, "Tech Today", "Editor");

        item1.getItemDetails();
        System.out.println("Loan Days: " + item1.getLoanDuration());

        item2.getItemDetails();
        System.out.println("Loan Days: " + item2.getLoanDuration());
    }
}