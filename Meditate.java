import java.util.ArrayList;

public class Meditate {
	public static ArrayList<String> chantInputs = new ArrayList();
	
	public static void trance() {
		
	}
	
	public static void handleMeditating(String v) {
		switch (v) {
			case "VISUALIZE":
				visualize(Parser.noun.toString());
				break;
			case "CHANT":
				chant(Parser.noun.toString());
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
				Player.meditating = false;
				Story.printDoneMeditating();
				Parser.handleInput(v);
				break;
		}
	}
	
	public static void visualize(String n) {
		switch (n) {
			case "":
				Story.print("What do you want to visualize?");
				break;
			case "LOTUS":
				if (Player.memory.contains("Lotus")) {
					if (!Player.visualizingLotus) {
						Player.visualizingFish = false;						
						Player.visualizingKnot = false;						
						Player.visualizingLotus = true;	
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
					if (!Player.visualizingFish) {
						Player.visualizingLotus = false;						
						Player.visualizingKnot = false;						
						Player.visualizingFish = true;	
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
					if (!Player.visualizingKnot) {
						Player.visualizingLotus = false;						
						Player.visualizingFish = false;						
						Player.visualizingKnot = true;
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
}