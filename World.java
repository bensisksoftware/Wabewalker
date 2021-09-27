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
	public static boolean yuInCase;
	public static boolean goInBox;
	public static boolean sandExhibitDoorOpen;
	public static boolean loungeSafeOpen;
	public static boolean shrineRoom1SafeOpen;
	public static boolean shrineRoom2DoorOpen;
	public static boolean courtyardDoorOpen;
	public static boolean studySafeOpen;
	public static boolean creakyDeckOpen;
	public static boolean caseOpen;
	public static boolean cornOnRod;
	public static boolean bite;
	public static boolean theaterTVAtBeginning;
	public static boolean reaperDisabled;
	
	public static int fishWait = 3;
	
	public static void resetBulbs() {
		if (Player.orangeAlive && Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			OOO = true;
		}
		
		if (Player.orangeAlive && Player.greenAlive && !Player.purpleAlive) {
			wipeBulbs();
			OOX = true;
		}
		
		if (Player.orangeAlive && !Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			OXO = true;
		}
		
		if (!Player.orangeAlive && Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			XOO = true;
		}
		
		if (Player.orangeAlive && !Player.greenAlive && !Player.purpleAlive) {
			wipeBulbs();
			OXX = true;
		}
		
		if (!Player.orangeAlive && Player.greenAlive && !Player.purpleAlive) {
			wipeBulbs();
			XOX = true;
		}
		
		if (!Player.orangeAlive && !Player.greenAlive && Player.purpleAlive) {
			wipeBulbs();
			XXO = true;
		}
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
	
	public static void eventAtEnd() {
		World.checkRod();
	}
}