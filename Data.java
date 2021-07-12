public class Data {
	public static int numberOfMoves = 0;
	public static int year = -2137459457;
	
	public static boolean gameOver;
	
	public static void setUp() {
		setYear();
		World.OOO = true;
		Player.orangeAlive = true;
		Player.greenAlive = true;
		Player.purpleAlive = true;
		Room.location.add(Room.gardenPatio);
		Room.visited.add(Room.gardenPatio);
		Room.setRooms();
		Room.setExits();
		Room.setObjects();
		Room.setRoomsWithPlaques();
		
		// test
		Player.updateLocation(Room.sittingRoom);
	}
	
	public static void printToCMD() {
		System.out.println("\nMove: " + numberOfMoves);
		System.out.println(Player.getLocation().title);
		System.out.println("input: " + Parser.input);
	}
	
	public static void newGame() {
		System.out.println("Data.newGame() unfinished");
		System.exit(0);
	}
	
	public static void setYear() {
		year = (int)(Math.random() * 5998 + 1);
		
		// resets year to desired range
		while ((year > 1861 && year < 2200)	|| (year < 101)) {
			System.out.println("Data.setYear contained undesirable number");
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
}