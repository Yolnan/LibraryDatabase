
public class FictionBook extends Book {
	public FictionBook(String n, String l, int i, int pg) {
		super(n,l,i,pg);
		name = n;
		language = l;
		ISBN = i;
		pgNum = pg;
	}
}
