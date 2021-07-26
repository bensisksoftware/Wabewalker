public class Data {
	public static int moves = 0;
	public static int year = -2137459457;
	public static int kimisNumber = -19670064;
	
	public static boolean gameOver;
	
	public static void setUp() {
		setYear();
		setKimisNumber();
		Thesaurus.addExtraWords();
		World.OOO = true;
		Player.orangeAlive = true;
		Player.greenAlive = true;
		Player.purpleAlive = true;
		Meditate.setShrines();
		Room.location.add(Room.gardenPatio);
		Room.visited.add(Room.gardenPatio);
		Room.setRooms();
		Room.setExits();
		Room.setGardenObjects();
		Room.setHouseObjects();
		Room.setTempleObjects();
		Room.setRoomsWithPlaques();
		resetAllBooleans();
		
		// test
		test();
	}
	
	public static void printToCMD() {
		System.out.println("\nMove: " + moves);
		System.out.println(Player.getLocation().title);
		System.out.println("input: " + Parser.input);
	}
	
	public static void newGame() {
		System.out.println("Data.newGame() unfinished");
		System.exit(0);
	}
	
	public static void setYear() {
		kimisNumber = (int)(Math.random() * 99999999 + 1);
	}
	
	public static void setKimisNumber() {
		year = (int)(Math.random() * 5998 + 1);
		
		// resets year to desired range
		while ((year > 1861 && year < 2200)	|| (year < 101)) {
			//System.out.println("Data.setYear contained undesirable number");
			year = (int)(Math.random() * 5998 + 1);
		}
		
		// resets year if player previously guessed it
		while (Player.answers.contains(yearToString())) {
			System.out.println("Data.setPostRadiusYear contained previous monk answer");
			year = (int)(Math.random() * 5998 + 1);
		}
		
		//System.out.println(yearToString());
	}
	
	public static String yearToString() {
		String s = Integer.toString(year);
		
		return s;
	}
	
	public static void handleGameOver(String v) {
		switch (v) {
			case "YES":
				Data.newGame();
				break;
			case "NO":
				System.exit(0);
				break;
			default:
				Story.printYesOrNo();
				break;
		}
	}
	
	private static void resetAllBooleans() {
		World.tripwire = false;
		World.dark = false;
		World.raDropped = false;
		NPC.scheduled = false;
		World.islandOpen = false;
		World.omInSafe = true;
		World.jiInSafe = true;
		World.niInSafe = true;
		World.yuInBox = true;
		World.goInCase = true;
		World.sandExhibitDoorOpen = false;
		World.loungeSafeOpen = false;
		World.shrineRoom1SafeOpen = false;
		World.shrineRoom2DoorOpen = false;
		World.courtyardDoorOpen = false;
		World.masterBedroomSafeOpen = false;
		World.creakyDeckOpen = false;
		World.boxOpen = false;
		World.cornOnRod = false;
		World.bite = false;
		World.theaterTVAtBeginning = true;
		Player.sipped = false;
		Player.spokeToClan = false;
		Player.metIsachi = false;
		Player.sawReaper2 = false;
	}
	
	private static void addMemory() {
		Player.memory.add("Lotus");
		Player.memory.add("Fish");
		Player.memory.add("Knot");
		Player.memory.add("om");
		Player.memory.add("ni");
		Player.memory.add("go");
		Player.memory.add("yu");
		Player.memory.add("ji");
		Player.memory.add("ra");
		Player.memory.add("shi");
	}
	
	public static void test() {
		//Player.updateLocation(Room.darkPassageway);
		//World.XOO = true;
		
		addMemory();
	}
}