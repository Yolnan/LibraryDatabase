import java.util.*;
public abstract class Item {
	protected String name;
	protected String language;
	protected String genre;
	protected int loanPeriod;
	protected boolean available;
	protected String type;
	static ArrayList<Item> shelf = new ArrayList<Item>(); 
	
	public String getName() {
		return name;
	}
	public boolean isAvailable() {
		return available;
	}
	public String getLanguage() {
		return language;
	}
	public String getGenre() {
		return genre;
	}
	public int getLoanPeriod() {
		return loanPeriod;
	}
	public void setAvailable(boolean a) {
		available = a;
	}
	public String getType() {
		return type;
	}
}
