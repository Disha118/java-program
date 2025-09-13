package library;

import java.util.HashMap;
import java.util.Map;

class Library implements Issueable {

	private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String title, String author, String isbn) 
    {
        books.put(isbn, new Book(title, author, isbn));
    }

    @Override
    public boolean issueBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && book.isAvailable())  {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook(String isbn) {
        Book book = books.get(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean isAvailable(String isbn) {
        Book book = books.get(isbn);
        return book != null && book.isAvailable();
    }
}
