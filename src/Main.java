import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Amazing Blob", "Jake Blob", 5.99);
        Book book2 = new Book("Kites Attack The City", "Solo Kim", 8.99);
        Book book3 = new Book("Rich Mice", "Amy Jill", 10.99);
        Book book4 = new Book("Hoover-Moover", "Betty Black", 12.99);

        TreeSet<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book book:books){
            System.out.println(book);
        }
    }
}
