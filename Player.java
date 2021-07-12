import java.util.ArrayList;

public class Player {
	public static boolean meditating;
	public static boolean dreaming;
	public static boolean visualizingLotus;
	public static boolean visualizingFish;
	public static boolean visualizingKnot;
	public static boolean tookACBook;
	public static boolean sawReaper1;
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
	
	public static ArrayList<String> memory = new ArrayList<String>();
	public static ArrayList<String> answers = new ArrayList<String>();
	public static ArrayList<Item> inventory = new ArrayList<Item>();
	public static ArrayList<Item> orangeSavedInventory = new ArrayList<Item>();
	public static ArrayList<Item> greenSavedInventory = new ArrayList<Item>();
	public static ArrayList<Item> purpleSavedInventory = new ArrayList<Item>();
	
	public static Room getLocation() {
		return Room.location.get(0);
	}
	
	public static void updateLocation(Room r) {
		Room.location.clear();
		Room.location.add(r);
		Bunraku.header1.setText(Player.getLocation().title);
		Story.printLocation();
		
		if (!Room.visited.contains(Player.getLocation())) {
			Story.newLine();
			Story.printDesc();
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
						Story.printBlackOut();
						Player.updateLocation(Room.library);
					} else {
						inventory.clear();
						Story.printBlackOut();
						Player.updateLocation(Room.shrineRoom2);
					}
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
		Room.shrineRoom1DoorOpen = false;
		
		if (!getLocation().equals(Room.library))
			inventory.clear();
		
		sawReaper1 = false;
		orangeSavedInventory.clear();
	}
	
	public static void wipeGreen() {
		greenAlive = false;
		greenAtTV = false;
		caughtFish = false;
		hadCorn = false;
		raDropped = false;
		World.scheduled = false;
		World.tripwire = true;
			
		if (!getLocation().equals(Room.island))
			inventory.clear();
		
		greenSavedInventory.clear();
	}
	
	public static void wipePurple() {
		purpleAlive = false;
		purpleAtTV = false;
			
		if (!getLocation().equals(Room.shrineRoom1))
			inventory.clear();
		
		purpleSavedInventory.clear();
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
			case "Master Bedroom":
				return "green";
			case "Library":
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
			case "Bottom of Stairs":
				return "purple";
			case "Top of Stairs":
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
}