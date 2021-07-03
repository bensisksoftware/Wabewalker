public class Parser {
	public static StringBuilder input = new StringBuilder("");
	public static StringBuilder verb = new StringBuilder("");
	public static StringBuilder noun = new StringBuilder("");
	
	public static void submitInput() {
		// set scrollbar to bottom
		Bunraku.body.setCaretPosition(Bunraku.body.getDocument().getLength());
		
		// create new body paragraph
		Story.newParagraph();
		
		Story.printInput();
		
		setInput();
		
		resetInput();
		
		eraseSpaces();
		
		wipeWords();
		
		verifyInput();
	}
	
	private static void setInput() {
		input.setLength(0);
		input.append(Bunraku.inputBox.getText().toUpperCase());
	}
	
	private static void resetInput() {
		// erase inputBox
		Bunraku.inputBox.setText("");
	}
	
	private static void eraseSpaces() {
		// deletes all spaces at beginning of input
		while (input.charAt(0) == ' ') {
			input.deleteCharAt(0);
		}
		
		// deletes all spaces at end of input
		while (input.charAt(input.length() - 1) == ' ') {
			input.deleteCharAt(input.length() - 1);
		}
		
		input.trimToSize();
	}
	
	private static void wipeWords() {
		verb.setLength(0);;
		noun.setLength(0);;
	}
	
	private static void verifyInput() {
		System.out.println("input: " + input);
		int count = 0;
		int spaceIndex = input.indexOf(" "); //this finds the first occurrence of space
		
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == ' ')
				count++;
		}
		
		if (count == 0) {
			// one word
			simplifyVerb(input.toString());
		} else if (count == 1) {
			// two words
			verb.append(input.substring(0 , spaceIndex)); // get verb
			noun.append(input.substring(input.lastIndexOf(" ") + 1)); // get noun
			
			simplifyVerb(verb.toString());
		} else {
			// too many words
			Story.tooManySpaces();
		}
	}
	
	public static void processInput(String s) {
		switch (s) {
			case "NORTH":
				Action.goNorth();
				break;
			case "SOUTH":
				Action.goSouth();
				break;
			case "EAST":
				Action.goEast();
				break;
			case "WEST":
				Action.goWest();
				break;
			case "NORTHEAST":
				Action.goNorthEast();
				break;
			case "SOUTHEAST":
				Action.goSouthEast();
				break;
			case "NORTHWEST":
				Action.goNorthWest();
				break;
			case "SOUTHWEST":
				Action.goSouthWest();
				break;
			case "UP":
				Action.goUp();
				break;
			case "DOWN":
				Action.goDown();
				break;
			case "INVENTORY":
				Action.checkInventory();
				break;
			case "TAKE":
				Action.take(noun.toString());
				break;
			case "DROP":
				Action.drop(noun.toString());
				break;
			case "LOOK":
				Action.look();
			default:
				Story.invalid();
				break;
		}
	}
	
	private static void simplifyVerb(String s) {
		//String s = input.toString();
		
		if (s.equals("WALK")
		|| s.equals("RUN")) {
			s = "GO";
		}
		
		if (s.equals("N")) {
			s = "NORTH";
		}

		if (s.equals("S")) {
			s = "SOUTH";
		}
		
		if (s.equals("E")) {
			s = "EAST";
		}
		
		if (s.equals("W")) {
			s = "WEST";
		}
		
		if (s.equals("NE")) {
			s = "NORTHEAST";
		}

		if (s.equals("SE")) {
			s = "SOUTHEAST";
		}
		
		if (s.equals("NW")) {
			s = "NORTHWEST";
		}
		
		if (s.equals("SW")) {
			s = "SOUTHWEST";
		}
		
		if (s.equals("U")) {
			s = "UP";
		}
		
		if (s.equals("D")) {
			s = "DOWN";
		}
		
		if (s.equals("I")) {
			s = "INVENTORY";
		}
		
		if (s.equals("X")
			|| s.equals("CHECK")
			|| s.equals("READ")){
			s = "EXAMINE";
		}
		
		if (s.equals("L")){
			s = "LOOK";
		}
		
		if (s.equals("GET")
		|| s.equals("OBTAIN")
		|| s.equals("GRAB")) {
			s = "TAKE";
		}
		
		processInput(s);
	}
	
	// unused
	private static void simplify() {
		String s = input.toString();
		
		/** template
		if (s.equals("")
		|| s.equals("")
		|| s.equals("")) {
			s = "";
		}
		*/
		
		if (s.equals("N")
		|| s.equals("GO N")
		|| s.equals("WALK N")
		|| s.equals("RUN N")
		|| s.equals("GO NORTH")
		|| s.equals("WALK NORTH")
		|| s.equals("RUN NORTH")) {
			s = "NORTH";
		}

		if (s.equals("S")
		|| s.equals("GO S")
		|| s.equals("WALK S")
		|| s.equals("RUN S")
		|| s.equals("GO SOUTH")
		|| s.equals("WALK SOUTH")
		|| s.equals("RUN SOUTH")) {
			s = "SOUTH";
		}
		
		if (s.equals("E")
		|| s.equals("GO E")
		|| s.equals("WALK E")
		|| s.equals("RUN E")
		|| s.equals("GO EAST")
		|| s.equals("WALK EAST")
		|| s.equals("RUN EAST")) {
			s = "EAST";
		}
		
		if (s.equals("W")
		|| s.equals("GO W")
		|| s.equals("WALK W")
		|| s.equals("RUN W")
		|| s.equals("GO WEST")
		|| s.equals("WALK WEST")
		|| s.equals("RUN WEST")) {
			s = "WEST";
		}
		
		if (s.equals("NE")
		|| s.equals("GO NE")
		|| s.equals("WALK NE")
		|| s.equals("RUN NE")
		|| s.equals("GO NORTHEAST")
		|| s.equals("WALK NORTHEAST")
		|| s.equals("RUN NORTHEAST")) {
			s = "NORTHEAST";
		}

		if (s.equals("SE")
		|| s.equals("GO SE")
		|| s.equals("WALK SE")
		|| s.equals("RUN SE")
		|| s.equals("GO SOUTHEAST")
		|| s.equals("WALK SOUTHEAST")
		|| s.equals("RUN SOUTHEAST")) {
			s = "SOUTHEAST";
		}
		
		if (s.equals("NW")
		|| s.equals("GO NW")
		|| s.equals("WALK NW")
		|| s.equals("RUN NW")
		|| s.equals("GO NORTHWEST")
		|| s.equals("WALK NORTHWEST")
		|| s.equals("RUN NORTHWEST")) {
			s = "NORTHWEST";
		}
		
		if (s.equals("SW")
		|| s.equals("GO SW")
		|| s.equals("WALK SW")
		|| s.equals("RUN SW")
		|| s.equals("GO SOUTHWEST")
		|| s.equals("WALK SOUTHWEST")
		|| s.equals("RUN SOUTHWEST")) {
			s = "SOUTHWEST";
		}
		
		if (s.equals("U")
		|| s.equals("GO U")
		|| s.equals("WALK U")
		|| s.equals("RUN U")
		|| s.equals("GO UP")
		|| s.equals("WALK UP")
		|| s.equals("RUN UP")) {
			s = "UP";
		}
		
		if (s.equals("D")
		|| s.equals("GO D")
		|| s.equals("WALK D")
		|| s.equals("RUN D")
		|| s.equals("GO DOWN")
		|| s.equals("WALK DOWN")
		|| s.equals("RUN DOWN")) {
			s = "DOWN";
		}
		
		processInput(s);
	}
}

