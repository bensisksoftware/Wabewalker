public class NPC {
	public static boolean scheduled;
	
	public static String kimiState = "";
	public static String todState = "content";
	
	public static void handleReaper(String w) {
		if (Parser.sentence.contains(Data.yearToString())) {
			// correct answer
			
		} else {
			// incorrect answer
			Story.printReaperWrong();
			Player.facingReaper = false;
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
	
	public static void handleTod(String w) {
		switch (getTod()) {
			case "content":
				if (w.equals("ASK")) {
					
				}
				
				
				if (w.equals("ICHIRO")) {
					Story.print(Story.tod2);
				} else if (w.equals("POWER") || w.equals("HELP")) {
					Story.print(Story.tod3);
				} else if (w.equals("SCROLL")) {
					Story.print(Story.tod4a);
					
					if (Player.sipped) {
						Story.print(Story.tod4c);
					} else {
						Story.print(Story.tod4b);
					}
					
					Story.print(Story.tod4d);
					setTod("proposing");
				} else if (w.equals("TEA")) {
					Story.print("\"It should be cooled off by now,\" he says, taking a sip of his own.");
				} else if (w.equals("DRINK")) {
					Story.print("You sip the tea. It's quite good.");
				} else {
					Story.print(Story.tod8);
				}
				break;
			case "proposing":
				if (w.equals("YES")) {
					Story.print(Story.tod5);
					Player.savePurpleInventory();
					Player.updateLocation(Room.gardenPatio);
					Player.dreaming = true;
					World.XOO = false;
					World.OOO = true;
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
	
	public static void setTod(String s) {
		todState = s;
	}
	
	public static String getTod() {
		return todState;
	}
	
}