public class Story {
	private static String invalid = "That is a sentence I don't understand."; // Frotz copyright?
	private static String tooManySpaces = "There are too many words and/or spaces in that sentence. Try to pair a verb with a noun.";
	public static String taken = "Taken.";
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
	
	public static void printMissingNoun() {
		print(missingNoun);
	}
	
	public static void print(String s) {
		Bunraku.body.append(s);
	}
	
	public static void printTakeItem() {
		newParagraph();
		print(taken);
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
}