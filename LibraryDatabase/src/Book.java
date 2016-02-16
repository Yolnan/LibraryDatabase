import java.util.*;
public class Book extends Item {
	protected String ISBN;
	protected int pgNum;
	public Book(String n, String l, String g, String i, int pg) {
		name = n;
		language = l;
		genre = g;
		ISBN = i;
		pgNum = pg;
		available = true;
		loanPeriod = 21;
		type = "book";
	}
	public String getISBN() {
		return ISBN;
	}
	public int getPgNum() {
		return pgNum;
	}
			
}
