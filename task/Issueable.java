package library;
import java.util.ArrayList;
import java.util.HashMap;
interface Issueable {
	boolean issueBook(String isbn);
    boolean returnBook(String isbn);
    boolean isAvailable(String isbn);
}
