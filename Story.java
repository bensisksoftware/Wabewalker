import java.util.ArrayList;

public class Story {
	private static String invalid = "That is a sentence I don't understand."; // Frotz copyright?
	private static String tooManySpaces = "There are too many words and/or spaces in that sentence. Try to pair a verb with a noun.";
	public static String inventory = "Your inventory contains: ";
	public static String inventoryEmpty = "Your inventory is empty.";
	public static String missingNoun = "You are missing a noun in that sentence.";
	public static String notHere = "You can't see that here.";
	
	public static void invalid() {
		print(invalid);
	}
	
	public static void tooManySpaces() {
		print(tooManySpaces);
	}
	
	public static void newLine() {
		print("\n");
	}
	
	public static void newParagraph() {
		print("\n\n");
	}
	
	public static void printInput() {
		print(">" + Bunraku.inputBox.getText());
		newParagraph();
	}
	
	public static void printLocation() {
		print(Room.getLocation().title);
	}
	
	public static void printMissingNoun() {
		print(missingNoun);
	}
	
	public static void print(String s) {
		Bunraku.body.append(s);
	}
	
	public static void printTakeItem() {
		print("Taken.");
	}
	
	public static void printNotInInventory() {
		print("You are not carrying that.");
	}
	
	public static void printInventory() {
		print(inventory);
		
		for (int i = 0; i < Item.inventory.size(); i++) {
			newLine();
			print(Item.inventory.get(i));
		}
	}
	
	public static void printNotHere() {
		print(notHere);
	}
	
	public static void printObjects() {
		if ((Room.getLocation().equals(Room.teaRoom.title)) && !Item.tookACBook) { 
			// normal Story.printDesc handles this exception
		} else {
			// print all objects in room
			for (int i = 0; i < Room.getObjects().size(); i++) {
				newLine();
				print("There is " + Room.getObjects().get(i) + " here.");
			}
		}
	}
}