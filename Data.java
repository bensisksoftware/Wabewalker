public class Data {
	public static void setUp() {
		Room.location.add(Room.gardenPatio);
		Room.setRooms();
		Room.setExits();
		Room.setObjects();
	}
}