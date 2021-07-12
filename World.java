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
}