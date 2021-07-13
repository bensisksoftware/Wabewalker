public class Parser {
	public static StringBuilder input = new StringBuilder("");
	public static StringBuilder verb = new StringBuilder("");
	public static StringBuilder noun = new StringBuilder("");
	
	public static void submitInput() {
		Data.numberOfMoves++;
		
		Story.newParagraph();
		
		Story.printInput();
		
		setInput();
		
		resetInput();
		
		eraseSpaces();
		
		wipeWords();
		
		verifyInput();
		
		Story.setScrollbar();
		
		Data.printToCMD();
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
	
	public static void simplifyNoun(String n) {
		if (n.equals("N")) {
			n = "NORTH";
		}

		if (n.equals("S")) {
			n = "SOUTH";
		}
		
		if (n.equals("E")) {
			n = "EAST";
		}
		
		if (n.equals("W")) {
			n = "WEST";
		}
		
		if (n.equals("NE")) {
			n = "NORTHEAST";
		}

		if (n.equals("SE")) {
			n = "SOUTHEAST";
		}
		
		if (n.equals("NW")) {
			n = "NORTHWEST";
		}
		
		if (n.equals("SW")) {
			n = "SOUTHWEST";
		}
		
		if (n.equals("FADED")) {
			n = "OM";
		}
		
		if (n.equals("FANCY")) {
			n = "NI";
		}
		
		if (n.equals("FROSTY")) {
			n = "GO";
		}
		
		if (n.equals("CRUMPLED")) {
			n = "YU";
		}
		
		if (n.equals("SMOOTH")) {
			n = "JI";
		}
		
		if (n.equals("DUSTY")) {
			n = "RA";
		}
		
		if (n.equals("STAINED")) {
			n = "SHI";
		}
		
		if (n.equals("BULBS")
			|| n.equals("BULB")) {
			n = "PLAQUE";
		}
		
		if (n.equals("BANNER")) {
			n = "SIGN";
		}
		
		if (n.equals("CHIPPENDALE")) {
			n = "MIRROR";
		}
		
		if (n.equals("WATER")) {
			n = "POND";
		}

		if (n.equals("KERNEL")) {
			n = "CORN";
		}
		
		if (n.equals("POLE")) {
			n = "ROD";
		}
		
		if (n.equals("LANDLINE")) {
			n = "PHONE";
		}
		
		noun.setLength(0);
		noun.append(n);
	}
	
	private static void simplifyVerb(String v) {
		if (v.equals("LICK")
		|| v.equals("TASTE")
		|| v.equals("FEEL")
		|| v.equals("BREAK")
		|| v.equals("CUT")
		|| v.equals("SMASH")
		|| v.equals("CRUSH")
		|| v.equals("DESTROY")
		|| v.equals("RUB")
		|| v.equals("TOUCH")) {
			v = "UNUSED";
		}
		
		if (v.equals("WALK")
		|| v.equals("RUN")) {
			v = "GO";
		}
		
		if (v.equals("N")) {
			v = "NORTH";
		}

		if (v.equals("S")) {
			v = "SOUTH";
		}
		
		if (v.equals("E")) {
			v = "EAST";
		}
		
		if (v.equals("W")) {
			v = "WEST";
		}
		
		if (v.equals("NE")) {
			v = "NORTHEAST";
		}

		if (v.equals("SE")) {
			v = "SOUTHEAST";
		}
		
		if (v.equals("NW")) {
			v = "NORTHWEST";
		}
		
		if (v.equals("SW")) {
			v = "SOUTHWEST";
		}
		
		if (v.equals("U")) {
			v = "UP";
		}
		
		if (v.equals("D")) {
			v = "DOWN";
		}
		
		if (v.equals("RW")) {
			v = "REWIND";
		}
		
		if (v.equals("FF")) {
			v = "FASTFORWARD";
		}
		
		if (v.equals("I")) {
			v = "INVENTORY";
		}
		
		if (v.equals("X")
			|| v.equals("INVESTIGATE")
			|| v.equals("CHECK")){
			v = "EXAMINE";
		}
		
		if (v.equals("L")){
			v = "LOOK";
		}
		
		if (v.equals("UNLOCK")){
			v = "OPEN";
		}
		
		if (v.equals("CLOSE")){
			v = "SHUT";
		}
		
		if (v.equals("CALL")){
			v = "DIAL";
		}
		
		if (v.equals("GET")
		|| v.equals("OBTAIN")
		|| v.equals("CATCH")
		|| v.equals("GRAB")) {
			v = "TAKE";
		}
		
		if (v.equals("THROW")
		|| v.equals("TOSS")) {
			v = "DROP";
		}
		
		if (v.equals("OK")
		|| v.equals("OKAY")
		|| v.equals("K")
		|| v.equals("KAY")
		|| v.equals("KK")
		|| v.equals("ALRIGHT")
		|| v.equals("FINE")
		|| v.equals("SURE")
		|| v.equals("SURE THING")
		|| v.equals("SURE THANG")
		|| v.equals("YES")
		|| v.equals("YEAH")
		|| v.equals("YEA")
		|| v.equals("YE")
		|| v.equals("Y")
		|| v.equals("YA")
		|| v.equals("ALLRIGHT")
		|| v.equals("AFFIRMATIVE")
		|| v.equals("ALL RIGHT")
		|| v.equals("VERY WELL")
		|| v.equals("BY ALL MEANS")
		|| v.equals("CERTAINLY")
		|| v.equals("ABSOLUTELY")
		|| v.equals("INDEED")
		|| v.equals("AGREED")
		|| v.equals("ROGER")
		|| v.equals("AYE")
		|| v.equals("AY")
		|| v.equals("AYE AYE")
		|| v.equals("YAH")
		|| v.equals("YEP")
		|| v.equals("YUP")
		|| v.equals("RIGHTO")
		|| v.equals("WHY NOT")
		|| v.equals("SURELY")) {
			v = "YES";
		}
					
		if (v.equals("NO")
		|| v.equals("NO INDEED")
		|| v.equals("ABSOLUTELY NOT")
		|| v.equals("MOST CERTAINLY NOT")
		|| v.equals("OF COURSE NOT")
		|| v.equals("UNDER NO CIRCUMSTANCES")
		|| v.equals("BY NO MEANS")
		|| v.equals("NOT AT ALL")
		|| v.equals("NEGATIVE")
		|| v.equals("NEGATIVO")
		|| v.equals("NEVER")
		|| v.equals("NOT REALLY")
		|| v.equals("NO THANKS")
		|| v.equals("NAE")
		|| v.equals("NOPE")
		|| v.equals("NA")
		|| v.equals("NAH")
		|| v.equals("NOT ON YOUR LIFE")
		|| v.equals("NO WAY")
		|| v.equals("NO WAY JOSE")
		|| v.equals("NOT ON YOUR NELLY")
		|| v.equals("NO SIR")
		|| v.equals("NO SIREE")
		|| v.equals("NAW")
		|| v.equals("NOTHING")
		|| v.equals("NAY")) {
			v = "NO";
		}
		
		if (v.equals("BIZ")) {
			v = "BUSINESS";
		}
		
		if (v.equals("APPOINTMENT")
		|| v.equals("APT")
		|| v.equals("APPT")
		|| v.equals("LESSON")
		|| v.equals("FORMER")
		|| v.equals("INDEPTH")) {
			v = "SCHEDULE";
		}
		
		if (v.equals("FREE")
		|| v.equals("LATTER")
		|| v.equals("CONSULT")
		|| v.equals("CONSULTATION")) {
			v = "PHONE";
		}
		
		if (v.equals("CYA")
		|| v.equals("GOODBYE")
		|| v.equals("SEEYA")
		|| v.equals("SAYONARA")
		|| v.equals("LATER")
		|| v.equals("LEAVE")
		|| v.equals("STOP")
		|| v.equals("END")
		|| v.equals("EXIT")
		|| v.equals("FINISHED")
		|| v.equals("DONE")
		|| v.equals("FINISH")) {
			v = "BYE";
		}
		
		if (v.equals("CUP")
		|| v.equals("SIP")
		|| v.equals("DRINK")) {
			v = "TEA";
		}
		
		if (v.equals("YOU")
		|| v.equals("HRU")
		|| v.equals("SUP")
		|| v.equals("WHADDUP")
		|| v.equals("ASK")
		|| v.equals("OGENKIDESUKA")
		|| v.equals("HISACHI")
		|| v.equals("YOURSELF")
		|| v.equals("U")
		|| v.equals("TOD")) {
			v = "ICHIRO";
		}
		
		if (v.equals("OUTAGE")
		|| v.equals("ELECTRICITY")
		|| v.equals("LIGHTS")
		|| v.equals("HEAT")
		|| v.equals("AIR")
		|| v.equals("CONDITIONER")
		|| v.equals("AC")
		|| v.equals("BULB")
		|| v.equals("BULBS")
		|| v.equals("LIGHT")
		|| v.equals("PLAQUE")
		|| v.equals("PLAQUES")
		|| v.equals("POST")
		|| v.equals("SLATE")
		|| v.equals("METAL")
		|| v.equals("HELP")) {
			v = "POWER";
		}
		
		if (v.equals("SCROLLS")) {
			v = "SCROLL";
		}
		
		if (v.equals("YANK")) {
			v = "PULL";
		}
		
		if (v.equals("SWALLOW")
		|| v.equals("CONSUME")) {
			v = "EAT";
		}
		
		
		
		if (v.equals("BAIT")
		|| v.equals("HOOK")
		|| v.equals("ATTACH")) {
			v = "PUT";
		}
		
		if (v.equals("HERE")
		|| v.equals("PLACE")
		|| v.equals("LOCATION")
		|| v.equals("WHERE")
		|| v.equals("PATH")
		|| v.equals("PATHS")
		|| v.equals("CLUE")
		|| v.equals("HINT")
		|| v.equals("MAP")
		|| v.equals("WORLD")
		|| v.equals("SHRINE")
		|| v.equals("HONDO")) {
			v = "TEMPLE";
		}
		
		if (v.equals("YELL")
		|| v.equals("SPEAK")
		|| v.equals("UTTER")
		|| v.equals("VOICE")
		|| v.equals("TELL")
		|| v.equals("DECLARE")
		|| v.equals("STATE")
		|| v.equals("ACCOUNCE")
		|| v.equals("REMARK")
		|| v.equals("COMMENT")
		|| v.equals("ANSWER")
		|| v.equals("REPLY")
		|| v.equals("SCREAM")
		|| v.equals("STATE")
		|| v.equals("STATE")
		|| v.equals("STATE")
		|| v.equals("STATE")
		|| v.equals("STATE")
		|| v.equals("STATE")
		|| v.equals("EXCLAIM")) {
			v = "SAY";
		}
		
		if (v.equals("PUSH")){
			v = "PRESS";
		}
		
		interruptInput(v);
	}
	
	public static void interruptInput(String v) {
		if (Player.facingReaper) {
			World.handleReaper(v);
		} else if (v.equals("UNUSED")) {
			Story.print("You don't need to do that in this game.");
		} else if (Data.gameOver) { 
			Data.handleGameOver(v);
		} else if (Player.onPhone) {
			if (v.equals("HANG")) {
				Action.hang(noun.toString());
			} else {
				World.handleKimi(v);
			}
		} else if (Player.meditating) {
			Player.handleMeditating(v);
		} else {
			handleInput(v);
		}
	}
	
	public static void handleInput(String v) {
		switch (v) {
			case "MEDITATE":
				Action.meditate();
				break;
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
			case "HANG":
				Action.hang(noun.toString());
				break;
			case "VISUALIZE":
				Story.printNotMeditating();
				break;
			case "CHANT":
				Story.printNotMeditating();
				break;
			case "PRESS":
				Action.press(noun.toString());
				break;
			case "PULL":
				Action.pull(noun.toString());
				break;
			case "REWIND":
				Action.pressRewind();
				break;
			case "FASTFORWARD":
				Action.pressFastforward();
				break;
			case "PLAY":
				Action.pressPlay();
				break;
			case "MOVE":
				Action.move(noun.toString());
				break;
			case "DIAL":	
				if (Player.inventory.contains(Item.phone)) {
					Action.dial(noun.toString());
				} else {
					Story.print("You're not holding an item that can do that.");
				}
				break;
			default:
				Story.invalid();
				break;
		}
	}
}

