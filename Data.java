public class Data {
	public static String playerLocation = "";
	
	public static void setUp() {
		playerLocation = "Garden Patio";
		Room.setRooms();
		Room.setExits();
		Room.setObjects();
	}
}