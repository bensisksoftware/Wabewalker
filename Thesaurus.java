import java.util.ArrayList;

public class Thesaurus {
	public static ArrayList<String> extraWords = new ArrayList<String>();
	
	public static void addExtraWords() {
		extraWords.add("THE");
		extraWords.add("A");
		extraWords.add("AN");
		extraWords.add("AT");
		extraWords.add("OUT");
		extraWords.add("OLD");
		extraWords.add("MY");
		extraWords.add("THROUGH");
		extraWords.add("UNDER");
		extraWords.add("IN");
		extraWords.add("SOME");
		extraWords.add("CORDED");
		extraWords.add("TO");
		extraWords.add("ON");
		extraWords.add("WITH");
		extraWords.add("CAN");
		extraWords.add("I");
		extraWords.add("HAVE");
		extraWords.add("FOR");
		extraWords.add("IT");
		extraWords.add("LARGE");
		extraWords.add("SMALL");
		extraWords.add("BIG");
		extraWords.add("HOODED");
		extraWords.add("COLORFUL");
		extraWords.add("ABOUT");
		extraWords.add("DOZEN");
		extraWords.add("SAY");
		extraWords.add("THAT");
		extraWords.add("WOODEN");
	}
	
	public static String translate(String w) {
		// Player doesn't need to do this to beat this game
		if (w.equals("LICK")
		|| w.equals("TASTE")
		|| w.equals("FEEL")
		|| w.equals("RUB")
		|| w.equals("KISS")
		|| w.equals("SHRED")
		|| w.equals("RUIN")
		|| w.equals("TOUCH")) {
			w = "UNUSED";
		}
		
		if (w.equals("COBWEBS")
		|| w.equals("COBWEB")
		|| w.equals("CANDLE")
		|| w.equals("CANDLES")
		|| w.equals("CLOTH")
		|| w.equals("VELVET")
		|| w.equals("WEBS")
		|| w.equals("WEB")) {
			w ="JUNK";
		}
		
		if (w.equals("RED")
		|| w.equals("YELLOW")
		|| w.equals("BLUE")
		|| w.equals("WHITE")
		|| w.equals("BROWN")
		|| w.equals("BURGUNDY")
		|| w.equals("BLACK")) {
			w ="COLOR";
		}
		
		if (w.equals("STAIR")
		|| w.equals("STAIRCASE")) {
			w ="STAIRS";
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
		
		if (w.equals("ARROW")
			|| w.equals("ARROWS")
			|| w.equals("METAL")
			|| w.equals("METAL")
			|| w.equals("METAL")
			|| w.equals("PANELS")
			|| (w.equals("POST") && Player.getLocation().title.equals("Hamlet"))) {
			w = "PANEL";
		}
		
		if (w.equals("BULBS")) {
			w = "BULB";
		}
		
		if (w.equals("BIRD")
			|| w.equals("PAPER")
			|| w.equals("ORAGAMI")
			|| w.equals("CURTAIN")) {
			w = "BIRDS";
		}
		
		if (w.equals("CARVING")
			|| w.equals("BANNER")
			|| w.equals("SLATE")
			|| w.equals("PLAQUE")
			|| w.equals("MEMORIAL")
			|| w.equals("INSCRIPTION")) {
			w = "SIGN";
		}
		
		if (w.equals("COBBLE")
		|| w.equals("SQUARE")) {
			w = "STONE";
		}
		
		if (w.equals("KEGON-JI")
		|| w.equals("KEGONJI")
		|| w.equals("KEGON JI")) {
			w = "TEMPLE";
		}
		
		if (w.equals("CEDAR")
		|| w.equals("BARRIER")) {
			w = "LATTICE";
		}
		
		if (w.equals("SNOWFLAKE")
		|| w.equals("SNOWFLAKES")
		|| w.equals("SNOWFALL")) {
			w = "SNOW";
		}
		
		if (w.equals("CHIPPENDALE")
		|| w.equals("REFLECTION")
		|| w.equals("HAIR")) {
			w = "MIRROR";
		}
		
		if (w.equals("WATER")
		|| w.equals("RIPPLE")
		|| w.equals("RIPPLES")
		|| w.equals("WAVE")
		|| w.equals("WAVES")) {
			w = "POND";
		}
		
		if (w.equals("SECRET")) {
			w = "COMPARTMENT";
		}
		
		if (w.equals("INSIDE")) {
			w = "IN";
		}
		
		if (w.equals("PORCELAIN")) {
			w = "MASK";
		}
		
		if (w.equals("KOI")) {
			w = "FISH";
		}

		if (w.equals("KERNEL")
		|| w.equals("BAIT")) {
			w = "CORN";
		}
		
		if (w.equals("POLE")
		|| w.equals("FISHING")
		|| w.equals("HOOK")
		|| w.equals("LINE")) {
			w = "ROD";
		}
		
		if (w.equals("SHOE")
		|| w.equals("SHOES")
		|| w.equals("FEET")
		|| w.equals("FOOT")
		|| w.equals("poop")
		|| w.equals("SANDAL")) {
			w = "SANDALS";
		}		
		
		if (w.equals("ME")
		|| w.equals("SELF")
		|| w.equals("SAMUES")
		|| w.equals("CLOTHING")
		|| w.equals("CLOTHES")) {
			w = "SAMUE";
		}
		
		if (w.equals("LANDLINE")) {
			w = "PHONE";
		}
		
		if (w.equals("SAND")
		|| w.equals("GRAVEL")) {
			w = "EXHIBIT";
		}
		
		if (w.equals("CRYPTO")) {
			w = "CRYPTOGRAM";
		}
		
		if (w.equals("TREES")
		|| w.equals("GARDEN")
		|| w.equals("GARDENS")
		|| w.equals("PRUNED")
		|| w.equals("FOREST")
		|| w.equals("BAMBOO")
		|| w.equals("PINE")) {
			w = "TREE";
		}
		
		if (w.equals("FIGURES")) {
			w = "FIGURE";
		}
		
		if (w.equals("GOLD")) {
			w = "CHEST";
		}
		
		if (w.equals("ROOFTOP")) {
			w = "ROOF";
		}
		
		if (w.equals("COUCH")
			|| w.equals("CUSHION") 
			|| w.equals("CUSHIONS")) {
			w = "SOFA";
		}
		
		if (w.equals("FLOOR")) {
			w = "GROUND";
		}
		
		if (w.equals("PANELS")) {
			w = "PANEL";
		}
		
		if (w.equals("IRON")) {
			w = "SAFE";
		}
		
		if (w.equals("JEWELLED")
		|| w.equals("JEWEL")	
		|| w.equals("JEWELS")	
		|| w.equals("RUBY")	
		|| w.equals("RUBIES")	
		|| w.equals("EMERALD")	
		|| w.equals("EMERALDS")	
		|| w.equals("SAPPHIRE")	) {
			w = "CASE";
		}
		
		if (w.equals("WALK")
		|| w.equals("STROLL")
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
		
		if (w.equals("I")
		|| w.equals("POCKET")
		|| w.equals("POCKETS")) {
			w = "INVENTORY";
		}
		
		if (w.equals("X")
		|| w.equals("READ")
		|| w.equals("INVESTIGATE")
		|| w.equals("L")
		|| w.equals("SEARCH")
		|| w.equals("LOOK")
		|| w.equals("CHECK")){
			w = "EXAMINE";
		}
		
		if (w.equals("KILL")
			|| w.equals("COMBAT")
			|| w.equals("ATTACK")
			|| w.equals("HIT")){
			w = "FIGHT";
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
		
		if (w.equals("RAILING")
		|| w.equals("BALCONY")){
			w = "DECK";
		}
		
		if (w.equals("GET")
		|| w.equals("OBTAIN")
		|| w.equals("CATCH")
		|| w.equals("GRAB")) {
			w = "TAKE";
		}
		
		if (w.equals("STORE")
		|| w.equals("STOREFRONT")
		|| w.equals("TRINKET")
		|| w.equals("SHOP")) {
			w = "SHOP";
		}
		
		if (w.equals("THROW")
		|| w.equals("TOSS")) {
			w = "DROP";
		}
		
		if (w.equals("HELLO")
		|| w.equals("AHOY")
		|| w.equals("HOWDY")
		|| w.equals("BONJOUR")
		|| w.equals("HEY")
		|| w.equals("KONNICHIWA")
		|| w.equals("GREETINGS")) {
			w = "HI";
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
		
		if (Player.getLocation().title.equals("Sitting Room")) {
			if (w.equals("BIZ")) {
				w = "BUSINESS";
			}
		} else {
			if (w.equals("BUSINESS")) {
				w = "CARD";
			}
		}
		
		if (w.equals("APPOINTMENT")
		|| w.equals("APT")
		|| w.equals("APPT")
		|| w.equals("LESSON")
		|| w.equals("FORMER")
		|| w.equals("IN-DEPTH")
		|| w.equals("INDEPTH")) {
			w = "SCHEDULE";
		}
		
		if (w.equals("EYE")
		|| w.equals("MOUTH")
		|| w.equals("EAR")
		|| w.equals("HEART")
		|| w.equals("FOOT")
		|| w.equals("HAND")
		|| w.equals("NOSE")) {
			w = "PICTURE";
		}
		
		if (w.equals("FREE")
		|| w.equals("LATTER")
		|| w.equals("DIALPAD")
		|| w.equals("CONSULT")
		|| w.equals("CONSULTATION")) {
			w = "PHONE";
		}
		
		if (w.equals("CYA")
		|| w.equals("GOODBYE")
		|| w.equals("SEEYA")
		|| w.equals("SAYONARA")
		|| w.equals("LATER")
		|| w.equals("STOP")
		|| w.equals("END")
		|| w.equals("FINISHED")
		|| w.equals("DONE")
		|| w.equals("FINISH")) {
			w = "BYE";
		}
		
		if (w.equals("LEAVE")) {
			w = "EXIT";
		}
		
		if (w.equals("RESIDENTS")
		|| w.equals("RESIDENT'S")
		|| w.equals("RESIDENTS'")
		|| w.equals("QUARTERS")) {
			w = "HOUSE";
		}
		
		if (w.equals("CUP")) {
			w = "TEA";
		}
		
		if (w.equals("DOORWAY")) {
			w = "DOOR";
		}
		
		if (w.equals("RAILING")) {
			w = "WALL";
		}
		
		if (w.equals("LOAD")) {
			w = "RESTORE";
		}
		
		if (w.equals("SIP")
		|| w.equals("GULP")) {
			w = "DRINK";
		}
		
		if (Player.getLocation().title.equals("Hisachi Ichiro's House")) {
			if (w.equals("YOU")
			|| w.equals("HRU")
			|| w.equals("SUP")
			|| w.equals("WHADDUP")
			|| w.equals("OGENKIDESUKA")
			|| w.equals("ICHIRO")
			|| w.equals("YOURSELF")
			|| w.equals("U")
			|| w.equals("HIM")
			|| w.equals("GLASSES")
			|| w.equals("ROBE")
			|| w.equals("MAN")
			|| w.equals("TOD")) {
				w = "HISACHI";
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
			|| w.equals("PANEL")
			|| w.equals("PANELS")
			|| w.equals("POST")
			|| w.equals("SLATE")
			|| w.equals("METAL")) {
				w = "POWER";
			}
		}
		
		if (Player.getLocation().title.equals("Sitting Room")) {
			if (w.equals("HER")
			|| w.equals("WOMAN")
			|| w.equals("INSTRUCTOR")) {
				w = "KIMI";
			}
		}
		
		if (w.equals("SCROLLS")) {
			w = "SCROLL";
		}
		
		if (w.equals("SIT")) {
			w = "LAY";
		}
		
		if (w.equals("KIMONO")) {
			w = "WOMAN";
		}
		
		if (w.equals("YANK")
		|| w.equals("REEL")
		|| w.equals("TUG")) {
			w = "PULL";
		}
		
		if (w.equals("PAINTINGS")
		|| w.equals("ART")
		|| w.equals("GALLERY")
		|| w.equals("ARTWORK")) {
			w = "PAINTING";
		}
		
		if (w.equals("ADACHI")) {
			w = "MUSEUM";
		}
		
		if (w.equals("FOUR-POSTER")
			|| w.equals("FOURPOSTER")) {
			w = "BED";
		}
		
		if (w.equals("SWALLOW")
		|| w.equals("CONSUME")) {
			w = "EAT";
		}
		
		if (w.equals("MANNEQUINS")) {
			w = "MANNEQUIN";
		}
		
		if (w.equals("M")) {
			w = "MEMORY";
		}
		
		if (w.equals("H")) {
			w = "HELP";
		}
		
		if (w.equals("HOOK")
		|| w.equals("ATTACH")) {
			w = "PUT";
		}
		
		if (w.equals("GLASS")
		|| w.equals("PANE")
		|| w.equals("OUTSIDE")) {
			w = "WINDOW";
		}
		
		if (w.equals("LAUNDRY")
		|| w.equals("SHELF")) {
			w = "CHUTE";
		}
		
		if (w.equals("TELEVISION")
		|| w.equals("DISPLAY")
		|| w.equals("SCREEN")
		|| w.equals("SET")) {
			w = "TV";
		}
		
		if (w.equals("ALTAR")
		|| w.equals("HOKURA")
		|| w.equals("BUTSUDAN")) {
			w = "SHRINE";
		}
		
		if (w.equals("HERE")
		|| w.equals("CLOSET")
		|| w.equals("ISLAND")
		|| w.equals("WABE")
		|| w.equals("PLACE")
		|| w.equals("LOCATION")
		|| w.equals("WORLD")) {
			w = "ROOM";
		}
		
		if (w.equals("WALKWAY")
		|| w.equals("WALKWAYS")) {
			w = "PATH";
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
		|| w.equals("TALK")
		|| w.equals("STATE")
		|| w.equals("EXCLAIM")) {
			w = "SAY";
		}
		
		if (w.equals("CUT")
		|| w.equals("SMASH")
		|| w.equals("CRUSH")
		|| w.equals("BREAK")) {
			w = "DESTROY";
		}
		
		if (w.equals("PUSH")){
			w = "PRESS";
		}
		
		if (w.equals("THATCHED")
		|| w.equals("STRAW")
		|| w.equals("CEILING")){
			w = "HUT";
		}
		
		return w;
	}
}