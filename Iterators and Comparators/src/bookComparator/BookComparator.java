package bookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
	
	@Override
	public int compare(Book a, Book b) {
		if (a.getTitle().compareTo(b.getTitle()) == 0) {
			return Integer.compare(a.getYears(), b.getYears());
		}
		return a.getTitle().compareTo(b.getTitle());
	}
}
