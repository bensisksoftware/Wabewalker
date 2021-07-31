import java.util.ArrayList;

public class Meditate {
	public static boolean visualizingLotus;
	public static boolean visualizingFish;
	public static boolean visualizingKnot;
	public static boolean trancedGarden;
	public static boolean trancedHouse;
	public static boolean trancedTemple;
	
	public static int trancesTranced = 0;
	public static int gardenTrance = 0;
	public static int houseTrance = 0;
	public static int templeTrance = 0;
	
	public static ArrayList<String> chantInputs = new ArrayList();
	public static ArrayList<String> gChant = new ArrayList();
	public static ArrayList<String> hChant = new ArrayList();
	public static ArrayList<String> tChant = new ArrayList();
	
	public static void setShrines() {
		gChant.add("ni");
		gChant.add("yu");
		gChant.add("ji");
		gChant.add("om");
		gChant.add("om");
		gChant.add("shi");
		gChant.add("shi");
		gChant.add("ji");
		gChant.add("shi");
		gChant.add("ra");
		gChant.add("om");
		gChant.add("go");
		gChant.add("shi");
		gChant.add("shi");
		
		hChant.add("go");
		hChant.add("ji");
		hChant.add("go");
		hChant.add("ji");
		hChant.add("yu");
		hChant.add("ra");
		hChant.add("shi");
		hChant.add("om");
		hChant.add("ji");
		hChant.add("go");
		hChant.add("ji");
		hChant.add("ni");
		hChant.add("ra");
		hChant.add("shi");
		
		tChant.add("om");
		tChant.add("ra");
		tChant.add("yu");
		tChant.add("ni");
		tChant.add("shi");
		tChant.add("yu");
		tChant.add("ra");
		tChant.add("go");
		tChant.add("ni");
		tChant.add("yu");
		tChant.add("ji");
		tChant.add("shi");
		tChant.add("yu");
		tChant.add("ra");
	}
	
	public static void handleMeditating(String v) {
		switch (v) {
			case "VISUALIZE":
				visualize(Parser.sentence.get(1));
				break;
			case "CHANT":
				chant(Parser.sentence.get(1));
				break;
			case "LOTUS":
				visualize("LOTUS");
				break;
			case "FISH":
				visualize("FISH");
				break;
			case "KNOT":
				visualize("KNOT");
				break;
			case "OM":
				chant("OM");
				break;
			case "NI":
				chant("NI");
				break;
			case "GO":
				chant("GO");
				break;
			case "YU":
				chant("YU");
				break;
			case "JI":
				chant("JI");
				break;
			case "RA":
				chant("RA");
				break;
			case "SHI":
				chant("SHI");
				break;
			default:
				stopMeditating();
				Parser.handleInput(v);
				break;
		}
	}
	
	private static void stopMeditating() {
		Player.meditating = false;
		visualizingLotus = false;
		visualizingFish = false;
		visualizingKnot = false;
		chantInputs.clear();
		Story.printDoneMeditating();
	}
	
	public static void visualize(String n) {
		switch (n) {
			case "":
				Story.print("What do you want to visualize?");
				break;
			case "LOTUS":
				if (Player.memory.contains("Lotus")) {
					if (!visualizingLotus) {
						visualizingFish = false;						
						visualizingKnot = false;						
						visualizingLotus = true;	
						Story.printVisualize("lotus");
					} else {
						Story.printAlreadyVisualizing();
					}
				} else {
					Story.printNotMemorized();
				}
				break;
			case "FISH":
				if (Player.memory.contains("Fish")) {
					if (!visualizingFish) {
						visualizingLotus = false;						
						visualizingKnot = false;						
						visualizingFish = true;	
						Story.printVisualize("fish");						
					} else {
						Story.printAlreadyVisualizing();
					}
				} else {
					Story.printNotMemorized();
				}
				break;
			case "KNOT":
				if (Player.memory.contains("Knot")) {
					if (!visualizingKnot) {
						visualizingLotus = false;						
						visualizingFish = false;						
						visualizingKnot = true;
						Story.printVisualize("knot");
					} else {
						Story.printAlreadyVisualizing();
					}
				} else {
					Story.printNotMemorized();
				}
				break;
			default:
				Story.printNotMemorized();
				break;
		}
	}
	
	public static void chant(String c) {
		switch (c) {
			case "":
				Story.print("Chant what?");
				break;
			case "OM":
				if (Player.memory.contains("om")) {
					Story.print("\"...Ommm...\"");
					chantInputs.add("om");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "NI":
				if (Player.memory.contains("ni")) {
					Story.print("\"...Niii...\"");
					chantInputs.add("ni");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "GO":
				if (Player.memory.contains("go")) {
					Story.print("\"...Gooo...\"");
					chantInputs.add("go");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "YU":
				if (Player.memory.contains("yu")) {
					Story.print("\"...Yuuu...\"");
					chantInputs.add("yu");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "JI":
				if (Player.memory.contains("ji")) {
					Story.print("\"...Jiii...\"");
					chantInputs.add("ji");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "RA":
				if (Player.memory.contains("ra")) {
					Story.print("\"...Raaa...\"");
					chantInputs.add("ra");
				} else {
					Story.printNotMemorized();
				}
				break;
			case "SHI":
				if (Player.memory.contains("shi")) {
					Story.print("\"...Shiii...\"");
					chantInputs.add("shi");
				} else {
					Story.printNotMemorized();
				}
				break;
			default:
				Story.printNotMemorized();
				break;
		}
	}
	
	public static void checkShrine() {
		// shift chants in arraylist to the left if list > max
		if (chantInputs.size() > 14) {
			for(int i = 0; i < chantInputs.size() - 1; i++) {
				chantInputs.set(i, chantInputs.get(i + 1)); 
			}
			
			chantInputs.remove(chantInputs.size() - 1);
		}
		
		if (visualizingKnot) {
			System.out.println("Player is visualizing knot");
		} else if (visualizingFish) {
			System.out.println("Player is visualizing fish");
		} else if (visualizingLotus) {
			System.out.println("Player is visualizing lotus");
		} else {
			System.out.println("Player is NOT visualizing");
		}
		
		if (chantInputs.equals(gChant) || chantInputs.equals(hChant) || chantInputs.equals(tChant)) {
			System.out.println("chant is correct");
		} else {
			System.out.println("chant is NOT correct");
		}
		
		System.out.println("pChant " + chantInputs);
		
		if ((Player.getLocation().title.equals("Shrine Room 1")
			&& chantInputs.equals(gChant)
			&& visualizingKnot) 
		||	(Player.getLocation().title.equals("Shrine Room 2")
			&& chantInputs.equals(hChant)
			&& visualizingLotus) 
		||	(Player.getLocation().title.equals("Shrine Room 3")
			&& chantInputs.equals(tChant)
			&& visualizingFish)) {
				trance();
		} else {
			System.out.println("still meditating");
		}
	}
	
	public static void trance() {
		System.out.println("Trance baby, Trance.");
		
		if (Player.getLocation().title.equals("Shrine Room 1")) {
			if (trancedGarden) {
				Story.printTrance(gardenTrance);
			} else {
				Story.printTrance(trancesTranced + 1);
				gardenTrance = trancesTranced + 1;
				trancedGarden = true;
				trancesTranced++;
				Data.updateScore(10);
			}
		}
		
		if (Player.getLocation().title.equals("Shrine Room 2")) {
			if (trancedHouse) {
				Story.printTrance(houseTrance);
			} else {
				Story.printTrance(trancesTranced + 1);
				houseTrance = trancesTranced + 1;
				trancedHouse = true;
				trancesTranced++;
				Data.updateScore(10);
			}
		}
		
		if (Player.getLocation().title.equals("Shrine Room 3")) {
			if (trancedTemple) {
				Story.printTrance(templeTrance);
			} else {
				Story.printTrance(trancesTranced + 1);
				templeTrance = trancesTranced + 1;
				trancedTemple = true;
				trancesTranced++;
				Data.updateScore(10);
			}
		}
		
		Player.meditating = false;
		visualizingLotus = false;
		visualizingFish = false;
		visualizingKnot = false;
		chantInputs.clear();
	}
}