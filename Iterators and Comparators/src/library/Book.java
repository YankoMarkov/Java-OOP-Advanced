package library;

import java.util.Arrays;
import java.util.List;

public class Book {
	
	private String title;
	private int years;
	private List<String> authors;
	
	public Book(String title, int years, String... authors) {
		this.title = title;
		this.years = years;
		this.setAuthors(authors);
	}
	
	public String getTitle() {
		return title;
	}
	
	private void setTitle(String title) {
		this.title = title;
	}
	
	public int getYears() {
		return years;
	}
	
	private void setYears(int years) {
		this.years = years;
	}
	
	public List<String> getAuthors() {
		return authors;
	}
	
	private void setAuthors(String... authors) {
		this.authors = Arrays.asList(authors);
		
	}
}


