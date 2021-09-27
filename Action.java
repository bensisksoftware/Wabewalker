import java.util.ArrayList;

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
			case "Avalokitesvara Shrine":
				Player.updateLocation(Room.sandExhibit);
				break;
			case "Cafe":
				Player.updateLocation(Room.wabe);
				
				if (!Player.dreaming) {
					Player.facingReaper = true;
					Story.newLine();
					Story.printReaperEncounter1();
				}
				break;
			case "Assembly Room":
				Player.updateLocation(Room.gallery);
				break;
			case "Living Room":
				Player.updateLocation(Room.shrineRoom2);
				
				if (!World.reaperDisabled)
					World.tripwire = true;
				break;
			case "Pond":
				Player.updateLocation(Room.courtyard);
				World.bite = false;
				Player.startedFishing = 0;
				Player.fishing = false;
				break;
			case "Sitting Room":
				if (Player.inventory.contains(Item.Phone.getTitle())) {
					Player.inventory.remove(Item.Phone.getTitle());
					Room.getObjects().add(Item.Phone.getTitle());
					Story.print("You can't take the corded phone with you, so you leave it.");
					Story.newParagraph();
				}
				Player.updateLocation(Room.hallway);
				break;
			case "Dark Passageway":
				Player.updateLocation(Room.mannequinRoom);
				break;
			case "Master Bedroom":
				Player.updateLocation(Room.forest);
				break;
			case "Forest":
				Player.updateLocation(Room.gate);
				break;
			case "Gate":
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
			case "Wabe":
				Player.updateLocation(Room.cafe);
				break;
			case "Gallery":
				Player.updateLocation(Room.assemblyRoom);
				
				if (Player.dreaming && !Player.spokeToClan) {
					Story.newLine();
					Story.print(Story.tod9);
					Player.spokeToClan = true;
					Player.inventory.add(Item.Sword.getTitle());
				}
				
				if (NPC.reaperMoved)
					Story.printSamadhiFinal();
				break;
			case "Altar of Samantabhadra":
				Player.updateLocation(Room.livingRoom);
				World.shrineRoom2DoorOpen = false;

				if (World.tripwire) {
					World.tripwire = false;
					Story.newLine();
					Player.facingReaper = true;
					Story.printReaperEncounter2();
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
			case "Gate":
				Player.updateLocation(Room.forest);
				break;
			case "Bottom of Mountain":
				Player.updateLocation(Room.gate);
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
			case "Butsudan of Kannon":
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
				
				if (!Player.dreaming && !Player.sawReaper1 && !World.reaperDisabled) {
					Player.sawReaper1 = true;
					Story.printSeeReaper1();
				}
				break;
			case "Wabe":
				Player.updateLocation(Room.gallery);
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
				if (Player.inventory.contains(Item.Phone.getTitle())) {
					Player.inventory.remove(Item.Phone.getTitle());
					Room.getObjects().add(Item.Phone.getTitle());
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
				
				if (NPC.reaperMoved)
					Story.printSamadhiFinal();
				break;
			case "Bottom of Mountain":
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
			case "Gallery":
				Player.updateLocation(Room.wabe);
				
				if (Player.dreaming) {
					Story.print("\nSomeone in a faded orange samue is standing here. You hear yourself whisper, \"What year did the Wabewalker write Bunraku?\" The person says something inaudible. Everything goes black, and you find yourself sitting in Hisachi Ichiro's House.\n");

					Player.returnToIsachi();
				}
				break;
			case "Altar of Samantabhadra":
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
				if (Player.inventory.contains(Item.Phone.getTitle())) {
					Player.inventory.remove(Item.Phone.getTitle());
					Room.getObjects().add(Item.Phone.getTitle());
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
				if (World.islandOpen)
					Story.print("You hear the lattice barrier behind you drop back down.\n\n");
				
				Player.updateLocation(Room.bottomOfMountain);
				World.islandOpen = false;
				break;
			case "Top of Mountain":
				Player.updateLocation(Room.hamlet);
				
				if (World.XOO && !Player.metIsachi){
					Story.newLine();
					Story.print(Story.tod1);
					Story.newLine();
					Player.updateLocation(Room.hisachiIchirosHouse);
					Story.print("\"The tea should have cooled off by now,\" he says. \"It's nice to have some company over every now and then. My name is Hisachi Ichiro, by the way.\"");
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
			case "Wabe":
				Player.updateLocation(Room.gallery);
				break;
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
			case "IN":
				enter(Parser.sentence.get(2));
				break;
			case "NORTH":
				if (Room.getExits().contains("N")) {
					goNorth();
				} else {
					Room.noExit("NORTH");
				}
				break;
			case "SOUTH":
				if (Room.getExits().contains("S")) {
					goSouth();
				} else {
					Room.noExit("SOUTH");
				}
				break;
			case "EAST":
				if (Room.getExits().contains("E")) {
					goEast();
				} else {
					Room.noExit("EAST");
				}	
				break;
			case "WEST":
				if (Room.getExits().contains("W")) {
					goWest();
				} else {
					Room.noExit("WEST");
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
				if (Player.inventory.contains(Item.Rod.getTitle())) {
					goFishing();
				} else {
					Story.printHow();
				}
				break;
			default:
				Story.print("Try using a direction instead. For example, you can type GO NORTH.");
				break;
		}
	}
	
	public static void enter(String r) {
		switch (r) {
			case "":
				Story.printMoreSpecific();
				break;
			case "MUSEUM":
				if (Player.getLocation().title.equals("Garden Patio")) {
					goSouth();
				} else {
					if (Player.getArea().equals("garden")) {
						Story.print("You are currently in the Adachi Museum of Art.");
					} else {
						Story.printNotHere();
					}
				}
				break;
			case "TEMPLE":
				if (Player.getArea().equals("temple")) {
					enterTemple();
				} else {
					Story.printNotHere();
				}
				break;
			case "ROOM":
			case "DOOR":
				Room.enterRoom();
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void enterTemple() {
		switch (Player.getLocation().title) {
			case "Forest":
			case "Gate":
			case "Bottom of Mountain":
			case "Island":
			case "Halfway up Mountain":
			case "Hamlet":
			case "Hisachi Ichiro's House":
				Story.printNotHere();
				break;
			case "Top of Mountain":
				goNorth();
				break;
			case "Hondo":
			case "Butsudan of Kannon":
			case "Trinket Shop":
			case "Creaky Deck":
			case "Balcony":
			case "Overlook":
				Story.print("You are currently in the Kegon-ji Temple.");
				break;
			default:
				Story.invalid();
				System.out.println("Action.enterTemple() error");
				break;
		}
	}
	
	public static void exit(String s) {
		switch (s) {
			case "":
			case "ROOM":
				Room.checkPreviousLocation();
				break;
			case "MUSEUM":
				if (Player.getArea().equals("garden")) {
					if (Player.getLocation().title.equals("Cobble Square")) {
						goNorth();
					} else {
						Story.print("You are not standing near an exit.");
					}
				} else {
					Story.printNotHere();
				}
				break;
			case "HOUSE":
				if (Player.getArea().equals("house")) {
					Story.print("You are not standing near an exit.");
				} else {
					Story.printNotHere();
				}
				break;
			case "TEMPLE":
				if (Player.getArea().equals("temple")) {
					if (Player.getLocation().title.equals("Hondo")) {
						goSouth();
					} else {
						Story.print("You are not standing near an exit.");
					}
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.invalid();
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
			case "Wabe":
				Player.updateLocation(Room.wabe);
				break;
			case "Avalokitesvara Shrine":
				Player.updateLocation(Room.shrineRoom1);
				break;
			case "Gallery":
				Player.updateLocation(Room.gallery);
				break;
			case "Assembly Room":
				Player.updateLocation(Room.assemblyRoom);
				break;
			case "Altar of Samantabhadra":
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
			case "Forest":
				Player.updateLocation(Room.forest);
				break;
			case "Gate":
				Player.updateLocation(Room.gate);
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
			case "Butsudan of Kannon":
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
	
	public static void attemptToExamine(String w) {
		if (w.equals("INVENTORY")) {
			checkInventory();
		} else if (World.dark) {
			switch (Player.getLocation().title) {
				case "Dark Passageway":
					if (w.equals("HOLE")) {
						Item.Hole.hole.examine();
					} else if (w.equals("WOMAN")) {
						Item.woman.examine();
					} else if (w.equals("FIGURE")) {
						Story.printNotHere();
					} else if (w.equals("")) {
						Action.examine(w);
					} else {
						Story.printTooDark();
					}
					break;
				case "Mannequin Room":
					if (w.equals("MANNEQUIN")) {
						Item.mannequin.examine();
					} else if (w.equals("")) {
						Action.examine(w);
					} else {
						Story.printTooDark();
					}
					break;
				case "Theater":
					if (w.equals("TV")) {
						Item.TV.tv.examine();
					} else if (w.equals("")) {
						Action.examine(w);
					} else {
						Story.printTooDark();
					}
					break;
				default:
					System.out.println("Action.attemptToExamine error");
					break;
			}
		} else {
			Action.examine(w);
		}
	}
	
	public static void examine(String w) {
		switch (w) {
			case "":
				look();
				break;
			case "COLOR":
				if (Parser.sentence.get(2).equals("")) {
					Story.printMissingNoun();
				} else {
					examine(Parser.sentence.get(2));
				}
				break;
			case "ORANGE":
				examineOrange(Parser.sentence.get(2));
				break;
			case "GREEN":
				examineGreen(Parser.sentence.get(2));
				break;
			case "PURPLE":
				examinePurple(Parser.sentence.get(2));
				break;
			case "BULB":
				if (Room.hasPanel()) {
					Item.panel.examine();
				} else {
					Story.printNotHere();
				}
				break;
			case "AROUND":
			case "ROOM":
				look();
				break;
			case "JUNK":
				Item.junk.examine();
				break;
			case "INVENTORY":
				checkInventory();
				break;
			case "BOOK":
				Item.book.examine();
				break;
			case "CRYPTOGRAM":
				Item.cryptogram.examine();
				break;
			case "OM":
				Item.om.examine();
				break;
			case "NI":
				Item.ni.examine();
				break;
			case "GO":
				Item.go.examine();				
				break;
			case "YU":
				Item.yu.examine();				
				break;
			case "JI":
				Item.ji.examine();			
				break;
			case "RA":
				Item.ra.examine();				
				break;
			case "SHI":
				Item.shi.examine();				
				break;
			case "SCROLL":
				Item.scroll.attemptToExamineScroll();
				break;
			case "ROD":
				Item.rod.examine();
				break;
			case "CORN":
				Item.corn.examine();
				break;
			case "COMPARTMENT":
				Item.compartment.examine();
				break;
			case "SHOP":
				Item.shop.examine();
				break;
			case "PARCHMENT":
				Item.parchment.examine();
				break;
			case "CARD":
				Item.card.examine();
				break;
			case "STONE":
				if (Parser.sentence.get(2).equals("")) {
					Item.stone.examine();
				} else {
					examine(Parser.sentence.get(2));
				}
				break;
			case "MIRROR":
				Item.mirror.examine();
				break;
			case "PATH":
				Item.path.examine();
				break;
			case "PANEL":
				Item.panel.examine();
				break;
			case "MOUNTAIN":
				Item.mountain.examine();
				break;
			case "PICTURE":
				Item.picture.examine();
				break;
			case "TEMPLE":
				Item.temple.examine();
				break;
			case "HUT":
				Item.hut.examine();
				break;
			case "STAIRS":
				Item.stairs.examine();
				break;
			case "WOMAN":
				Item.woman.examine();
				break;
			case "MASK":
				Item.mask.examine();
				break;
			case "SIGN":
				Item.sign.examine();
				break;
			case "WALL":
				Item.wall.examine();
				break;
			case "CLOAK":
				Item.cloak.examine();
				break;
			case "BASIN":
				Item.basin.examine();
				break;
			case "SAMUE":
				Item.samue.examine(); 
				break;
			case "POND":
				Item.pond.examine();
				break;
			case "FISH":
				Item.fish.examine();
				break;
			case "BRIDGE":
				Item.bridge.examine();
				break;
			case "TV":
				Item.tv.examine();
				break;
			case "PHONE":
				Item.phone.examine();
				break;
			case "DOOR":
				Item.door.examine();
				break;
			case "BLOOD":
				Item.blood.examine();
				break;
			case "SAFE":
				Item.safe.examine();
				break;
			case "GATE":
				Item.gate.examine();
				break;
			case "BOX":
				Item.box.examine();
				break;
			case "BIRDS":
				Item.birds.examine();
				break;
			case "MEMORY":
				Item.memory.examine();
				break;
			case "SHRINE":
				Item.shrine.examine();
				break;
			case "TASSEL":
				Item.tassel.examine();
				break;
			case "TEA":
				Item.tea.examine();
				break;
			case "TREE":
				Item.tree.examine();
				break;
			case "CHEST":
				Item.chest.examine();
				break;
			case "FIGURE":
				Item.figure.examine();
				break;
			case "CASE":
				Item.jewelledCase.examine();
				break;
			case "BUTTON":
				Item.button.examine();
				break;
			case "HOLE":
				Item.hole.examine();
				break;
			case "WINDOW":
				Item.window.examine();
				break;
			case "CHUTE":
				Item.chute.examine();
				break;
			case "SOFA":
				Item.sofa.examine();
				break;
			case "EXHIBIT":
				Item.exhibit.examine();
				break;
			case "LEVER":
				Item.lever.examine();
				break;
			case "BED":
				Item.bed.examine();
				break;
			case "MANNEQUIN":
				Item.mannequin.examine();
				break;
			case "LATTICE":
				Item.lattice.examine();
				break;
			case "SNOW":
				Item.snow.examine();
				break;
			case "SANDALS":
				Item.sandals.examine();
				break;
			case "HOUSE":
				Item.house.examine();
				break;
			case "ROOF":
				Item.roof.examine();
				break;
			case "HISACHI":
				Item.hisachi.examine();
				break;
			case "DECK":
				Item.deck.examine();
				break;
			case "PAINTING":
				Item.painting.examine();
				break;
			case "HALLWAY":
				Item.hallway.examine();
				break;
			case "SWORD":
				Item.sword.examine();
				break;
			case "MUSEUM":
				Item.museum.examine();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void take(String w) {
		switch (w) {
			case "":
				Story.printMissingNoun();
				break;
			case "ALL":
				takeAll();
				break;
			case "COLOR":
				if (Parser.sentence.get(2).equals("")) {
					Story.printMissingNoun();
				} else {
					take(Parser.sentence.get(2));
				}
				break;
			case "ORANGE":
				takeOrange(Parser.sentence.get(2));
				break;
			case "GREEN":
				takeGreen(Parser.sentence.get(2));
				break;
			case "PURPLE":
				takePurple(Parser.sentence.get(2));
				break;
			case "BULB":
				if (Room.hasPanel()) {
					Story.print("The bulbs are securely fastened on the panel.");
				} else {
					Story.printNotHere();
				}
				break;
			case "OFF":
				takeOff(Parser.sentence.get(2));
				break;
			case "JUNK":
				Item.junk.take();
				break;
			case "BOOK":
				Item.book.take();
				break;
			case "CRYPTOGRAM":
				Item.cryptogram.take();
				break;
			case "OM":
				Item.om.take();
				break;
			case "NI":
				Item.ni.take();
				break;
			case "GO":
				Item.go.take();				
				break;
			case "YU":
				Item.yu.take();				
				break;
			case "JI":
				Item.ji.take();			
				break;
			case "RA":
				Item.ra.take();				
				break;
			case "SHI":
				Item.shi.take();				
				break;
			case "SCROLL":
				Item.scroll.take();
				break;
			case "ROD":
				Item.rod.take();
				break;
			case "CORN":
				Item.corn.take();
				break;
			case "PARCHMENT":
				Item.parchment.take();
				break;
			case "CARD":
				Item.card.take();
				break;
			case "MIRROR":
				Item.mirror.take();
				break;
			case "PANEL":
				Item.panel.take();
				break;
			case "CLOAK":
				Item.cloak.take();
				break;
			case "STAIRS":
				Item.stairs.take();
				break;
			case "PATH":
				Item.path.take();
				break;
			case "COMPARTMENT":
				Item.compartment.take();
				break;
			case "SHOP":
				Item.shop.take();
				break;
			case "STONE":
				Item.stone.take();
				break;
			case "MOUNTAIN":
				Item.mountain.take();
				break;
			case "TEMPLE":
				Item.temple.take();
				break;
			case "HUT":
				Item.hut.take();
				break;
			case "WALL":
				Item.wall.take();
				break;
			case "WOMAN":
				Item.woman.take();
				break;
			case "MASK":
				Item.mask.take();
				break;
			case "SIGN":
				Item.sign.take();
				break;
			case "BASIN":
				Item.basin.take();
				break;
			case "SAMUE":
				Item.samue.take();
				break;
			case "PICTURE":
				Item.picture.take();
				break;
			case "POND":
				Item.pond.take();
				break;
			case "FISH":
				Item.fish.take();
				break;
			case "BRIDGE":
				Item.bridge.take();
				break;
			case "TV":
				Item.tv.take();
				break;
			case "BLOOD":
				Item.blood.take();
				break;
			case "SWORD":
				Item.sword.take();
				break;
			case "PHONE":
				Item.phone.take();
				break;
			case "DOOR":
				Item.door.take();
				break;
			case "SAFE":
				Item.safe.take();
				break;
			case "GATE":
				Item.gate.take();
				break;
			case "BOX":
				Item.box.take();
				break;
			case "BIRDS":
				Item.birds.take();
				break;
			case "MEMORY":
				Item.memory.take();
				break;
			case "SHRINE":
				Item.shrine.take();
				break;
			case "TASSEL":
				Item.tassel.take();
				break;
			case "TEA":
				Item.tea.take();
				break;
			case "TREE":
				Item.tree.take();
				break;
			case "CHEST":
				Item.chest.take();
				break;
			case "FIGURE":
				Item.figure.take();
				break;
			case "CASE":
				Item.jewelledCase.take();
				break;
			case "BUTTON":
				Item.button.take();
				break;
			case "HOLE":
				Item.hole.take();
				break;
			case "WINDOW":
				Item.window.take();
				break;
			case "CHUTE":
				Item.chute.take();
				break;
			case "SOFA":
				Item.sofa.take();
				break;
			case "EXHIBIT":
				Item.exhibit.take();
				break;
			case "LEVER":
				Item.lever.take();
				break;
			case "BED":
				getInBed();
				break;
			case "MANNEQUIN":
				Item.mannequin.take();
				break;
			case "LATTICE":
				Item.lattice.take();
				break;
			case "SNOW":
				Item.snow.take();
				break;
			case "SANDALS":
				Item.sandals.take();
				break;
			case "HOUSE":
				Item.house.take();
				break;
			case "ROOF":
				Item.roof.take();
				break;
			case "HISACHI":
				Item.hisachi.take();
				break;
			case "DECK":
				Item.deck.take();
				break;
			case "PAINTING":
				Item.painting.take();
				break;
			case "HALLWAY":
				Item.hallway.take();
				break;
			case "MUSEUM":
				Item.museum.take();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void takeAll() {
		int numOfItems = Room.getObjects().size();
		ArrayList<String> items = Room.getObjects();
		
		if (numOfItems == 0) {
			Story.print("There's nothing here you can take.");
		} else {
			for (int i = 0; i < numOfItems; i++) {
				String item = items.get(i);
				Story.printTake(item);
				Player.inventory.add(item);
				
				if (i < numOfItems - 1)
					Story.newLine();
			}
			
			Room.getObjects().clear();
		}
	}
	
	public static void examineOrange(String object) {
		switch (object) {
			case "":
				Story.printMissingNoun();
				break;
			case "BULB":
				if (Room.hasPanel()) {
					if (Player.orangeAlive) {
						Story.print("The orange bulb is glowing.");
					} else {
						Story.print("The orange bulb is not glowing.");
					}
				} else {
					Story.printNotHere();
				}
				break;
			case "SAMUE":
				if (Player.getArea().equals("garden")) {
					Story.printNothingSpecial();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examineGreen(String object) {
		switch (object) {
			case "":
				Story.printMissingNoun();
				break;
			case "BULB":
				if (Room.hasPanel()) {
					if (Player.greenAlive) {
						Story.print("The green bulb is glowing.");
					} else {
						Story.print("The green bulb is not glowing.");
					}
				} else {
					Story.printNotHere();
				}
				break;
			case "SAMUE":
				if (Player.getArea().equals("house")) {
					Story.printNothingSpecial();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void examinePurple(String object) {
		switch (object) {
			case "":
				Story.printMissingNoun();
				break;
			case "BULB":
				if (Room.hasPanel()) {
					if (Player.purpleAlive) {
						Story.print("The purple bulb is glowing.");
					} else {
						Story.print("The purple bulb is not glowing.");
					}
				} else {
					Story.printNotHere();
				}
				break;
			case "SAMUE":
				if (Player.getArea().equals("temple")) {
					Story.printNothingSpecial();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void takeOrange(String object) {
		switch (object) {
			case "":
				Story.printMissingNoun();
				break;
			case "BULB":
				if (Room.hasPanel()) {
					Story.print("The bulbs are securely fastened on the panel.");
				} else {
					Story.printNotHere();
				}
				break;
			case "SAMUE":
				if (Player.getArea().equals("garden")) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void takeGreen(String object) {
		switch (object) {
			case "":
				Story.printMissingNoun();
				break;
			case "BULB":
				if (Room.hasPanel()) {
					Story.print("The bulbs are securely fastened on the panel.");
				} else {
					Story.printNotHere();
				}
				break;
			case "SAMUE":
				if (Player.getArea().equals("house")) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void takePurple(String object) {
		switch (object) {
			case "":
				Story.printMissingNoun();
				break;
			case "BULB":
				if (Room.hasPanel()) {
					Story.print("The bulbs are securely fastened on the panel.");
				} else {
					Story.printNotHere();
				}
				break;
			case "SAMUE":
				if (Player.getArea().equals("temple")) {
					Story.printAlreadyHave();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void cast(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "ROD":
				if (Player.inventory.contains(Item.Rod.getTitle())) {
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
	}
	
	public static void reelIn() {
		if (Player.fishing) {
			Story.print("You reel in the line.");
			
			if (World.bite) {
				catchFish();
			} else {
				Story.print(" But you didn't catch anything.");
			}
			
			Player.startedFishing = 0;
			Player.fishing = false;
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
	
	public static void takeOff(String n) {
		switch (n) {
			case "SANDALS":
				Story.print("That's all you have on!");
				break;
			case "SAMUE":
				if (!Player.dreaming) {
					Story.print("That's all you have on!");
				} else {
					Story.printNotHere();
				}
				break;
			case "CLOAK":
				if (Player.dreaming) {
					Story.print("That's all you have on!");
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void getIn(String n) {
		switch (n) {
			case "BED":
				getInBed();
				break;
			default:
				Story.printInteresting();
				break;
		}
	}
	
	private static void getInBed() {
		if (Player.getLocation().title.equals("Master Bedroom")) {
			Story.print("You are now lying in the four-poster bed. It's quite comfortable.");
		} else {
			Story.printNotHere();
		}
	}
	
	public static void put(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "CORN":
				Item.corn.put();
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
					Story.print("\nThe figures draw their swords, and before you can say \"Bunraku,\" you black out. You find yourself sitting on a cushion in Hisachi Ichiro's House.\n");
					Player.returnToIsachi();
				} else {
					Story.printNotHere();
				}
				break;
			case "WOMAN":
				if (Player.getLocation().title.equals("Cafe") || Player.getLocation().title.equals("Living Room")) {
					Story.printGlassObstructs();
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void eat(String s) {
		switch (s) {
			case "CORN":
				Item.corn.eat();
				break;
			default:
				Story.printHow();
				break;
		}
	}
	
	public static void say() {
		switch (Player.getLocation().title) {
			case "Cafe":
			case "Living Room":
				Story.print("The woman has no reaction to you whatsoever.");
				break;
			default:
				Story.print("It doesn't seem like anyone is listening to you.");
				break;
		}
	}
	
	public static void drop(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "ALL":
				dropAll();
				break;
			case "BOOK":
				if (Player.inventory.contains(Item.Book.getTitle())) {
					Player.inventory.remove(Item.Book.getTitle());
					Room.getObjects().add(Item.Book.getTitle());
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "OM":
				if (Player.inventory.contains(Item.Om.getTitle())) {
					Player.inventory.remove(Item.Om.getTitle());
					Room.getObjects().add(Item.Om.getTitle());
					
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "NI":
				if (Player.inventory.contains(Item.Ni.getTitle())) {
					Player.inventory.remove(Item.Ni.getTitle());
					Room.getObjects().add(Item.Ni.getTitle());
					
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "GO":
				if (Player.inventory.contains(Item.Go.getTitle())) {
					Player.inventory.remove(Item.Go.getTitle());
					Room.getObjects().add(Item.Go.getTitle());
					
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "YU":
				if (Player.inventory.contains(Item.Yu.getTitle())) {
					Player.inventory.remove(Item.Yu.getTitle());
					Room.getObjects().add(Item.Yu.getTitle());
					
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "JI":
				if (Player.inventory.contains(Item.Ji.getTitle())) {
					Player.inventory.remove(Item.Ji.getTitle());
					Room.getObjects().add(Item.Ji.getTitle());
					
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "RA":
				if (Player.inventory.contains(Item.Ra.getTitle())) {
					Player.inventory.remove(Item.Ra.getTitle());
					Room.getObjects().add(Item.Ra.getTitle());
					
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "SHI":
				if (Player.inventory.contains(Item.Shi.getTitle())) {
					Player.inventory.remove(Item.Shi.getTitle());
					Room.getObjects().add(Item.Shi.getTitle());
					
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "SCROLL":
				if (Player.getInventoryScrollCount() > 1) {
					Story.print("Which one?");
				} else if (Player.getInventoryScrollCount() == 1) {
					Item.scroll.dropScroll();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "ROD":
				if (Player.inventory.contains(Item.Rod.getTitle())) {
					Player.inventory.remove(Item.Rod.getTitle());
					Room.getObjects().add(Item.Rod.getTitle());
					Player.fishing = false;
					World.bite = false;
					Player.startedFishing = 0;
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "CRYPTOGRAM":
				if (Player.inventory.contains(Item.Cryptogram.getTitle())) {
					Player.inventory.remove(Item.Cryptogram.getTitle());
					Room.getObjects().add(Item.Cryptogram.getTitle());
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "CORN":
				if (Player.inventory.contains(Item.Corn.getTitle())) {
					Player.inventory.remove(Item.Corn.getTitle());
					Room.getObjects().add(Item.Corn.getTitle());
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "PARCHMENT":
				if (Player.inventory.contains(Item.Parchment.getTitle())) {
					Player.inventory.remove(Item.Parchment.getTitle());
					Room.getObjects().add(Item.Parchment.getTitle());
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "CARD":
				if (Player.inventory.contains(Item.Card.getTitle())) {
					Player.inventory.remove(Item.Card.getTitle());
					Room.getObjects().add(Item.Card.getTitle());
					Story.printDropped();
				} else {
					Story.printNotInInventory();
				}
				break;
			case "PHONE":
				if (Player.inventory.contains(Item.Phone.getTitle())) {
					Player.inventory.remove(Item.Phone.getTitle());
					Room.getObjects().add(Item.Phone.getTitle());
					Story.print("You hang up the phone.");
				} else {
					Story.printNotInInventory();
				}
				break;
			case "SWORD":
				Item.sword.drop();
				break;
			default:
				Story.printNotInInventory();
				break;
		}
	}
	
	public static void dropAll() {
		for (String item : Player.inventory) {
			Room.getObjects().add(item);
		}
		
		Story.printDropped();
		Player.inventory.clear();
	}
	
	public static void hang(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "UP":
				if (Player.inventory.contains(Item.Phone.getTitle())) {
					Player.inventory.remove(Item.Phone.getTitle());
					Room.getObjects().add(Item.Phone.getTitle());
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
	
	public static void sit(String w) {
		switch (w) {
			case "":
				if (Player.getLocation().title.equals("Lounge")) {
					Story.print("You sit on the sofa. It's quite comfortable.");
				} else {
					Story.print("You find a comfortable position to sit on the ground.");
				}
				break;
			case "DOWN":
				if (Player.getLocation().title.equals("Lounge")) {
					Story.print("You sit on the sofa. It's quite comfortable.");
				} else if (Player.getLocation().title.equals("Master Bedroom")) {
					Story.print("You sit on the bed. It's quite comfortable.");
				} else {
					Story.print("You find a comfortable position to sit on the ground.");
				}
				break;
			case "GROUND":
				Story.print("You find a comfortable position to sit on the ground.");
				break;
			case "SOFA":
				if (Player.getLocation().title.equals("Lounge")) {
					Story.print("You sit on the sofa. It's quite comfortable.");
				} else {
					Story.printNotHere();
				}
				break;
			case "BED":
				if (Player.getLocation().title.equals("Master Bedroom")) {
					Story.print("You sit on the bed. It's quite comfortable.");
				} else {
					Story.printNotHere();
				}
				break;
			default:
				Story.invalid();
				break;
		}
			
	}
	
	public static void open(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			case "DOOR":
				Item.door.open();
				break;
			case "SAFE":
				Item.safe.open();
				break;
			case "BOX":
				Item.box.open();
				break;
			case "CASE":
				Item.jewelledCase.open();
				break;
			case "CHEST":
				Item.chest.open();
				break;
			case "BOOK":
				Item.book.examine();
				break;
			case "WINDOW":
				Item.window.open();
				break;
			case "Lattice":
				Item.lattice.open();
				break;
			default:
				Story.printCantOpen();
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
				Item.Door.door.shut();
				break;
			case "SAFE":
				Item.Safe.safe.shut();
				break;
			case "BOX":
				Item.Box.box.shut();
				break;
			case "CASE":
				Item.JewelledCase.jewelledCase.shut();
				break;
			case "BOOK":
				Story.print("It's closed.");
				break;
			default:
				Story.print("That is not something you can shut.");
				break;
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
				Item.Button.button.press();
				break;
			case "STOP":
			case "PAUSE":
				Story.print("That button isn't here.");
				break;
			case "LEVER":
				Item.lever.push();
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void pull(String n) {
		switch (n) {
			case "":
				if (Player.fishing) {
					reelIn();
				} else {
					Story.printMissingNoun();
				}
				break;
			case "TASSEL":
				Item.Tassel.tassel.pull();
				break;
			case "BIRDS":
				moveBirds();
				break;
			case "IN":
			case "ROD":
			case "FISH":
				reelIn();
				break;
			case "LEVER":
				Item.Lever.lever.pull();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void destroy(String n) {
		switch (n) {
			case "":
				Story.printMissingNoun();
				break;
			default:
				Story.print("Even with your best effort, it is futile.");
				break;
		}
	}
	
	public static void pressRewind() {
		switch (Player.getLocation().title) {
			case "Avalokitesvara Shrine":
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
					Story.print("The lattice barrier obstructs you from reaching the television.");
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
			case "Avalokitesvara Shrine":
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
					Story.print("The lattice barrier obstructs you from reaching the television.");
				}
				break;
			case "Theater":
				if (World.theaterTVAtBeginning) {
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
			case "Avalokitesvara Shrine":
				Player.playPurple();
				break;
			case "Master Bedroom":
				Player.playOrange();
				break;
			case "Island":
				Player.playGreen();
				break;
			case "Theater":
				Item.TV.playTheater();
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
			case "BIRDS":
				moveBirds();
				break;
			case "MIRROR":
				moveMirror();
				break;
			case "LEVER":
				Item.lever.pull();
				break;
			case "TASSEL":
				Item.tassel.pull();
				break;
			default:
				Story.invalid();
				break;
		}
	}
	
	public static void moveBirds() {
		if (Player.getLocation().title.equals("Overlook")) {
			Story.printMoveBirds();
			Story.newLine();
			Player.facingReaper = true;
			Story.printReaperEncounter3();		
		} else {
			Story.printNotHere();
		}
	}
	
	public static void moveMirror() {
		switch (Player.getLocation().title) {
			case "Thatched Hut":
			case "Study":
			case "Trinket Shop":
				Story.printTooHeavy();
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
	
	public static void dial(String n) {
		switch (n) {
			case "19670064":
				Player.onPhone = true;
				NPC.setKimi("moshi");
				Story.printKimiMoshi();
				
				if (!Player.gotKimiPoints) {
					Player.gotKimiPoints = true;
					Data.updateScore(5);
				}
				break;
			default:
				Story.printPhoneWrong();
				break;
		}
	}
}