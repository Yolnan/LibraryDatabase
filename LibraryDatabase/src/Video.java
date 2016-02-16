import java.util.*;
public class Video extends Item {
	protected String UPC;
	protected int length;
	public Video(String n, String l, String g, String u, int t) {
		name = n;
		language = l;
		UPC = u;
		genre = g;
		length = t;
		available = true;
		loanPeriod = 7;
		type = "video";
	}
	public String getUPC() {
		return UPC;
	}
	public int getLength() {
		return length;
	}
	
}
