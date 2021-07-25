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
	public static boolean masterBedroomSafeOpen;
	public static boolean creakyDeckOpen;
	public static boolean boxOpen;
	public static boolean cornOnRod;
	public static boolean bite;
	public static boolean theaterTVAtBeginning;
	
	public static ArrayList<String> gChant = new ArrayList();
	public static ArrayList<String> hChant = new ArrayList();
	public static ArrayList<String> tChant = new ArrayList();
	
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
	
	public static void checkShrine() {
		// shift chants in arraylist to the left if list > max
		if (Meditate.chantInputs.size() > 14) {
			for(int i = 0; i < Meditate.chantInputs.size()-1; i++) {
				Meditate.chantInputs.set(i, Meditate.chantInputs.get(i+1)); 
			}
			
			Meditate.chantInputs.remove(Meditate.chantInputs.size() -1);
		}
		
		if ((Player.getLocation().title.equals("Shrine Room 1")
			&& Meditate.chantInputs.equals(gChant)
			&& Player.visualizingKnot) 
		||	(Player.getLocation().title.equals("Shrine Room 2")
			&& Meditate.chantInputs.equals(hChant)
			&& Player.visualizingLotus) 
		||	(Player.getLocation().title.equals("Shrine Room 3")
			&& Meditate.chantInputs.equals(tChant)
			&& Player.visualizingFish)) {
				Meditate.trance();
		}
	}
	
	public static void pressButton() {
		switch (Player.getLocation().title) {
			case "Shrine Room 1":
				Story.print("Which button?");
				break;
			case "Library":
				Story.print("Which button?");
				break;
			case "Island":
				Story.print("Which button?");
				break;
			case "Theater":
				Story.print("Which button?");
				break;
			case "Hallway":
				if (OOO && !raDropped) {
					Story.printActivateHallway();
					raDropped = true;
					Room.closetObjects.add(Item.ra);
					Room.closet.scrollCount++;
				} else {
					Story.print("You push the button, but nothing happens.");
				}
				break;
			case "Creaky Deck":
				if (OOO && !creakyDeckOpen) {
					Story.printActivateCreakyDeck();
					creakyDeckOpen = true;
				} else {
					Story.print("You push the button, but nothing happens.");
				}
				break;
			default:
				Story.printNotHere();
				break;
		}
	}
}