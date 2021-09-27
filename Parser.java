import java.util.ArrayList;

public class Parser {
	public static StringBuilder input = new StringBuilder("");
	public static StringBuilder verb = new StringBuilder("");
	public static StringBuilder noun = new StringBuilder("");
	
	public static ArrayList<String> sentence = new ArrayList<String>();
	
	public static void submitInput() {
		Data.moves++;
		Story.newParagraph();
		Story.printInput();
		setInput();
		resetInput();
		
		if (validInput()) {
			eraseSpaces();
			createSentence();
			passInput();
			Story.setScrollbar();
		}
	}
	
	public static void setInput() {
		input.setLength(0);
		input.append(Wabewalker.inputBox.getText().toUpperCase());
	}
	
	public static void resetInput() {
		Wabewalker.inputBox.setText("");
	}
	
	private static boolean validInput() {
		int c = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ')
				c++;
		}
		
		if (c == 0) {
			return false;
		} else {
			return true;
		}
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
		
		// delete duplicate spaces
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == ' ' && input.charAt(i + 1) == ' ') {
				shiftChars(i);
			}
		}
		
		input.trimToSize();
	}
	
	private static void shiftChars(int c) {
		for (int i = c; i < input.length() - 1; i++) {
			input.setCharAt(i, input.charAt(i + 1));
		}
		
		input.setLength(input.length() - 1);
		eraseSpaces();
	}
	
	private static void createSentence() {
		StringBuilder word = new StringBuilder("");
		
		sentence.clear();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				sentence.add(Thesaurus.translate(word.toString()));
				word.setLength(0);
			} else {
				if (i == input.length() - 1) {
					word.append(input.charAt(i));
					sentence.add(Thesaurus.translate(word.toString()));
				} else {
					word.append(input.charAt(i));
				}
			}
		}

		removeExtraWords();
		sentence.add(""); // adds empty String to end of Sentence so program can easily know it is the end of the sentence.
	}
	
	private static void removeExtraWords() {
		for (int i = 0; i < Thesaurus.extraWords.size(); i++) {
			while (sentence.contains(Thesaurus.extraWords.get(i)))
				sentence.remove(Thesaurus.extraWords.get(i));
		}
		
		// if player says "HISACHI ICHIRO" reduce it to just "ICHIRO"
		for (int i = 0; i < sentence.size() - 1; i++) {
			if (sentence.get(i).equals("ICHIRO") && sentence.get(i + 1).equals("ICHIRO")) {
				sentence.remove(i);
			}
		}
	}
	
	public static void passInput() {
		if (Story.restartRestoreOrQuit) {
			Story.handleQuestion(sentence.get(0));
		} else if  (Data.yesOrNo) {
			Data.yesOrNo(sentence.get(0));
		} else if (Player.facingReaper) {
			NPC.handleReaper(sentence.get(0));
		} else if (sentence.contains("UNUSED")) {
			Story.printUnused();
		} else if (Data.gameOver) { 
			Data.handleGameOver(sentence.get(0));
		} else if (Player.onPhone) {
			if (sentence.get(0).equals("HANG")) {
				Action.hang(sentence.get(1).toString());
			} else {
				NPC.handleKimi(sentence.get(0));
			}
		} else if (Player.getLocation().title.equals("Hisachi Ichiro's House")) {
			NPC.handleTod(sentence.get(0));
		} else if (Player.meditating) {
			Meditate.handleMeditating(sentence.get(0));
		} else {
			handleInput(sentence.get(0));
		}
	}
	
	public static void handleInput(String w) {
		if (!w.equals("HINT"))
			Data.hint = 1;
		
		switch (w) {
			case "HELP":
				Story.printHelp();
				break;
			case "BRIEF":
				Story.brief(true);
				break;
			case "VERBOSE":
				Story.brief(false);
				break;
			case "MEDITATE":
				Action.meditate();
				break;
			case "NORTH":
				if (Room.getExits().contains("N")) {
					Action.goNorth();
				} else {
					Room.noExit("NORTH");
				}
				break;
			case "SOUTH":
				if (Room.getExits().contains("S")) {
					Action.goSouth();
				} else {
					Room.noExit("SOUTH");
				}
				break;
			case "EAST":
				if (Room.getExits().contains("E")) {
					Action.goEast();
				} else {
					Room.noExit("EAST");
				}	
				break;
			case "WEST":
				if (Room.getExits().contains("W")) {
					Action.goWest();
				} else {
					Room.noExit("WEST");
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
				Action.go(sentence.get(1));
				break;
			case "WAIT":
				Action.passTime();
				break;
			case "INVENTORY":
				Action.checkInventory();
				break;
			case "MEMORY":
				Story.printMemory();
				break;
			case "TAKE":
				Action.take(sentence.get(1));
				break;
			case "PICK":
				Action.pick(sentence.get(1));
				break;
			case "DROP":
				Action.drop(sentence.get(1));
				break;
			case "EXAMINE":
				Action.attemptToExamine(sentence.get(1));
				break;
			case "OPEN":
				Action.open(sentence.get(1));
				break;
			case "SHUT":
				Action.shut(sentence.get(1));
				break;
			case "HANG":
				Action.hang(sentence.get(1));
				break;
			case "VISUALIZE":
				Story.printNotMeditating();
				break;
			case "CHANT":
				Story.printNotMeditating();
				break;
			case "PRESS":
				Action.press(sentence.get(1));
				break;
			case "PULL":
				Action.pull(sentence.get(1));
				break;
			case "PUT":
				Action.put(sentence.get(1));
				break;
			case "SAY":
				Action.say();
				break;
			case "CAST":
				Action.cast(sentence.get(1));
				break;
			case "HIDE":
				Story.print("Despite your best efforts to hide yourself, you end up completely exposed.");
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
				Action.move(sentence.get(1));
				break;
			case "DIAL":	
				if (Player.inventory.contains(Item.Phone.getTitle())) {
					Action.dial(sentence.get(1));
				} else {
					Story.print("You're not holding an item that can do that.");
				}
				break;
			case "FIGHT":
				Action.fight(sentence.get(1));
				break;
			case "CHEAT":
				Data.cheat();
				break;
			case "DIE":
				Story.printHow();
				break;
			case "SIT":
				Action.sit(sentence.get(1));
				break;
			case "DANCE":
				Story.printDance();
				break;
			case "SLEEP":
				Story.print("You're wide awake, and full of energy!");
				break;
			case "EAT":
				Action.eat(sentence.get(1));
				break;
			case "BACK":
				Room.checkPreviousLocation();
				break;
			case "EXIT":
				Action.exit(sentence.get(1));
				break;
			case "ENTER":
				Action.enter(sentence.get(1));
				break;
			case "DESTROY":
				Action.destroy(sentence.get(1));
				break;
			case "CREDITS":
				Story.printCredits();
				break;
			case "HINT":
				Story.printHint(sentence.get(1));
				break;
			case "KNOCK":
				Item.door.knock();
				break;
			case "CLIMB":
				Story.print("You quickly find out that you are a terrible climber.");
				break;
			case "FOLLOW":
				Story.print("Try using a direction instead. For example, you can type GO NORTH.");
				break;
			case "RESTART":
				Data.confirmNewGame();
				break;
			case "SAVE":
				Data.attemptToSaveGame();
				break;
			case "RESTORE":
				Data.attemptToRestoreGame();
				break;
			default:
				Story.invalid();
				break;
		}
		
		World.eventAtEnd();
	}
}

