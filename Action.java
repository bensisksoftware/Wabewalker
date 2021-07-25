public class Action {
	public static void look() {
		Story.printDesc();
		Story.printDesc2();
		Story.printObjects();
	}
	
	public static void meditate() {
		Player.meditating = true;
		Story.printNowMeditating();
	}
	
	public static void goNorth() {
		switch (Player.getLocation().title) {
			case "Cobble Square":
				Player.updateLocation(Room.gardenPatio);
				break;
			case "Thatched Hut":
				Player.updateLocation(Room.cobbleSquare);
				break;
			case "Shrine Room 1":
				Player.updateLocation(Room.sandExhibit);
				break;
			case "Cafe":
				Player.updateLocation(Room.outsideGallery);
				
				if (!Player.dreaming) {
					Player.facingReaper = true;
					Story.newParagraph();
					Story.printReaperEncounter1();
				}
				break;
			case "Assembly Room":
				Player.updateLocation(Room.insideGallery);
				Story.print("\nTo the west, you see a monk in a faded orange robe. You hear yourself whisper, \"What year did Palu write Post Radius?\" The monk says something that you cannot make out, and you black out. You find yourself sitting in Hisachi Ichiro's House.\n");
				Player.returnToIsachi();
				break;
			case "Living Room":
				Player.updateLocation(Room.shrineRoom2);
				break;
			case "Pond":
				Player.updateLocation(Room.courtyard);
				World.bite = false;
				Player.startedFishing = 0;
				Player.fishing = false;
				break;
			case "Sitting Room":
				if (Player.inventory.contains(Item.phone)) {
					Player.inventory.remove(Item.phone);
					Room.getObjects().add(Item.phone);
					Story.print("You can't take the corded phone with you, so you leave it.");
					Story.newParagraph();
				}
				Player.updateLocation(Room.hallway);
				break;
			case "Dark Passageway":
				Player.updateLocation(Room.mannequinRoom);
				break;
			case "Library":
				Player.updateLocation(Room.outsideGate);
				break;
			case "Outside Gate":
				Player.updateLocation(Room.insideGate);
				break;
			case "Inside Gate":
				Player.updateLocation(Room.bottomOfStairs);
				break;
			case "Bottom of Stairs":
				Player.updateLocation(Room.topOfStairs);
				break;
			case "Top of Stairs":
				Player.updateLocation(Room.hondo);
				break;
			case "Hondo":
				Player.updateLocation(Room.shrineRoom3);
				break;
			case "Balcony":
				Player.updateLocation(Room.creakyDeck);
				break;
			default:
				System.out.println("Action.goNorth() error");
				break;
		}
	}
	
	public static void goSouth() {
		switch (Player.getLocation().title) {
			case "Garden Patio":
				Player.updateLocation(Room.cobbleSquare);
				break;
			case "Cobble Square":
				Player.updateLocation(Room.thatchedHut);
				break;
			case "Sand Exhibit":
				if (World.sandExhibitDoorOpen) {
					Player.updateLocation(Room.shrineRoom1);
				} else {
					Story.printDoorBlocking();
				}
				break;
			case "Outside Gallery":
				Player.updateLocation(Room.cafe);
				break;
			case "Inside Gallery":
				Player.updateLocation(Room.assemblyRoom);
				
				if (!Player.spokeToClan) {
					Story.print(Story.tod9);
					Player.spokeToClan = true;
					Player.inventory.add(Item.sword);
				}
				break;
			case "Shrine Room 2":
				Player.updateLocation(Room.livingRoom);
				World.shrineRoom2DoorOpen = false;

				if (World.tripwire) {
					Story.newLine();
					Player.facingReaper = true;
					Story.printReaperEncounter1();
				} else {
					World.tripwire = true;
				}
				break;
			case "Courtyard":
				Player.updateLocation(Room.pond);
				World.courtyardDoorOpen = false;
				break;
			case "Hallway":
				Player.updateLocation(Room.sittingRoom);
				break;
			case "Mannequin Room":
				Player.updateLocation(Room.darkPassageway);
				break;
			case "Inside Gate":
				Player.updateLocation(Room.outsideGate);
				break;
			case "Bottom of Stairs":
				Player.updateLocation(Room.insideGate);
				break;
			case "Top of Stairs":
				Player.updateLocation(Room.bottomOfStairs);
				break;
			case "Hondo":
				Player.updateLocation(Room.topOfStairs);
				break;
			case "Shrine Room 3":
				Player.updateLocation(Room.hondo);
				break;
			case "Creaky Deck":
				Player.updateLocation(Room.balcony);
				break;
			default:
				System.out.println("Action.goSouth() error");
				break;
		}
	}
	
	public static void goEast() {
		switch (Player.getLocation().title) {
			case "Tea Room":
				Player.updateLocation(Room.cobbleSquare);
				break;
			case "Cobble Square":
				Player.updateLocation(Room.sandExhibit);
				break;
			case "Lounge":
				Player.updateLocation(Room.gardenOverlook);
				break;
			case "Garden Overlook":
				Player.updateLocation(Room.cafe);
				if (!Player.dreaming) {
					if (!Player.sawReaper1) {
						Player.sawReaper1 = true;
						Story.printSeeReaper1();
					}
				}
				break;
			case "Outside Gallery":
				Player.updateLocation(Room.insideGallery);
				break;
			case "Living Room":
				Player.updateLocation(Room.pond);
				break;
			case "Courtyard":
				if (World.courtyardDoorOpen) {
					Player.updateLocation(Room.closet);
				} else {
					Story.printDoorBlocking();
				}
				break;
			case "Sitting Room":
				if (Player.inventory.contains(Item.phone)) {
					Player.inventory.remove(Item.phone);
					Room.getObjects().add(Item.phone);
					Story.print("You can't take the corded phone with you, so you leave it.");
					Story.newParagraph();
				}
				Player.updateLocation(Room.library);
				break;
			case "Master Bedroom":
				Player.updateLocation(Room.sittingRoom);
				break;
			case "Dark Passageway":
				Player.updateLocation(Room.shrineRoom2);
				World.dark = false;
				break;
			case "Mannequin Room":
				Player.updateLocation(Room.theater);
				break;
			case "Inside Gate":
				Player.updateLocation(Room.island);
				break;
			case "Hamlet":
				Player.updateLocation(Room.topOfStairs);
				break;
			case "Overlook":
				Player.updateLocation(Room.creakyDeck);
				break;
			default:
				System.out.println("Action.goEast() error");
				break;
			
		}
	}
	
	public static void goWest() {
		switch (Player.getLocation().title) {
			case "Cobble Square":
				Player.updateLocation(Room.teaRoom);
				break;
			case "Sand Exhibit":
				Player.updateLocation(Room.cobbleSquare);
				break;
			case "Garden Overlook":
				Player.updateLocation(Room.lounge);
				break;
			case "Cafe":
				Player.updateLocation(Room.gardenOverlook);
				break;
			case "Inside Gallery":
				Player.updateLocation(Room.outsideGallery);
				break;
			case "Shrine Room 2":
				if (World.shrineRoom2DoorOpen) {
					Player.updateLocation(Room.darkPassageway);
					World.dark = true;
					World.tripwire = false;
				} else {
					Story.printDoorBlocking();
				}
				break;
			case "Pond":
				Player.updateLocation(Room.livingRoom);
				break;
			case "Closet":
				if (World.courtyardDoorOpen) {
					Player.updateLocation(Room.courtyard);
				} else {
					Story.printDoorBlocking();
				}
				break;
			case "Sitting Room":
				if (Player.inventory.contains(Item.phone)) {
					Player.inventory.remove(Item.phone);
					Room.getObjects().add(Item.phone);
					Story.print("You can't take the corded phone with you, so you leave it.");
					Story.newParagraph();
				}
				Player.updateLocation(Room.masterBedroom);
				break;
			case "Library":
				Player.updateLocation(Room.sittingRoom);
				break;
			case "Theater":
				Player.updateLocation(Room.mannequinRoom);
				break;
			case "Island":
				Story.print("You hear the wooden gate slam shut behind you\n");
				Player.updateLocation(Room.insideGate);
				World.islandOpen = false;
				break;
			case "Top of Stairs":
				Player.updateLocation(Room.hamlet);
				
				if (World.XOO && !Player.metIsachi){
					Story.newLine();
					Story.print(Story.tod1);
					Story.newLine();
					Player.updateLocation(Room.todsHouse);
				}
				break;
			case "Creaky Deck":
				Player.updateLocation(Room.overlook);
				break;
			case "Overlook":
				Player.updateLocation(Room.gardenPatio);
				break;
			default:
				System.out.println("Action.goWest() error");
				break;
		}
	}
	
	public static void goNorthEast() {
		switch (Player.getLocation().title) {
			case "Hondo":
				Player.updateLocation(Room.trinketShop);
				break;
			case "Courtyard":
				Player.updateLocation(Room.landing);
				World.courtyardDoorOpen = false;
				break;
			default:
				System.out.println("Action.goNorthEast() error");
				break;
		}
	}
	
	public static void goNorthWest() {
		switch (Player.getLocation().title) {
			case "Garden Overlook":
				Player.updateLocation(Room.thatchedHut);
				break;
			case "Hallway":
				Player.updateLocation(Room.landing);
				break;
			case "Hondo":
				Player.updateLocation(Room.balcony);
				break;
			default:
				System.out.println("Action.goNorthWest() error");
				break;
		}
	}
	
	public static void goSouthEast() {
		switch (Player.getLocation().title) {
			case "Thatched Hut":
				Player.updateLocation(Room.gardenOverlook);
				break;
			case "Landing":
				Player.updateLocation(Room.hallway);
				break;
			case "Balcony":
				Player.updateLocation(Room.hondo);
				break;
			default:
				System.out.println("Action.goSouthEast() error");
				break;
		}
	}
	
	public static void goSouthWest() {
		switch (Player.getLocation().title) {
			case "Landing":
				Player.updateLocation(Room.courtyard);
				break;
			case "Trinket Shop":
				Player.updateLocation(Room.hondo);
				break;
			default:
				System.out.println("Action.goSouthWest() error");
				break;
		}
	}
	
	public static void goUp() {
		switch (Player.getLocation().title) {
			case "Courtyard":
				Player.updateLocation(Room.landing);
				World.courtyardDoorOpen = false;
				break;
			case "Landing":
				Player.updateLocation(Room.hallway);
				break;
			case "Bottom of Stairs":
				Player.updateLocation(Room.topOfStairs);
				break;
			default:
				System.out.println("Action.goUp() error");
				break;
		}
	}
	
	public static void goDown() {
		switch (Player.getLocation().title) {
			case "Landing":
				Player.updateLocation(Room.courtyard);
				break;
			case "Hallway":
				Player.updateLocation(Room.landing);
				break;
			case "Top of Stairs":
				Player.updateLocation(Room.bottomOfStairs);
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
			case "FISHING":
				if (Player.inventory.contains(Item.rod)) {
					goFishing();
				} else {
					Story.printHow();
				}
			default:
				System.out.println("Action.go() error");
				break;
		}
	}
	
	public static void cast(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "ROD":
				if (Player.inventory.contains(Item.rod)) {
					goFishing();
				} else {
					Story.printHow();
				}
				break;
			default:
				Story.invalid();
				break;
		}
	}
	public static void goFishing() {
		if (Player.getLocation().equals(Room.pond)) {
			Player.fishing = true;
			Story.printCast();
			Player.startedFishing = Data.moves;
		} else {
			Story.print("You cast your line and the hook lands on the ground in front of you.");
		}
	}
	
	public static void passTime() {
		Story.printPassTime();
		
		if (World.cornOnRod && Player.fishing && (Data.moves == (Player.startedFishing + 6))) {
			Story.printBite();
			World.bite = true;
			World.cornOnRod = false;
		}
		
		if (World.bite && (Data.moves > (Player.startedFishing + 6))) {
			Story.print(" You no longer feel a tug on the line.");
			World.bite = false;
		}
	}
	
	private static void reelIn() {
		Story.print("You reel in the line.");
		
		if (World.bite) {
			catchFish();
		} else {
			Story.print(" You didn't catch anything.");
		}
		
		Player.startedFishing = 0;
		World.bite = false;
	}
	
	private static void catchFish() {
		World.cornOnRod = false;
		Story.printCatch();
		Player.memorizeFish();
	}
	
	public static void checkInventory() {
		if (Player.inventory.isEmpty()) {
			Story.printInventoryEmpty();
		} else {
			Story.printInventory();
		}
	}
	
	public static void visualize(String n) {
		switch (n) {
			case "":
				Story.print("What do you want to visualize?");
				break;
			case "LOTUS":
				if (Player.memory.contains("Lotus")) {
					if (!Player.visualizingLotus) {
						Player.visualizingFish = false;						
						Player.visualizingKnot = false;						
						Player.visualizingLotus = true;	
						Story.printVisualize("lotus");
					} else {
						Story.printAlreadyVisualizing();
					}
				} else {
					Story.printNotMemorized();
				}
				break;
			case "FISH":
				if (Player.memory.contains("Fish")) {
					if (!Player.visualizingFish) {
						Player.visualizingLotus = false;						
						Player.visualizingKnot = false;						
						Player.visualizingFish = true;	
						Story.printVisualize("fish");						
					} else {
						Story.printAlreadyVisualizing();
					}
				} else {
					Story.printNotMemorized();
				}
				break;
			case "KNOT":
				if (Player.memory.contains("Knot")) {
					if (!Player.visualizingKnot) {
						Player.visualizingLotus = false;						
						Player.visualizingFish = false;						
						Player.visualizingKnot = true;
						Story.printVisualize("knot");
					} else {
						Story.printAlreadyVisualizing();
					}
				} else {
					Story.printNotMemorized();
				}
				break;
			default:
				Story.printNotMemorized();
				break;
		}
	}
	
	public static void chant(String c) {
		switch (c) {
			case "":
				Story.print("Chant what?");
				break;
			case "OM":
				if (Player.memory.contains("om")) {
					Story.print("\"...Ommm...\"");
					Player.chantInputs.add("om");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "NI":
				if (Player.memory.contains("ni")) {
					Story.print("\"...Niii...\"");
					Player.chantInputs.add("ni");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "GO":
				if (Player.memory.contains("go")) {
					Story.print("\"...Gooo...\"");
					Player.chantInputs.add("go");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "YU":
				if (Player.memory.contains("yu")) {
					Story.print("\"...Yuuu...\"");
					Player.chantInputs.add("yu");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "JI":
				if (Player.memory.contains("ji")) {
					Story.print("\"...Jiii...\"");
					Player.chantInputs.add("ji");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "RA":
				if (Player.memory.contains("ra")) {
					Story.print("\"...Raaa...\"");
					Player.chantInputs.add("ra");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "SHI":
				if (Player.memory.contains("shi")) {
					Story.print("\"...Shiii...\"");
					Player.chantInputs.add("shi");
				} else {
					Story.printNotMemorized();
				}
				break;
			default:
				Story.printNotMemorized();
				break;
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
					Player.tookACBook = true;
				} else if (Player.inventory.contains(Item.book)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "OM":
				if (Room.getObjects().contains(Item.om) || (Player.getLocation().title.equals("Lounge") && World.loungeSafeOpen && World.omInSafe)) {
					Item.getOm();
				} else if (Player.inventory.contains(Item.om)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "NI":
				if (Room.getObjects().contains(Item.ni) || (Player.getLocation().title.equals("Master Bedroom") && World.masterBedroomSafeOpen && World.niInSafe)) {
					Item.getNi();
				} else if (Player.inventory.contains(Item.ni)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "GO":
				if (Room.getObjects().contains(Item.go) || (Player.getLocation().title.equals("Creaky Deck") && World.creakyDeckOpen && World.goInCase)) {
					Item.getGo();
				} else if (Player.inventory.contains(Item.go)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "YU":
				if (Room.getObjects().contains(Item.yu) || (World.yuInBox && World.boxOpen && (Player.inventory.contains(Item.box) || Room.getObjects().contains(Item.box)))){
					Item.getYu();
				} else if (Player.inventory.contains(Item.yu)) {
					Story.printAlreadyHave();
				} else{
					Story.printNotHere();
				}
				break;
			case "JI":
				if (Room.getObjects().contains(Item.ji) || (World.jiInSafe && World.shrineRoom1SafeOpen && (Player.inventory.contains(Item.ji)))) {
					Item.getJi();
				} else if (Player.inventory.contains(Item.ji)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "RA":
				if (Room.getObjects().contains(Item.ra)) {
					Item.getRa();
				} else if (Player.inventory.contains(Item.ra)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "SHI":
				if (Room.getObjects().contains(Item.shi)) {
					Item.getShi();
				} else if (Player.inventory.contains(Item.shi)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "SCROLL":
				if (Player.getLocation().equals(Room.hallway)) {
					if (Room.hallway.getScrollCount() == 0) {
						Story.print("The glass panel prevents you from getting to the scroll.");
					} else {
						Story.print("Which one?");
					}
				} else {
					if (Room.getScrollCount() > 1) {
						Story.print("Which one?");
					} else if (Room.getScrollCount() == 1) {
						Item.getScroll();
					} else {
						Story.printNotHere();
					}
				}
				break;
			case "ROD":
				if (Room.getObjects().contains(Item.rod)) {
					Item.getRod();
				} else if (Player.inventory.contains(Item.rod)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "BOOKLET":
				if (Room.getObjects().contains(Item.booklet)) {
					Item.getBooklet();
				} else if (Player.inventory.contains(Item.booklet)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "HANDBOOK":
				if (Room.getObjects().contains(Item.handbook)) {
					Item.getHandbook();
				} else if (Player.inventory.contains(Item.handbook)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "PAMPHLET":
				if (Room.getObjects().contains(Item.pamphlet)) {
					Item.getPamphlet();
				} else if (Player.inventory.contains(Item.pamphlet)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "CORN":
				if (Room.getObjects().contains(Item.corn)) {
					Item.getCorn();
				} else if (Player.inventory.contains(Item.corn)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "PARCHMENT":
				if (Room.getObjects().contains(Item.parchment)) {
					Item.getParchment();
				} else if (Player.inventory.contains(Item.parchment)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "CARD":
				if (Room.getObjects().contains(Item.card)) {
					Item.getCard();
				} else if (Player.inventory.contains(Item.card)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "FISH":
				if (Player.getLocation().title.equals("Pond")) {
					reelIn();
				} else {
					Story.printNotHere();
				}
				break;
			case "PHONE":
				if (Room.getObjects().contains(Item.phone)) {
					Item.getPhone();
				} else if (Player.inventory.contains(Item.phone)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			case "BOX":
				if (Room.getObjects().contains(Item.box)) {
					Item.getBox();
				} else {
					Story.printNotHere();
				}
				break;
			case "MIRROR":
				Item.getMirror();
				break;
			case "SWORD":
				if (Player.inventory.contains(Item.sword)) {
					Story.printAlreadyHave();
				} else if (Room.getObjects().contains(Item.sword)) {
					Player.inventory.add(Item.sword);
					Story.print("Taken.");
				} else {
					Story.printNotHere();
				}
				break;
			case "WOMAN":
				Story.printCantTake();
				break;
			case "CRANES":
				moveCranes();
				break;
			default:
				Story.printNotHere();
				break;
		}
		
	}
	
	public static void put(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "CORN":
				if (Player.inventory.contains(Item.rod) && Player.inventory.contains(Item.corn)) {
					Story.printBait();
					World.cornOnRod = true;
					Player.inventory.remove(Item.corn);
				} else {
					Story.printHow();
				}
				break;
			case "ROD":
				if (Player.inventory.contains(Item.rod) && Player.inventory.contains(Item.corn)) {
					Story.printBait();
					World.cornOnRod = true;
					Player.inventory.remove(Item.corn);
				} else {
					Story.printHow();
				}
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void fight(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "FIGURE":
				if (Player.getLocation().title.equals("Assembly Room")) {
					Story.print("\nThe figures draw their swords, and before you can say \"Bunraku,\" you black out. You find yourself sitting in Hisachi Ichiro's House.\n");
					Player.returnToIsachi();
				} else {
					Story.printNotHere();
				}
				break;
			case "WOMAN":
				if (Player.getLocation().title.equals("Cafe") || Player.getLocation().title.equals("Living Room")) {
					Story.print("The woman is on the other side of the glass.");
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void drop(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "BOOK":
				if (Player.inventory.contains(Item.book)) {
					Player.inventory.remove(Item.book);
					Room.getObjects().add(Item.book);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "OM":
				if (Player.inventory.contains(Item.om)) {
					Player.inventory.remove(Item.om);
					Room.getObjects().add(Item.om);
					Room.addScroll();
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "NI":
				if (Player.inventory.contains(Item.ni)) {
					Player.inventory.remove(Item.ni);
					Room.getObjects().add(Item.ni);
					Room.addScroll();
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "GO":
				if (Player.inventory.contains(Item.go)) {
					Player.inventory.remove(Item.go);
					Room.getObjects().add(Item.go);
					Room.addScroll();
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "YU":
				if (Player.inventory.contains(Item.yu)) {
					Player.inventory.remove(Item.yu);
					Room.getObjects().add(Item.yu);
					Room.addScroll();
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "JI":
				if (Player.inventory.contains(Item.ji)) {
					Player.inventory.remove(Item.ji);
					Room.getObjects().add(Item.ji);
					Room.addScroll();
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "RA":
				if (Player.inventory.contains(Item.ra)) {
					Player.inventory.remove(Item.ra);
					Room.getObjects().add(Item.ra);
					Room.addScroll();
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "SHI":
				if (Player.inventory.contains(Item.shi)) {
					Player.inventory.remove(Item.shi);
					Room.getObjects().add(Item.shi);
					Room.addScroll();
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "ROD":
				if (Player.inventory.contains(Item.rod)) {
					Player.inventory.remove(Item.rod);
					Room.getObjects().add(Item.rod);
					Player.fishing = false;
					World.bite = false;
					Player.startedFishing = 0;
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "BOOKLET":
				if (Player.inventory.contains(Item.booklet)) {
					Player.inventory.remove(Item.booklet);
					Room.getObjects().add(Item.booklet);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "HANDBOOK":
				if (Player.inventory.contains(Item.handbook)) {
					Player.inventory.remove(Item.handbook);
					Room.getObjects().add(Item.handbook);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "PAMPHLET":
				if (Player.inventory.contains(Item.pamphlet)) {
					Player.inventory.remove(Item.pamphlet);
					Room.getObjects().add(Item.pamphlet);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "CORN":
				if (Player.inventory.contains(Item.corn)) {
					Player.inventory.remove(Item.corn);
					Room.getObjects().add(Item.corn);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "PARCHMENT":
				if (Player.inventory.contains(Item.parchment)) {
					Player.inventory.remove(Item.parchment);
					Room.getObjects().add(Item.parchment);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "CARD":
				if (Player.inventory.contains(Item.card)) {
					Player.inventory.remove(Item.card);
					Room.getObjects().add(Item.card);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "PHONE":
				if (Player.inventory.contains(Item.phone)) {
					Player.inventory.remove(Item.phone);
					Room.getObjects().add(Item.phone);
					Story.print("You hang up the phone.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "SWORD":
				if (Player.inventory.contains(Item.sword)) {
					Player.inventory.remove(Item.sword);
					Room.getObjects().add(Item.sword);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
			default:
				System.out.println("Action.drop() error");
				break;
		}
	}
	
	public static void hang(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "UP":
				if (Player.inventory.contains(Item.phone)) {
					Player.inventory.remove(Item.phone);
					Room.getObjects().add(Item.phone);
					Story.print("You hang up the phone.");
				} else {
					Story.print("You're not even holding the phone.");
				}
				break;
			default:
				Story.invalid();
			break;
		}
	}
	
	private static void readSign() {
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
				Story.print(Story.sandExhibitSign);
				break;
			case "Shrine Room 2":
				Story.print(Story.shrineRoom2Sign);
				break;
			case "Sitting Room":
				Story.print(Story.sittingRoomSign);
				break;
			case "Inside Gate":
				Story.print(Story.insideGateSign);
				break;
			case "Bottom of Stairs":
				Story.print(Story.bottomOfStairsSign);
				break;
			case "Top of Stairs":
				Story.printReadKnot();
				
				if (!Player.memory.contains("Knot")) {
					Story.printMemorizeSymbol();
					Player.memory.add("Knot");
				}
				break;
			case "Hondo":
				Story.print(Story.hondoSign);
				break;
			case "Shrine Room 3":
				Story.print(Story.shrineRoom3Sign);
				break;
			default:
				Story.printNotHere();
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
			case "OM":
				Item.examineOm();
				break;
			case "NI":
				Item.examineNi();
				break;
			case "GO":
				Item.examineGo();				
				break;
			case "YU":
				Item.examineYu();				
				break;
			case "JI":
				Item.examineJi();			
				break;
			case "RA":
				Item.examineRa();				
				break;
			case "SHI":
				Item.examineShi();				
				break;
			case "SCROLL":
				if (Player.getLocation().equals(Room.hallway)) {
					if (Room.hallway.getScrollCount() == 0) {
						Story.print("The glass panel prevents you from getting to the scroll.");
					} else {
						Story.print("Which one?");
					}
				} else {
					if ((Room.getScrollCount() + Player.getInventoryScrollCount()) > 1) {
						Story.print("Which one?");
					} else if ((Room.getScrollCount() + Player.getInventoryScrollCount()) == 1) {
						Item.examineScroll();
					} else {
						Story.printNotHere();
					}
				}
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
			case "MIRROR":
				Item.examineMirror();
				break;
			case "PLAQUE":
				Story.printPlaque();
				break;
			case "WOMAN":
				if (Player.getLocation().title.equals("Cafe") || Player.getLocation().title.equals("Living Room")) {
					Story.printWoman();
				} else {
					Story.printNotHere();
				}
				break;
			case "SIGN":
				readSign();
				break;
			case "ROBE":
				Story.print("It's a loosely-fit faded " + Player.getRobe() + " robe."); 
				break;
			case "POND":
				if (Player.getLocation().title.equals("Pond")) {
					Story.print("Small ripples roll across the pond. You can see a red koi fish exploring idly underwater.");
				} else {
					Story.printNotHere();
				}
				break;
			case "FISH":
				if (Player.getLocation().title.equals("Pond")) {
					Story.print("The red koi fish is exploring idly underwater, just out of reach.");
				} else {
					Story.printNotHere();
				}
				break;
			case "TV":
				Item.examineTV();
				break;
			case "PHONE":
				Item.examinePhone();
				break;
			case "DOOR":
				Item.examineDoor();
				break;
			case "SAFE":
				Item.examineSafe();
				break;
			case "GATE":
				Story.printExamineGate();
				break;
			case "BOX":
				Item.examineBox();
				break;
			case "CRANES":
				// if at overlook or shrine1 w right screen
				if (Player.getLocation().title.equals("Overlook")) {
					Story.print("The cranes are colorful and on a hinge thing where you can maybe move it hint hint.");
				} else if (Player.getLocation().title.equals("Shrine Room 1") && Player.purpleAlive) {
					Story.print("The paper cranes on the TV are so colorful and encompass the whole screen");
				} else {
					Story.printNotHere();
				}
				break;
			case "MEMORY":
				Story.printMemory();
				break;
			case "SHRINE":
				Story.printExamineShrine();
				break;
			case "TASSEL":
				Story.print("The tassel is hanging from the gate.");
				break;
			case "TEA":
				Story.print("There's nothing special about it.");
				break;
			case "CHEST":
				if (Player.getLocation().title.equals("Assembly Room")) {
					Story.print("It's gold and there's a plaque on the front of it.");
				} else {
					Story.printNotHere();
				}
				break;
			case "FIGURE":
				if (Player.getLocation().title.equals("Assembly Room")) {
					Story.print("They are wearing black hooded robes.");
				} else {
					Story.printNotHere();
				}
				break;
			case "CASE":
				Item.examineCase();
				break;
			case "BUTTON":
				Story.print("It's a tiny silver button.");
				break;
			case "HOLE":
				examineHole();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examineHole() {
		if (Player.getLocation().title.equals("Dark Passageway")) {
			Story.print("Through the hole you can see the woman.");
			
			if (!Player.sawReaper2) {
				Story.print(" Lurking behind the woman, you see a hooded figure. Seemingly unsatisfied, it leaves the area.");
			}
			
			Player.sawReaper2 = true;
		} else {
			Story.printNotHere();
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
			case "BOX":
				openBox();
				break;
			case "CASE":
				openCase();
				break;
			case "CHEST":
				if (Player.getLocation().title.equals("Assembly Room"))
					Story.print(Story.tod10);
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
			case "EYES":
				meditate();
				break;
			case "DOOR":
				shutDoor();
				break;
			case "SAFE":
				shutSafe();
				break;
			case "BOX":
				shutBox();
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
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
				if (World.sandExhibitDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OOX) {
						Story.print("The door opens, revealing a shrine room.");
						World.sandExhibitDoorOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Shrine Room 1":
				if (World.sandExhibitDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					Story.print("The door opens, revealing a sand exhibit.");
					World.sandExhibitDoorOpen = true;
				}
				break;
			case "Shrine Room 2":
				if (World.shrineRoom2DoorOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OOX) {
						Story.print("With some effort, the door slides opens, revealing a dark passageway.");
						World.shrineRoom2DoorOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Dark Passageway":
				if (World.shrineRoom2DoorOpen) {
					Story.printAlreadyOpen();
				} else {
					Story.print("The door opens, revealing a shrine room.");
					World.shrineRoom2DoorOpen = true;
				}
				break;
			case "Courtyard":
				if (World.courtyardDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.XOO) {
						Story.print("The door opens, revealing a small closet.");
						World.courtyardDoorOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Closet":
				if (World.courtyardDoorOpen) {
					Story.printAlreadyOpen();
				} else {
					Story.print("The door opens, revealing a courtyard.");
					World.courtyardDoorOpen = true;
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void shutDoor() {
		switch (Player.getLocation().title) {
			case "Sand Exhibit":
				if (!World.sandExhibitDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					World.sandExhibitDoorOpen = false;
				}
				break;
			case "Shrine Room 1":
				if (!World.sandExhibitDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					World.sandExhibitDoorOpen = false;
				}
				break;
			case "Shrine Room 2":
				if (!World.shrineRoom2DoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					World.shrineRoom2DoorOpen = false;
				}
				break;
			case "Dark Passageway":
				if (!World.shrineRoom2DoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					World.shrineRoom2DoorOpen = false;
				}
				break;
			case "Courtyard":
				if (!World.courtyardDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					World.courtyardDoorOpen = false;
				}
				break;
			case "Closet":
				if (!World.courtyardDoorOpen) {
					Story.printAlreadyShut();
				} else {
					Story.printShutDoor();
					World.courtyardDoorOpen = false;
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void openSafe() {
		switch (Player.getLocation().title) {
			case "Lounge":
				if (World.loungeSafeOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OOX) {
						Story.print("The safe swings open, revealing a faded scroll.");
						World.loungeSafeOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Shrine Room 1":
				if (World.shrineRoom1SafeOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.OXO) {
						Story.print("The safe swings open, revealing a smooth scroll.");
						World.shrineRoom1SafeOpen = true;
					} else {
						Story.printLocked();
					}
				}
				break;
			case "Master Bedroom":
				if (World.masterBedroomSafeOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.XOX) {
						Story.print("The safe swings open, revealing a fancy scroll.");
						World.masterBedroomSafeOpen = true;
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
		switch (Player.getLocation().title) {
			case "Lounge":
				if (World.loungeSafeOpen) {
					Story.print("The safe slams shut.");
					World.loungeSafeOpen = false;
					
				} else {
					Story.printAlreadyOpen();
				}
				break;
			case "Shrine Room 1":
				if (World.shrineRoom1SafeOpen) {
					Story.print("The safe slams shut.");
					World.shrineRoom1SafeOpen = false;
				} else {
					Story.printAlreadyOpen();
				}
				break;
			case "Master Bedroom":
				if (World.masterBedroomSafeOpen) {
					Story.print("The safe slams shut.");
					World.masterBedroomSafeOpen = false;
				} else {
					Story.printAlreadyOpen();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void openBox() {
		Story.printOpenBox();
		World.boxOpen = true;
	}
	
	public static void shutBox() {
		Story.printShutBox();
		World.boxOpen = false;
	}
	
	public static void openCase() {
		Story.print("The case doesn't have a handle.");
	}
	
	public static void shutCase() {
		if (World.creakyDeckOpen) {
			Story.print("There's no way to shut it.");
		} else {
			Story.printAlreadyShut();
		}
	}
	
	public static void press(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "REWIND":
				pressRewind();
				break;
			case "FASTFORWARD":
				pressFastforward();
				break;
			case "PLAY":
				pressPlay();
				break;
			case "BUTTON":
				World.pressButton();
				break;
			default:
				Story.printNothingHappens();
				break;
		}
	}
	
	public static void pull(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "TASSEL":
				if (Player.getLocation().title.equals("Island")) {
					pullTassel();
				} else {
					Story.printNotHere();
				}
				break;
			case "IN":
				if (Player.fishing) {
					reelIn();
				}
				break;
			case "ROD":
				if (Player.fishing) {
					reelIn();
				}
				break;
			default:
				Story.printInteresting();
				break;
		}
	}
	
	public static void reel(String n) {
		switch (n) {
			case "":
				if (Player.fishing) {
					reelIn();
				} else {
					Story.printHow();
				}
				break;
			case "IN":
				if (Player.fishing) {
					reelIn();
				} else {
					Story.printHow();
				}
				break;
			case "ROD":
				if (Player.fishing) {
					reelIn();
				} else {
					Story.printHow();
				}
				break;
			default:
				Story.printInteresting();
				break;
		}
	}
	
	private static void pullTassel() {
		if (World.islandOpen) {
			Story.print("You pull the tassel, but nothing happens.");
		} else {
			World.islandOpen = true;
			Story.printTassel();
		}
	}
	
	public static void pressRewind() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				if (Player.purpleAlive) {
					Story.printTapeAtBeginning();
				} else {
					Story.printRewind("purple");
					Player.purpleAlive = true;
					World.resetBulbs();
				}
				break;
			case "Library":
				if (Player.orangeAlive) {
					Story.printTapeAtBeginning();
				} else {
					Story.printRewind("orange");
					Player.orangeAlive = true;
					World.resetBulbs();
				}
				break;
			case "Island":
				if (World.islandOpen) {
					if (Player.greenAlive) {
						Story.printTapeAtBeginning();
					} else {
						Story.printRewind("green");
						Player.greenAlive = true;
						World.resetBulbs();
					}
				} else {
					Story.print("You can't reach the TV behind the gate.");
				}
				break;
			case "Theater":
				if (World.theaterTVAtBeginning) {
					Story.printTapeAtBeginning();
				} else {
					Story.printRewind("theater");
					World.theaterTVAtBeginning = true;
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void pressFastforward() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				if (Player.purpleAlive) {
					Story.printFastforward("purple");
					Player.purpleAlive = false;
					World.resetBulbs();	
				} else {
					Story.printNothingHappens();
				}
				break;
			case "Library":
				if (Player.orangeAlive) {
					Story.printFastforward("orange");
					Player.orangeAlive = false;
					World.resetBulbs();
				} else {
					Story.printNothingHappens();
				}
				break;
			case "Island":
				if (World.islandOpen) {
					if (Player.greenAlive) {
						Story.printFastforward("green");
						Player.greenAlive = false;
						World.resetBulbs();
					} else {
						Story.printNothingHappens();
					}
				} else {
					Story.print("You can't reach the TV behind the gate.");
				}
				break;
			case "Theater":
				if (!World.theaterTVAtBeginning) {
					Story.printFastforward("theater");
					World.theaterTVAtBeginning = false;
				} else {
					Story.printNothingHappens();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void pressPlay() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				if (Player.purpleAlive) {
					Story.printBlackOut();
					Player.orangeAtTV = true;
					
					if (Player.purpleAtTV) {
						Player.updateLocation(Room.island);
					} else {
						Player.updateLocation(Room.outsideGate);
					}
				} else {
					Story.printTapePlaying();
				}
				break;
			case "Library":
				if (Player.orangeAlive) {
					Story.printBlackOut();
					Player.greenAtTV = true;
					
					if (Player.orangeAtTV) {
						Player.updateLocation(Room.shrineRoom1);
					} else {
						Player.updateLocation(Room.gardenPatio);
					}
				} else {
					Story.printTapePlaying();
				}
				break;
			case "Island":
				if (World.islandOpen) {
					if (Player.greenAlive) {
						Story.printBlackOut();
						Player.purpleAtTV = true;
						
						if (Player.greenAtTV) {
							Player.updateLocation(Room.library);
						} else {
							Player.updateLocation(Room.shrineRoom2);
						}
					} else {
						Story.printTapePlaying();
					}
				} else {
					Story.print("You can't reach the TV behind the gate.");
				}
				break;
			case "Theater":
				if (World.theaterTVAtBeginning) {
					Story.printTheaterTV();
				} else {
					Story.printTapePlaying();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void move(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "CRANES":
				moveCranes();
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void moveCranes() {
		Story.printMoveCranes();
		Story.newLine();
		Player.facingReaper = true;
		Story.printReaperEncounter2();
	}
	
	public static void dial(String n) {
		switch (n) {
			case "19670064":
				Player.onPhone = true;
				World.setKimi("moshi");
				Story.printKimiMoshi();
				break;
			default:
				Story.printPhoneWrong();
				break;
		}
	}
}