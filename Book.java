package library;

class Book {
	  private String title;
	    private String author;
	    private String isbn;
	    private boolean available;

	    public Book(String title, String author, String isbn){
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	        this.available = true;
	    }

	    public String getIsbn() {
	        return isbn;
	    }

	    public boolean isAvailable() {
	        return available;
	    }

	    public void setAvailable(boolean available) {
	        this.available = available;
	    }

		public String getTitle() {
			return title;
		}
	}



