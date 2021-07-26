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
		
		eraseSpaces();
		
		createSentence();
		
		passInput();
		
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
		System.out.println(sentence);
	}
	
	private static void removeExtraWords() {
		for (int i = 0; i < Thesaurus.extraWords.size(); i++) {
			while (sentence.contains(Thesaurus.extraWords.get(i)))
				sentence.remove(Thesaurus.extraWords.get(i));
		}
	}
	
	public static void passInput() {
		if (Player.facingReaper) {
			NPC.handleReaper(sentence.get(0));
		} else if (sentence.get(0).equals("UNUSED")) {
			Story.print("You don't need to do that in this game.");
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
			Meditate.checkShrine();
		} else {
			handleInput(sentence.get(0));
		}
	}
	
	public static void handleInput(String w) {
		switch (w) {
			case "HELP":
				Story.printHelp();
				break;
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
			case "DROP":
				Action.drop(sentence.get(1));
				break;
			case "LOOK":
				Action.look();
				break;
			case "EXAMINE":
				if (World.dark) {
					if (sentence.get(1).equals("HOLE")) {
						Action.examine("HOLE");
					} else {
						Story.printTooDark();
					}
				} else {
					Action.examine(sentence.get(1));
				}
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
			case "CAST":
				Action.cast(sentence.get(1));
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
				if (Player.inventory.contains(Item.phone)) {
					Action.dial(sentence.get(1));
				} else {
					Story.print("You're not holding an item that can do that.");
				}
				break;
			case "REEL":
				Action.reel(sentence.get(1));
				break;
			case "FIGHT":
				Action.fight(sentence.get(1));
				break;
			default:
				Story.invalid();
				break;
		}
	}
}

