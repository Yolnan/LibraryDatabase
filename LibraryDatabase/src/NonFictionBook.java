
public class NonFictionBook extends Book {
	public NonFictionBook(String n, String l, int i, int pg) {
		super(n,l,i,pg);
		name = n;
		language = l;
		ISBN = i;
		pgNum = pg;
	}
}
