public class Data {
	public static int moves = 0;
	public static int score = 0;
	public static int maxScore = 200;
	public static int year = -2137459457;
	public static int kimisNumber = 19670064;
	
	public static boolean gameOver;
	
	public static void setUpGame() {
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
		Story.printLocation();
		Story.newLine();
		Story.printDesc();
		
		// test
		test();
	}
	
	public static void printToCMD() {
		System.out.println("\nMove: " + moves);
		System.out.println(Player.getLocation().title);
		System.out.println("input: " + Parser.input);
		System.out.println(Parser.sentence);
	}
	
	public static void newGame() {
		System.out.println("Data.newGame() unfinished");
		System.exit(0);
	}
	
	public static void setYear() {
			year = (int)(Math.random() * 1999 + 1);
		
		// resets year to desired range or if player previously guessed it
		while (year < 101 || Player.answers.contains(year)) {
			year = (int)(Math.random() * 1999 + 1);
		}
	}
	
	public static void checkAnswers() {
		if (Player.answers.size() > 1500) {
			Player.answers.clear();
		}
	}
	
	public static void updateScore(int p) {
		score += p;
		Story.newParagraph();
		Story.print("[Your score just went up by " + p + " points. The total is now " + score + " out of " + maxScore + ".]");
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
		World.librarySafeOpen = false;
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
		Player.memory.add("Flower");
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
	
	private static void addItems() {
		Player.inventory.add(Item.om);
		Player.inventory.add(Item.ni);
		Player.inventory.add(Item.go);
		Player.inventory.add(Item.yu);
		Player.inventory.add(Item.ji);
		Player.inventory.add(Item.ra);
		Player.inventory.add(Item.shi);
	}
	
	public static void test() {
		// Player.updateLocation(Room.library);
		//World.XOO = true;
		//addMemory();
		//addItems();
	}
	
	public static void cheat() {
		System.out.println(kimisNumber);
	}
}