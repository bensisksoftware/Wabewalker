import java.util.ArrayList;

public class Thesaurus {
	public static ArrayList<String> extraWords = new ArrayList<String>();
	
	public static void addExtraWords() {
		extraWords.add("THE");
		extraWords.add("A");
		extraWords.add("AN");
		extraWords.add("SOME");
		extraWords.add("ALL");
		extraWords.add("TO");
		extraWords.add("ON");
		extraWords.add("WITH");
		extraWords.add("IN");
		extraWords.add("IT");
		extraWords.add("ABOUT");
		extraWords.add("SAY");
		extraWords.add("THAT");
	}
	
	public static String translate(String w) {
		if (w.equals("LICK")
		|| w.equals("TASTE")
		|| w.equals("FEEL")
		|| w.equals("BREAK")
		|| w.equals("CUT")
		|| w.equals("SMASH")
		|| w.equals("CRUSH")
		|| w.equals("DESTROY")
		|| w.equals("RUB")
		|| w.equals("TOUCH")) {
			w = "UNUSED";
		}
		
		if (w.equals("N")) {
			w = "NORTH";
		}

		if (w.equals("S")) {
			w = "SOUTH";
		}
		
		if (w.equals("E")) {
			w = "EAST";
		}
		
		if (w.equals("W")) {
			w = "WEST";
		}
		
		if (w.equals("NE")) {
			w = "NORTHEAST";
		}

		if (w.equals("SE")) {
			w = "SOUTHEAST";
		}
		
		if (w.equals("NW")) {
			w = "NORTHWEST";
		}
		
		if (w.equals("SW")) {
			w = "SOUTHWEST";
		}
		
		if (w.equals("FADED")) {
			w = "OM";
		}
		
		if (w.equals("FANCY")) {
			w = "NI";
		}
		
		if (w.equals("FROSTY")) {
			w = "GO";
		}
		
		if (w.equals("CRUMPLED")) {
			w = "YU";
		}
		
		if (w.equals("SMOOTH")) {
			w = "JI";
		}
		
		if (w.equals("DUSTY")) {
			w = "RA";
		}
		
		if (w.equals("STAINED")) {
			w = "SHI";
		}
		
		if (w.equals("BULBS")
			|| w.equals("BULB")) {
			w = "PLAQUE";
		}
		
		if (w.equals("CRANE")
			|| w.equals("ORAGAMI")) {
			w = "CRANES";
		}
		
		if (w.equals("BANNER")) {
			w = "SIGN";
		}
		
		if (w.equals("CHIPPENDALE")) {
			w = "MIRROR";
		}
		
		if (w.equals("WATER")) {
			w = "POND";
		}

		if (w.equals("KERNEL")) {
			w = "CORN";
		}
		
		if (w.equals("POLE")
			|| w.equals("HOOK")
			|| w.equals("LINE")) {
			w = "ROD";
		}
		
		if (w.equals("ME")
			|| w.equals("SELF")) {
			w = "ROBE";
		}
		
		if (w.equals("LANDLINE")) {
			w = "PHONE";
		}
		
		if (w.equals("FIGURES")) {
			w = "FIGURE";
		}
		
		if (w.equals("GOLD")) {
			w = "CHEST";
		}
		
		if (w.equals("PLAQUES")) {
			w = "PLAQUE";
		}
		
		if (w.equals("JEWELED")) {
			w = "BOX";
		}
		
		if (w.equals("WALK")
		|| w.equals("RUN")) {
			w = "GO";
		}
		
		if (w.equals("N")) {
			w = "NORTH";
		}

		if (w.equals("S")) {
			w = "SOUTH";
		}
		
		if (w.equals("E")) {
			w = "EAST";
		}
		
		if (w.equals("W")) {
			w = "WEST";
		}
		
		if (w.equals("NE")) {
			w = "NORTHEAST";
		}

		if (w.equals("SE")) {
			w = "SOUTHEAST";
		}
		
		if (w.equals("NW")) {
			w = "NORTHWEST";
		}
		
		if (w.equals("SW")) {
			w = "SOUTHWEST";
		}
		
		if (w.equals("U")) {
			w = "UP";
		}
		
		if (w.equals("D")) {
			w = "DOWN";
		}
		
		if (w.equals("Z")) {
			w = "WAIT";
		}
		
		if (w.equals("RW")) {
			w = "REWIND";
		}
		
		if (w.equals("FF")) {
			w = "FASTFORWARD";
		}
		
		if (w.equals("I")) {
			w = "INVENTORY";
		}
		
		if (w.equals("X")
			|| w.equals("READ")
			|| w.equals("INVESTIGATE")
			|| w.equals("CHECK")){
			w = "EXAMINE";
		}
		
		if (w.equals("KILL")
			|| w.equals("COMBAT")
			|| w.equals("HIT")){
			w = "FIGHT";
		}
		
		if (w.equals("L")){
			w = "LOOK";
		}
		
		if (w.equals("UNLOCK")){
			w = "OPEN";
		}
		
		if (w.equals("CLOSE")){
			w = "SHUT";
		}
		
		if (w.equals("CALL")){
			w = "DIAL";
		}
		
		if (w.equals("GET")
		|| w.equals("OBTAIN")
		|| w.equals("CATCH")
		|| w.equals("GRAB")) {
			w = "TAKE";
		}
		
		if (w.equals("THROW")
		|| w.equals("TOSS")) {
			w = "DROP";
		}
		
		if (w.equals("OK")
		|| w.equals("OKAY")
		|| w.equals("K")
		|| w.equals("KAY")
		|| w.equals("KK")
		|| w.equals("ALRIGHT")
		|| w.equals("FINE")
		|| w.equals("SURE")
		|| w.equals("SURE THING")
		|| w.equals("SURE THANG")
		|| w.equals("YES")
		|| w.equals("YEAH")
		|| w.equals("YEA")
		|| w.equals("YE")
		|| w.equals("Y")
		|| w.equals("YA")
		|| w.equals("ALLRIGHT")
		|| w.equals("AFFIRMATIVE")
		|| w.equals("ALL RIGHT")
		|| w.equals("VERY WELL")
		|| w.equals("BY ALL MEANS")
		|| w.equals("CERTAINLY")
		|| w.equals("ABSOLUTELY")
		|| w.equals("INDEED")
		|| w.equals("AGREED")
		|| w.equals("ROGER")
		|| w.equals("AYE")
		|| w.equals("AY")
		|| w.equals("AYE AYE")
		|| w.equals("YAH")
		|| w.equals("YEP")
		|| w.equals("YUP")
		|| w.equals("RIGHTO")
		|| w.equals("WHY NOT")
		|| w.equals("SURELY")) {
			w = "YES";
		}
					
		if (w.equals("NO")
		|| w.equals("NO INDEED")
		|| w.equals("ABSOLUTELY NOT")
		|| w.equals("MOST CERTAINLY NOT")
		|| w.equals("OF COURSE NOT")
		|| w.equals("UNDER NO CIRCUMSTANCES")
		|| w.equals("BY NO MEANS")
		|| w.equals("NOT AT ALL")
		|| w.equals("NEGATIVE")
		|| w.equals("NEGATIVO")
		|| w.equals("NEVER")
		|| w.equals("NOT REALLY")
		|| w.equals("NO THANKS")
		|| w.equals("NAE")
		|| w.equals("NOPE")
		|| w.equals("NA")
		|| w.equals("NAH")
		|| w.equals("NOT ON YOUR LIFE")
		|| w.equals("NO WAY")
		|| w.equals("NO WAY JOSE")
		|| w.equals("NOT ON YOUR NELLY")
		|| w.equals("NO SIR")
		|| w.equals("NO SIREE")
		|| w.equals("NAW")
		|| w.equals("NOTHING")
		|| w.equals("NAY")) {
			w = "NO";
		}
		
		if (w.equals("BIZ")) {
			w = "BUSINESS";
		}
		
		if (w.equals("APPOINTMENT")
		|| w.equals("APT")
		|| w.equals("APPT")
		|| w.equals("LESSON")
		|| w.equals("FORMER")
		|| w.equals("INDEPTH")) {
			w = "SCHEDULE";
		}
		
		if (w.equals("FREE")
		|| w.equals("LATTER")
		|| w.equals("CONSULT")
		|| w.equals("CONSULTATION")) {
			w = "PHONE";
		}
		
		if (w.equals("CYA")
		|| w.equals("GOODBYE")
		|| w.equals("SEEYA")
		|| w.equals("SAYONARA")
		|| w.equals("LATER")
		|| w.equals("LEAVE")
		|| w.equals("STOP")
		|| w.equals("END")
		|| w.equals("EXIT")
		|| w.equals("FINISHED")
		|| w.equals("DONE")
		|| w.equals("FINISH")) {
			w = "BYE";
		}
		
		if (w.equals("CUP")) {
			w = "TEA";
		}
		
		if (w.equals("SIP")
		|| w.equals("GULP")) {
			w = "DRINK";
		}
		
		if (Player.getLocation().title.equals("Ichiro Hisachi's House")) {
			if (w.equals("YOU")
			|| w.equals("HRU")
			|| w.equals("SUP")
			|| w.equals("WHADDUP")
			|| w.equals("OGENKIDESUKA")
			|| w.equals("HISACHI")
			|| w.equals("YOURSELF")
			|| w.equals("U")
			|| w.equals("HIM")
			|| w.equals("TOD")) {
				w = "ICHIRO";
			}
			
			
			if (w.equals("OUTAGE")
			|| w.equals("HELP")
			|| w.equals("ELECTRICITY")
			|| w.equals("LIGHTS")
			|| w.equals("HEAT")
			|| w.equals("AIR")
			|| w.equals("CONDITIONER")
			|| w.equals("AC")
			|| w.equals("BULB")
			|| w.equals("BULBS")
			|| w.equals("LIGHT")
			|| w.equals("PLAQUE")
			|| w.equals("PLAQUES")
			|| w.equals("POST")
			|| w.equals("SLATE")
			|| w.equals("METAL")); {
				w = "POWER";
			}
		}
		
		if (w.equals("HER")) {
			w = "KIMI";
		}
		
		if (w.equals("SCROLLS")) {
			w = "SCROLL";
		}
		
		if (w.equals("YANK")) {
			w = "PULL";
		}
		
		if (w.equals("SWALLOW")
		|| w.equals("CONSUME")) {
			w = "EAT";
		}
		
		if (w.equals("M")) {
			w = "MEMORY";
		}
		
		if (w.equals("H")) {
			w = "HELP";
		}
		
		if (w.equals("BAIT")
		|| w.equals("HOOK")
		|| w.equals("ATTACH")) {
			w = "PUT";
		}
		
		if (w.equals("HERE")
		|| w.equals("PLACE")
		|| w.equals("LOCATION")
		|| w.equals("WHERE")
		|| w.equals("PATH")
		|| w.equals("PATHS")
		|| w.equals("CLUE")
		|| w.equals("HINT")
		|| w.equals("MAP")
		|| w.equals("WORLD")
		|| w.equals("SHRINE")
		|| w.equals("HONDO")) {
			w = "TEMPLE";
		}
		
		if (w.equals("YELL")
		|| w.equals("SPEAK")
		|| w.equals("UTTER")
		|| w.equals("VOICE")
		|| w.equals("TELL")
		|| w.equals("DECLARE")
		|| w.equals("STATE")
		|| w.equals("ACCOUNCE")
		|| w.equals("REMARK")
		|| w.equals("COMMENT")
		|| w.equals("ANSWER")
		|| w.equals("REPLY")
		|| w.equals("SCREAM")
		|| w.equals("STATE")
		|| w.equals("STATE")
		|| w.equals("STATE")
		|| w.equals("STATE")
		|| w.equals("STATE")
		|| w.equals("STATE")
		|| w.equals("EXCLAIM")) {
			w = "SAY";
		}
		
		if (w.equals("PUSH")){
			w = "PRESS";
		}
		
		return w;
	}
}