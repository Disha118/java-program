package library;

import static
org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LibraryTest {


		@org.junit.Test
	    public void testIssueBook() {
	        Library library = new Library();
	        library.addBook("1984", "George Orwell", "123456789");
	        boolean isAvailable = library.isAvailable("123456789");
	        library.issueBook("123456789");
	        
	        assert !library.isAvailable("123456789");
	     
	    }

	    @org.junit.Test
	    public void testReturnBook() {
	        Library library = new Library();
	        library.addBook("1984", "George Orwell", "123456789");
	        library.issueBook("123456789");
	        assert library.returnBook("123456789");
	        assert library.isAvailable("123456789");
	    }

	    @org.junit.Test
	    public void testIsAvailable() {
	        Library library = new Library();
	        library.addBook("1984", "George Orwell", "123456789");
	        assert library.isAvailable("123456789");
	        library.issueBook("123456789");
	        assert !library.isAvailable("123456789");
	        
	    }
	
	}


