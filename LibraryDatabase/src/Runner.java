import java.util.*;
import java.io.*;
public class Runner {
	static Scanner input = new Scanner(System.in);
//	public static void DataBase() {
//		System.out.println("Welcome");
//		System.out.println("Enter your name");
//		String a = input.nextLine();
//		if(Patron.patronList.contains(a)) {
//			System.out.println("Welcome back " + a);
//		} else {
//			System.out.println("You need to create an account");
//			Patron.addPatron();
//		}
//	}
	
	public static void fillShelf() {
		Book Martian = new Book("The Martian", "English", "Fiction", "9780804139021", 369);
		Book BNW = new Book("Brave New World", "English", "Fiction", "0899664237", 232);
		Book History = new Book("Nations of Nations", "English", "Nonfiction", "0072870990", 629);
		Video War = new Video("War of the Century", "English", "Nonfiction", "B00097DY6G", 60);
		Video Mice = new Video("Of Mice and Men", "English", "Fiction", "B016BSSD9E", 110);
		Item.shelf.add(Martian);
		Item.shelf.add(BNW);
		Item.shelf.add(History);
		Item.shelf.add(War);
		Item.shelf.add(Mice);
	}
	public static int getChoice() {
		System.out.println("Select one of the choices");
		int choice = 0; 
        System.out.println("Please select one of the following choices:");
        System.out.println("1. Search library database.");
        System.out.println("2. Check out a library item.");
        System.out.println("3. Return a library Item.");
        System.out.println("4. Exit.");
        if (input.hasNextInt()) {
            choice = input.nextInt();
            input.nextLine();
            switch(choice) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                choice = 4;
                break;
            }
        }
        return choice;
    }
	public static void searchItem() {
        System.out.println("Please specify your criteria:");
        System.out.println("Title: ");
        String title = input.nextLine();
        System.out.println("Fiction or Nonfiction");
        String genre = input.nextLine();
        
        ArrayList <Item> resultList = new ArrayList<Item>();
        for (Item item: Item.shelf) {
            boolean titleMatched = false;
            boolean formatMatched = false;
            if (title.isEmpty()) {
                titleMatched = true;
            } else {
                if (item.name.equalsIgnoreCase(title)) {
                    titleMatched = true;
                } 
            }
            if (genre.isEmpty()) {
                formatMatched = true;
            } else {
                if (item.genre.equalsIgnoreCase(genre)) {
                    formatMatched = true;
                } 
            }
            if (titleMatched && formatMatched) {
                resultList.add(item);
            }
        }    
        System.out.println("-----------------------------------------");
        if (resultList.isEmpty()) {
            System.out.println("No item matches your criteria.");
        } else {
            System.out.println("The items match your criteria:\n");
        }
        for (Item a: resultList) {
        	if(a.getType().equals("book")) {
        		System.out.println(a.getName() + "		Language: " + a.getLanguage() + "	ISBN: " + ((Book)a).getISBN());
        	} else {
        		System.out.println(a.getName() + "		Language: " + a.getLanguage() + "	UPC: " + ((Video)a).getUPC());
        	}
            if(a.isAvailable()) {
            	System.out.println("Item is on shelf.  Loan period is " + a.getLoanPeriod() + " days");
            } else {
            	System.out.println("Item is checked out");
            }
        }
        System.out.println("-----------------------------------------");
	}    
        
    public static void checkOutItem(Patron p) {
    	 System.out.println("Please specify item title you want to check out");
    	 String title = input.nextLine();
    	 if (title.isEmpty()) {
             System.out.println("No item is specified");
             return;
    	 }    
    	 for (Item item: Item.shelf) {
    		 if (item.name.equalsIgnoreCase(title) && item.isAvailable()) {
    			 item.setAvailable(false);
    			 p.patronBag.add(item);
    			 System.out.println("You have checked out " + item.getName());
             } else if(item.name.equalsIgnoreCase(title) && item.isAvailable() == false) {
            	 System.out.println(item.getName() + " is checked out");
             }
    	 }
	}
    public static void returnItem(Patron p) {
    	System.out.println("Please specify item title you want to return");
    	String title = input.nextLine();
    	if (title.isEmpty()) {
            System.out.println("No item is specified");
            return;
   	    }    
    	boolean found = false;
    	for (Item item: p.patronBag) {
    		if (item.name.equalsIgnoreCase(title)) {
   			 	item.setAvailable(true);
   			 	System.out.println("You have returned " + item.getName());
   			 	p.patronBag.remove(item);
   			 	found = true;
   			 	break;
    		} 
    	}	
    	if(found == false) {
			System.out.println("You do not have " + title);
    	}
    }
	public static void main(String[] args) {
		Patron p;
		p = Patron.addPatron();
		fillShelf();
		
		while(true) {
			int choice = getChoice();
            boolean timeToEnd = false;
            switch (choice) {
            case 1:
                searchItem();
                break;
            case 2:
                checkOutItem(p);
                break;
            case 3:            
                returnItem(p);
                break;
            default:
                timeToEnd = true;
                System.out.println("Transaction ended.");
                break;
            }   
            if (timeToEnd) {
                break;
            }
        }

	}	

}
