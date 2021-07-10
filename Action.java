public class Action {
	public static void look() {
		Story.printDesc();
		Story.printObjects();
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
				if (Room.shrineRoom1DoorOpen) {
					Update.location(Room.shrineRoom1);
				} else {
					Story.printDoorBlocking();
				}
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
				if (Room.closetDoorOpen) {
					Update.location(Room.closet);
				} else {
					Story.printDoorBlocking();
				}
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
				if (Room.darkPassagewayDoorOpen) {
					Update.location(Room.darkPassageway);
				} else {
					Story.printDoorBlocking();
				}
				break;
			case "Pond":
				Update.location(Room.livingRoom);
				break;
			case "Closet":
				if (Room.closetDoorOpen) {
					Update.location(Room.courtyard);
				} else {
					Story.printDoorBlocking();
				}
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
	
	public static void go(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "NORTH":
				if (Room.getExits().contains("N")) {
					goNorth();
				} else {
					Story.printNoExit();
				}
				break;
			case "SOUTH":
				if (Room.getExits().contains("S")) {
					goSouth();
				} else {
					Story.printNoExit();
				}
				break;
			case "EAST":
				if (Room.getExits().contains("E")) {
					goEast();
				} else {
					Story.printNoExit();
				}	
				break;
			case "WEST":
				if (Room.getExits().contains("W")) {
					goWest();
				} else {
					Story.printNoExit();
				}
				break;
			case "NORTHEAST":
				if (Room.getExits().contains("NE")) {
					goNorthEast();
				} else {
					Story.printNoExit();
				}
				break;
			case "SOUTHEAST":
				if (Room.getExits().contains("SE")) {
					goSouthEast();
				} else {
					Story.printNoExit();
				}
				break;
			case "NORTHWEST":
				if (Room.getExits().contains("NW")) {
					goNorthWest();
				} else {
					Story.printNoExit();
				}
				break;
			case "SOUTHWEST":
				if (Room.getExits().contains("SW")) {
					goSouthWest();
				} else {
					Story.printNoExit();
				}
				break;
			case "UP":
				if (Room.getExits().contains("U")) {
					goUp();
				} else {
					Story.printNoExit();
				}
				break;
			case "DOWN":
				if (Room.getExits().contains("D")) {
					goDown();
				} else {
					Story.printNoExit();
				}
				break;
			default:
				System.out.println("Action.go() error");
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
				} else if (Item.inventory.contains(Item.book)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "OM":
				if (Room.getObjects().contains(Item.om)) {
					Item.getOm();
				} else if (Item.inventory.contains(Item.om)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "NI":
				if (Room.getObjects().contains(Item.ni)) {
					Item.getNi();
				} else if (Item.inventory.contains(Item.ni)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "GO":
				if (Room.getObjects().contains(Item.go)) {
					Item.getGo();
				} else if (Item.inventory.contains(Item.go)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "YU":
				if (Room.getObjects().contains(Item.yu)) {
					Item.getYu();
				} else if (Item.inventory.contains(Item.yu)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "JI":
				if (Room.getObjects().contains(Item.ji)) {
					Item.getJi();
				} else if (Item.inventory.contains(Item.ji)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "RA":
				if (Room.getObjects().contains(Item.ra)) {
					Item.getRa();
				} else if (Item.inventory.contains(Item.ra)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "SHI":
				if (Room.getObjects().contains(Item.shi)) {
					Item.getShi();
				} else if (Item.inventory.contains(Item.shi)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "ROD":
				if (Room.getObjects().contains(Item.rod)) {
					Item.getRod();
				} else if (Item.inventory.contains(Item.rod)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "BOOKLET":
				if (Room.getObjects().contains(Item.booklet)) {
					Item.getBooklet();
				} else if (Item.inventory.contains(Item.booklet)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "HANDBOOK":
				if (Room.getObjects().contains(Item.handbook)) {
					Item.getHandbook();
				} else if (Item.inventory.contains(Item.handbook)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "PAMPHLET":
				if (Room.getObjects().contains(Item.pamphlet)) {
					Item.getPamphlet();
				} else if (Item.inventory.contains(Item.pamphlet)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "CORN":
				if (Room.getObjects().contains(Item.corn)) {
					Item.getCorn();
				} else if (Item.inventory.contains(Item.corn)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "PARCHMENT":
				if (Room.getObjects().contains(Item.parchment)) {
					Item.getParchment();
				} else if (Item.inventory.contains(Item.parchment)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "CARD":
				if (Room.getObjects().contains(Item.card)) {
					Item.getCard();
				} else if (Item.inventory.contains(Item.card)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				System.out.println("Action.take() error");
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
				System.out.println("Action.drop() error");
				break;
		}
	}
	
	public static void read(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "BOOK":
				if (Item.inventory.contains(Item.book) || Room.getObjects().contains(Item.book)) {
					Item.examineBook();
				} else {
					Story.printNotHere();
				}
				break;
			case "BOOKLET":
				if (Item.inventory.contains(Item.booklet) || Room.getObjects().contains(Item.booklet)) {
					Item.examineBooklet();
				} else {
					Story.printNotHere();
				}
				break;
			case "HANDBOOK":
				if (Item.inventory.contains(Item.handbook) || Room.getObjects().contains(Item.handbook)) {
					Item.examineHandbook();
				} else {
					Story.printNotHere();
				}
				break;
			case "PAMPHLET":
				if (Item.inventory.contains(Item.pamphlet) || Room.getObjects().contains(Item.pamphlet)) {
					Item.examinePamphlet();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				System.out.println("Action.read() error");
				break;
		}
	}
	
	public static void examine(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "BOOK":
				Item.examineBook();
				break;
			case "BOOKLET":
				Item.examineBooklet();
				break;
			case "HANDBOOK":
				Item.examineHandbook();
				break;
			case "PAMPHLET":
				Item.examinePamphlet();
				break;
			case "FADED":
				Item.examineOm();
			case "FANCY":
				Item.examineNi();
				break;
			case "FROSTY":
				Item.examineGo();
				break;
			case "CRUMPLED":
				Item.examineYu();
				break;
			case "SMOOTH":
				Item.examineJi();
				break;
			case "DUSTY":
				Item.examineRa();
				break;
			case "STAINED":
				Item.examineShi();
				break;
			case "ROD":
				Item.examineRod();
				break;
			case "CORN":
				Item.examineCorn();
				break;
			case "PARCHMENT":
				Item.examineParchment();
				break;
			case "CARD":
				Item.examineCard();
				break;
			default:
				System.out.println("Action.read() error");
				break;
		}
	}
	
	public static void open(String n) {
		switch (n) {
			case "":
				Story.print("What do you want to open?");
				break;
			case "DOOR":
				openDoor();
				break;
			case "SAFE":
				openSafe();
				break;
			case "CASE":
				openCase();
				break;
			default:
				Story.print("That is not something you can open.");
				break;
		}
	}
	
	public static void shut(String n) {
		switch (n) {
			case "":
				Story.print("What do you want to shut?");
				break;
			case "DOOR":
				shutDoor();
				break;
			case "SAFE":
				shutSafe();
				break;
			case "CASE":
				shutCase();
				break;
			default:
				Story.print("That is not something you can shut.");
				break;
		}
	}
	
	public static void openDoor() {
		switch (Room.getLocation().title) {
			case "Sand Exhibit":
				if (Room.shrineRoom1DoorOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OOX) {
						Story.print("The door opens, revealing a shrine room.");
						Room.shrineRoom1DoorOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Shrine Room 1":
				if (Room.shrineRoom1DoorOpen) {
					Story.printAlreadyOpen();
				} else {
					Story.print("The door opens, revealing a sand exhibit.");
					Room.shrineRoom1DoorOpen = true;
				}
				break;
			case "Shrine Room 2":
				if (Room.darkPassagewayDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OOX) {
						Story.print("With some effort, the door slides opens, revealing a dark passageway.");
						Room.darkPassagewayDoorOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Dark Passageway":
				if (Room.darkPassagewayDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					Story.print("The door opens, revealing a shrine room.");
					Room.darkPassagewayDoorOpen = true;
				}
				break;
			case "Courtyard":
				if (Room.closetDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.XOO) {
						Story.print("The door opens, revealing a small closet.");
						Room.closetDoorOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Closet":
				if (Room.closetDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					Story.print("The door opens, revealing a courtyard.");
					Room.closetDoorOpen = true;
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void shutDoor() {
		switch (Room.getLocation().title) {
			case "Sand Exhibit":
				if (!Room.shrineRoom1DoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					Room.shrineRoom1DoorOpen = false;
				}
				break;
			case "Shrine Room 1":
				if (!Room.shrineRoom1DoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					Room.shrineRoom1DoorOpen = false;
				}
				break;
			case "Shrine Room 2":
				if (!Room.darkPassagewayDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					Room.darkPassagewayDoorOpen = false;
				}
				break;
			case "Dark Passageway":
				if (!Room.darkPassagewayDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					Room.darkPassagewayDoorOpen = false;
				}
				break;
			case "Courtyard":
				if (!Room.closetDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					Room.closetDoorOpen = false;
				}
				break;
			case "Closet":
				if (!Room.closetDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					Room.closetDoorOpen = false;
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void openSafe() {
		switch (Room.getLocation().title) {
			case "Lounge":
				if (Room.loungeSafeOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OOX) {
						Story.print("The safe swings open, revealing a faded scroll.");
						Room.loungeSafeOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Shrine Room 1":
				if (Room.shrineRoom1SafeOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OXO) {
						Story.print("The safe swings open, revealing a smooth scroll.");
						Room.loungeSafeOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Master Bedroom":
				if (Room.masterBedroomSafeOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.XOX) {
						Story.print("The safe swings open, revealing a fancy scroll.");
						Room.masterBedroomSafeOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void shutSafe() {
		
	}
	
	public static void openCase() {
		
	}
	
	public static void shutCase() {
		
	}
}