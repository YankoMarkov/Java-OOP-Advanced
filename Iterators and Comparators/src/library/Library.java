package library;

import java.util.Iterator;
import java.util.function.Consumer;

public class Library implements Iterable<Book> {
	
	private Book[] books;
	private Iterator<Book> iterator;
	
	public Library(Book... books) {
		this.books = books;
	}
	
	public Book[] getBooks() {
		return books;
	}
	
	private void setBooks(Book[] books) {
		this.books = books;
	}
	
	@Override
	public Iterator iterator() {
		return new LibraryIterator();
	}
	
	@Override
	public void forEach(Consumer action) {
		this.iterator = new LibraryIterator();
		action.accept(this.iterator.next());
	}
	
	private class LibraryIterator implements Iterator<Book> {
		
		private int index;
		
		private LibraryIterator() {
			this.setIndex();
		}
		
		private void setIndex() {
			this.index = 0;
		}
		
		@Override
		public boolean hasNext() {
			return this.index < books.length;
		}
		
		@Override
		public Book next() {
			return books[this.index++];
		}
	}
}
