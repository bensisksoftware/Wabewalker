public class Action {
	public static void goNorth() {
		switch (Data.playerLocation) {
			case "Cobble Square":
				Update.location("Garden Patio");
				break;
			case "Thatched Hut":
				Update.location("Cobble Square");
				break;
			case "Shrine Room 1":
				Update.location("Sand Exhibit");
				break;
			case "Cafe":
				Update.location("Outside Gallery");
				break;
			case "Assembly Room":
				Update.location("Inside Gallery");
				break;
			case "Living Room":
				Update.location("Shrine Room 2");
				break;
			case "Pond":
				Update.location("Courtyard");
				break;
			case "Sitting Room":
				Update.location("Hallway");
				break;
			case "Dark Passageway":
				Update.location("Mannequin Room");
				break;
			case "Library":
				Update.location("Outside Gate");
				break;
			case "Outside Gate":
				Update.location("Inside Gate");
				break;
			case "Inside Gate":
				Update.location("Bottom of Stairs");
				break;
			case "Bottom of Stairs":
				Update.location("Top of Stairs");
				break;
			case "Top of Stairs":
				Update.location("Hondo");
				break;
			case "Hondo":
				Update.location("Shrine Room 3");
				break;
			case "Balcony":
				Update.location("Creaky Deck");
				break;
			default:
				System.out.println("Action.goNorth() error");
				break;
		}
	}
	
	public static void goSouth() {
		switch (Data.playerLocation) {
			case "Garden Patio":
				Update.location("Cobble Square");
				break;
			case "Cobble Square":
				Update.location("Thatched Hut");
				break;
			case "Sand Exhibit":
				Update.location("Shrine Room 1");
				break;
			case "Outside Gallery":
				Update.location("Cafe");
				break;
			case "Inside Gallery":
				Update.location("Assembly Room");
				break;
			case "Assembly Room":
				Update.location("Shrine Room 2");
				break;
			case "Shrine Room 2":
				Update.location("Living Room");
				break;
			case "Courtyard":
				Update.location("Pond");
				break;
			case "Hallway":
				Update.location("Sitting Room");
				break;
			case "Mannequin Room":
				Update.location("Dark Passageway");
				break;
			case "Inside Gate":
				Update.location("Outside Gate");
				break;
			case "Bottom of Stairs":
				Update.location("Inside Gate");
				break;
			case "Top of Stairs":
				Update.location("Bottom of Stairs");
				break;
			case "Hondo":
				Update.location("Top of Stairs");
				break;
			case "Shrine Room 3":
				Update.location("Hondo");
				break;
			case "Creaky Deck":
				Update.location("Balcony");
				break;
			default:
				System.out.println("Action.goSouth() error");
				break;
		}
	}
	
	public static void goEast() {
		switch (Data.playerLocation) {
			case "Tea Room":
				Update.location("Cobble Square");
				break;
			case "Cobble Square":
				Update.location("Sand Exhibit");
				break;
			case "Lounge":
				Update.location("Garden Overlook");
				break;
			case "Garden Overlook":
				Update.location("Cafe");
				break;
			case "Outside Gallery":
				Update.location("Inside Gallery");
				break;
			case "Living Room":
				Update.location("Pond");
				break;
			case "Courtyard":
				Update.location("Closet");
				break;
			case "Sitting Room":
				Update.location("Library");
				break;
			case "Master Bedroom":
				Update.location("Sitting Room");
				break;
			case "Dark Passageway":
				Update.location("Shrine Room 2");
				break;
			case "Mannequin Room":
				Update.location("Theater");
				break;
			case "Inside Gate":
				Update.location("Island");
				break;
			case "Hamlet":
				Update.location("Top of Stairs");
				break;
			case "Overlook":
				Update.location("Creaky Deck");
				break;
			default:
				System.out.println("Action.goEast() error");
				break;
			
		}
	}
	
	public static void goWest() {
		switch (Data.playerLocation) {
			case "Cobble Square":
				Update.location("Tea Room");
				break;
			case "Sand Exhibit":
				Update.location("Cobble Square");
				break;
			case "Garden Overlook":
				Update.location("Lounge");
				break;
			case "Cafe":
				Update.location("Garden Overlook");
				break;
			case "Inside Gallery":
				Update.location("Outside Gallery");
				break;
			case "Shrine Room 2":
				Update.location("Dark Passageway");
				break;
			case "Pond":
				Update.location("Living Room");
				break;
			case "Closet":
				Update.location("Courtyard");
				break;
			case "Sitting Room":
				Update.location("Master Bedroom");
				break;
			case "Library":
				Update.location("Sitting Room");
				break;
			case "Theater":
				Update.location("Mannequin Room");
				break;
			case "Island":
				Update.location("Inside Gate");
				break;
			case "Top of Stairs":
				Update.location("Hamlet");
				break;
			case "Creaky Deck":
				Update.location("Overlook");
				break;
			case "Overlook":
				Update.location("Garden Patio");
				break;
			default:
				System.out.println("Action.goWest() error");
				break;
		}
	}
	
	public static void goNorthEast() {
		switch (Data.playerLocation) {
			case "Hondo":
				Update.location("Trinket Shop");
				break;
			case "Courtyard":
				Update.location("Landing");
				break;
			default:
				System.out.println("Action.goNorthEast() error");
				break;
		}
	}
	
	public static void goNorthWest() {
		switch (Data.playerLocation) {
			case "Garden Overlook":
				Update.location("Thatched Hut");
				break;
			case "Hallway":
				Update.location("Landing");
				break;
			case "Hondo":
				Update.location("Balcony");
				break;
			default:
				System.out.println("Action.goNorthWest() error");
				break;
		}
	}
	
	public static void goSouthEast() {
		switch (Data.playerLocation) {
			case "Thatched Hut":
				Update.location("Garden Overlook");
				break;
			case "Landing":
				Update.location("Hallway");
				break;
			case "Balcony":
				Update.location("Hondo");
				break;
			default:
				System.out.println("Action.goSouthEast() error");
				break;
		}
	}
	
	public static void goSouthWest() {
		switch (Data.playerLocation) {
			case "Landing":
				Update.location("Courtyard");
				break;
			case "Trinket Shop":
				Update.location("Hondo");
				break;
			default:
				System.out.println("Action.goSouthWest() error");
				break;
		}
	}
	
	public static void goUp() {
		switch (Data.playerLocation) {
			case "Courtyard":
				Update.location("Landing");
				break;
			case "Landing":
				Update.location("Hallway");
				break;
			case "Bottom of Stairs":
				Update.location("Top of Stairs");
				break;
			default:
				System.out.println("Action.goUp() error");
				break;
		}
	}
	
	public static void goDown() {
		switch (Data.playerLocation) {
			case "Landing":
				Update.location("Courtyard");
				break;
			case "Hallway":
				Update.location("Landing");
				break;
			case "Top of Stairs":
				Update.location("Bottom of Stairs");
				break;
			default:
				System.out.println("Action.goDown() error");
				break;
		}
	}
	
	public static void checkInventory() {
		if (Item.inventory.isEmpty()) {
			Story.print(Story.inventoryEmpty);
		} else {
			Story.printInventory();
		}
	}
	
	public static void take(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "BOOK":
				if (Room.getObjects().contains("book")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "OM":
				if (Room.getObjects().contains("om")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "NI":
				if (Room.getObjects().contains("ni")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "GO":
				if (Room.getObjects().contains("go")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "YU":
				if (Room.getObjects().contains("yu")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "JI":
				if (Room.getObjects().contains("ji")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "RA":
				if (Room.getObjects().contains("ra")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "SHI":
				if (Room.getObjects().contains("shi")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "ROD":
				if (Room.getObjects().contains("rod")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "BOOKLET":
				if (Room.getObjects().contains("booklet")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "HANDBOOK":
				if (Room.getObjects().contains("handbook")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "PAMPHLET":
				if (Room.getObjects().contains("pamphlet")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "CORN":
				if (Room.getObjects().contains("corn")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "PARCHMENT":
				if (Room.getObjects().contains("parchment")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "CARD":
				if (Room.getObjects().contains("card")) {
					Item.getBook();
				} else {
					Story.printNotHere();
				}
				break;
			default:
			
				break;
		}
		
	}
}