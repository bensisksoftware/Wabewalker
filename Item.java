import java.util.ArrayList;

public class Item {
	public static boolean tookACBook;
	
	public static ArrayList<String> inventory = new ArrayList<String>();
	
	public static String om = "a faded scroll"; 
	public static String ni = "a fancy scroll"; 
	public static String go = "a frosty scroll"; 
	public static String yu = "a crumpled scroll"; 
	public static String ji = "a smooth scroll"; 
	public static String ra = "a dusty scroll"; 
	public static String shi = "a tea-stained scroll"; 
	public static String book = "a book"; 
	public static String rod = "a fishing pole"; 
	public static String booklet = "a booklet"; 
	public static String handbook = "a handbook"; 
	public static String pamphlet = "a pamphlet"; 
	public static String corn = "a small pile of corn"; 
	public static String parchment = "a parchment"; 
	public static String card = "a business card"; 
	
	public static void getBook() {
		Story.printTakeItem();
		inventory.add(book);
		Room.getObjects().remove(book);
	}
	
	public static void getOm() {
		Story.printTakeItem();
		inventory.add(om);
		Room.getObjects().remove(om);
	}
	
	public static void getNi() {
		Story.printTakeItem();
		inventory.add(ni);
		Room.getObjects().remove(ni);
	}
	
	public static void getGo() {
		Story.printTakeItem();
		inventory.add(go);
		Room.getObjects().remove(go);
	}
	
	public static void getYu() {
		Story.printTakeItem();
		inventory.add(yu);
		Room.getObjects().remove(yu);
	}
	
	public static void getJi() {
		Story.printTakeItem();
		inventory.add(ji);
		Room.getObjects().remove(ji);
	}
	
	public static void getRa() {
		Story.printTakeItem();
		inventory.add(ra);
		Room.getObjects().remove(ra);
	}
	
	public static void getShi() {
		Story.print("You feel a rather large bulge in your pants.");
		inventory.add(shi);
	}
	
	public static void getRod() {
		Story.printTakeItem();
		inventory.add(rod);
		Room.getObjects().remove(rod);
	}
	
	public static void getBooklet() {
		Story.printTakeItem();
		inventory.add(booklet);
		Room.getObjects().remove(booklet);
	}
	
	public static void getHandbook() {
		Story.printTakeItem();
		inventory.add(pamphlet);
		Room.getObjects().remove(handbook);
	}
	
	public static void getPamphlet() {
		Story.printTakeItem();
		inventory.add(pamphlet);
		Room.getObjects().remove(pamphlet);
	}
	
	public static void getCorn() {
		Story.printTakeItem();
		inventory.add(corn);
		Room.getObjects().remove(corn);
	}
	
	public static void getParchment() {
		Story.printTakeItem();
		inventory.add(parchment);
		Room.getObjects().remove(parchment);
	}
	
	public static void getCard() {
		Story.printTakeItem();
		inventory.add(card);
		Room.getObjects().remove(card);
	}
	
	public static void examineBook() {
		
	}
	
	public static void examineOm() {
	
	}
	
	public static void examineNi() {
		
	}
	
	public static void examineGo() {
		
	}
	
	public static void examineYu() {
		
	}
	
	public static void examineJi() {
		
	}
	
	public static void examineRa() {
		
	}
	
	public static void examineShi() {
		
	}
	
	public static void examineRod() {
		
	}
	
	public static void examineBooklet() {
		
	}
	
	public static void examineHandbook() {
		
	}
	
	public static void examineCorn() {
		
	}
	
	public static void examineParchment() {
		
	}
	
	public static void examineCard() {
		
	}	
}