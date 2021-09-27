public class NPC {
	public static boolean scheduled;
	public static boolean reaperMoved;
	
	public static String kimiState = "";
	public static String todState = "content";
	
	public static void handleReaper(String a) {
		if (Parser.sentence.contains(Integer.toString(Data.year))) {
			// correct answer
			World.reaperDisabled = true;
			Player.facingReaper = false;
			Story.printSamadhi1();
		} else {
			// incorrect answer
			Story.printReaperWrong();
			Player.facingReaper = false;
			
			if (!Player.guesses.contains(a))
				Player.guesses.add(a);
			
			Data.checkGuesses();
			Data.deaths++;
		}
	}
	
	public static void handleKimi(String v) {
		switch (getKimi()) {
			case "moshi":
				if (v.equals("DANCE") || v.equals("NARRATIVE") || v.equals("REIKI") || v.equals("THERAPY")) {
					Story.printKimiNeedSch();
					setKimi("needSch");
				} else if (v.equals("MEDITATION") || v.equals("INSTRUCTION") || v.equals("KNOWLEDGE")) {
					Story.printKimiSchOrPho();
					setKimi("schOrPho");
				} else {
					Story.printKimiBiz();
					setKimi("biz");
				}
				break;
			case "biz":
				// business or personal
				if (v.equals("BUSINESS")) {
					Story.printKimiRight();
					setKimi("right");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "right":
				if (v.equals("REMEDY")) {
					Story.printKimiNeedSch();
					setKimi("needSch");
				} else if (v.equals("KNOWLEDGE")) {
					Story.printKimiSchOrPho();
					setKimi("schOrPho");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "needSch":
				if (v.equals("YES")) {
					if (scheduled) {
						Story.printKimiNoSch();
						setKimi("anythingElse");
					} else {
						Story.printKimiHaveOpening();
						setKimi("haveOpening");
					}
				} else if (v.equals("NO")) { 
					Story.printKimiSorry();
					setKimi("anythingElse");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "haveOpening":
				if (v.equals("YES")) {
					scheduled = true;
					Story.printKimiAnythingElse();
					setKimi("anythingElse");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "anythingElse":
				if (v.equals("YES")) {
					Story.printKimiBiz();
					setKimi("biz");
				} else if (v.equals("DANCE") || v.equals("NARRATIVE") || v.equals("REIKI") || v.equals("THERAPY")) {
					Story.printKimiNeedSch();
					setKimi("needSch");
				} else if (v.equals("MEDITATION") || v.equals("INSTRUCTION") || v.equals("KNOWLEDGE")) {
					Story.printKimiSchOrPho();
					setKimi("schOrPho");
				} else if (v.equals("NO")) {
					Story.printKimiBye();
					Player.onPhone = false;
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			case "schOrPho":
				if (v.equals("SCHEDULE")) {
					if (scheduled) {
						Story.printKimiNoSch();
						setKimi("anythingElse");
					} else {
						Story.printKimiHaveOpening();
						setKimi("haveOpening");
					}
				} else if (v.equals("PHONE")) {
					Story.printKimiWisdom();
					setKimi("anythingElse");
				} else {
					Story.printKimiWrong();
					setKimi("anythingElse");
				}
				break;
			default:
				System.out.println("NPC.handleKimi() error");
				break;
			
		}
	}
	
	public static void setKimi(String s) {
		kimiState = s;
	}
	
	public static String getKimi() {
		return kimiState;
	}
	
	public static void removeDuplicateHisachis() {
		int count = 0;
		
		for (String s : Parser.sentence) {
			if (s.equals("HISACHI"))
				count++;
		}
		
		for (int i = 0; i < count - 1; i++) {
			Parser.sentence.remove("HISACHI");
		}
	}
	
	public static void handleTod(String w) {
		removeDuplicateHisachis();
		
		switch (getTod()) {
			case "content":
				if (w.equals("ASK")) {
					askTod();
				} else if (w.equals("HI")) {
					Story.print("He smiles.");
				} else if (w.equals("HISACHI")) {
					Story.print(Story.tod2);
				} else if (w.equals("POWER")) {
					Story.print(Story.tod3);
				} else if (w.equals("TEMPLE")) {
					Story.print(Story.tod2);
				} else if (w.equals("SCROLL")) {
					askTodAboutScroll();
				} else if (w.equals("TEA")) {
					Story.print("\"It should be cooled off by now,\" he says, taking a sip of his own.");
				} else if (w.equals("DRINK")) {
					Story.print("You sip the tea. It's quite good.");
					Player.sipped = true;
				} else if (w.equals("GIVE")) {
					if (Parser.sentence.contains("SCROLL")) {
						askTodAboutScroll();
					} else {
						Story.print(Story.tod8); // tod's confused
					}
				} else if (w.equals("HYPNOTIZE")) {
					hypnotize();
				} else if (w.equals("TAKE")) {
					Action.take(Parser.sentence.get(1));
				} else if (w.equals("EXAMINE")) {
					Action.examine(Parser.sentence.get(1));
				} else {
					Story.print(Story.tod8); // tod's confused
				}
				break;
			case "proposing":
				if (w.equals("YES") || (w.equals("SAY") && Parser.sentence.get(1).equals("YES"))) {
					hypnotize();
				} else {
					Story.print(Story.tod6);
					setTod("content");
				}
				break;
			default:
				System.out.println("NPC.handleTod() error");
				break;
			
		}
	}
	
	private static void askTod() {
		if (Parser.sentence.get(1).equals("")) {
			Story.printMissingNoun();
		} else if (Parser.sentence.get(1).equals("HISACHI") && Parser.sentence.get(2).equals("")) {
			Story.print(Story.tod2); // ask ichiro about himself			
		} else if (Parser.sentence.get(1).equals("HISACHI") && Parser.sentence.get(2).equals("POWER")) {
			Story.print(Story.tod3);
		} else if (Parser.sentence.get(1).equals("HISACHI") && Parser.sentence.get(2).equals("TEMPLE")) {
			Story.print(Story.tod2);			
		} else if (Parser.sentence.get(1).equals("HISACHI") && Parser.sentence.get(2).equals("SCROLL")) {
			askTodAboutScroll();			
		} else if (Parser.sentence.get(1).equals("HISACHI") && (Parser.sentence.get(2).equals("TEA") || Parser.sentence.get(2).equals("DRINK"))) {
			Story.print("\"It should be cooled off by now,\" he says, taking a sip of his own.");			
		} else if (Parser.sentence.get(1).equals("POWER")) {
			Story.print(Story.tod3);	
		} else if (Parser.sentence.get(1).equals("TEMPLE")) {
			Story.print(Story.tod2);
		} else if (Parser.sentence.get(1).equals("SCROLL")) {
			askTodAboutScroll();			
		} else if (Parser.sentence.get(1).equals("TEA") || Parser.sentence.get(2).equals("DRINK")) {
			Story.print("\"It should be cooled off by now,\" he says, taking a sip of his own.");			
		} else {
			Story.print(Story.tod8);
		}
	}
	
	private static void askTodAboutScroll() {
		Story.print(Story.tod4a);
					
		if (Player.sipped) {
			Story.print(Story.tod4c);
		} else {
			Story.print(Story.tod4b);
		}
		
		Story.print(Story.tod4d);
		setTod("proposing");
	}
	
	public static void setTod(String s) {
		todState = s;
	}
	
	public static String getTod() {
		return todState;
	}
	
	private static void hypnotize() {
		Story.print(Story.tod5);
		Player.savePurpleInventory();
		Player.inventory.clear();
		Player.updateLocation(Room.gardenPatio);
		Player.dreaming = true;
		World.XOO = false;
		World.OOO = true;
	}
}