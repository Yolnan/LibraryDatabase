import java.util.*;
public class Patron {
	static Scanner input = new Scanner(System.in);
	static int pNum = 1;
	String pName;
	ArrayList<Item> patronBag;
//	static ArrayList<Patron> patronList = new ArrayList<Patron>();
	public Patron(int p, String np) {
		pNum = p;
		pName = np;
		patronBag = new ArrayList<Item>();
	}
	public static Patron addPatron() {
		System.out.println("Welcome");
		System.out.println("Enter your name");
		String n = input.nextLine();
		Patron b = new Patron(pNum++, n);
//		patronList.add(a);
		System.out.println("Hello " + n);
		return b;
	}
//	public void addBook() {
//		System.out.println("Enter the title of the book ");
//		String title = input.nextLine();
//		input.next();
//		System.out.println("Enter the language of the book");
//		String lang = input.nextLine();
//		input.next();
//		System.out.println("Enter 1 if book is fiction or 2 if book is non-fiction");
//		String genre;
//		while(true) {
//			if(input.nextInt() == 1) {
//				genre = "fiction";
//				break;
//			} else if(input.nextInt() == 2) {
//				genre = "non-fiction";
//				break;
//			} else {
//				System.out.println("Invalid input, try again");
//			}
//		}
//		System.out.println("Enter the ISBN number");
//		String ISBN = input.nextLine();
//		input.next();
//		System.out.println("Enter the number of pages");
//		int pgNum = input.nextInt();
//		Book a = new Book(title, lang, genre, ISBN, pgNum);
//		Item.shelf.add(a);
//	}
//	public void addVideo() {
//		System.out.println("Enter the title of the video ");
//		String title = input.nextLine();
//		input.next();
//		System.out.println("Enter the language of the video");
//		String lang = input.nextLine();
//		input.next();
//		System.out.println("Enter 1 if video is fiction or 2 if video is non-fiction");
//		String genre;
//		while(true) {
//			if(input.nextInt() == 1) {
//				genre = "fiction";
//				break;
//			} else if(input.nextInt() == 2) {
//				genre = "non-fiction";
//				break;
//			} else {
//				System.out.println("Invalid input, try again");
//			}
//		}
//		System.out.println("Enter the UPC number");
//		String UPC = input.nextLine();
//		input.next();
//		System.out.println("Enter length of the video");
//		int length = input.nextInt();
//		Video a = new Video(title, lang, genre, UPC, length);
//		Item.shelf.add(a);
//	}
}
