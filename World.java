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
	public static boolean scheduled;
	public static boolean islandOpen;
	public static boolean omInSafe;
	public static boolean jiInSafe;
	public static boolean niInSafe;
	public static boolean yuInCase;
	public static boolean goInCase;
	public static boolean sandExhibitDoorOpen;
	public static boolean loungeSafeOpen;
	public static boolean shrineRoom1SafeOpen;
	public static boolean shrineRoom2DoorOpen;
	public static boolean courtyardDoorOpen;
	public static boolean masterBedroomSafeOpen;
	public static boolean creakyDeckOpen;
	
	public static String kimiState = "";
	
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
	
	public static void handleReaper(String v) {
		if (Data.yearToString().equals(v) || Data.yearToString().equals(Parser.noun.toString())) {
			// correct answer
		} else {
			// incorrect answer
			Story.printReaperWrong();
			Player.facingReaper = false;
		}
	}
	
	public static void handleKimi(String v) {
		switch (getKimi()) {
			case "moshi":
				if (v.equals("DANCE") || v.equals("NARRATIVE") || v.equals("REIKI") || v.equals("THERAPY")) {
					Story.printKimiNeedSch();
					setKimi("needSch");
				} else if (v.equals("MEDITATION") || v.equals("INSTRUCTION") || v.equals("KNOWLEDGE")) {
					Story.printKimiSchOrPho();
					setKimi("schOrPho");
				} else {
					Story.printKimiBiz();
					setKimi("biz");
				}
				break;
			case "biz":
				// business or personal
				if (v.equals("BUSINESS")) {
					Story.printKimiRight();
					setKimi("right");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "right":
				if (v.equals("REMEDY")) {
					Story.printKimiNeedSch();
					setKimi("needSch");
				} else if (v.equals("KNOWLEDGE")) {
					Story.printKimiSchOrPho();
					setKimi("schOrPho");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "needSch":
				if (v.equals("YES")) {
					if (scheduled) {
						Story.printKimiNoSch();
						setKimi("anythingElse");
					} else {
						Story.printKimiHaveOpening();
						setKimi("haveOpening");
					}
				} else if (v.equals("NO")) { 
					Story.printKimiSorry();
					setKimi("anythingElse");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "haveOpening":
				if (v.equals("YES")) {
					scheduled = true;
					Story.printKimiAnythingElse();
					setKimi("anythingElse");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "anythingElse":
				if (v.equals("YES")) {
					Story.printKimiBiz();
					setKimi("biz");
				} else if (v.equals("DANCE") || v.equals("NARRATIVE") || v.equals("REIKI") || v.equals("THERAPY")) {
					Story.printKimiNeedSch();
					setKimi("needSch");
				} else if (v.equals("MEDITATION") || v.equals("INSTRUCTION") || v.equals("KNOWLEDGE")) {
					Story.printKimiSchOrPho();
					setKimi("schOrPho");
				} else if (v.equals("NO")) {
					Story.printKimiBye();
					Player.onPhone = false;
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "schOrPho":
				if (v.equals("SCHEDULE")) {
					if (scheduled) {
						Story.printKimiNoSch();
						setKimi("anythingElse");
					} else {
						Story.printKimiHaveOpening();
						setKimi("haveOpening");
					}
				} else if (v.equals("PHONE")) {
					Story.printKimiWisdom();
					setKimi("anythingElse");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			default:
				System.out.println("World.handleKimi() error");
				break;
			
		}
	}
	
	public static void setKimi(String s) {
		kimiState = s;
	}
	
	public static String getKimi() {
		return kimiState;
	}
	
	public static void checkShrine() {
		// shift chants in arraylist to the left if list > max
		if (Player.chantInputs.size() > 14) {
			for(int i = 0; i < Player.chantInputs.size()-1; i++) {
				Player.chantInputs.set(i, Player.chantInputs.get(i+1)); 
			}
			
			Player.chantInputs.remove(Player.chantInputs.size() -1);
		}
		
		if ((Player.getLocation().title.equals("Shrine Room 1")
			&& Player.chantInputs.equals(gChant)
			&& Player.visualizingKnot) 
		||	(Player.getLocation().title.equals("Shrine Room 2")
			&& Player.chantInputs.equals(hChant)
			&& Player.visualizingLotus) 
		||	(Player.getLocation().title.equals("Shrine Room 3")
			&& Player.chantInputs.equals(tChant)
			&& Player.visualizingFish)) {
				Player.trance();
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