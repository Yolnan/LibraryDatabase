
public class Book extends Item {
	protected int ISBN;
	protected int pgNum;
	public Book(String n, String l, int i, int pg) {
		name = n;
		language = l;
		ISBN = i;
		pgNum = pg;
	}
			
}
