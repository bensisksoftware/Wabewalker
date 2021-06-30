import java.util.ArrayList;

public class Room {
	public static ArrayList<Room> rooms = new ArrayList<Room>();
	
	public static ArrayList<String> gardenPatioObjects = new ArrayList<String>();
	public static ArrayList<String> cobbleSquareObjects = new ArrayList<String>();
	public static ArrayList<String> teaRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> sandExhibitObjects = new ArrayList<String>(); 
	public static ArrayList<String> thatchedHutObjects = new ArrayList<String>(); 
	public static ArrayList<String> gardenOverlookObjects = new ArrayList<String>(); 
	public static ArrayList<String> loungeObjects = new ArrayList<String>(); 
	public static ArrayList<String> cafeObjects = new ArrayList<String>(); 
	public static ArrayList<String> outsideGalleryObjects = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom1Objects = new ArrayList<String>(); 
	public static ArrayList<String> insideGalleryObjects = new ArrayList<String>(); 
	public static ArrayList<String> assemblyRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom2Objects = new ArrayList<String>(); 
	public static ArrayList<String> livingRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> pondObjects = new ArrayList<String>(); 
	public static ArrayList<String> courtyardObjects = new ArrayList<String>(); 
	public static ArrayList<String> landingObjects = new ArrayList<String>(); 
	public static ArrayList<String> hallwayObjects = new ArrayList<String>(); 
	public static ArrayList<String> sittingRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> masterBedroomObjects = new ArrayList<String>(); 
	public static ArrayList<String> libraryObjects = new ArrayList<String>(); 
	public static ArrayList<String> closetObjects = new ArrayList<String>(); 
	public static ArrayList<String> darkPassagewayObjects = new ArrayList<String>();
	public static ArrayList<String> mannequinRoomObjects = new ArrayList<String>(); 
	public static ArrayList<String> theaterObjects = new ArrayList<String>(); 
	public static ArrayList<String> outsideGateObjects = new ArrayList<String>();
	public static ArrayList<String> insideGateObjects = new ArrayList<String>(); 
	public static ArrayList<String> islandObjects = new ArrayList<String>(); 
	public static ArrayList<String> bottomOfStairsObjects = new ArrayList<String>(); 
	public static ArrayList<String> topOfStairsObjects = new ArrayList<String>(); 
	public static ArrayList<String> hamletObjects = new ArrayList<String>(); 
	public static ArrayList<String> hondoObjects = new ArrayList<String>(); 
	public static ArrayList<String> balconyObjects = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom3Objects = new ArrayList<String>();
	public static ArrayList<String> trinketShopObjects = new ArrayList<String>(); 
	public static ArrayList<String> creakyDeckObjects = new ArrayList<String>(); 
	public static ArrayList<String> overlookObjects = new ArrayList<String>(); 
	
	public static ArrayList<String> gardenPatioExits = new ArrayList<String>();
	public static ArrayList<String> cobbleSquareExits = new ArrayList<String>();
	public static ArrayList<String> teaRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> sandExhibitExits = new ArrayList<String>(); 
	public static ArrayList<String> thatchedHutExits = new ArrayList<String>(); 
	public static ArrayList<String> gardenOverlookExits = new ArrayList<String>(); 
	public static ArrayList<String> loungeExits = new ArrayList<String>(); 
	public static ArrayList<String> cafeExits = new ArrayList<String>(); 
	public static ArrayList<String> outsideGalleryExits = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom1Exits = new ArrayList<String>(); 
	public static ArrayList<String> insideGalleryExits = new ArrayList<String>(); 
	public static ArrayList<String> assemblyRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom2Exits = new ArrayList<String>(); 
	public static ArrayList<String> livingRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> pondExits = new ArrayList<String>(); 
	public static ArrayList<String> courtyardExits = new ArrayList<String>(); 
	public static ArrayList<String> landingExits = new ArrayList<String>(); 
	public static ArrayList<String> hallwayExits = new ArrayList<String>(); 
	public static ArrayList<String> sittingRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> masterBedroomExits = new ArrayList<String>(); 
	public static ArrayList<String> libraryExits = new ArrayList<String>(); 
	public static ArrayList<String> closetExits = new ArrayList<String>(); 
	public static ArrayList<String> darkPassagewayExits = new ArrayList<String>();
	public static ArrayList<String> mannequinRoomExits = new ArrayList<String>(); 
	public static ArrayList<String> theaterExits = new ArrayList<String>(); 
	public static ArrayList<String> outsideGateExits = new ArrayList<String>();
	public static ArrayList<String> insideGateExits = new ArrayList<String>(); 
	public static ArrayList<String> islandExits = new ArrayList<String>(); 
	public static ArrayList<String> bottomOfStairsExits = new ArrayList<String>(); 
	public static ArrayList<String> topOfStairsExits = new ArrayList<String>(); 
	public static ArrayList<String> hamletExits = new ArrayList<String>(); 
	public static ArrayList<String> hondoExits = new ArrayList<String>(); 
	public static ArrayList<String> balconyExits = new ArrayList<String>(); 
	public static ArrayList<String> shrineRoom3Exits = new ArrayList<String>();
	public static ArrayList<String> trinketShopExits = new ArrayList<String>(); 
	public static ArrayList<String> creakyDeckExits = new ArrayList<String>(); 
	public static ArrayList<String> overlookExits = new ArrayList<String>(); 
	
	//public static boolean playerHere;
	
	public static String intro = "You bought a ticket to the Adachi Museum of Art.\n\nThis is the introduction.\n\nBUNRAKU\n\nCopyright (C) 2021 by Benjamin, Inc. All rights reserved.\n\nBUNRAKU is a trademark of Benjamin, Inc.\n\nRelease 1\n\n";
	public static String gardenPatioDesc = "The celebrated White Gravel and Pine Tree Garden of the Adachi Bigutsukan expands before you. Part of you yearns to stroll through the sand, but you know better than to disturb the cherished landscape. To the south is the Adachi Museum of Art.";
	public static String cobbleSquareDesc = "Your sandles clack on the cobblestone tiles. The garden expands to the north. There are doorways to the east and west of you. To the south is a hut.";
	public static String teaRoomDesc = "You are standing in a room designed for drinking tea. There are a few benches here. There may or may not be a book on a bench. There is an exit to the east.";
	public static String sandExhibitDesc = "This room displays a sand exhibit. To the south lies a door. Mounted on the door is a plaque. Beside the door is a sign.";
	public static String thatchedHutDesc = "You are in a thatched hut. There is a Chippendale mirror standing here. To the southeast is a lovely hallway. The cobble square is to the north.";
	public static String gardenOverlookDesc = "The White Gravel and Pine Tree Garden of the Adachi Bigutsukan expands to the south. Part of you yearns to stroll through the sand, but you know better than to disturb the cherished landscape. To the west is a room. To the east is a jungle path. The thatched hut is to the northwest.";
	public static String loungeDesc = "A comfy red sofa lines the wall. Above it, built into the wall, is a metal safe. On the safe is a plaque. There is an exit to the east.";
	public static String cafeDesc = "The cafe is empty. There's a woman staring at you from behind the glass. There are paths to the west and to the north.";
	public static String outsideGalleryDesc = "The entrance to the gallery is here to the east. The cafe is to the south.";
	public static String shrineRoom1Desc = "Beautiful shrine. There's a TV here. There's a safe with a plaque here.";
	public static String insideGalleryDesc = "Beautiful gallery. There is a room to the south. The exit is west of here.";
	public static String assemblyRoomDesc = "Three hooded figures stand behind a gold chest. There is an exit to the north.";
	public static String shrineRoom2Desc = "Beautiful shrine. There is a door on the west wall with a plaque beside it. You see a living room to the south.";
	public static String livingRoomDesc = "A woman is standing outside the window. You see the shrine room north of here. To the east, a gentle breeze flows in, and you see a deck area.";
	public static String pondDesc = "The trickling of water sounds nice. You see some fish swimming. There are hallways to the west and north.";
	public static String courtyardDesc = "Sunny courtyard. A door is to the east. There's a plaque next to it. A winding stone staircase leads to the northeast. A hallway extends south.";
	public static String landingDesc = "You are halfway up the stairs. It ascends to the southeast, and Roomends to the southwest.";
	public static String hallwayDesc = "There's a laundry chute here with a button. Through a glass pane you see a scroll sitting atop a shelf. There is a plaque here.";
	public static String sittingRoomDesc = "A quaint room. A landline phone sits on a table here. There are rooms to the east and west, as well as a hallway to the north.";
	public static String masterBedroomDesc = "A gentle breeze flows in through the window. The room is quite bare. There is a safe with a plaque on the wall.";
	public static String libraryDesc = "This is a small library. A red book, a blue book, and a black book stand on the shelf. Hung on the wall is a fishing pole. There's a TV here.";
	public static String closetDesc = "This small closet contains a trashcan. In the trashcan is a small pile of corn, and a scroll. Above the trashcan is a chute that comes out from the ceiling. There is an exit to the west.";
	public static String darkPassagewayDesc = "This is a dark passageway. There is a way to the north. Light from the shrine room emits through the doorway to the east.";
	public static String mannequinRoomDesc = "It's dark here, but you can see what look to be mannequins. There is a Desc here too. There are passageways to the east and south.";
	public static String theaterDesc = "There is a TV here. There is a passageway to the west.";
	public static String outsideGateDesc = "A huge mountain looms above you. You see a path through the gate to the north.";
	public static String insideGateDesc = "The path up the mountain leads north. Beside the path is a stone monument with an inscription carved into it. To the east is a bridge extending over a frozen pond. In the middle of the pond is a small man-made island. There is also a path leading south.";
	public static String islandDesc = "There is a thing here with a gate. Through the gate you see a TV. There is a tassel here. The bridge extends west over the frozen pond.";
	public static String bottomOfStairsDesc = "You are at the bottom of a large stair. To the north, you can just make out a temple. There is a path to the south.";
	public static String topOfStairsDesc = "You are at the top of the stairs. There is a wooden sign here. To the north is a large temple. To the west you can see residents' quarters.";
	public static String hamletDesc = "There is a house here. In the front, is a wooden post with a plaque on it. There is a path to the east.";
	public static String hisachiIchirosHouseDesc = "You are sitting on a cushion in a warm house.";
	public static String hondoDesc = "This is the main area of the temple. To the northeast you see a balcony. To the north you can see a magnificent golden shrine. A trinket shop is to the northwest.";
	public static String balconyDesc = "The balcony extends along the edge of the temple. There are paper slips here. The deck continues to the north and southeast.";
	public static String shrineRoom3Desc = "This is a magnificent golden shrine. There is an exit to the south.";
	public static String trinketShopDesc = "A shopkeeper is here behind the counter. There is an exit to the southwest.";
	public static String creakyDeckDesc = "The deck creaks beneath your feet. There is a wooden box here with a button and a plaque. There are walkways to the west and south.";
	public static String overlookDesc = "There is a mirror here, and paper cranes. There is a way to the east.";
	
	public static Room gardenPatio = new Room();
	public static Room cobbleSquare = new Room();
	public static Room teaRoom = new Room(); 
	public static Room sandExhibit = new Room(); 
	public static Room thatchedHut = new Room(); 
	public static Room gardenOverlook = new Room(); 
	public static Room lounge = new Room(); 
	public static Room cafe = new Room(); 
	public static Room outsideGallery = new Room(); 
	public static Room shrineRoom1 = new Room(); 
	public static Room insideGallery = new Room(); 
	public static Room assemblyRoom = new Room(); 
	public static Room shrineRoom2 = new Room(); 
	public static Room livingRoom = new Room(); 
	public static Room pond = new Room(); 
	public static Room courtyard = new Room(); 
	public static Room landing = new Room(); 
	public static Room hallway = new Room(); 
	public static Room sittingRoom = new Room(); 
	public static Room masterBedroom = new Room(); 
	public static Room library = new Room(); 
	public static Room closet = new Room(); 
	public static Room darkPassageway = new Room();
	public static Room mannequinRoom = new Room(); 
	public static Room theater = new Room(); 
	public static Room outsideGate = new Room();
	public static Room insideGate = new Room(); 
	public static Room island = new Room(); 
	public static Room bottomOfStairs = new Room(); 
	public static Room topOfStairs = new Room(); 
	public static Room hamlet = new Room(); 
	public static Room hisachiIchirosHouse = new Room(); 
	public static Room hondo = new Room(); 
	public static Room balcony = new Room(); 
	public static Room shrineRoom3 = new Room();
	public static Room trinketShop = new Room(); 
	public static Room creakyDeck = new Room(); 
	public static Room overlook = new Room(); 

	public static void setRooms() {
		rooms.add(gardenPatio); 
		rooms.add(cobbleSquare); 
		rooms.add(teaRoom); 
		rooms.add(sandExhibit); 
		rooms.add(thatchedHut); 
		rooms.add(gardenOverlook); 
		rooms.add(lounge); 
		rooms.add(cafe); 
		rooms.add(outsideGallery); 
		rooms.add(shrineRoom1); 
		rooms.add(insideGallery); 
		rooms.add(assemblyRoom); 
		rooms.add(shrineRoom2); 
		rooms.add(livingRoom); 
		rooms.add(pond); 
		rooms.add(courtyard); 
		rooms.add(landing); 
		rooms.add(hallway); 
		rooms.add(sittingRoom); 
		rooms.add(masterBedroom); 
		rooms.add(library); 
		rooms.add(closet); 
		rooms.add(darkPassageway);
		rooms.add(mannequinRoom); 
		rooms.add(theater); 
		rooms.add(outsideGate);
		rooms.add(insideGate); 
		rooms.add(island); 
		rooms.add(bottomOfStairs); 
		rooms.add(topOfStairs); 
		rooms.add(hamlet); 
		rooms.add(hisachiIchirosHouse); 
		rooms.add(hondo); 
		rooms.add(balcony); 
		rooms.add(shrineRoom3);
		rooms.add(trinketShop); 
		rooms.add(creakyDeck); 
		rooms.add(overlook); 
	}
	
	public static void setExits() {
		gardenPatioExits.add("S");
		cobbleSquareExits.add("N");
		cobbleSquareExits.add("S");
		cobbleSquareExits.add("E");
		cobbleSquareExits.add("W");
		teaRoomExits.add("E"); 
		sandExhibitExits.add("W"); 
		sandExhibitExits.add("S"); 
		thatchedHutExits.add("N"); 
		thatchedHutExits.add("SE"); 
		gardenOverlookExits.add("NW"); 
		gardenOverlookExits.add("W"); 
		gardenOverlookExits.add("E"); 
		loungeExits.add("E"); 
		cafeExits.add("N"); 
		cafeExits.add("W"); 
		outsideGalleryExits.add("E"); 
		outsideGalleryExits.add("S"); 
		shrineRoom1Exits.add("N"); 
		insideGalleryExits.add("W"); 
		insideGalleryExits.add("S"); 
		assemblyRoomExits.add("N"); 
		shrineRoom2Exits.add("W"); 
		shrineRoom2Exits.add("S"); 
		livingRoomExits.add("N"); 
		livingRoomExits.add("E"); 
		pondExits.add("N"); 
		pondExits.add("W"); 
		courtyardExits.add("E"); 
		courtyardExits.add("NE"); 
		courtyardExits.add("U"); 
		courtyardExits.add("S"); 
		landingExits.add("SW"); 
		landingExits.add("SE"); 
		landingExits.add("U"); 
		landingExits.add("D"); 
		hallwayExits.add("NW"); 
		hallwayExits.add("D"); 
		hallwayExits.add("S"); 
		sittingRoomExits.add("N"); 
		sittingRoomExits.add("E"); 
		sittingRoomExits.add("W"); 
		masterBedroomExits.add("E"); 
		libraryExits.add("W"); 
		closetExits.add("W"); 
		darkPassagewayExits.add("N");
		darkPassagewayExits.add("E");
		mannequinRoomExits.add("E"); 
		mannequinRoomExits.add("S"); 
		theaterExits.add("W"); 
		outsideGateExits.add("N");
		insideGateExits.add("N"); 
		insideGateExits.add("E"); 
		insideGateExits.add("S"); 
		islandExits.add("W"); 
		bottomOfStairsExits.add("N"); 
		bottomOfStairsExits.add("S"); 
		bottomOfStairsExits.add("U"); 
		topOfStairsExits.add("N"); 
		topOfStairsExits.add("W"); 
		topOfStairsExits.add("S"); 
		topOfStairsExits.add("D"); 
		hamletExits.add("E"); 
		hondoExits.add("N"); 
		hondoExits.add("NE"); 
		hondoExits.add("NW"); 
		hondoExits.add("S"); 
		balconyExits.add("N"); 
		balconyExits.add("SE"); 
		shrineRoom3Exits.add("S");
		trinketShopExits.add("SW"); 
		creakyDeckExits.add("S"); 
		creakyDeckExits.add("W"); 
		overlookExits.add("E"); 
	}
	
	public static void setObjects() {
		teaRoomObjects.add(Item.book); 
		loungeObjects.add(Item.om); 
		shrineRoom1Objects.add(Item.ji); 
		masterBedroomObjects.add(Item.ni); 
		libraryObjects.add(Item.rod); 
		libraryObjects.add(Item.booklet); 
		libraryObjects.add(Item.handbook); 
		libraryObjects.add(Item.pamphlet); 
		closetObjects.add(Item.ra); 
		closetObjects.add(Item.corn); 
		mannequinRoomObjects.add(Item.parchment); 
		balconyObjects.add(Item.card); 
		trinketShopObjects.add(Item.yu); 
		creakyDeckObjects.add(Item.go); 
	}
	
	private static void setDesc(String s) {
		Story.print(s);
	}
	
	public static void printDesc() {
		switch (Data.playerLocation) {
			case "Garden Patio":
				setDesc(gardenPatioDesc);
				break;
			case "Cobble Square":
				setDesc(cobbleSquareDesc);
				break;
			case "Tea Room":
				setDesc(teaRoomDesc);
				break;
			case "Sand Exhibit":
				setDesc(sandExhibitDesc);
				break;
			case "Thatched Hut":
				setDesc(thatchedHutDesc);
				break;
			case "Garden Overlook":
				setDesc(gardenOverlookDesc);
				break;
			case "Lounge":
				setDesc(loungeDesc);
				break;
			case "Cafe":
				setDesc(cafeDesc);
				break;
			case "Outside Gallery":
				setDesc(outsideGalleryDesc);
				break;
			case "Shrine Room 1":
				setDesc(shrineRoom1Desc);
				break;
			case "Inside Gallery":
				setDesc(insideGalleryDesc);
				break;
			case "Assembly Room":
				setDesc(assemblyRoomDesc);
				break;
			case "Shrine Room 2":
				setDesc(shrineRoom2Desc);
				break;
			case "Living Room":
				setDesc(livingRoomDesc);
				break;
			case "Pond":
				setDesc(pondDesc);
				break;
			case "Courtyard":
				setDesc(courtyardDesc);
				break;
			case "Landing":
				setDesc(landingDesc);
				break;
			case "Hallway":
				setDesc(hallwayDesc);
				break;
			case "Sitting Room":
				setDesc(sittingRoomDesc);
				break;
			case "Master Bedroom":
				setDesc(masterBedroomDesc);
				break;
			case "Library":
				setDesc(libraryDesc);
				break;
			case "Closet":
				setDesc(closetDesc);
				break;
			case "Dark Passageway":
				setDesc(darkPassagewayDesc);
				break;
			case "Mannequin Room":
				setDesc(mannequinRoomDesc);
				break;
			case "Theater":
				setDesc(theaterDesc);
				break;
			case "Outside Gate":
				setDesc(outsideGateDesc);
				break;
			case "Inside Gate":
				setDesc(insideGateDesc);
				break;
			case "Island":
				setDesc(islandDesc);
				break;
			case "Bottom of Stairs":
				setDesc(bottomOfStairsDesc);
				break;
			case "Top of Stairs":
				setDesc(topOfStairsDesc);
				break;
			case "Hamlet":
				setDesc(hamletDesc);
				break;
			case "Hisachi Ichiro's House":
				setDesc(hisachiIchirosHouseDesc);
				break;
			case "Hondo":
				setDesc(hondoDesc);
				break;
			case "Balcony":
				setDesc(balconyDesc);
				break;
			case "Shrine Room 3":
				setDesc(shrineRoom3Desc);
				break;
			case "Trinket Shop":
				setDesc(trinketShopDesc);
				break;
			case "Creaky Deck":
				setDesc(creakyDeckDesc);
				break;
			case "Overlook":
				setDesc(overlookDesc);
				break;
			default:
				System.out.println("Room.setDesc() error");
				break;
			
		}
	}
	
	public static void printObject() {
		if (getObjects().contains(Item.om)) {
			Story.newLine();
			Story.print(There is  + Item.om +  here.);
		}
		
		if (getObjects().contains(Item.ni)) {
			Story.newLine();
			Story.print(There is  + Item.ni +  here.);
		}
		
		if (getObjects().contains(Item.go)) {
			Story.newLine();
			Story.print(There is  + Item.go +  here.);
		}
		
		if (getObjects().contains(Item.yu)) {
			Story.newLine();
			Story.print(There is  + Item.yu +  here.);
		}
		
		if (getObjects().contains(Item.ji)) {
			Story.newLine();
			Story.print(There is  + Item.ji +  here.);
		}
		
		if (getObjects().contains(Item.ra)) {
			Story.newLine();
			Story.print(There is  + Item.ra +  here.);
		}
		
		if (getObjects().contains(Item.shi)) {
			Story.newLine();
			Story.print(There is  + Item.shi +  here.);
		}
		
		if (getObjects().contains(Item.book)) {
			Story.newLine();
			Story.print(There is  + Item.book +  here.);
		}
		
		if (getObjects().contains(Item.rod)) {
			Story.newLine();
			Story.print(There is  + Item.rod +  here.);
		}
		
		if (getObjects().contains(Item.booklet)) {
			Story.newLine();
			Story.print(There is  + Item.booklet +  here.);
		}
		
		if (getObjects().contains(Item.handbook)) {
			Story.newLine();
			Story.print(There is  + Item.handbook +  here.);
		}
		
		if (getObjects().contains(Item.pamphlet)) {
			Story.newLine();
			Story.print(There is  + Item.pamphlet +  here.);
		}
		
		if (getObjects().contains(Item.corn)) {
			Story.newLine();
			Story.print(There is  + Item.corn +  here.);
		}
		
		if (getObjects().contains(Item.parchment)) {
			Story.newLine();
			Story.print(There is  + Item.parchment +  here.);
		}
		
		if (getObjects().contains(Item.card)) {
			Story.newLine();
			Story.print(There is  + Item.card +  here.);
		}
	}
	
	public static ArrayList getObjects() {
		switch (Data.playerLocation) {
			case "Garden Patio":
				return gardenPatioObjects;
			case "Cobble Square":
				return cobbleSquareObjects;
			case "Tea Room":
				return teaRoomObjects;
			case "Sand Exhibit":
				return sandExhibitObjects;
			case "Thatched Hut":
				return thatchedHutObjects;
			case "Garden Overlook":
				return gardenOverlookObjects;
			case "Lounge":
				return loungeObjects;
			case "Cafe":
				return cafeObjects;
			case "Outside Gallery":
				return outsideGalleryObjects;
			case "Shrine Room 1":
				return shrineRoom1Objects;
			case "Inside Gallery":
				return insideGalleryObjects;
			case "Assembly Room":
				return assemblyRoomObjects;
			case "Shrine Room 2":
				return shrineRoom2Objects;
			case "Living Room":
				return livingRoomObjects;
			case "Pond":
				return pondObjects;
			case "Courtyard":
				return courtyardObjects;
			case "Landing":
				return landingObjects;
			case "Hallway":
				return hallwayObjects;
			case "Sitting Room":
				return sittingRoomObjects;
			case "Master Bedroom":
				return masterBedroomObjects;
			case "Library":
				return libraryObjects;
			case "Closet":
				return closetObjects;
			case "Dark Passageway":
				return darkPassagewayObjects;
			case "Mannequin Room":
				return mannequinRoomObjects;
			case "Theater":
				return theaterObjects;
			case "Outside Gate":
				return outsideGateObjects;
			case "Inside Gate":
				return insideGateObjects;
			case "Island":
				return islandObjects;
			case "Bottom of Stairs":
				return bottomOfStairsObjects;
			case "Top of Stairs":
				return topOfStairsObjects;
			case "Hamlet":
				return hamletObjects;
			case "Hondo":
				return hondoObjects;
			case "Balcony":
				return balconyObjects;
			case "Shrine Room 3":
				return shrineRoom3Objects;
			case "Trinket Shop":
				return trinketShopObjects;
			case "Creaky Deck":
				return creakyDeckObjects;
			case "Overlook":
				return overlookObjects;
			default:
				System.out.println("Room.getObjects() error");
				return null;
		}
	}
}