import java.util.ArrayList;

public class World {
	public static boolean OOO;
	public static boolean OOX;
	public static boolean OXO;
	public static boolean OXX;
	public static boolean XOO;
	public static boolean XOX;
	public static boolean XXO;
	public static boolean tripwire;
	public static boolean dark;
	public static boolean raDropped;
	public static boolean islandOpen;
	public static boolean omInSafe;
	public static boolean jiInSafe;
	public static boolean niInSafe;
	public static boolean yuInBox;
	public static boolean goInCase;
	public static boolean sandExhibitDoorOpen;
	public static boolean loungeSafeOpen;
	public static boolean shrineRoom1SafeOpen;
	public static boolean shrineRoom2DoorOpen;
	public static boolean courtyardDoorOpen;
	public static boolean studySafeOpen;
	public static boolean creakyDeckOpen;
	public static boolean boxOpen;
	public static boolean cornOnRod;
	public static boolean bite;
	public static boolean theaterTVAtBeginning;
	public static boolean disableReaper;
	
	public static int fishWait = 3;
	
	public static void resetBulbs() {
		if (Player.orangeAlive && Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			OOO = true;
			System.out.println("OOO");
		}
		
		if (Player.orangeAlive && Player.greenAlive && !Player.purpleAlive) {
			wipeBulbs();
			OOX = true;
			System.out.println("OOX");
		}
		
		if (Player.orangeAlive && !Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			OXO = true;
			System.out.println("OXO");
		}
		
		if (!Player.orangeAlive && Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			XOO = true;
			System.out.println("XOO");
		}
		
		if (Player.orangeAlive && !Player.greenAlive && !Player.purpleAlive) {
			wipeBulbs();
			OXX = true;
			System.out.println("OXX");
		}
		
		if (!Player.orangeAlive && Player.greenAlive && !Player.purpleAlive) {
			wipeBulbs();
			XOX = true;
			System.out.println("XOX");
		}
		
		if (!Player.orangeAlive && !Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			XXO = true;
			System.out.println("XXO");
		}
		
		// close all doors, safes, etc
		lockup();
	}
	
	public static void lockup() {
		
	}
	
	public static void wipeBulbs() {
		OOO = false;
		OOX = false;
		OXO = false;
		XOO = false;
		OXX = false;
		XXO = false;
		XOX = false;
	}
	
	public static int getScrollCount() {
		int totalScrolls = 0;
		
		totalScrolls += Room.location.get(0).scrollCount;
		
		totalScrolls += Player.getInventoryScrollCount();
		
		if ((boxOpen && yuInBox) && (Room.getObjects().contains(Item.box) || Player.inventory.contains(Item.box)))
			totalScrolls++;
		
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				if (shrineRoom1SafeOpen && jiInSafe)
					totalScrolls++;
				break;
			case "Lounge":
				if (loungeSafeOpen && omInSafe)
					totalScrolls++;
				break;
			case "Study":
				if (studySafeOpen && niInSafe)
					totalScrolls++;
				break;
			case "Creaky Deck":
				if (creakyDeckOpen && goInCase)
					totalScrolls++;
				break;
			default:
				break;
		}
		
		return totalScrolls;
	}
	
	public static void checkRod() {
		if (cornOnRod && Player.fishing && (Data.moves == (Player.startedFishing + fishWait))) {
			Story.printBite();
			bite = true;
			cornOnRod = false;
		}
		
		if (bite && (Data.moves > (Player.startedFishing + fishWait))) {
			Story.print("\nYou no longer feel a tug on the line.");
			bite = false;
		}
	}
	
	public static void playTheater() {
		if (theaterTVAtBeginning) {
			Story.printTheaterTV();
			theaterTVAtBeginning = false;
			
			if (!Player.playedTheaterTV) {
				Player.playedTheaterTV = true;
				Data.updateScore(5);
			}
		} else {
			Story.printTapePlaying();
		}
	}
}