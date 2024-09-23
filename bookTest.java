import  java.util.Arrays;
import java.util.Scanner;

public class bookTest {
    public static void main(String[] args) {
        Author[] authors = authorTest.newAuthors();
        Book[] book = new Book[10];
        book[0] = new Book("Java Programming", authors[0], 29.95, 100);
        book[1] = new Book( "dsa", authors[0] , 32.45 ,628);
        book[2] = new Book("Clean Code", authors[2], 40.75, 60);
        book[3] = new Book("The Pragmatic Programmer", authors[0], 45.00, 50);
        book[4] = new Book("Head First Java", authors[1], 30.99, 120);
        book[5] = new Book("Design Patterns", authors[0], 38.25, 90);
        book[6] = new Book("Refactoring", authors[2], 42.30, 70);
        book[7] = new Book("Spring in Action",authors[2] , 50.00, 40);
        book[8] = new Book("Hibernate in Action", authors[0], 33.75, 110);
        book[9] = new Book("Kotlin in Action", authors[1], 28.90, 130);


        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten tac gia: ");
        String authorName = scanner.nextLine();




















//        Book[] sortedBooks = Arrays.stream(book)
//                .sorted((b1, b2) -> b1.getNameBook().compareTo(b2.getNameBook()))
//                .toArray(Book[]::new);
//        System.out.println("Danh sách sách đã sắp xếp theo tên:");
//        for (Book b : sortedBooks) {
//            System.out.println(b);
//        }
//        System.out.println("sach co gia tien cao nhat : ");
//
//        Book maxPriceBook = book[0];
//
//        for (int i = 1; i < book.length; i++) {
//            if (book[i].getPrice() > maxPriceBook.getPrice()) {
//                maxPriceBook = book[i];
//            }
//        }
//        System.out.println("Cuốn sách có giá cao nhất: " + maxPriceBook.toString());

         }
        }


