
public class Book {
    private String nameBook;
    private Author author;
    private double price;
    private int qty;

    public Book() {
        System.out.println("Book Constructor");
    }
    public Book(String nameBook, Author author, double price, int qty) {
        this.nameBook = nameBook;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + nameBook + '\'' +
                ", Author='" + author + '\'' +
                ", Price=" + price +
                ", Qty=" + qty +
                '}';
    }
}
