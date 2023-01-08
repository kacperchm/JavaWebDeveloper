package pl.edu.wszib.jwd.Spotkanie3;

public class Library {

    static void compareBooks(Book book1, Book book2) {
        if(book1.equals(book2)) {
            System.out.println(book1 + " to ta sama książka co " + book2);
        } else {
            System.out.println(book1 + " to nie ta sama książka co " + book2);
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Anioły i demony", "Dan Brown", "ETC", 2015);
        Book book2 = new Book("Anioły i demony", "Dan Brown", "ETC", 2015);
        Book book3 = new Book("Kod Leonarda Da Vinci", "Dan Brown", "ETC", 2017);
        Book book4 = new Book("Anioły i demony", "Dan Brown", "ETC", 2016);
        Book[] books = {book1, book2, book3,book4};

        compareBooks(books[0],books[1]);
        compareBooks(books[0],books[3]);
        compareBooks(books[1],books[2]);
    }
}
