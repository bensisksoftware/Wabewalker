import java.util.ArrayList;

public class Player {
	public static boolean meditating;
	public static boolean dreaming;
	public static boolean tookACBook;
	public static boolean sawReaper1;
	public static boolean sawReaper2;
	public static boolean facingReaper;
	public static boolean orangeAlive;
	public static boolean greenAlive;
	public static boolean purpleAlive;
	public static boolean orangeAtTV;
	public static boolean greenAtTV;
	public static boolean purpleAtTV;
	public static boolean caughtFish;
	public static boolean hadCorn;
	public static boolean raDropped;
	public static boolean onPhone;
	public static boolean fishing;
	public static boolean sipped;
	public static boolean spokeToClan;
	public static boolean metIsachi;
	public static boolean playedTheaterTV;
	public static boolean baitedRod;
	public static boolean openedGate;
	public static boolean examinedCard;
	public static boolean heardKimiWisdom;
	public static boolean openedSandExhibitDoor;
	public static boolean gotTodPoints;
	public static boolean readBook;
	public static boolean readCryptogram;
	public static boolean pulledHallwayLever;
	public static boolean openedCloset;
	public static boolean openedShrineRoom2Door;
	public static boolean sittingOnGround;
	public static boolean sittingOnSofa;
	public static boolean tookParchment;
	public static boolean examinedMannequin;
	
	public static int startedFishing = 0;
	
	public static String previousLocation = "";
	
	public static ArrayList<String> memory = new ArrayList<String>();
	public static ArrayList<String> answers = new ArrayList<>();
	public static ArrayList<Item> inventory = new ArrayList<Item>();
	public static ArrayList<Item> orangeSavedInventory = new ArrayList<Item>();
	public static ArrayList<Item> greenSavedInventory = new ArrayList<Item>();
	public static ArrayList<Item> purpleSavedInventory = new ArrayList<Item>();
	
	public static Room getLocation() {
		return Room.location.get(0);
	}
	
	public static String getPreviousLocation() {
		return previousLocation;
	}
	
	public static void updatePreviousLocation(String p) {
		previousLocation = p;
	}
	
	public static void updateLocation(Room r) {
		updatePreviousLocation(getLocation().title);
		Room.location.clear();
		Room.location.add(r);
		Bunraku.header1.setText(Player.getLocation().title);
		Story.printLocation();
		
		if (!Room.visited.contains(Player.getLocation())) {
			Story.newLine();
			Story.printDesc();
			Story.printDesc2();
		}
		
		addVisited();
		Story.printObjects();
	}
	
	public static void addVisited() {
		if (!Room.visited.contains(getLocation()))
			Room.visited.add(getLocation());
	}
	
	public static void die() {
		switch (getLocation().title) {
			case "Outside Gallery":
				if (greenAlive) {
					wipeOrange();
					World.resetBulbs();
					
					if (greenAtTV) {
						restoreGreenInventory();
					} else {
						inventory.clear();
					}
					
					Story.printBlackOut();
					Player.updateLocation(Room.masterBedroom);
				} else {
					// no ningyo
					Story.printGameOver();
				}
				break;
			case "Living Room":
				if (purpleAlive) {
					wipeGreen();
					World.resetBulbs();
					
					if (purpleAtTV) {
						restorePurpleInventory();
						Story.printBlackOut();
						Player.updateLocation(Room.island);
					} else {
						inventory.clear();
						Story.printBlackOut();
						Player.updateLocation(Room.outsideGate);
					}
				} else {
					// no ningyo
					Story.printGameOver();
				}
				break;
			case "Overlook":
				if (orangeAlive) {
					wipePurple();
					World.resetBulbs();
					
					if (orangeAtTV) {
						restoreOrangeInventory();
						Story.printBlackOut();
						Player.updateLocation(Room.shrineRoom1);
					} else {
						inventory.clear();
						Story.printBlackOut();
						Player.updateLocation(Room.gardenPatio);
					}
				} else {
					// no ningyo
					Data.gameOver = true;
					Story.printGameOver();
				}
				break;
			default:
			
				break;
		}
	}
	
	public static void wipeOrange() {
		orangeAlive = false;
		orangeAtTV = false;
		World.sandExhibitDoorOpen = false;
		
		if (!getLocation().equals(Room.masterBedroom))
			inventory.clear();
		
		sawReaper1 = false;
		orangeSavedInventory.clear();
		
		Room.gardenPatioObjects.clear();
		Room.cobbleSquareObjects.clear();
		Room.teaRoomObjects.clear(); 
		Room.sandExhibitObjects.clear(); 
		Room.thatchedHutObjects.clear(); 
		Room.gardenOverlookObjects.clear(); 
		Room.loungeObjects.clear(); 
		Room.cafeObjects.clear(); 
		Room.outsideGalleryObjects.clear(); 
		Room.shrineRoom1Objects.clear(); 
		Room.insideGalleryObjects.clear(); 
		Room.assemblyRoomObjects.clear(); 
		
		Room.setGardenObjects(); 
	}
	
	public static void wipeGreen() {
		greenAlive = false;
		greenAtTV = false;
		caughtFish = false;
		hadCorn = false;
		raDropped = false;
		sawReaper2 = false;
		NPC.scheduled = false;
		World.tripwire = false;
		World.cornOnRod = false;
		tookParchment = false;
			
		if (!getLocation().equals(Room.island))
			inventory.clear();
		
		greenSavedInventory.clear();
		
		Room.shrineRoom2Objects.clear(); 
		Room.livingRoomObjects.clear(); 
		Room.pondObjects.clear(); 
		Room.courtyardObjects.clear(); 
		Room.landingObjects.clear(); 
		Room.hallwayObjects.clear(); 
		Room.sittingRoomObjects.clear(); 
		Room.studyObjects.clear(); 
		Room.masterBedroomObjects.clear(); 
		Room.closetObjects.clear(); 
		Room.darkPassagewayObjects.clear();
		Room.mannequinRoomObjects.clear(); 
		Room.theaterObjects.clear(); 
		
		Room.setHouseObjects(); 
	}
	
	public static void wipePurple() {
		purpleAlive = false;
		purpleAtTV = false;
		sipped = false;
		spokeToClan = false;
		metIsachi = false;
		World.boxOpen = false;
		World.creakyDeckOpen = false;
		World.yuInBox = true;
		World.goInCase = true;
			
		if (!getLocation().equals(Room.shrineRoom1))
			inventory.clear();
		
		purpleSavedInventory.clear();
		
		Room.outsideGateObjects.clear();
		Room.insideGateObjects.clear(); 
		Room.islandObjects.clear(); 
		Room.bottomOfMountainObjects.clear(); 
		Room.topOfMountainObjects.clear(); 
		Room.hamletObjects.clear(); 
		Room.hondoObjects.clear(); 
		Room.balconyObjects.clear(); 
		Room.shrineRoom3Objects.clear();
		Room.trinketShopObjects.clear(); 
		Room.creakyDeckObjects.clear(); 
		Room.overlookObjects.clear();
		
		Room.setTempleObjects(); 
	}
	
	public static void saveOrangeInventory() {
		orangeSavedInventory.clear();
		
		for (int i = 0; i < inventory.size(); i++) {
			orangeSavedInventory.add(inventory.get(i));
		}
	}
	
	public static void saveGreenInventory() {
		greenSavedInventory.clear();
		
		for (int i = 0; i < inventory.size(); i++) {
			greenSavedInventory.add(inventory.get(i));
		}
	}
	
	public static void savePurpleInventory() {
		purpleSavedInventory.clear();
		
		for (int i = 0; i < inventory.size(); i++) {
			purpleSavedInventory.add(inventory.get(i));
		}
	}
	
	public static void restoreOrangeInventory() {
		inventory.clear();
		
		for (int i = 0; i < orangeSavedInventory.size(); i++) {
			inventory.add(orangeSavedInventory.get(i));
		}
	}
	
	public static void restoreGreenInventory() {
		inventory.clear();
		
		for (int i = 0; i < greenSavedInventory.size(); i++) {
			inventory.add(greenSavedInventory.get(i));
		}
	}
	
	public static void restorePurpleInventory() {
		inventory.clear();
		
		for (int i = 0; i < purpleSavedInventory.size(); i++) {
			inventory.add(purpleSavedInventory.get(i));
		}
	}
	
	public static void playOrange() {
		if (orangeAlive) {
			saveGreenInventory();
			inventory.clear();
			Story.printBlackOut();
			greenAtTV = true;
			
			if (orangeAtTV) {
				updateLocation(Room.shrineRoom1);
				restoreOrangeInventory();
			} else {
				updateLocation(Room.gardenPatio);
			}
		} else {
			Story.printTapePlaying();
		}
	}
	
	public static void playGreen() {
		if (World.islandOpen) {
			if (greenAlive) {
				savePurpleInventory();
				inventory.clear();
				Story.printBlackOut();
				purpleAtTV = true;
				updateLocation(Room.masterBedroom);
				
				if (greenAtTV)
					restoreGreenInventory();
				
			} else {
				Story.printTapePlaying();
			}
		} else {
			Story.print("You can't reach the TV behind the gate.");
		}
	}
	
	public static void playPurple() {
		if (purpleAlive) {
			saveOrangeInventory();
			inventory.clear();
			Story.printBlackOut();
			orangeAtTV = true;
			
			if (purpleAtTV) {
				updateLocation(Room.island);
				restorePurpleInventory();
			} else {
				updateLocation(Room.outsideGate);
			}
		} else {
			Story.printTapePlaying();
		}
	}
	
	public static String getRobe() {
		switch (Player.getLocation().title) {
			case "Garden Patio":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Cobble Square":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Tea Room":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Sand Exhibit":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Thatched Hut":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Garden Overlook":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Lounge":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Cafe":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Outside Gallery":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Shrine Room 1":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Inside Gallery":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Assembly Room":
				if (Player.dreaming) {
					return "black";
				} else {
					return "orange";
				}
			case "Shrine Room 2":
				return "green";
			case "Living Room":
				return "green";
			case "Pond":
				return "green";
			case "Courtyard":
				return "green";
			case "Landing":
				return "green";
			case "Hallway":
				return "green";
			case "Sitting Room":
				return "green";
			case "Study":
				return "green";
			case "Master Bedroom":
				return "green";
			case "Closet":
				return "green";
			case "Dark Passageway":
				return "green";
			case "Mannequin Room":
				return "green";
			case "Theater":
				return "green";
			case "Outside Gate":
				return "purple";
			case "Inside Gate":
				return "purple";
			case "Island":
				return "purple";
			case "Bottom of Mountain":
				return "purple";
			case "Top of Mountain":
				return "purple";
			case "Hamlet":
				return "purple";
			case "Hisachi Ichiro's House":
				return "purple";
			case "Hondo":
				return "purple";
			case "Balcony":
				return "purple";
			case "Shrine Room 3":
				return "purple";
			case "Trinket Shop":
				return "purple";
			case "Creaky Deck":
				return "purple";
			case "Overlook":
				return "purple";
			default:
				System.out.println("Player.getRobe() error");
				return null;
		}
	}
	
	public static void memorizeFish() {
		if (!memory.contains("Fish")) {
			memory.add("Fish");
			Data.updateScore(10);
		}
	}
	
	public static void returnToIsachi() {
		dreaming = false;
		restorePurpleInventory();
		Story.print(Story.tod11);
		inventory.add(Item.shi);
		NPC.setTod("content");
		Story.newLine();
		updateLocation(Room.hamlet);
		metIsachi = true;
		World.OOO = false;
		World.XOO = true;
	}
	
	public static int getInventoryScrollCount() {
		int c = 0;
		
		if (inventory.contains(Item.om))
			c++;
		
		if (inventory.contains(Item.ni))
			c++;
		
		if (inventory.contains(Item.go))
			c++;
		
		if (inventory.contains(Item.yu))
			c++;
		
		if (inventory.contains(Item.ji))
			c++;
		
		if (inventory.contains(Item.ra))
			c++;
		
		if (inventory.contains(Item.shi))
			c++;
		
		return c;
	}
}