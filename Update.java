public class Update {
	
	public static void location(Room r) {
		Room.setLocation(r);
		Bunraku.header1.setText(Room.getLocation().title);
		Story.printLocation();
		Story.newLine();
		Room.printDesc();
		Story.printObjects();
	}
}