class BookData {

    String title;
    String author;
    double price;

    BookData(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price);
    }
}

public class BookArrayDemo {

    public static void main(String[] args) {

        BookData[] books = new BookData[3];

        books[0] = new BookData("Java Programming", "James Gosling", 500);
        books[1] = new BookData("Python Basics", "Guido van Rossum", 450);
        books[2] = new BookData("C++ Guide", "Bjarne Stroustrup", 550);

        for (BookData b : books) {
            b.display();
        }
    }
}