public class Parser {
	public static int numberOfMoves = 0;
	public static StringBuilder input = new StringBuilder("");
	public static StringBuilder verb = new StringBuilder("");
	public static StringBuilder noun = new StringBuilder("");
	
	public static void submitInput() {
		// create new body paragraph
		Story.newParagraph();
		
		Story.printInput();
		
		setInput();
		
		resetInput();
		
		eraseSpaces();
		
		wipeWords();
		
		verifyInput();
		
		Story.setScrollbar();
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
		verb.setLength(0);
		noun.setLength(0);
	}
	
	private static void verifyInput() {
		numberOfMoves++;
		System.out.println("\nMove: " + numberOfMoves);
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
			
			// noun must be first
			simplifyNoun(noun.toString());
			simplifyVerb(verb.toString());
		} else {
			// too many words
			Story.tooManySpaces();
		}
	}
	
	public static void simplifyNoun(String s) {
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
		
		noun.setLength(0);
		noun.append(s);
	}
	
	private static void simplifyVerb(String s) {
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
			|| s.equals("CHECK")){
			s = "EXAMINE";
		}
		
		if (s.equals("L")){
			s = "LOOK";
		}
		
		if (s.equals("UNLOCK")){
			s = "OPEN";
		}
		
		if (s.equals("GET")
		|| s.equals("OBTAIN")
		|| s.equals("GRAB")) {
			s = "TAKE";
		}
		
		processInput(s);
	}
	
	public static void processInput(String s) {
		switch (s) {
			case "NORTH":
				if (Room.getExits().contains("N")) {
					Action.goNorth();
				} else {
					Story.printNoExit();
				}
				break;
			case "SOUTH":
				if (Room.getExits().contains("S")) {
					Action.goSouth();
				} else {
					Story.printNoExit();
				}
				break;
			case "EAST":
				if (Room.getExits().contains("E")) {
					Action.goEast();
				} else {
					Story.printNoExit();
				}	
				break;
			case "WEST":
				if (Room.getExits().contains("W")) {
					Action.goWest();
				} else {
					Story.printNoExit();
				}
				break;
			case "NORTHEAST":
				if (Room.getExits().contains("NE")) {
					Action.goNorthEast();
				} else {
					Story.printNoExit();
				}
				break;
			case "SOUTHEAST":
				if (Room.getExits().contains("SE")) {
					Action.goSouthEast();
				} else {
					Story.printNoExit();
				}
				break;
			case "NORTHWEST":
				if (Room.getExits().contains("NW")) {
					Action.goNorthWest();
				} else {
					Story.printNoExit();
				}
				break;
			case "SOUTHWEST":
				if (Room.getExits().contains("SW")) {
					Action.goSouthWest();
				} else {
					Story.printNoExit();
				}
				break;
			case "UP":
				if (Room.getExits().contains("U")) {
					Action.goUp();
				} else {
					Story.printNoExit();
				}
				break;
			case "DOWN":
				if (Room.getExits().contains("D")) {
					Action.goDown();
				} else {
					Story.printNoExit();
				}
				break;
			case "GO":
				Action.go(noun.toString());
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
				break;
			case "READ":
				Action.read(noun.toString());
				break;
			case "EXAMINE":
				Action.examine(noun.toString());
				break;
			case "OPEN":
				Action.open(noun.toString());
				break;
			case "SHUT":
				Action.shut(noun.toString());
				break;
			default:
				Story.invalid();
				break;
		}
	}
}

