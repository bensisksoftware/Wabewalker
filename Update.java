public class Update {
	
	public static void location(String l) {
		Data.playerLocation = l;
		Bunraku.header1.setText(Data.playerLocation);
		Story.print(Data.playerLocation);
		Story.newLine();
		Room.printDesc();
		Room.printObject();
	}
}