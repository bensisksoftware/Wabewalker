public class Data {
	public static void setUp() {
		World.OOO = true;
		Room.location.add(Room.gardenPatio);
		Room.visited.add(Room.gardenPatio);
		Room.setRooms();
		Room.setExits();
		Room.setObjects();
	}
}