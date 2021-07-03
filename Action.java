public class Action {
	public static void look() {
		
	}
	
	public static void goNorth() {
		switch (Room.getLocation().title) {
			case "Cobble Square":
				Update.location(Room.gardenPatio);
				break;
			case "Thatched Hut":
				Update.location(Room.cobbleSquare);
				break;
			case "Shrine Room 1":
				Update.location(Room.sandExhibit);
				break;
			case "Cafe":
				Update.location(Room.outsideGallery);
				break;
			case "Assembly Room":
				Update.location(Room.insideGallery);
				break;
			case "Living Room":
				Update.location(Room.shrineRoom2);
				break;
			case "Pond":
				Update.location(Room.courtyard);
				break;
			case "Sitting Room":
				Update.location(Room.hallway);
				break;
			case "Dark Passageway":
				Update.location(Room.mannequinRoom);
				break;
			case "Library":
				Update.location(Room.outsideGate);
				break;
			case "Outside Gate":
				Update.location(Room.insideGate);
				break;
			case "Inside Gate":
				Update.location(Room.bottomOfStairs);
				break;
			case "Bottom of Stairs":
				Update.location(Room.topOfStairs);
				break;
			case "Top of Stairs":
				Update.location(Room.hondo);
				break;
			case "Hondo":
				Update.location(Room.shrineRoom3);
				break;
			case "Balcony":
				Update.location(Room.creakyDeck);
				break;
			default:
				System.out.println("Action.goNorth() error");
				break;
		}
	}
	
	public static void goSouth() {
		switch (Room.getLocation().title) {
			case "Garden Patio":
				Update.location(Room.cobbleSquare);
				break;
			case "Cobble Square":
				Update.location(Room.thatchedHut);
				break;
			case "Sand Exhibit":
				Update.location(Room.shrineRoom1);
				break;
			case "Outside Gallery":
				Update.location(Room.cafe);
				break;
			case "Inside Gallery":
				Update.location(Room.assemblyRoom);
				break;
			case "Assembly Room":
				Update.location(Room.shrineRoom2);
				break;
			case "Shrine Room 2":
				Update.location(Room.livingRoom);
				break;
			case "Courtyard":
				Update.location(Room.pond);
				break;
			case "Hallway":
				Update.location(Room.sittingRoom);
				break;
			case "Mannequin Room":
				Update.location(Room.darkPassageway);
				break;
			case "Inside Gate":
				Update.location(Room.outsideGate);
				break;
			case "Bottom of Stairs":
				Update.location(Room.insideGate);
				break;
			case "Top of Stairs":
				Update.location(Room.bottomOfStairs);
				break;
			case "Hondo":
				Update.location(Room.topOfStairs);
				break;
			case "Shrine Room 3":
				Update.location(Room.hondo);
				break;
			case "Creaky Deck":
				Update.location(Room.balcony);
				break;
			default:
				System.out.println("Action.goSouth() error");
				break;
		}
	}
	
	public static void goEast() {
		switch (Room.getLocation().title) {
			case "Tea Room":
				Update.location(Room.cobbleSquare);
				break;
			case "Cobble Square":
				Update.location(Room.sandExhibit);
				break;
			case "Lounge":
				Update.location(Room.gardenOverlook);
				break;
			case "Garden Overlook":
				Update.location(Room.cafe);
				break;
			case "Outside Gallery":
				Update.location(Room.insideGallery);
				break;
			case "Living Room":
				Update.location(Room.pond);
				break;
			case "Courtyard":
				Update.location(Room.closet);
				break;
			case "Sitting Room":
				Update.location(Room.library);
				break;
			case "Master Bedroom":
				Update.location(Room.sittingRoom);
				break;
			case "Dark Passageway":
				Update.location(Room.shrineRoom2);
				break;
			case "Mannequin Room":
				Update.location(Room.theater);
				break;
			case "Inside Gate":
				Update.location(Room.island);
				break;
			case "Hamlet":
				Update.location(Room.topOfStairs);
				break;
			case "Overlook":
				Update.location(Room.creakyDeck);
				break;
			default:
				System.out.println("Action.goEast() error");
				break;
			
		}
	}
	
	public static void goWest() {
		switch (Room.getLocation().title) {
			case "Cobble Square":
				Update.location(Room.teaRoom);
				break;
			case "Sand Exhibit":
				Update.location(Room.cobbleSquare);
				break;
			case "Garden Overlook":
				Update.location(Room.lounge);
				break;
			case "Cafe":
				Update.location(Room.gardenOverlook);
				break;
			case "Inside Gallery":
				Update.location(Room.outsideGallery);
				break;
			case "Shrine Room 2":
				Update.location(Room.darkPassageway);
				break;
			case "Pond":
				Update.location(Room.livingRoom);
				break;
			case "Closet":
				Update.location(Room.courtyard);
				break;
			case "Sitting Room":
				Update.location(Room.masterBedroom);
				break;
			case "Library":
				Update.location(Room.sittingRoom);
				break;
			case "Theater":
				Update.location(Room.mannequinRoom);
				break;
			case "Island":
				Update.location(Room.insideGate);
				break;
			case "Top of Stairs":
				Update.location(Room.hamlet);
				break;
			case "Creaky Deck":
				Update.location(Room.overlook);
				break;
			case "Overlook":
				Update.location(Room.gardenPatio);
				break;
			default:
				System.out.println("Action.goWest() error");
				break;
		}
	}
	
	public static void goNorthEast() {
		switch (Room.getLocation().title) {
			case "Hondo":
				Update.location(Room.trinketShop);
				break;
			case "Courtyard":
				Update.location(Room.landing);
				break;
			default:
				System.out.println("Action.goNorthEast() error");
				break;
		}
	}
	
	public static void goNorthWest() {
		switch (Room.getLocation().title) {
			case "Garden Overlook":
				Update.location(Room.thatchedHut);
				break;
			case "Hallway":
				Update.location(Room.landing);
				break;
			case "Hondo":
				Update.location(Room.balcony);
				break;
			default:
				System.out.println("Action.goNorthWest() error");
				break;
		}
	}
	
	public static void goSouthEast() {
		switch (Room.getLocation().title) {
			case "Thatched Hut":
				Update.location(Room.gardenOverlook);
				break;
			case "Landing":
				Update.location(Room.hallway);
				break;
			case "Balcony":
				Update.location(Room.hondo);
				break;
			default:
				System.out.println("Action.goSouthEast() error");
				break;
		}
	}
	
	public static void goSouthWest() {
		switch (Room.getLocation().title) {
			case "Landing":
				Update.location(Room.courtyard);
				break;
			case "Trinket Shop":
				Update.location(Room.hondo);
				break;
			default:
				System.out.println("Action.goSouthWest() error");
				break;
		}
	}
	
	public static void goUp() {
		switch (Room.getLocation().title) {
			case "Courtyard":
				Update.location(Room.landing);
				break;
			case "Landing":
				Update.location(Room.hallway);
				break;
			case "Bottom of Stairs":
				Update.location(Room.topOfStairs);
				break;
			default:
				System.out.println("Action.goUp() error");
				break;
		}
	}
	
	public static void goDown() {
		switch (Room.getLocation().title) {
			case "Landing":
				Update.location(Room.courtyard);
				break;
			case "Hallway":
				Update.location(Room.landing);
				break;
			case "Top of Stairs":
				Update.location(Room.bottomOfStairs);
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
				if (Room.getObjects().contains(Item.book)) {
					Item.getBook();
					Item.tookACBook = true;
				} else {
					Story.printNotHere();
				}
				break;
			case "OM":
				if (Room.getObjects().contains(Item.om)) {
					Item.getOm();
				} else {
					Story.printNotHere();
				}
				break;
			case "NI":
				if (Room.getObjects().contains(Item.ni)) {
					Item.getNi();
				} else {
					Story.printNotHere();
				}
				break;
			case "GO":
				if (Room.getObjects().contains(Item.go)) {
					Item.getGo();
				} else {
					Story.printNotHere();
				}
				break;
			case "YU":
				if (Room.getObjects().contains(Item.yu)) {
					Item.getYu();
				} else {
					Story.printNotHere();
				}
				break;
			case "JI":
				if (Room.getObjects().contains(Item.ji)) {
					Item.getJi();
				} else {
					Story.printNotHere();
				}
				break;
			case "RA":
				if (Room.getObjects().contains(Item.ra)) {
					Item.getRa();
				} else {
					Story.printNotHere();
				}
				break;
			case "SHI":
				if (Room.getObjects().contains(Item.shi)) {
					Item.getShi();
				} else {
					Story.printNotHere();
				}
				break;
			case "ROD":
				if (Room.getObjects().contains(Item.rod)) {
					Item.getRod();
				} else {
					Story.printNotHere();
				}
				break;
			case "BOOKLET":
				if (Room.getObjects().contains(Item.booklet)) {
					Item.getBooklet();
				} else {
					Story.printNotHere();
				}
				break;
			case "HANDBOOK":
				if (Room.getObjects().contains(Item.handbook)) {
					Item.getHandbook();
				} else {
					Story.printNotHere();
				}
				break;
			case "PAMPHLET":
				if (Room.getObjects().contains(Item.pamphlet)) {
					Item.getPamphlet();
				} else {
					Story.printNotHere();
				}
				break;
			case "CORN":
				if (Room.getObjects().contains(Item.corn)) {
					Item.getCorn();
				} else {
					Story.printNotHere();
				}
				break;
			case "PARCHMENT":
				if (Room.getObjects().contains(Item.parchment)) {
					Item.getParchment();
				} else {
					Story.printNotHere();
				}
				break;
			case "CARD":
				if (Room.getObjects().contains(Item.card)) {
					Item.getCard();
				} else {
					Story.printNotHere();
				}
				break;
			default:
			
				break;
		}
		
	}
	
	public static void drop(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "BOOK":
				if (Item.inventory.contains(Item.book)) {
					Item.inventory.remove(Item.book);
					Room.getObjects().add(Item.book);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "OM":
				if (Item.inventory.contains(Item.om)) {
					Item.inventory.remove(Item.om);
					Room.getObjects().add(Item.om);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "NI":
				if (Item.inventory.contains(Item.ni)) {
					Item.inventory.remove(Item.ni);
					Room.getObjects().add(Item.ni);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "GO":
				if (Item.inventory.contains(Item.go)) {
					Item.inventory.remove(Item.go);
					Room.getObjects().add(Item.go);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "YU":
				if (Item.inventory.contains(Item.yu)) {
					Item.inventory.remove(Item.yu);
					Room.getObjects().add(Item.yu);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "JI":
				if (Item.inventory.contains(Item.ji)) {
					Item.inventory.remove(Item.ji);
					Room.getObjects().add(Item.ji);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "RA":
				if (Item.inventory.contains(Item.ra)) {
					Item.inventory.remove(Item.ra);
					Room.getObjects().add(Item.ra);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "SHI":
				if (Item.inventory.contains(Item.shi)) {
					Item.inventory.remove(Item.shi);
					Room.getObjects().add(Item.shi);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "ROD":
				if (Item.inventory.contains(Item.rod)) {
					Item.inventory.remove(Item.rod);
					Room.getObjects().add(Item.rod);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "BOOKLET":
				if (Item.inventory.contains(Item.booklet)) {
					Item.inventory.remove(Item.booklet);
					Room.getObjects().add(Item.booklet);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "HANDBOOK":
				if (Item.inventory.contains(Item.handbook)) {
					Item.inventory.remove(Item.handbook);
					Room.getObjects().add(Item.handbook);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "PAMPHLET":
				if (Item.inventory.contains(Item.pamphlet)) {
					Item.inventory.remove(Item.pamphlet);
					Room.getObjects().add(Item.pamphlet);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "CORN":
				if (Item.inventory.contains(Item.corn)) {
					Item.inventory.remove(Item.corn);
					Room.getObjects().add(Item.corn);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "PARCHMENT":
				if (Item.inventory.contains(Item.parchment)) {
					Item.inventory.remove(Item.parchment);
					Room.getObjects().add(Item.parchment);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "CARD":
				if (Item.inventory.contains(Item.card)) {
					Item.inventory.remove(Item.card);
					Room.getObjects().add(Item.card);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			default:
			
				break;
		}
	}
}