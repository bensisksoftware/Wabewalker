public class Update {
	public static void location(Room r) {
		Room.setLocation(r);
		Bunraku.header1.setText(Room.getLocation().title);
		Story.printLocation();
		
		if (!Room.visited.contains(Room.getLocation())) {
			Story.newLine();
			Story.printDesc();
		}
		
		addVisited();
		Story.printObjects();
	}
	
	private static void addVisited() {
		if (!Room.visited.contains(Room.getLocation()))
			Room.visited.add(Room.getLocation());
	}
}