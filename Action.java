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
					Story.newLine();
					Story.printReaperEncounter1();
				}
				break;
			case "Assembly Room":
				Player.updateLocation(Room.insideGallery);
				
				if (Player.dreaming) {
					Story.print("\nTo the west, you see a monk in a faded orange robe. You hear yourself whisper, \"What year did the wabewalker write Bunraku?\" The monk says something that you cannot make out, and you black out. You find yourself sitting in Hisachi Ichiro's House.\n");

					Player.returnToIsachi();
				}
				break;
			case "Living Room":
				Player.updateLocation(Room.shrineRoom2);
				
				if (!World.disableReaper)
					World.tripwire = true;
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
			case "Master Bedroom":
				Player.updateLocation(Room.outsideGate);
				break;
			case "Outside Gate":
				Player.updateLocation(Room.insideGate);
				break;
			case "Inside Gate":
				Player.updateLocation(Room.bottomOfMountain);
				break;
			case "Bottom of Mountain":
				Player.updateLocation(Room.halfwayUpMountain);
				break;
			case "Halfway up Mountain":
				Player.updateLocation(Room.topOfMountain);
				break;
			case "Top of Mountain":
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
					World.tripwire = false;
					Story.newLine();
					Player.facingReaper = true;
					Story.printReaperEncounter1();
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
			case "Bottom of Mountain":
				Player.updateLocation(Room.insideGate);
				break;
			case "Halfway up Mountain":
				Player.updateLocation(Room.bottomOfMountain);
				break;
			case "Top of Mountain":
				Player.updateLocation(Room.halfwayUpMountain);
				break;
			case "Hondo":
				Player.updateLocation(Room.topOfMountain);
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
				
				if (!Player.dreaming && !Player.sawReaper1 && !World.disableReaper) {
					Player.sawReaper1 = true;
					Story.printSeeReaper1();
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
				Player.updateLocation(Room.masterBedroom);
				break;
			case "Study":
				Player.updateLocation(Room.sittingRoom);
				break;
			case "Dark Passageway":
				if (World.shrineRoom2DoorOpen) {
					Player.updateLocation(Room.shrineRoom2);
					World.dark = false;
				} else {
					Story.printDoorBlocking();
				}
				break;
			case "Mannequin Room":
				Player.updateLocation(Room.theater);
				break;
			case "Inside Gate":
				Player.updateLocation(Room.island);
				break;
			case "Hamlet":
				Player.updateLocation(Room.topOfMountain);
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
				Player.updateLocation(Room.study);
				break;
			case "Master Bedroom":
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
			case "Top of Mountain":
				Player.updateLocation(Room.hamlet);
				
				if (World.XOO && !Player.metIsachi){
					Story.newLine();
					Story.print(Story.tod1);
					Story.newLine();
					Player.updateLocation(Room.todsHouse);
					
					if (!Player.gotTodPoints) {
						Player.gotTodPoints = true;
						Data.updateScore(5);
					}
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
			case "Bottom of Mountain":
				Player.updateLocation(Room.halfwayUpMountain);
				break;
			case "Halfway up Mountain":
				Player.updateLocation(Room.topOfMountain);
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
			case "Halfway up Mountain":
				Player.updateLocation(Room.bottomOfMountain);
				break;
			case "Top of Mountain":
				Player.updateLocation(Room.halfwayUpMountain);
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
			case "BACK":
				Room.checkPreviousLocation();
				break;
			case "ROD": // (go fishing)
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
	
	public static void goBack() {
		switch (Player.previousLocation) {
			case "Garden Patio":
				Player.updateLocation(Room.gardenPatio);
				break;
			case "Cobble Square":
				Player.updateLocation(Room.cobbleSquare);
				break;
			case "Tea Room":
				Player.updateLocation(Room.teaRoom);
				break;
			case "Sand Exhibit":
				Player.updateLocation(Room.sandExhibit);
				break;
			case "Thatched Hut":
				Player.updateLocation(Room.thatchedHut);
				break;
			case "Garden Overlook":
				Player.updateLocation(Room.gardenOverlook);
				break;
			case "Lounge":
				Player.updateLocation(Room.lounge);
				break;
			case "Cafe":
				Player.updateLocation(Room.cafe);
				break;
			case "Outside Gallery":
				Player.updateLocation(Room.outsideGallery);
				break;
			case "Shrine Room 1":
				Player.updateLocation(Room.shrineRoom1);
				break;
			case "Inside Gallery":
				Player.updateLocation(Room.insideGallery);
				break;
			case "Assembly Room":
				Player.updateLocation(Room.assemblyRoom);
				break;
			case "Shrine Room 2":
				Player.updateLocation(Room.shrineRoom2);
				break;
			case "Living Room":
				Player.updateLocation(Room.livingRoom);
				break;
			case "Pond":
				Player.updateLocation(Room.pond);
				break;
			case "Courtyard":
				Player.updateLocation(Room.courtyard);
				break;
			case "Landing":
				Player.updateLocation(Room.landing);
				break;
			case "Hallway":
				Player.updateLocation(Room.hallway);
				break;
			case "Sitting Room":
				Player.updateLocation(Room.sittingRoom);
				break;
			case "Study":
				Player.updateLocation(Room.study);
				break;
			case "Master Bedroom":
				Player.updateLocation(Room.masterBedroom);
				break;
			case "Closet":
				Player.updateLocation(Room.closet);
				break;
			case "Dark Passageway":
				Player.updateLocation(Room.darkPassageway);
				break;
			case "Mannequin Room":
				Player.updateLocation(Room.mannequinRoom);
				break;
			case "Theater":
				Player.updateLocation(Room.theater);
				break;
			case "Outside Gate":
				Player.updateLocation(Room.outsideGate);
				break;
			case "Inside Gate":
				Player.updateLocation(Room.insideGate);
				break;
			case "Island":
				Player.updateLocation(Room.island);
				break;
			case "Bottom of Mountain":
				Player.updateLocation(Room.bottomOfMountain);
				break;
			case "Top of Mountain":
				Player.updateLocation(Room.topOfMountain);
				break;
			case "Hamlet":
				Player.updateLocation(Room.hamlet);
				break;
			case "Hondo":
				Player.updateLocation(Room.hondo);
				break;
			case "Balcony":
				Player.updateLocation(Room.balcony);
				break;
			case "Shrine Room 3":
				Player.updateLocation(Room.shrineRoom3);
				break;
			case "Trinket Shop":
				Player.updateLocation(Room.trinketShop);
				break;
			case "Creaky Deck":
				Player.updateLocation(Room.creakyDeck);
				break;
			case "Overlook":
				Player.updateLocation(Room.overlook);
				break;
			default:
				System.out.println("Action.goBack() error");
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
		
		World.checkRod();
	}
	
	private static void reelIn() {
		if (Player.fishing) {
			Story.print("You reel in the line.");
			
			if (World.bite) {
				catchFish();
			} else {
				Story.print(" You didn't catch anything.");
			}
			
			Player.startedFishing = 0;
			World.bite = false;
		} else {
			Story.printHow();
		}
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
				if (Room.getObjects().contains(Item.ni) || (Player.getLocation().title.equals("Study") && World.studySafeOpen && World.niInSafe)) {
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
				if (Room.getObjects().contains(Item.ji) || (World.jiInSafe && World.shrineRoom1SafeOpen && Player.getLocation().title.equals("Shrine Room 1"))) {
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
					if (World.getScrollCount() == 0) {
						Story.print("The glass panel prevents you from getting to the scroll.");
					} else {
						Story.print("Which one?");
					}
				} else {
					if (World.getScrollCount() > 1) {
						Story.print("Which one?");
					} else if (World.getScrollCount() == 1) {
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
				/**
				if (Room.getObjects().contains(Item.booklet)) {
					Item.getBooklet();
				} else if (Player.inventory.contains(Item.booklet)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
				*/
			case "HANDBOOK":
				/**
				if (Room.getObjects().contains(Item.handbook)) {
					Item.getHandbook();
				} else if (Player.inventory.contains(Item.handbook)) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
				*/
			case "CRYPTOGRAM":
				Item.getCryptogram();
				break;
			case "CORN":
				Item.getCorn();
				break;
			case "PARCHMENT":
				Item.getParchment();
				break;
			case "CARD":
				Item.getCard();
				break;
			case "FISH":
				if (Player.fishing && Player.getLocation().title.equals("Pond")) {
					reelIn();
				} else {
					Story.printNotHere();
				}
				break;
			case "PHONE":
				Item.getPhone();
				break;
			case "BOX":
				Item.getBox();
				break;
			case "MIRROR":
				Item.getMirror();
				break;
			case "SWORD":
				Item.getSword();
				break;
			case "WOMAN":
				Story.printCantTake();
				break;
			case "MANNEQUIN":
				Story.printCantTake();
				break;
			case "TV":
				Story.printCantTake();
				break;
			case "CRANES":
				moveCranes();
				break;
			case "SIGN":
				Item.takeSign();
				break;
			case "SOFA":
				Item.takeSofa();
				break;
			case "PLAQUE":
				Item.takePlaque();
				break;
			case "DOOR":
				Item.takeDoor();
				break;
			case "SAFE":
				Item.takeSafe();
				break;
			case "WINDOW":
				Item.takeWindow();
				break;
			case "JUNK":
				
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
				Item.putCorn();
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
			case "SCROLL":
				if (Player.getInventoryScrollCount() > 1) {
					Story.print("Which one?");
				} else if (Player.getInventoryScrollCount() == 1) {
					Item.dropScroll();
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
				/**
				if (Player.inventory.contains(Item.booklet)) {
					Player.inventory.remove(Item.booklet);
					Room.getObjects().add(Item.booklet);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
				*/
			case "HANDBOOK":
				/**
				if (Player.inventory.contains(Item.handbook)) {
					Player.inventory.remove(Item.handbook);
					Room.getObjects().add(Item.handbook);
					Story.print("Dropped.");
				} else {
					Story.printNotInInventory();
				}
				break;
				*/
			case "CRYPTOGRAM":
				if (Player.inventory.contains(Item.cryptogram)) {
					Player.inventory.remove(Item.cryptogram);
					Room.getObjects().add(Item.cryptogram);
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
				Story.printNotInInventory();
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
	
	public static void examine(String w) {
		switch (w) {
			case "":
				look();
				break;
			case "AROUND":
				look();
				break;
			case "BOOK":
				Item.examineBook();
				break;
			case "BOOKLET":
				//Item.examineBooklet();
				break;
			case "HANDBOOK":
				//Item.examineHandbook();
				break;
			case "CRYPTOGRAM":
				Item.examineCryptogram();
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
				Item.attemptToExamineScroll();
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
				Item.examineSign();
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
				Item.examineCranes();
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
				Item.examineChest();
				break;
			case "FIGURE":
				Item.examineFigure();
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
			case "WINDOW":
				Item.examineWindow();
				break;
			case "CHUTE":
				Item.examineChute();
				break;
			case "SOFA":
				Item.examineSofa();
				break;
			case "EXHIBIT":
				Item.examineExhibit();
				break;
			case "LEVER":
				Item.examineLever();
				break;
			case "BED":
				Item.examineBed();
				break;
			case "MANNEQUIN":
				Item.examineMannequin();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void tryToWalk(String w) {
		if (Player.sittingOnGround || Player.sittingOnSofa) {
			Story.print("You would have to stand up first to do that.");
		} else {
			
		}
	}
	
	public static void tryToSit(String w) {
		if (Player.sittingOnGround) {
			if (w.equals("") || w.equals("DOWN") || w.equals("GROUND")) {
				Story.printAlreadyDoing();
			} else if (w.equals("SOFA")) {
				if (Player.getLocation().title.equals("Lounge")) {
					Story.print("You would have to stand up first to do that.");
				} else {
					Story.printNotHere();
				}
			} else {
				Story.invalid();
			}
		} else if (Player.sittingOnSofa) {
			if (w.equals("") || w.equals("DOWN")) {
				Story.printAlreadyDoing();
			} else if (w.equals("GROUND")) {
				Story.print("You would have to stand up first to do that.");
			} else {
				Story.invalid();
			}
		} else {
			sit(w);
		}
	}
	
	public static void sit(String w) {
		switch (w) {
			case "":
				if (Player.getLocation().title.equals("Lounge")) {
					Player.sittingOnSofa = true;
					Story.print("You sit on the sofa. It's quite comfortable.");
				} else {
					Player.sittingOnGround = true;
					Story.print("You find a comfortable position to sit on the ground.");
				}
				break;
			case "DOWN":
				if (Player.getLocation().title.equals("Lounge")) {
					Player.sittingOnSofa = true;
					Story.print("You sit on the sofa. It's quite comfortable.");
				} else {
					Player.sittingOnGround = true;
					Story.print("You find a comfortable position to sit on the ground.");
				}
				break;
			case "GROUND":
				Player.sittingOnGround = true;
				Story.print("You find a comfortable position to sit on the ground.");
				break;
			case "SOFA":
				if (Player.getLocation().title.equals("Lounge")) {
					Player.sittingOnSofa = true;
					Story.print("You sit on the sofa. It's quite comfortable.");
				} else {
					Story.printNotHere();
				}
				break;
			default:
				
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
		} else if (Player.getLocation().title.equals("Closet")) {
			Story.print("You can't see anything special about the hole in the ceiling.");
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
				openChest();
				break;
			case "BOOK":
				Item.examineBook();
				break;
			case "WINDOW":
				Item.openWindow();
				break;
			default:
				Story.print("That is not something you can open.");
				break;
		}
	}
	
	private static void openChest() {
		if (Player.getLocation().title.equals("Assembly Room")) {
			Story.print(Story.tod10);
		} else {
			Story.printNotHere();
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
			case "BOOK":
				Story.print("It's closed.");
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
						
						if (!Player.openedSandExhibitDoor) {
							Player.openedSandExhibitDoor = true;
							Data.updateScore(5);
						}
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
						
						if (!Player.openedShrineRoom2Door) {
							Player.openedShrineRoom2Door = true;
							Data.updateScore(5);
						}
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
						
						if (!Player.openedCloset) {
							Player.openedCloset = true;
							Data.updateScore(5);
						}
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
			case "Study":
				if (World.studySafeOpen) {
					Story.printAlreadyOpen();
				} else {
					if (World.XOX) {
						Story.print("The safe swings open, revealing a fancy scroll.");
						World.studySafeOpen = true;
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
			case "Study":
				if (World.studySafeOpen) {
					Story.print("The safe slams shut.");
					World.studySafeOpen = false;
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
		Story.print("There's no discernable way to open the case by hand.");
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
				pressButton();
				break;
			default:
				Story.printNothingHappens();
				break;
		}
	}
	
	public static void pressButton() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				Story.print("Which button?");
				break;
			case "Master Bedroom":
				Story.print("Which button?");
				break;
			case "Island":
				Story.print("Which button?");
				break;
			case "Theater":
				Story.print("Which button?");
				break;
			case "Creaky Deck":
				if (World.XXO && !World.creakyDeckOpen) {
					Story.printActivateCreakyDeck();
					World.creakyDeckOpen = true;
				} else {
					Story.print("You push the button, but nothing happens.");
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void pull(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "TASSEL":
				pullTassel();
				break;
			case "CRANES":
				moveCranes();
				break;
			case "IN":
				reelIn();
				break;
			case "ROD":
				reelIn();
				break;
			case "LEVER":
				pullLever();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	private static void pullLever() {
		if (Player.getLocation().title.equals("Hallway")) {
			if (World.OOO && !World.raDropped) {
				Story.printActivateHallway();
				World.raDropped = true;
				Room.closetObjects.add(Item.ra);
				Room.closet.scrollCount++;
				
				if (!Player.pulledHallwayLever) {
					Player.pulledHallwayLever = true;
					Data.updateScore(5);
				}
			} else {
				Story.print("You pull the lever, but nothing happens.");
			}
		}
	}
	
	private static void pullTassel() {
		if (Player.getLocation().title.equals("Island")) {
			if (World.islandOpen) {
				Story.print("You pull the tassel, but nothing happens. The gate is already open.");
			} else {
				World.islandOpen = true;
				Story.printTassel();
				
				if (!Player.openedGate) {
					Player.openedGate = true;
					Data.updateScore(5);
				}
			}
		} else {
			Story.printNotHere();
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
			case "Master Bedroom":
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
			case "Master Bedroom":
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
				Player.playPurple();
				break;
			case "Master Bedroom":
				Player.playOrange();
				break;
			case "Island":
				Player.playGreen();
				break;
			case "Theater":
				World.playTheater();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void pick(String w) {
		switch (w) {
			case "UP":
				take(Parser.sentence.get(2));
				break;
			default:
				Story.invalid();
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
		if (Player.getLocation().title.equals("Overlook")) {
			Story.printMoveCranes();
			Story.newLine();
			Player.facingReaper = true;
			Story.printReaperEncounter2();		
		} else {
			Story.printNotHere();
		}
	}
	
	public static void dial(String n) {
		switch (n) {
			case "19670064":
				Player.onPhone = true;
				NPC.setKimi("moshi");
				Story.printKimiMoshi();
				break;
			default:
				Story.printPhoneWrong();
				break;
		}
	}
}